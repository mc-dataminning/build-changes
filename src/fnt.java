import com.google.common.base.Splitter;
import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fnt extends fnx {
   static final akq b = akq.b("container/slot");
   static final Logger c = LogUtils.getLogger();
   private static final int q = 18;
   private static final int r = 20;
   private static final int s = 1;
   private static final int u = 1;
   private static final int v = 2;
   private static final int w = 2;
   private static final akp<ddu> x = deb.b;
   public static final wy a = wy.c("flat_world_preset.unknown");
   private final fmy y;
   private wy z;
   private wy A;
   private fnt.a B;
   private fig C;
   fip D;
   ehp E;

   public fnt(fmy $$0) {
      super(wy.c("createWorld.customize.presets.title"));
      this.y = $$0;
   }

   @Nullable
   private static ehm a(jn<dfw> $$0, String $$1, int $$2) {
      List<String> $$3 = Splitter.on('*').limit(2).splitToList($$1);
      int $$5;
      String $$4;
      if ($$3.size() == 2) {
         $$4 = $$3.get(1);

         try {
            $$5 = Math.max(Integer.parseInt($$3.get(0)), 0);
         } catch (NumberFormatException var11) {
            c.error("Error while parsing flat world string", var11);
            return null;
         }
      } else {
         $$4 = $$3.get(0);
         $$5 = 1;
      }

      int $$9 = Math.min($$2 + $$5, dwv.c);
      int $$10 = $$9 - $$2;

      Optional<jm.c<dfw>> $$11;
      try {
         $$11 = $$0.a(akp.a(lu.f, akq.a($$4)));
      } catch (Exception var10) {
         c.error("Error while parsing flat world string", var10);
         return null;
      }

      if ($$11.isEmpty()) {
         c.error("Error while parsing flat world string => Unknown block, {}", $$4);
         return null;
      } else {
         return new ehm($$10, $$11.get().a());
      }
   }

   private static List<ehm> a(jn<dfw> $$0, String $$1) {
      List<ehm> $$2 = Lists.newArrayList();
      String[] $$3 = $$1.split(",");
      int $$4 = 0;

      for (String $$5 : $$3) {
         ehm $$6 = a($$0, $$5, $$4);
         if ($$6 == null) {
            return Collections.emptyList();
         }

         $$2.add($$6);
         $$4 += $$6.a();
      }

      return $$2;
   }

   public static ehp a(jn<dfw> $$0, jn<ddu> $$1, jn<ejs> $$2, jn<eiq> $$3, String $$4, ehp $$5) {
      Iterator<String> $$6 = Splitter.on(';').split($$4).iterator();
      if (!$$6.hasNext()) {
         return ehp.a($$1, $$2, $$3);
      } else {
         List<ehm> $$7 = a($$0, $$6.next());
         if ($$7.isEmpty()) {
            return ehp.a($$1, $$2, $$3);
         } else {
            jm.c<ddu> $$8 = $$1.b(x);
            jm<ddu> $$9 = $$8;
            if ($$6.hasNext()) {
               String $$10 = $$6.next();
               $$9 = Optional.ofNullable(akq.c($$10)).map($$0x -> akp.a(lu.aF, $$0x)).flatMap($$1::a).orElseGet(() -> {
                  c.warn("Invalid biome: {}", $$10);
                  return $$8;
               });
            }

            return $$5.a($$7, $$5.c(), $$9);
         }
      }
   }

   static String a(ehp $$0) {
      StringBuilder $$1 = new StringBuilder();

      for (int $$2 = 0; $$2 < $$0.e().size(); $$2++) {
         if ($$2 > 0) {
            $$1.append(",");
         }

         $$1.append($$0.e().get($$2));
      }

      $$1.append(";");
      $$1.append($$0.d().e().map(akp::a).orElseThrow(() -> new IllegalStateException("Biome not registered")));
      return $$1.toString();
   }

   @Override
   protected void aP_() {
      this.z = wy.c("createWorld.customize.presets.share");
      this.A = wy.c("createWorld.customize.presets.list");
      this.D = new fip(this.o, 50, 40, this.m - 100, 20, this.z);
      this.D.f(1230);
      fte $$0 = this.y.a.m().k();
      ka $$1 = $$0.a();
      cpj $$2 = $$0.h().b();
      jn<ddu> $$3 = $$1.b(lu.aF);
      jn<ejs> $$4 = $$1.b(lu.aT);
      jn<eiq> $$5 = $$1.b(lu.aQ);
      jn<dfw> $$6 = $$1.b(lu.f).a($$2);
      this.D.a(a(this.y.l()));
      this.E = this.y.l();
      this.d(this.D);
      this.B = this.c(new fnt.a($$1, $$2));
      this.C = this.c(fig.a(wy.c("createWorld.customize.presets.select"), $$4x -> {
         ehp $$5x = a($$6, $$3, $$4, $$5, this.D.a(), this.E);
         this.y.a($$5x);
         this.l.a(this.y);
      }).a(this.m / 2 - 155, this.n - 28, 150, 20).a());
      this.c(fig.a(wx.e, $$0x -> this.l.a(this.y)).a(this.m / 2 + 5, this.n - 28, 150, 20).a());
      this.c(this.B.h() != null);
   }

   @Override
   public boolean a(double $$0, double $$1, double $$2, double $$3) {
      return this.B.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(fgi $$0, int $$1, int $$2) {
      String $$3 = this.D.a();
      this.b($$0, $$1, $$2);
      this.D.a($$3);
   }

   @Override
   public void d() {
      this.l.a(this.y);
   }

   @Override
   public void a(fht $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.c().a();
      $$0.c().a(0.0F, 0.0F, 400.0F);
      $$0.a(this.o, this.k, this.m / 2, 8, 16777215);
      $$0.b(this.o, this.z, 51, 30, 10526880);
      $$0.b(this.o, this.A, 51, 68, 10526880);
      $$0.c().b();
      this.D.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void c(boolean $$0) {
      this.C.j = $$0 || this.D.a().length() > 1;
   }

   class a extends fjc<fnt.a.a> {
      public a(final ka $$0, final cpj $$1) {
         super(fnt.this.l, fnt.this.m, fnt.this.n - 117, 80, 24);

         for (jm<ehn> $$2 : $$0.d(lu.aN).c(awi.a)) {
            Set<dfw> $$3 = $$2.a().b().e().stream().map($$0x -> $$0x.b().b()).filter($$1x -> !$$1x.a($$1)).collect(Collectors.toSet());
            if (!$$3.isEmpty()) {
               fnt.c
                  .info(
                     "Discarding flat world preset {} since it contains experimental blocks {}",
                     $$2.e().map($$0x -> $$0x.a().toString()).orElse("<unknown>"),
                     $$3
                  );
            } else {
               this.b(new fnt.a.a($$2));
            }
         }
      }

      public void a(@Nullable fnt.a.a $$0) {
         super.a($$0);
         fnt.this.c($$0 != null);
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         if (super.a($$0, $$1, $$2)) {
            return true;
         } else {
            if (fmh.a($$0) && this.h() != null) {
               this.h().b();
            }

            return false;
         }
      }

      public class a extends fjc.a<fnt.a.a> {
         private static final akq b = akq.b("textures/gui/container/stats_icons.png");
         private final ehn c;
         private final wy d;

         public a(final jm<ehn> $$1) {
            this.c = $$1.a();
            this.d = $$1.e().map($$0x -> wy.c($$0x.a().h("flat_world_preset"))).orElse(fnt.a);
         }

         @Override
         public void a(fht $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            this.a($$0, $$3, $$2, this.c.a().a());
            $$0.a(fnt.this.o, this.d, $$3 + 18 + 5, $$2 + 6, 16777215, false);
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            this.b();
            return super.a($$0, $$1, $$2);
         }

         void b() {
            a.this.a(this);
            fnt.this.E = this.c.b();
            fnt.this.D.a(fnt.a(fnt.this.E));
            fnt.this.D.b(false);
         }

         private void a(fht $$0, int $$1, int $$2, cuj $$3) {
            this.a($$0, $$1 + 1, $$2 + 1);
            $$0.b(new cuo($$3), $$1 + 2, $$2 + 2);
         }

         private void a(fht $$0, int $$1, int $$2) {
            $$0.a(fnt.b, $$1, $$2, 0, 18, 18);
         }

         @Override
         public wy a() {
            return wy.a("narrator.select", this.d);
         }
      }
   }
}
