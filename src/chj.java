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

public class chj {
   private static final Logger c = LogUtils.getLogger();
   private static final int d = 6;
   static final List<cdm<? extends cdl<? super chi>>> a = ImmutableList.of(cdm.c, cdm.f, cdm.d, cdm.y);
   static final List<ccf<?>> b = ImmutableList.of(
      ccf.n, ccf.m, ccf.E, ccf.t, ccf.Z, ccf.aR, ccf.aS, ccf.aT, ccf.aG, ccf.aQ, ccf.h, ccf.r, new ccf[]{ccf.O, ccf.P, ccf.R}
   );
   private static final int e = 9600;
   private static final float f = 1.0F;
   private static final float g = 2.0F;
   private static final float h = 1.25F;
   private static final float i = 1.25F;

   public static Predicate<cuc> a() {
      return $$0 -> $$0.a(awf.X);
   }

   protected static bud<?> a(bud<chi> $$0) {
      b($$0);
      e($$0);
      c($$0);
      d($$0);
      $$0.a(Set.of(cnz.a));
      $$0.b(cnz.b);
      $$0.f();
      return $$0;
   }

   static chi b(chi $$0) {
      $$0.dU().b(ccf.aS);
      $$0.dU().b(ccf.aR);
      return $$0.a(chi.a.a);
   }

   private static void b(bud<chi> $$0) {
      $$0.a(cnz.a, 0, ImmutableList.of(new bxo(0.8F), new bup<chi>(2.0F) {
         protected void a(aqm $$0, chi $$1, long $$2) {
            chj.b($$1);
            super.b($$0, $$1, $$2);
         }
      }, new bwe(500, 700), new bva(ccf.P)));
   }

   private static void c(bud<chi> $$0) {
      $$0.a(cnz.v, ImmutableList.of(Pair.of(0, new chj.e())), Set.of(Pair.of(ccf.Z, ccg.b), Pair.of(ccf.aR, ccg.a), Pair.of(ccf.m, ccg.a)));
   }

   private static void d(bud<chi> $$0) {
      $$0.a(
         cnz.z,
         ImmutableList.of(Pair.of(0, new chj.a(160, 180)), Pair.of(0, new chj.c(40))),
         Set.of(Pair.of(ccf.Z, ccg.b), Pair.of(ccf.m, ccg.b), Pair.of(ccf.aS, ccg.a))
      );
   }

   private static void e(bud<chi> $$0) {
      $$0.a(
         cnz.b,
         ImmutableList.of(
            Pair.of(0, new buo(bsm.aR) {
               @Override
               protected void a(aqm $$0, cer $$1, long $$2) {
                  chj.b((chi)$$1);
                  super.a($$0, $$1, $$2);
               }
            }),
            Pair.of(1, new bvh($$0x -> 1.25F, $$0x -> $$0x.p_() ? 2.5 : 3.5) {
               @Override
               protected void b(aqm $$0, btk $$1, long $$2) {
                  chj.b((chi)$$1);
                  super.b($$0, $$1, $$2);
               }
            }),
            Pair.of(2, new bwa(45, 90)),
            Pair.of(3, new chj.b(40, 100)),
            Pair.of(
               4,
               new bwr(
                  ImmutableList.of(
                     Pair.of(bxb.a(1.0F, 3), 2),
                     Pair.of(new chj.d(40, 80), 1),
                     Pair.of(new chj.f(40, 80), 1),
                     Pair.of(bwt.a(bsm.by, 6.0F), 1),
                     Pair.of(bwm.a(1.0F), 1),
                     Pair.of(new bve(5, 20), 2)
                  )
               )
            )
         ),
         Set.of(Pair.of(ccf.aS, ccg.b))
      );
   }

   static void a(chi $$0) {
      $$0.dU().a(ImmutableList.of(cnz.z, cnz.v, cnz.b));
   }

   static class a extends buu<chi> {
      a(int $$0, int $$1) {
         super(Map.of(ccf.Z, ccg.b, ccf.m, ccg.b, ccf.aS, ccg.a, ccf.aG, ccg.b), $$0, $$1);
      }

      protected boolean a(aqm $$0, chi $$1) {
         return $$1.go();
      }

      protected boolean a(aqm $$0, chi $$1, long $$2) {
         return $$1.dU().c(ccf.aS).isPresent() && $$1.gw() && !$$1.gs();
      }

      protected void b(aqm $$0, chi $$1, long $$2) {
         $$1.a(chi.a.f);
      }

      protected void c(aqm $$0, chi $$1, long $$2) {
         boolean $$3 = this.a($$2);
         if ($$3) {
            $$1.dU().a(ccf.aG, azk.a, 9600L);
         } else {
            chj.b($$1);
         }
      }
   }

   static class b extends buu<chi> {
      b(int $$0, int $$1) {
         super(Map.of(ccf.aT, ccg.a), $$0, $$1);
      }

      protected boolean a(aqm $$0, chi $$1, long $$2) {
         return true;
      }

      protected void b(aqm $$0, chi $$1, long $$2) {
         $$1.a(chi.a.b);
      }

      protected void c(aqm $$0, chi $$1, long $$2) {
         $$1.a(chi.a.a);
         $$1.dU().b(ccf.aT);
      }
   }

   static class c extends buu<chi> {
      c(int $$0) {
         super(Map.of(ccf.Z, ccg.b, ccf.m, ccg.b, ccf.aS, ccg.a, ccf.aG, ccg.a), $$0, $$0);
      }

      protected boolean a(aqm $$0, chi $$1) {
         return true;
      }

      protected boolean a(aqm $$0, chi $$1, long $$2) {
         return $$1.dU().c(ccf.aS).isPresent();
      }

      protected void b(aqm $$0, chi $$1, long $$2) {
         $$1.a(chi.a.g);
      }

      protected void c(aqm $$0, chi $$1, long $$2) {
         boolean $$3 = this.a($$2);
         $$1.a(chi.a.a).w($$3);
         $$1.dU().b(ccf.aS);
         $$1.dU().a(ccf.aT, true);
      }
   }

   static class d extends buu<chi> {
      d(int $$0, int $$1) {
         super(Map.of(ccf.Z, ccg.b, ccf.aS, ccg.b, ccf.aR, ccg.b, ccf.aT, ccg.b, ccf.r, ccg.b), $$0, $$1);
      }

      protected boolean a(aqm $$0, chi $$1) {
         return !$$1.y();
      }

      protected boolean a(aqm $$0, chi $$1, long $$2) {
         return true;
      }

      protected void b(aqm $$0, chi $$1, long $$2) {
         $$1.a(chi.a.c);
      }

      protected void c(aqm $$0, chi $$1, long $$2) {
         $$1.a(chi.a.a);
      }
   }

   static class e extends buu<chi> {
      e() {
         super(Map.of(ccf.m, ccg.a, ccf.Z, ccg.b, ccf.aR, ccg.a), 600);
      }

      protected boolean a(aqm $$0, chi $$1) {
         return $$1.go();
      }

      protected boolean a(aqm $$0, chi $$1, long $$2) {
         if (!$$1.go()) {
            $$1.a(chi.a.a);
            return false;
         } else {
            Optional<ja> $$3 = $$1.dU().c(ccf.m).map(cci::a).map(bwi::b);
            Optional<ja> $$4 = $$1.dU().c(ccf.aR);
            return !$$3.isEmpty() && !$$4.isEmpty() ? $$4.get().equals($$3.get()) : false;
         }
      }

      protected void b(aqm $$0, chi $$1, long $$2) {
         $$1.a(chi.a.e);
      }

      protected void c(aqm $$0, chi $$1, long $$2) {
         if ($$1.gw() && $$1.go()) {
            $$1.dU().a(ccf.aS, true);
         }

         $$1.dU().b(ccf.m);
         $$1.dU().b(ccf.aR);
      }
   }

   static class f extends buu<chi> {
      f(int $$0, int $$1) {
         super(Map.of(ccf.m, ccg.b, ccf.aR, ccg.b, ccf.aG, ccg.b), $$0, $$1);
      }

      protected boolean a(aqm $$0, chi $$1) {
         return !$$1.p_() && $$1.go();
      }

      protected boolean a(aqm $$0, chi $$1, long $$2) {
         return $$1.go();
      }

      protected void b(aqm $$0, chi $$1, long $$2) {
         $$1.a(chi.a.d);
      }

      protected void c(aqm $$0, chi $$1, long $$2) {
         boolean $$3 = this.a($$2);
         $$1.a(chi.a.a);
         if ($$3) {
            $$1.gv().ifPresent($$1x -> {
               $$1.dU().a(ccf.aR, $$1x);
               $$1.dU().a(ccf.m, new cci($$1x, 1.25F, 0));
            });
         }
      }
   }
}
