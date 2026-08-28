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

public class cmk {
   private static final Logger c = LogUtils.getLogger();
   private static final int d = 6;
   static final List<cid<? extends cic<? super cmj>>> a = ImmutableList.of(cid.c, cid.f, cid.d, cid.y);
   static final List<cgw<?>> b = ImmutableList.of(
      cgw.o, cgw.n, cgw.F, cgw.u, cgw.aa, cgw.aS, cgw.aT, cgw.aU, cgw.aH, cgw.aR, cgw.h, cgw.s, new cgw[]{cgw.P, cgw.Q, cgw.S}
   );
   private static final int e = 9600;
   private static final float f = 1.0F;
   private static final float g = 2.0F;
   private static final float h = 1.25F;
   private static final float i = 1.25F;

   public static Predicate<czy> a() {
      return $$0 -> $$0.a(axm.ab);
   }

   protected static byu<?> a(byu<cmj> $$0) {
      b($$0);
      e($$0);
      c($$0);
      d($$0);
      $$0.a(Set.of(ctr.a));
      $$0.b(ctr.b);
      $$0.f();
      return $$0;
   }

   static cmj b(cmj $$0) {
      $$0.ec().b(cgw.aT);
      $$0.ec().b(cgw.aS);
      return $$0.a(cmj.a.a);
   }

   private static void b(byu<cmj> $$0) {
      $$0.a(ctr.a, 0, ImmutableList.of(new ccf(0.8F), new bzg<cmj>(2.0F) {
         protected void a(ars $$0, cmj $$1, long $$2) {
            cmk.b($$1);
            super.b($$0, $$1, $$2);
         }
      }, new cav(500, 700), new bzr(cgw.Q)));
   }

   private static void c(byu<cmj> $$0) {
      $$0.a(ctr.v, ImmutableList.of(Pair.of(0, new cmk.e())), Set.of(Pair.of(cgw.aa, cgx.b), Pair.of(cgw.aS, cgx.a), Pair.of(cgw.n, cgx.a)));
   }

   private static void d(byu<cmj> $$0) {
      $$0.a(
         ctr.z,
         ImmutableList.of(Pair.of(0, new cmk.a(160, 180)), Pair.of(0, new cmk.c(40))),
         Set.of(Pair.of(cgw.aa, cgx.b), Pair.of(cgw.n, cgx.b), Pair.of(cgw.aT, cgx.a))
      );
   }

   private static void e(byu<cmj> $$0) {
      $$0.a(
         ctr.b,
         ImmutableList.of(
            Pair.of(0, new bzf(bxc.bk) {
               @Override
               protected void a(ars $$0, cjk $$1, long $$2) {
                  cmk.b((cmj)$$1);
                  super.a($$0, $$1, $$2);
               }
            }),
            Pair.of(1, new bzy($$0x -> 1.25F, $$0x -> $$0x.n_() ? 2.5 : 3.5) {
               @Override
               protected void b(ars $$0, byc $$1, long $$2) {
                  cmk.b((cmj)$$1);
                  super.b($$0, $$1, $$2);
               }
            }),
            Pair.of(2, new car(45, 90)),
            Pair.of(3, new cmk.b(40, 100)),
            Pair.of(
               4,
               new cbi(
                  ImmutableList.of(
                     Pair.of(cbs.a(1.0F, 3), 2),
                     Pair.of(new cmk.d(40, 80), 1),
                     Pair.of(new cmk.f(40, 80), 1),
                     Pair.of(cbk.a(bxc.bT, 6.0F), 1),
                     Pair.of(cbd.a(1.0F), 1),
                     Pair.of(new bzv(5, 20), 2)
                  )
               )
            )
         ),
         Set.of(Pair.of(cgw.aT, cgx.b))
      );
   }

   static void a(cmj $$0) {
      $$0.ec().a(ImmutableList.of(ctr.z, ctr.v, ctr.b));
   }

   static class a extends bzl<cmj> {
      a(int $$0, int $$1) {
         super(Map.of(cgw.aa, cgx.b, cgw.n, cgx.b, cgw.aT, cgx.a, cgw.aH, cgx.b), $$0, $$1);
      }

      protected boolean a(ars $$0, cmj $$1) {
         return $$1.gu();
      }

      protected boolean a(ars $$0, cmj $$1, long $$2) {
         return $$1.ec().c(cgw.aT).isPresent() && $$1.gx() && !$$1.gE();
      }

      protected void b(ars $$0, cmj $$1, long $$2) {
         $$1.a(cmj.a.f);
      }

      protected void c(ars $$0, cmj $$1, long $$2) {
         boolean $$3 = this.a($$2);
         if ($$3) {
            $$1.ec().a(cgw.aH, baw.a, 9600L);
         } else {
            cmk.b($$1);
         }
      }
   }

   static class b extends bzl<cmj> {
      b(int $$0, int $$1) {
         super(Map.of(cgw.aU, cgx.a), $$0, $$1);
      }

      protected boolean a(ars $$0, cmj $$1, long $$2) {
         return true;
      }

      protected void b(ars $$0, cmj $$1, long $$2) {
         $$1.a(cmj.a.b);
      }

      protected void c(ars $$0, cmj $$1, long $$2) {
         $$1.a(cmj.a.a);
         $$1.ec().b(cgw.aU);
      }
   }

   static class c extends bzl<cmj> {
      c(int $$0) {
         super(Map.of(cgw.aa, cgx.b, cgw.n, cgx.b, cgw.aT, cgx.a, cgw.aH, cgx.a), $$0, $$0);
      }

      protected boolean a(ars $$0, cmj $$1) {
         return true;
      }

      protected boolean a(ars $$0, cmj $$1, long $$2) {
         return $$1.ec().c(cgw.aT).isPresent();
      }

      protected void b(ars $$0, cmj $$1, long $$2) {
         $$1.a(cmj.a.g);
      }

      protected void c(ars $$0, cmj $$1, long $$2) {
         boolean $$3 = this.a($$2);
         $$1.a(cmj.a.a).w($$3);
         $$1.ec().b(cgw.aT);
         $$1.ec().a(cgw.aU, true);
      }
   }

   static class d extends bzl<cmj> {
      d(int $$0, int $$1) {
         super(Map.of(cgw.aa, cgx.b, cgw.aT, cgx.b, cgw.aS, cgx.b, cgw.aU, cgx.b, cgw.s, cgx.b), $$0, $$1);
      }

      protected boolean a(ars $$0, cmj $$1) {
         return !$$1.x();
      }

      protected boolean a(ars $$0, cmj $$1, long $$2) {
         return true;
      }

      protected void b(ars $$0, cmj $$1, long $$2) {
         $$1.a(cmj.a.c);
      }

      protected void c(ars $$0, cmj $$1, long $$2) {
         $$1.a(cmj.a.a);
      }
   }

   static class e extends bzl<cmj> {
      e() {
         super(Map.of(cgw.n, cgx.a, cgw.aa, cgx.b, cgw.aS, cgx.a), 600);
      }

      protected boolean a(ars $$0, cmj $$1) {
         return $$1.gu();
      }

      protected boolean a(ars $$0, cmj $$1, long $$2) {
         if (!$$1.gu()) {
            $$1.a(cmj.a.a);
            return false;
         } else {
            Optional<iv> $$3 = $$1.ec().c(cgw.n).map(cgz::a).map(caz::b);
            Optional<iv> $$4 = $$1.ec().c(cgw.aS);
            return !$$3.isEmpty() && !$$4.isEmpty() ? $$4.get().equals($$3.get()) : false;
         }
      }

      protected void b(ars $$0, cmj $$1, long $$2) {
         $$1.a(cmj.a.e);
      }

      protected void c(ars $$0, cmj $$1, long $$2) {
         if ($$1.gx() && $$1.gu()) {
            $$1.ec().a(cgw.aT, true);
         }

         $$1.ec().b(cgw.n);
         $$1.ec().b(cgw.aS);
      }
   }

   static class f extends bzl<cmj> {
      f(int $$0, int $$1) {
         super(Map.of(cgw.n, cgx.b, cgw.aS, cgx.b, cgw.aH, cgx.b), $$0, $$1);
      }

      protected boolean a(ars $$0, cmj $$1) {
         return !$$1.n_() && $$1.gu();
      }

      protected boolean a(ars $$0, cmj $$1, long $$2) {
         return $$1.gu();
      }

      protected void b(ars $$0, cmj $$1, long $$2) {
         $$1.a(cmj.a.d);
      }

      protected void c(ars $$0, cmj $$1, long $$2) {
         boolean $$3 = this.a($$2);
         $$1.a(cmj.a.a);
         if ($$3) {
            $$1.gw().ifPresent($$1x -> {
               $$1.ec().a(cgw.aS, $$1x);
               $$1.ec().a(cgw.n, new cgz($$1x, 1.25F, 0));
            });
         }
      }
   }
}
