import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import org.slf4j.Logger;

public class cfl {
   private static final Logger c = LogUtils.getLogger();
   private static final int d = 6;
   static final List<cbo<? extends cbn<? super cfk>>> a = ImmutableList.of(cbo.c, cbo.f, cbo.d, cbo.y);
   static final List<cah<?>> b = ImmutableList.of(
      cah.n, cah.m, cah.E, cah.t, cah.Z, cah.aR, cah.aS, cah.aT, cah.aG, cah.aQ, cah.h, cah.r, new cah[]{cah.O, cah.P, cah.R}
   );
   private static final int e = 9600;
   private static final float f = 1.0F;
   private static final float g = 2.0F;
   private static final float h = 1.25F;
   private static final float i = 1.25F;

   public static cwd a() {
      return cwd.a(csg.vi);
   }

   protected static bsf<?> a(bsf<cfk> $$0) {
      b($$0);
      e($$0);
      c($$0);
      d($$0);
      $$0.a(Set.of(cma.a));
      $$0.b(cma.b);
      $$0.f();
      return $$0;
   }

   static cfk b(cfk $$0) {
      $$0.dQ().b(cah.aS);
      $$0.dQ().b(cah.aR);
      return $$0.a(cfk.a.a);
   }

   private static void b(bsf<cfk> $$0) {
      $$0.a(cma.a, 0, ImmutableList.of(new bvq(0.8F), new bsr<cfk>(2.0F) {
         protected void a(aqe $$0, cfk $$1, long $$2) {
            cfl.b($$1);
            super.b($$0, $$1, $$2);
         }
      }, new bug(500, 700), new btc(cah.P)));
   }

   private static void c(bsf<cfk> $$0) {
      $$0.a(cma.v, ImmutableList.of(Pair.of(0, new cfl.e())), Set.of(Pair.of(cah.Z, cai.b), Pair.of(cah.aR, cai.a), Pair.of(cah.m, cai.a)));
   }

   private static void d(bsf<cfk> $$0) {
      $$0.a(
         cma.z,
         ImmutableList.of(Pair.of(0, new cfl.a(160, 180)), Pair.of(0, new cfl.c(40))),
         Set.of(Pair.of(cah.Z, cai.b), Pair.of(cah.m, cai.b), Pair.of(cah.aS, cai.a))
      );
   }

   private static void e(bsf<cfk> $$0) {
      $$0.a(
         cma.b,
         ImmutableList.of(
            Pair.of(0, new bsq(bqr.aQ) {
               @Override
               protected void a(aqe $$0, cct $$1, long $$2) {
                  cfl.b((cfk)$$1);
                  super.a($$0, $$1, $$2);
               }
            }),
            Pair.of(1, new btj($$0x -> 1.25F, $$0x -> $$0x.p_() ? 2.5 : 3.5) {
               @Override
               protected void b(aqe $$0, brm $$1, long $$2) {
                  cfl.b((cfk)$$1);
                  super.b($$0, $$1, $$2);
               }
            }),
            Pair.of(2, new buc(45, 90)),
            Pair.of(3, new cfl.b(40, 100)),
            Pair.of(
               4,
               new but(
                  ImmutableList.of(
                     Pair.of(bvd.a(1.0F, 3), 2),
                     Pair.of(new cfl.d(40, 80), 1),
                     Pair.of(new cfl.f(40, 80), 1),
                     Pair.of(buv.a(bqr.bx, 6.0F), 1),
                     Pair.of(buo.a(1.0F), 1),
                     Pair.of(new btg(5, 20), 2)
                  )
               )
            )
         ),
         Set.of(Pair.of(cah.aS, cai.b))
      );
   }

   static void a(cfk $$0) {
      $$0.dQ().a(ImmutableList.of(cma.z, cma.v, cma.b));
   }

   static class a extends bsw<cfk> {
      a(int $$0, int $$1) {
         super(Map.of(cah.Z, cai.b, cah.m, cai.b, cah.aS, cai.a, cah.aG, cai.b), $$0, $$1);
      }

      protected boolean a(aqe $$0, cfk $$1) {
         return $$1.gp();
      }

      protected boolean a(aqe $$0, cfk $$1, long $$2) {
         return $$1.dQ().c(cah.aS).isPresent() && $$1.gx() && !$$1.gt();
      }

      protected void b(aqe $$0, cfk $$1, long $$2) {
         $$1.a(cfk.a.f);
      }

      protected void c(aqe $$0, cfk $$1, long $$2) {
         boolean $$3 = this.a($$2);
         if ($$3) {
            $$1.dQ().a(cah.aG, ayy.a, 9600L);
         } else {
            cfl.b($$1);
         }
      }
   }

   static class b extends bsw<cfk> {
      b(int $$0, int $$1) {
         super(Map.of(cah.aT, cai.a), $$0, $$1);
      }

      protected boolean a(aqe $$0, cfk $$1, long $$2) {
         return true;
      }

      protected void b(aqe $$0, cfk $$1, long $$2) {
         $$1.a(cfk.a.b);
      }

      protected void c(aqe $$0, cfk $$1, long $$2) {
         $$1.a(cfk.a.a);
         $$1.dQ().b(cah.aT);
      }
   }

   static class c extends bsw<cfk> {
      c(int $$0) {
         super(Map.of(cah.Z, cai.b, cah.m, cai.b, cah.aS, cai.a, cah.aG, cai.a), $$0, $$0);
      }

      protected boolean a(aqe $$0, cfk $$1) {
         return true;
      }

      protected boolean a(aqe $$0, cfk $$1, long $$2) {
         return $$1.dQ().c(cah.aS).isPresent();
      }

      protected void b(aqe $$0, cfk $$1, long $$2) {
         $$1.a(cfk.a.g);
      }

      protected void c(aqe $$0, cfk $$1, long $$2) {
         boolean $$3 = this.a($$2);
         $$1.a(cfk.a.a).w($$3);
         $$1.dQ().b(cah.aS);
         $$1.dQ().a(cah.aT, true);
      }
   }

   static class d extends bsw<cfk> {
      d(int $$0, int $$1) {
         super(Map.of(cah.Z, cai.b, cah.aS, cai.b, cah.aR, cai.b, cah.aT, cai.b, cah.r, cai.b), $$0, $$1);
      }

      protected boolean a(aqe $$0, cfk $$1) {
         return !$$1.y();
      }

      protected boolean a(aqe $$0, cfk $$1, long $$2) {
         return true;
      }

      protected void b(aqe $$0, cfk $$1, long $$2) {
         $$1.a(cfk.a.c);
      }

      protected void c(aqe $$0, cfk $$1, long $$2) {
         $$1.a(cfk.a.a);
      }
   }

   static class e extends bsw<cfk> {
      e() {
         super(Map.of(cah.m, cai.a, cah.Z, cai.b, cah.aR, cai.a), 600);
      }

      protected boolean a(aqe $$0, cfk $$1) {
         return $$1.gp();
      }

      protected boolean a(aqe $$0, cfk $$1, long $$2) {
         if (!$$1.gp()) {
            $$1.a(cfk.a.a);
            return false;
         } else {
            Optional<im> $$3 = $$1.dQ().c(cah.m).map(cak::a).map(buk::b);
            Optional<im> $$4 = $$1.dQ().c(cah.aR);
            return !$$3.isEmpty() && !$$4.isEmpty() ? $$4.get().equals($$3.get()) : false;
         }
      }

      protected void b(aqe $$0, cfk $$1, long $$2) {
         $$1.a(cfk.a.e);
      }

      protected void c(aqe $$0, cfk $$1, long $$2) {
         if ($$1.gx() && $$1.gp()) {
            $$1.dQ().a(cah.aS, true);
         }

         $$1.dQ().b(cah.m);
         $$1.dQ().b(cah.aR);
      }
   }

   static class f extends bsw<cfk> {
      f(int $$0, int $$1) {
         super(Map.of(cah.m, cai.b, cah.aR, cai.b, cah.aG, cai.b), $$0, $$1);
      }

      protected boolean a(aqe $$0, cfk $$1) {
         return !$$1.p_() && $$1.gp();
      }

      protected boolean a(aqe $$0, cfk $$1, long $$2) {
         return $$1.gp();
      }

      protected void b(aqe $$0, cfk $$1, long $$2) {
         $$1.a(cfk.a.d);
      }

      protected void c(aqe $$0, cfk $$1, long $$2) {
         boolean $$3 = this.a($$2);
         $$1.a(cfk.a.a);
         if ($$3) {
            $$1.gw().ifPresent($$1x -> {
               $$1.dQ().a(cah.aR, $$1x);
               $$1.dQ().a(cah.m, new cak($$1x, 1.25F, 0));
            });
         }
      }
   }
}
