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

public class fmz extends fnd {
   static final akk b = new akk("container/slot");
   static final Logger c = LogUtils.getLogger();
   private static final int q = 18;
   private static final int r = 20;
   private static final int s = 1;
   private static final int u = 1;
   private static final int v = 2;
   private static final int w = 2;
   private static final akj<ddd> x = ddk.b;
   public static final wu a = wu.c("flat_world_preset.unknown");
   private final fme y;
   private wu z;
   private wu A;
   private fmz.a B;
   private fhm C;
   fhv D;
   egt E;

   public fmz(fme $$0) {
      super(wu.c("createWorld.customize.presets.title"));
      this.y = $$0;
   }

   @Nullable
   private static egq a(jk<dff> $$0, String $$1, int $$2) {
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

      int $$9 = Math.min($$2 + $$5, dvz.c);
      int $$10 = $$9 - $$2;

      Optional<jj.c<dff>> $$11;
      try {
         $$11 = $$0.a(akj.a(lr.f, new akk($$4)));
      } catch (Exception var10) {
         c.error("Error while parsing flat world string", var10);
         return null;
      }

      if ($$11.isEmpty()) {
         c.error("Error while parsing flat world string => Unknown block, {}", $$4);
         return null;
      } else {
         return new egq($$10, $$11.get().a());
      }
   }

   private static List<egq> a(jk<dff> $$0, String $$1) {
      List<egq> $$2 = Lists.newArrayList();
      String[] $$3 = $$1.split(",");
      int $$4 = 0;

      for (String $$5 : $$3) {
         egq $$6 = a($$0, $$5, $$4);
         if ($$6 == null) {
            return Collections.emptyList();
         }

         $$2.add($$6);
         $$4 += $$6.a();
      }

      return $$2;
   }

   public static egt a(jk<dff> $$0, jk<ddd> $$1, jk<eiw> $$2, jk<ehu> $$3, String $$4, egt $$5) {
      Iterator<String> $$6 = Splitter.on(';').split($$4).iterator();
      if (!$$6.hasNext()) {
         return egt.a($$1, $$2, $$3);
      } else {
         List<egq> $$7 = a($$0, $$6.next());
         if ($$7.isEmpty()) {
            return egt.a($$1, $$2, $$3);
         } else {
            jj.c<ddd> $$8 = $$1.b(x);
            jj<ddd> $$9 = $$8;
            if ($$6.hasNext()) {
               String $$10 = $$6.next();
               $$9 = Optional.ofNullable(akk.a($$10)).map($$0x -> akj.a(lr.aE, $$0x)).flatMap($$1::a).orElseGet(() -> {
                  c.warn("Invalid biome: {}", $$10);
                  return $$8;
               });
            }

            return $$5.a($$7, $$5.c(), $$9);
         }
      }
   }

   static String a(egt $$0) {
      StringBuilder $$1 = new StringBuilder();

      for (int $$2 = 0; $$2 < $$0.e().size(); $$2++) {
         if ($$2 > 0) {
            $$1.append(",");
         }

         $$1.append($$0.e().get($$2));
      }

      $$1.append(";");
      $$1.append($$0.d().e().map(akj::a).orElseThrow(() -> new IllegalStateException("Biome not registered")));
      return $$1.toString();
   }

   @Override
   protected void aO_() {
      this.z = wu.c("createWorld.customize.presets.share");
      this.A = wu.c("createWorld.customize.presets.list");
      this.D = new fhv(this.o, 50, 40, this.m - 100, 20, this.z);
      this.D.f(1230);
      fsi $$0 = this.y.a.m().k();
      jx $$1 = $$0.a();
      cov $$2 = $$0.h().b();
      jk<ddd> $$3 = $$1.b(lr.aE);
      jk<eiw> $$4 = $$1.b(lr.aS);
      jk<ehu> $$5 = $$1.b(lr.aP);
      jk<dff> $$6 = $$1.b(lr.f).a($$2);
      this.D.a(a(this.y.l()));
      this.E = this.y.l();
      this.d(this.D);
      this.B = this.c(new fmz.a($$1, $$2));
      this.C = this.c(fhm.a(wu.c("createWorld.customize.presets.select"), $$4x -> {
         egt $$5x = a($$6, $$3, $$4, $$5, this.D.a(), this.E);
         this.y.a($$5x);
         this.l.a(this.y);
      }).a(this.m / 2 - 155, this.n - 28, 150, 20).a());
      this.c(fhm.a(wt.e, $$0x -> this.l.a(this.y)).a(this.m / 2 + 5, this.n - 28, 150, 20).a());
      this.c(this.B.h() != null);
   }

   @Override
   public boolean a(double $$0, double $$1, double $$2, double $$3) {
      return this.B.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(ffn $$0, int $$1, int $$2) {
      String $$3 = this.D.a();
      this.b($$0, $$1, $$2);
      this.D.a($$3);
   }

   @Override
   public void d() {
      this.l.a(this.y);
   }

   @Override
   public void a(fgz $$0, int $$1, int $$2, float $$3) {
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

   class a extends fii<fmz.a.a> {
      public a(final jx $$0, final cov $$1) {
         super(fmz.this.l, fmz.this.m, fmz.this.n - 117, 80, 24);

         for (jj<egr> $$2 : $$0.d(lr.aM).c(avz.a)) {
            Set<dff> $$3 = $$2.a().b().e().stream().map($$0x -> $$0x.b().b()).filter($$1x -> !$$1x.a($$1)).collect(Collectors.toSet());
            if (!$$3.isEmpty()) {
               fmz.c
                  .info(
                     "Discarding flat world preset {} since it contains experimental blocks {}",
                     $$2.e().map($$0x -> $$0x.a().toString()).orElse("<unknown>"),
                     $$3
                  );
            } else {
               this.b(new fmz.a.a($$2));
            }
         }
      }

      public void a(@Nullable fmz.a.a $$0) {
         super.a($$0);
         fmz.this.c($$0 != null);
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         if (super.a($$0, $$1, $$2)) {
            return true;
         } else {
            if (fln.a($$0) && this.h() != null) {
               this.h().b();
            }

            return false;
         }
      }

      public class a extends fii.a<fmz.a.a> {
         private static final akk b = new akk("textures/gui/container/stats_icons.png");
         private final egr c;
         private final wu d;

         public a(final jj<egr> $$1) {
            this.c = $$1.a();
            this.d = $$1.e().map($$0x -> wu.c($$0x.a().f("flat_world_preset"))).orElse(fmz.a);
         }

         @Override
         public void a(fgz $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            this.a($$0, $$3, $$2, this.c.a().a());
            $$0.a(fmz.this.o, this.d, $$3 + 18 + 5, $$2 + 6, 16777215, false);
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            this.b();
            return super.a($$0, $$1, $$2);
         }

         void b() {
            a.this.a(this);
            fmz.this.E = this.c.b();
            fmz.this.D.a(fmz.a(fmz.this.E));
            fmz.this.D.b(false);
         }

         private void a(fgz $$0, int $$1, int $$2, ctv $$3) {
            this.a($$0, $$1 + 1, $$2 + 1);
            $$0.b(new cua($$3), $$1 + 2, $$2 + 2);
         }

         private void a(fgz $$0, int $$1, int $$2) {
            $$0.a(fmz.b, $$1, $$2, 0, 18, 18);
         }

         @Override
         public wu a() {
            return wu.a("narrator.select", this.d);
         }
      }
   }
}
