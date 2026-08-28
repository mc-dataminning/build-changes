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

public class fnx extends fob {
   static final akr b = akr.b("container/slot");
   static final Logger c = LogUtils.getLogger();
   private static final int r = 18;
   private static final int s = 20;
   private static final int u = 1;
   private static final int v = 1;
   private static final int w = 2;
   private static final int x = 2;
   private static final akq<ddw> y = ded.b;
   public static final wz a = wz.c("flat_world_preset.unknown");
   private final fnc z;
   private wz A;
   private wz B;
   private fnx.a C;
   private fik D;
   fit E;
   ehs F;

   public fnx(fnc $$0) {
      super(wz.c("createWorld.customize.presets.title"));
      this.z = $$0;
   }

   @Nullable
   private static ehp a(jn<dfy> $$0, String $$1, int $$2) {
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

      int $$9 = Math.min($$2 + $$5, dwy.c);
      int $$10 = $$9 - $$2;

      Optional<jm.c<dfy>> $$11;
      try {
         $$11 = $$0.a(akq.a(lu.f, akr.a($$4)));
      } catch (Exception var10) {
         c.error("Error while parsing flat world string", var10);
         return null;
      }

      if ($$11.isEmpty()) {
         c.error("Error while parsing flat world string => Unknown block, {}", $$4);
         return null;
      } else {
         return new ehp($$10, $$11.get().a());
      }
   }

   private static List<ehp> a(jn<dfy> $$0, String $$1) {
      List<ehp> $$2 = Lists.newArrayList();
      String[] $$3 = $$1.split(",");
      int $$4 = 0;

      for (String $$5 : $$3) {
         ehp $$6 = a($$0, $$5, $$4);
         if ($$6 == null) {
            return Collections.emptyList();
         }

         $$2.add($$6);
         $$4 += $$6.a();
      }

      return $$2;
   }

   public static ehs a(jn<dfy> $$0, jn<ddw> $$1, jn<ejv> $$2, jn<eit> $$3, String $$4, ehs $$5) {
      Iterator<String> $$6 = Splitter.on(';').split($$4).iterator();
      if (!$$6.hasNext()) {
         return ehs.a($$1, $$2, $$3);
      } else {
         List<ehp> $$7 = a($$0, $$6.next());
         if ($$7.isEmpty()) {
            return ehs.a($$1, $$2, $$3);
         } else {
            jm.c<ddw> $$8 = $$1.b(y);
            jm<ddw> $$9 = $$8;
            if ($$6.hasNext()) {
               String $$10 = $$6.next();
               $$9 = Optional.ofNullable(akr.c($$10)).map($$0x -> akq.a(lu.aF, $$0x)).flatMap($$1::a).orElseGet(() -> {
                  c.warn("Invalid biome: {}", $$10);
                  return $$8;
               });
            }

            return $$5.a($$7, $$5.c(), $$9);
         }
      }
   }

   static String a(ehs $$0) {
      StringBuilder $$1 = new StringBuilder();

      for (int $$2 = 0; $$2 < $$0.e().size(); $$2++) {
         if ($$2 > 0) {
            $$1.append(",");
         }

         $$1.append($$0.e().get($$2));
      }

      $$1.append(";");
      $$1.append($$0.d().e().map(akq::a).orElseThrow(() -> new IllegalStateException("Biome not registered")));
      return $$1.toString();
   }

   @Override
   protected void aT_() {
      this.A = wz.c("createWorld.customize.presets.share");
      this.B = wz.c("createWorld.customize.presets.list");
      this.E = new fit(this.o, 50, 40, this.m - 100, 20, this.A);
      this.E.f(1230);
      fti $$0 = this.z.a.m().k();
      ka $$1 = $$0.a();
      cpl $$2 = $$0.h().b();
      jn<ddw> $$3 = $$1.b(lu.aF);
      jn<ejv> $$4 = $$1.b(lu.aT);
      jn<eit> $$5 = $$1.b(lu.aQ);
      jn<dfy> $$6 = $$1.b(lu.f).a($$2);
      this.E.a(a(this.z.l()));
      this.F = this.z.l();
      this.d(this.E);
      this.C = this.c(new fnx.a($$1, $$2));
      this.D = this.c(fik.a(wz.c("createWorld.customize.presets.select"), $$4x -> {
         ehs $$5x = a($$6, $$3, $$4, $$5, this.E.a(), this.F);
         this.z.a($$5x);
         this.l.a(this.z);
      }).a(this.m / 2 - 155, this.n - 28, 150, 20).a());
      this.c(fik.a(wy.e, $$0x -> this.l.a(this.z)).a(this.m / 2 + 5, this.n - 28, 150, 20).a());
      this.c(this.C.h() != null);
   }

   @Override
   public boolean a(double $$0, double $$1, double $$2, double $$3) {
      return this.C.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(fgm $$0, int $$1, int $$2) {
      String $$3 = this.E.a();
      this.b($$0, $$1, $$2);
      this.E.a($$3);
   }

   @Override
   public void d() {
      this.l.a(this.z);
   }

   @Override
   public void a(fhx $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.c().a();
      $$0.c().a(0.0F, 0.0F, 400.0F);
      $$0.a(this.o, this.k, this.m / 2, 8, 16777215);
      $$0.b(this.o, this.A, 51, 30, 10526880);
      $$0.b(this.o, this.B, 51, 68, 10526880);
      $$0.c().b();
      this.E.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void c(boolean $$0) {
      this.D.j = $$0 || this.E.a().length() > 1;
   }

   class a extends fjg<fnx.a.a> {
      public a(final ka $$0, final cpl $$1) {
         super(fnx.this.l, fnx.this.m, fnx.this.n - 117, 80, 24);

         for (jm<ehq> $$2 : $$0.d(lu.aN).c(awj.a)) {
            Set<dfy> $$3 = $$2.a().b().e().stream().map($$0x -> $$0x.b().b()).filter($$1x -> !$$1x.a($$1)).collect(Collectors.toSet());
            if (!$$3.isEmpty()) {
               fnx.c
                  .info(
                     "Discarding flat world preset {} since it contains experimental blocks {}",
                     $$2.e().map($$0x -> $$0x.a().toString()).orElse("<unknown>"),
                     $$3
                  );
            } else {
               this.b(new fnx.a.a($$2));
            }
         }
      }

      public void a(@Nullable fnx.a.a $$0) {
         super.a($$0);
         fnx.this.c($$0 != null);
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         if (super.a($$0, $$1, $$2)) {
            return true;
         } else {
            if (fml.a($$0) && this.h() != null) {
               this.h().b();
            }

            return false;
         }
      }

      public class a extends fjg.a<fnx.a.a> {
         private static final akr b = akr.b("textures/gui/container/stats_icons.png");
         private final ehq c;
         private final wz d;

         public a(final jm<ehq> $$1) {
            this.c = $$1.a();
            this.d = $$1.e().map($$0x -> wz.c($$0x.a().h("flat_world_preset"))).orElse(fnx.a);
         }

         @Override
         public void a(fhx $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            this.a($$0, $$3, $$2, this.c.a().a());
            $$0.a(fnx.this.o, this.d, $$3 + 18 + 5, $$2 + 6, 16777215, false);
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            this.b();
            return super.a($$0, $$1, $$2);
         }

         void b() {
            a.this.a(this);
            fnx.this.F = this.c.b();
            fnx.this.E.a(fnx.a(fnx.this.F));
            fnx.this.E.b(false);
         }

         private void a(fhx $$0, int $$1, int $$2, cul $$3) {
            this.a($$0, $$1 + 1, $$2 + 1);
            $$0.b(new cuq($$3), $$1 + 2, $$2 + 2);
         }

         private void a(fhx $$0, int $$1, int $$2) {
            $$0.a(fnx.b, $$1, $$2, 0, 18, 18);
         }

         @Override
         public wz a() {
            return wz.a("narrator.select", this.d);
         }
      }
   }
}
