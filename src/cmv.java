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

public class cmv {
   private static final Logger c = LogUtils.getLogger();
   private static final int d = 6;
   static final List<cio<? extends cin<? super cmu>>> a = ImmutableList.of(cio.c, cio.f, cio.d, cio.y);
   static final List<chh<?>> b = ImmutableList.of(
      chh.o, chh.n, chh.F, chh.u, chh.aa, chh.aS, chh.aT, chh.aU, chh.aH, chh.aR, chh.h, chh.s, new chh[]{chh.P, chh.Q, chh.S}
   );
   private static final int e = 9600;
   private static final float f = 1.0F;
   private static final float g = 2.0F;
   private static final float h = 1.25F;
   private static final float i = 1.25F;

   public static Predicate<dak> a() {
      return $$0 -> $$0.a(axv.ac);
   }

   protected static bzf<?> a(bzf<cmu> $$0) {
      b($$0);
      e($$0);
      c($$0);
      d($$0);
      $$0.a(Set.of(cuc.a));
      $$0.b(cuc.b);
      $$0.f();
      return $$0;
   }

   static cmu b(cmu $$0) {
      $$0.ec().b(chh.aT);
      $$0.ec().b(chh.aS);
      return $$0.a(cmu.a.a);
   }

   private static void b(bzf<cmu> $$0) {
      $$0.a(cuc.a, 0, ImmutableList.of(new ccq(0.8F), new bzr<cmu>(2.0F) {
         protected void a(asb $$0, cmu $$1, long $$2) {
            cmv.b($$1);
            super.b($$0, $$1, $$2);
         }
      }, new cbg(500, 700), new cac(chh.Q)));
   }

   private static void c(bzf<cmu> $$0) {
      $$0.a(cuc.v, ImmutableList.of(Pair.of(0, new cmv.e())), Set.of(Pair.of(chh.aa, chi.b), Pair.of(chh.aS, chi.a), Pair.of(chh.n, chi.a)));
   }

   private static void d(bzf<cmu> $$0) {
      $$0.a(
         cuc.z,
         ImmutableList.of(Pair.of(0, new cmv.a(160, 180)), Pair.of(0, new cmv.c(40))),
         Set.of(Pair.of(chh.aa, chi.b), Pair.of(chh.n, chi.b), Pair.of(chh.aT, chi.a))
      );
   }

   private static void e(bzf<cmu> $$0) {
      $$0.a(
         cuc.b,
         ImmutableList.of(
            Pair.of(0, new bzq(bxn.bk) {
               @Override
               protected void a(asb $$0, cjv $$1, long $$2) {
                  cmv.b((cmu)$$1);
                  super.a($$0, $$1, $$2);
               }
            }),
            Pair.of(1, new caj($$0x -> 1.25F, $$0x -> $$0x.n_() ? 2.5 : 3.5) {
               @Override
               protected void b(asb $$0, byn $$1, long $$2) {
                  cmv.b((cmu)$$1);
                  super.b($$0, $$1, $$2);
               }
            }),
            Pair.of(2, new cbc(45, 90)),
            Pair.of(3, new cmv.b(40, 100)),
            Pair.of(
               4,
               new cbt(
                  ImmutableList.of(
                     Pair.of(ccd.a(1.0F, 3), 2),
                     Pair.of(new cmv.d(40, 80), 1),
                     Pair.of(new cmv.f(40, 80), 1),
                     Pair.of(cbv.a(bxn.bT, 6.0F), 1),
                     Pair.of(cbo.a(1.0F), 1),
                     Pair.of(new cag(5, 20), 2)
                  )
               )
            )
         ),
         Set.of(Pair.of(chh.aT, chi.b))
      );
   }

   static void a(cmu $$0) {
      $$0.ec().a(ImmutableList.of(cuc.z, cuc.v, cuc.b));
   }

   static class a extends bzw<cmu> {
      a(int $$0, int $$1) {
         super(Map.of(chh.aa, chi.b, chh.n, chi.b, chh.aT, chi.a, chh.aH, chi.b), $$0, $$1);
      }

      protected boolean a(asb $$0, cmu $$1) {
         return $$1.gu();
      }

      protected boolean a(asb $$0, cmu $$1, long $$2) {
         return $$1.ec().c(chh.aT).isPresent() && $$1.gx() && !$$1.gE();
      }

      protected void b(asb $$0, cmu $$1, long $$2) {
         $$1.a(cmu.a.f);
      }

      protected void c(asb $$0, cmu $$1, long $$2) {
         boolean $$3 = this.a($$2);
         if ($$3) {
            $$1.ec().a(chh.aH, bbh.a, 9600L);
         } else {
            cmv.b($$1);
         }
      }
   }

   static class b extends bzw<cmu> {
      b(int $$0, int $$1) {
         super(Map.of(chh.aU, chi.a), $$0, $$1);
      }

      protected boolean a(asb $$0, cmu $$1, long $$2) {
         return true;
      }

      protected void b(asb $$0, cmu $$1, long $$2) {
         $$1.a(cmu.a.b);
      }

      protected void c(asb $$0, cmu $$1, long $$2) {
         $$1.a(cmu.a.a);
         $$1.ec().b(chh.aU);
      }
   }

   static class c extends bzw<cmu> {
      c(int $$0) {
         super(Map.of(chh.aa, chi.b, chh.n, chi.b, chh.aT, chi.a, chh.aH, chi.a), $$0, $$0);
      }

      protected boolean a(asb $$0, cmu $$1) {
         return true;
      }

      protected boolean a(asb $$0, cmu $$1, long $$2) {
         return $$1.ec().c(chh.aT).isPresent();
      }

      protected void b(asb $$0, cmu $$1, long $$2) {
         $$1.a(cmu.a.g);
      }

      protected void c(asb $$0, cmu $$1, long $$2) {
         boolean $$3 = this.a($$2);
         $$1.a(cmu.a.a).w($$3);
         $$1.ec().b(chh.aT);
         $$1.ec().a(chh.aU, true);
      }
   }

   static class d extends bzw<cmu> {
      d(int $$0, int $$1) {
         super(Map.of(chh.aa, chi.b, chh.aT, chi.b, chh.aS, chi.b, chh.aU, chi.b, chh.s, chi.b), $$0, $$1);
      }

      protected boolean a(asb $$0, cmu $$1) {
         return !$$1.x();
      }

      protected boolean a(asb $$0, cmu $$1, long $$2) {
         return true;
      }

      protected void b(asb $$0, cmu $$1, long $$2) {
         $$1.a(cmu.a.c);
      }

      protected void c(asb $$0, cmu $$1, long $$2) {
         $$1.a(cmu.a.a);
      }
   }

   static class e extends bzw<cmu> {
      e() {
         super(Map.of(chh.n, chi.a, chh.aa, chi.b, chh.aS, chi.a), 600);
      }

      protected boolean a(asb $$0, cmu $$1) {
         return $$1.gu();
      }

      protected boolean a(asb $$0, cmu $$1, long $$2) {
         if (!$$1.gu()) {
            $$1.a(cmu.a.a);
            return false;
         } else {
            Optional<iw> $$3 = $$1.ec().c(chh.n).map(chk::a).map(cbk::b);
            Optional<iw> $$4 = $$1.ec().c(chh.aS);
            return !$$3.isEmpty() && !$$4.isEmpty() ? $$4.get().equals($$3.get()) : false;
         }
      }

      protected void b(asb $$0, cmu $$1, long $$2) {
         $$1.a(cmu.a.e);
      }

      protected void c(asb $$0, cmu $$1, long $$2) {
         if ($$1.gx() && $$1.gu()) {
            $$1.ec().a(chh.aT, true);
         }

         $$1.ec().b(chh.n);
         $$1.ec().b(chh.aS);
      }
   }

   static class f extends bzw<cmu> {
      f(int $$0, int $$1) {
         super(Map.of(chh.n, chi.b, chh.aS, chi.b, chh.aH, chi.b), $$0, $$1);
      }

      protected boolean a(asb $$0, cmu $$1) {
         return !$$1.n_() && $$1.gu();
      }

      protected boolean a(asb $$0, cmu $$1, long $$2) {
         return $$1.gu();
      }

      protected void b(asb $$0, cmu $$1, long $$2) {
         $$1.a(cmu.a.d);
      }

      protected void c(asb $$0, cmu $$1, long $$2) {
         boolean $$3 = this.a($$2);
         $$1.a(cmu.a.a);
         if ($$3) {
            $$1.gw().ifPresent($$1x -> {
               $$1.ec().a(chh.aS, $$1x);
               $$1.ec().a(chh.n, new chk($$1x, 1.25F, 0));
            });
         }
      }
   }
}
