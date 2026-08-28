import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import org.slf4j.Logger;

public class ckp {
   private static final Logger c = LogUtils.getLogger();
   private static final int d = 6;
   static final List<cgr<? extends cgq<? super cko>>> a = ImmutableList.of(cgr.c, cgr.f, cgr.d, cgr.y);
   static final List<cfk<?>> b = ImmutableList.of(
      cfk.n, cfk.m, cfk.E, cfk.t, cfk.Z, cfk.aR, cfk.aS, cfk.aT, cfk.aG, cfk.aQ, cfk.h, cfk.r, new cfk[]{cfk.O, cfk.P, cfk.R}
   );
   private static final int e = 9600;
   private static final float f = 1.0F;
   private static final float g = 2.0F;
   private static final float h = 1.25F;
   private static final float i = 1.25F;

   public static Predicate<cxp> a() {
      return $$0 -> $$0.a(ayd.ac);
   }

   protected static bxi<?> a(bxi<cko> $$0) {
      b($$0);
      e($$0);
      c($$0);
      d($$0);
      $$0.a(Set.of(cro.a));
      $$0.b(cro.b);
      $$0.f();
      return $$0;
   }

   static cko b(cko $$0) {
      $$0.ec().b(cfk.aS);
      $$0.ec().b(cfk.aR);
      return $$0.a(cko.a.a);
   }

   private static void b(bxi<cko> $$0) {
      $$0.a(cro.a, 0, ImmutableList.of(new cat(0.8F), new bxu<cko>(2.0F) {
         protected void a(ash $$0, cko $$1, long $$2) {
            ckp.b($$1);
            super.b($$0, $$1, $$2);
         }
      }, new bzj(500, 700), new byf(cfk.P)));
   }

   private static void c(bxi<cko> $$0) {
      $$0.a(cro.v, ImmutableList.of(Pair.of(0, new ckp.e())), Set.of(Pair.of(cfk.Z, cfl.b), Pair.of(cfk.aR, cfl.a), Pair.of(cfk.m, cfl.a)));
   }

   private static void d(bxi<cko> $$0) {
      $$0.a(
         cro.z,
         ImmutableList.of(Pair.of(0, new ckp.a(160, 180)), Pair.of(0, new ckp.c(40))),
         Set.of(Pair.of(cfk.Z, cfl.b), Pair.of(cfk.m, cfl.b), Pair.of(cfk.aS, cfl.a))
      );
   }

   private static void e(bxi<cko> $$0) {
      $$0.a(
         cro.b,
         ImmutableList.of(
            Pair.of(0, new bxt(bvr.bj) {
               @Override
               protected void a(ash $$0, chx $$1, long $$2) {
                  ckp.b((cko)$$1);
                  super.a($$0, $$1, $$2);
               }
            }),
            Pair.of(1, new bym($$0x -> 1.25F, $$0x -> $$0x.e_() ? 2.5 : 3.5) {
               @Override
               protected void b(ash $$0, bwo $$1, long $$2) {
                  ckp.b((cko)$$1);
                  super.b($$0, $$1, $$2);
               }
            }),
            Pair.of(2, new bzf(45, 90)),
            Pair.of(3, new ckp.b(40, 100)),
            Pair.of(
               4,
               new bzw(
                  ImmutableList.of(
                     Pair.of(cag.a(1.0F, 3), 2),
                     Pair.of(new ckp.d(40, 80), 1),
                     Pair.of(new ckp.f(40, 80), 1),
                     Pair.of(bzy.a(bvr.bS, 6.0F), 1),
                     Pair.of(bzr.a(1.0F), 1),
                     Pair.of(new byj(5, 20), 2)
                  )
               )
            )
         ),
         Set.of(Pair.of(cfk.aS, cfl.b))
      );
   }

   static void a(cko $$0) {
      $$0.ec().a(ImmutableList.of(cro.z, cro.v, cro.b));
   }

   static class a extends bxz<cko> {
      a(int $$0, int $$1) {
         super(Map.of(cfk.Z, cfl.b, cfk.m, cfl.b, cfk.aS, cfl.a, cfk.aG, cfl.b), $$0, $$1);
      }

      protected boolean a(ash $$0, cko $$1) {
         return $$1.go();
      }

      protected boolean a(ash $$0, cko $$1, long $$2) {
         return $$1.ec().c(cfk.aS).isPresent() && $$1.gr() && !$$1.gy();
      }

      protected void b(ash $$0, cko $$1, long $$2) {
         $$1.a(cko.a.f);
      }

      protected void c(ash $$0, cko $$1, long $$2) {
         boolean $$3 = this.a($$2);
         if ($$3) {
            $$1.ec().a(cfk.aG, bbk.a, 9600L);
         } else {
            ckp.b($$1);
         }
      }
   }

   static class b extends bxz<cko> {
      b(int $$0, int $$1) {
         super(Map.of(cfk.aT, cfl.a), $$0, $$1);
      }

      protected boolean a(ash $$0, cko $$1, long $$2) {
         return true;
      }

      protected void b(ash $$0, cko $$1, long $$2) {
         $$1.a(cko.a.b);
      }

      protected void c(ash $$0, cko $$1, long $$2) {
         $$1.a(cko.a.a);
         $$1.ec().b(cfk.aT);
      }
   }

   static class c extends bxz<cko> {
      c(int $$0) {
         super(Map.of(cfk.Z, cfl.b, cfk.m, cfl.b, cfk.aS, cfl.a, cfk.aG, cfl.a), $$0, $$0);
      }

      protected boolean a(ash $$0, cko $$1) {
         return true;
      }

      protected boolean a(ash $$0, cko $$1, long $$2) {
         return $$1.ec().c(cfk.aS).isPresent();
      }

      protected void b(ash $$0, cko $$1, long $$2) {
         $$1.a(cko.a.g);
      }

      protected void c(ash $$0, cko $$1, long $$2) {
         boolean $$3 = this.a($$2);
         $$1.a(cko.a.a).x($$3);
         $$1.ec().b(cfk.aS);
         $$1.ec().a(cfk.aT, true);
      }
   }

   static class d extends bxz<cko> {
      d(int $$0, int $$1) {
         super(Map.of(cfk.Z, cfl.b, cfk.aS, cfl.b, cfk.aR, cfl.b, cfk.aT, cfl.b, cfk.r, cfl.b), $$0, $$1);
      }

      protected boolean a(ash $$0, cko $$1) {
         return !$$1.x();
      }

      protected boolean a(ash $$0, cko $$1, long $$2) {
         return true;
      }

      protected void b(ash $$0, cko $$1, long $$2) {
         $$1.a(cko.a.c);
      }

      protected void c(ash $$0, cko $$1, long $$2) {
         $$1.a(cko.a.a);
      }
   }

   static class e extends bxz<cko> {
      e() {
         super(Map.of(cfk.m, cfl.a, cfk.Z, cfl.b, cfk.aR, cfl.a), 600);
      }

      protected boolean a(ash $$0, cko $$1) {
         return $$1.go();
      }

      protected boolean a(ash $$0, cko $$1, long $$2) {
         if (!$$1.go()) {
            $$1.a(cko.a.a);
            return false;
         } else {
            Optional<jh> $$3 = $$1.ec().c(cfk.m).map(cfn::a).map(bzn::b);
            Optional<jh> $$4 = $$1.ec().c(cfk.aR);
            return !$$3.isEmpty() && !$$4.isEmpty() ? $$4.get().equals($$3.get()) : false;
         }
      }

      protected void b(ash $$0, cko $$1, long $$2) {
         $$1.a(cko.a.e);
      }

      protected void c(ash $$0, cko $$1, long $$2) {
         if ($$1.gr() && $$1.go()) {
            $$1.ec().a(cfk.aS, true);
         }

         $$1.ec().b(cfk.m);
         $$1.ec().b(cfk.aR);
      }
   }

   static class f extends bxz<cko> {
      f(int $$0, int $$1) {
         super(Map.of(cfk.m, cfl.b, cfk.aR, cfl.b, cfk.aG, cfl.b), $$0, $$1);
      }

      protected boolean a(ash $$0, cko $$1) {
         return !$$1.e_() && $$1.go();
      }

      protected boolean a(ash $$0, cko $$1, long $$2) {
         return $$1.go();
      }

      protected void b(ash $$0, cko $$1, long $$2) {
         $$1.a(cko.a.d);
      }

      protected void c(ash $$0, cko $$1, long $$2) {
         boolean $$3 = this.a($$2);
         $$1.a(cko.a.a);
         if ($$3) {
            $$1.gq().ifPresent($$1x -> {
               $$1.ec().a(cfk.aR, $$1x);
               $$1.ec().a(cfk.m, new cfn($$1x, 1.25F, 0));
            });
         }
      }
   }
}
