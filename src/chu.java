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

public class chu {
   private static final Logger c = LogUtils.getLogger();
   private static final int d = 6;
   static final List<cdx<? extends cdw<? super cht>>> a = ImmutableList.of(cdx.c, cdx.f, cdx.d, cdx.y);
   static final List<ccq<?>> b = ImmutableList.of(
      ccq.n, ccq.m, ccq.E, ccq.t, ccq.Z, ccq.aR, ccq.aS, ccq.aT, ccq.aG, ccq.aQ, ccq.h, ccq.r, new ccq[]{ccq.O, ccq.P, ccq.R}
   );
   private static final int e = 9600;
   private static final float f = 1.0F;
   private static final float g = 2.0F;
   private static final float h = 1.25F;
   private static final float i = 1.25F;

   public static Predicate<cuo> a() {
      return $$0 -> $$0.a(awm.X);
   }

   protected static buo<?> a(buo<cht> $$0) {
      b($$0);
      e($$0);
      c($$0);
      d($$0);
      $$0.a(Set.of(cok.a));
      $$0.b(cok.b);
      $$0.f();
      return $$0;
   }

   static cht b(cht $$0) {
      $$0.dU().b(ccq.aS);
      $$0.dU().b(ccq.aR);
      return $$0.a(cht.a.a);
   }

   private static void b(buo<cht> $$0) {
      $$0.a(cok.a, 0, ImmutableList.of(new bxz(0.8F), new bva<cht>(2.0F) {
         protected void a(aqt $$0, cht $$1, long $$2) {
            chu.b($$1);
            super.b($$0, $$1, $$2);
         }
      }, new bwp(500, 700), new bvl(ccq.P)));
   }

   private static void c(buo<cht> $$0) {
      $$0.a(cok.v, ImmutableList.of(Pair.of(0, new chu.e())), Set.of(Pair.of(ccq.Z, ccr.b), Pair.of(ccq.aR, ccr.a), Pair.of(ccq.m, ccr.a)));
   }

   private static void d(buo<cht> $$0) {
      $$0.a(
         cok.z,
         ImmutableList.of(Pair.of(0, new chu.a(160, 180)), Pair.of(0, new chu.c(40))),
         Set.of(Pair.of(ccq.Z, ccr.b), Pair.of(ccq.m, ccr.b), Pair.of(ccq.aS, ccr.a))
      );
   }

   private static void e(buo<cht> $$0) {
      $$0.a(
         cok.b,
         ImmutableList.of(
            Pair.of(0, new buz(bsw.aR) {
               @Override
               protected void a(aqt $$0, cfc $$1, long $$2) {
                  chu.b((cht)$$1);
                  super.a($$0, $$1, $$2);
               }
            }),
            Pair.of(1, new bvs($$0x -> 1.25F, $$0x -> $$0x.o_() ? 2.5 : 3.5) {
               @Override
               protected void b(aqt $$0, btu $$1, long $$2) {
                  chu.b((cht)$$1);
                  super.b($$0, $$1, $$2);
               }
            }),
            Pair.of(2, new bwl(45, 90)),
            Pair.of(3, new chu.b(40, 100)),
            Pair.of(
               4,
               new bxc(
                  ImmutableList.of(
                     Pair.of(bxm.a(1.0F, 3), 2),
                     Pair.of(new chu.d(40, 80), 1),
                     Pair.of(new chu.f(40, 80), 1),
                     Pair.of(bxe.a(bsw.by, 6.0F), 1),
                     Pair.of(bwx.a(1.0F), 1),
                     Pair.of(new bvp(5, 20), 2)
                  )
               )
            )
         ),
         Set.of(Pair.of(ccq.aS, ccr.b))
      );
   }

   static void a(cht $$0) {
      $$0.dU().a(ImmutableList.of(cok.z, cok.v, cok.b));
   }

   static class a extends bvf<cht> {
      a(int $$0, int $$1) {
         super(Map.of(ccq.Z, ccr.b, ccq.m, ccr.b, ccq.aS, ccr.a, ccq.aG, ccr.b), $$0, $$1);
      }

      protected boolean a(aqt $$0, cht $$1) {
         return $$1.gm();
      }

      protected boolean a(aqt $$0, cht $$1, long $$2) {
         return $$1.dU().c(ccq.aS).isPresent() && $$1.gp() && !$$1.gu();
      }

      protected void b(aqt $$0, cht $$1, long $$2) {
         $$1.a(cht.a.f);
      }

      protected void c(aqt $$0, cht $$1, long $$2) {
         boolean $$3 = this.a($$2);
         if ($$3) {
            $$1.dU().a(ccq.aG, azr.a, 9600L);
         } else {
            chu.b($$1);
         }
      }
   }

   static class b extends bvf<cht> {
      b(int $$0, int $$1) {
         super(Map.of(ccq.aT, ccr.a), $$0, $$1);
      }

      protected boolean a(aqt $$0, cht $$1, long $$2) {
         return true;
      }

      protected void b(aqt $$0, cht $$1, long $$2) {
         $$1.a(cht.a.b);
      }

      protected void c(aqt $$0, cht $$1, long $$2) {
         $$1.a(cht.a.a);
         $$1.dU().b(ccq.aT);
      }
   }

   static class c extends bvf<cht> {
      c(int $$0) {
         super(Map.of(ccq.Z, ccr.b, ccq.m, ccr.b, ccq.aS, ccr.a, ccq.aG, ccr.a), $$0, $$0);
      }

      protected boolean a(aqt $$0, cht $$1) {
         return true;
      }

      protected boolean a(aqt $$0, cht $$1, long $$2) {
         return $$1.dU().c(ccq.aS).isPresent();
      }

      protected void b(aqt $$0, cht $$1, long $$2) {
         $$1.a(cht.a.g);
      }

      protected void c(aqt $$0, cht $$1, long $$2) {
         boolean $$3 = this.a($$2);
         $$1.a(cht.a.a).w($$3);
         $$1.dU().b(ccq.aS);
         $$1.dU().a(ccq.aT, true);
      }
   }

   static class d extends bvf<cht> {
      d(int $$0, int $$1) {
         super(Map.of(ccq.Z, ccr.b, ccq.aS, ccr.b, ccq.aR, ccr.b, ccq.aT, ccr.b, ccq.r, ccr.b), $$0, $$1);
      }

      protected boolean a(aqt $$0, cht $$1) {
         return !$$1.x();
      }

      protected boolean a(aqt $$0, cht $$1, long $$2) {
         return true;
      }

      protected void b(aqt $$0, cht $$1, long $$2) {
         $$1.a(cht.a.c);
      }

      protected void c(aqt $$0, cht $$1, long $$2) {
         $$1.a(cht.a.a);
      }
   }

   static class e extends bvf<cht> {
      e() {
         super(Map.of(ccq.m, ccr.a, ccq.Z, ccr.b, ccq.aR, ccr.a), 600);
      }

      protected boolean a(aqt $$0, cht $$1) {
         return $$1.gm();
      }

      protected boolean a(aqt $$0, cht $$1, long $$2) {
         if (!$$1.gm()) {
            $$1.a(cht.a.a);
            return false;
         } else {
            Optional<jd> $$3 = $$1.dU().c(ccq.m).map(cct::a).map(bwt::b);
            Optional<jd> $$4 = $$1.dU().c(ccq.aR);
            return !$$3.isEmpty() && !$$4.isEmpty() ? $$4.get().equals($$3.get()) : false;
         }
      }

      protected void b(aqt $$0, cht $$1, long $$2) {
         $$1.a(cht.a.e);
      }

      protected void c(aqt $$0, cht $$1, long $$2) {
         if ($$1.gp() && $$1.gm()) {
            $$1.dU().a(ccq.aS, true);
         }

         $$1.dU().b(ccq.m);
         $$1.dU().b(ccq.aR);
      }
   }

   static class f extends bvf<cht> {
      f(int $$0, int $$1) {
         super(Map.of(ccq.m, ccr.b, ccq.aR, ccr.b, ccq.aG, ccr.b), $$0, $$1);
      }

      protected boolean a(aqt $$0, cht $$1) {
         return !$$1.o_() && $$1.gm();
      }

      protected boolean a(aqt $$0, cht $$1, long $$2) {
         return $$1.gm();
      }

      protected void b(aqt $$0, cht $$1, long $$2) {
         $$1.a(cht.a.d);
      }

      protected void c(aqt $$0, cht $$1, long $$2) {
         boolean $$3 = this.a($$2);
         $$1.a(cht.a.a);
         if ($$3) {
            $$1.go().ifPresent($$1x -> {
               $$1.dU().a(ccq.aR, $$1x);
               $$1.dU().a(ccq.m, new cct($$1x, 1.25F, 0));
            });
         }
      }
   }
}
