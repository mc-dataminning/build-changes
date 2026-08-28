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

public class chz {
   private static final Logger c = LogUtils.getLogger();
   private static final int d = 6;
   static final List<cec<? extends ceb<? super chy>>> a = ImmutableList.of(cec.c, cec.f, cec.d, cec.y);
   static final List<ccv<?>> b = ImmutableList.of(
      ccv.n, ccv.m, ccv.E, ccv.t, ccv.Z, ccv.aR, ccv.aS, ccv.aT, ccv.aG, ccv.aQ, ccv.h, ccv.r, new ccv[]{ccv.O, ccv.P, ccv.R}
   );
   private static final int e = 9600;
   private static final float f = 1.0F;
   private static final float g = 2.0F;
   private static final float h = 1.25F;
   private static final float i = 1.25F;

   public static Predicate<cur> a() {
      return $$0 -> $$0.a(awy.X);
   }

   protected static but<?> a(but<chy> $$0) {
      b($$0);
      e($$0);
      c($$0);
      d($$0);
      $$0.a(Set.of(cop.a));
      $$0.b(cop.b);
      $$0.f();
      return $$0;
   }

   static chy b(chy $$0) {
      $$0.dS().b(ccv.aS);
      $$0.dS().b(ccv.aR);
      return $$0.a(chy.a.a);
   }

   private static void b(but<chy> $$0) {
      $$0.a(cop.a, 0, ImmutableList.of(new bye(0.8F), new bvf<chy>(2.0F) {
         protected void a(arf $$0, chy $$1, long $$2) {
            chz.b($$1);
            super.b($$0, $$1, $$2);
         }
      }, new bwu(500, 700), new bvq(ccv.P)));
   }

   private static void c(but<chy> $$0) {
      $$0.a(cop.v, ImmutableList.of(Pair.of(0, new chz.e())), Set.of(Pair.of(ccv.Z, ccw.b), Pair.of(ccv.aR, ccw.a), Pair.of(ccv.m, ccw.a)));
   }

   private static void d(but<chy> $$0) {
      $$0.a(
         cop.z,
         ImmutableList.of(Pair.of(0, new chz.a(160, 180)), Pair.of(0, new chz.c(40))),
         Set.of(Pair.of(ccv.Z, ccw.b), Pair.of(ccv.m, ccw.b), Pair.of(ccv.aS, ccw.a))
      );
   }

   private static void e(but<chy> $$0) {
      $$0.a(
         cop.b,
         ImmutableList.of(
            Pair.of(0, new bve(btc.aR) {
               @Override
               protected void a(arf $$0, cfh $$1, long $$2) {
                  chz.b((chy)$$1);
                  super.a($$0, $$1, $$2);
               }
            }),
            Pair.of(1, new bvx($$0x -> 1.25F, $$0x -> $$0x.p_() ? 2.5 : 3.5) {
               @Override
               protected void b(arf $$0, bua $$1, long $$2) {
                  chz.b((chy)$$1);
                  super.b($$0, $$1, $$2);
               }
            }),
            Pair.of(2, new bwq(45, 90)),
            Pair.of(3, new chz.b(40, 100)),
            Pair.of(
               4,
               new bxh(
                  ImmutableList.of(
                     Pair.of(bxr.a(1.0F, 3), 2),
                     Pair.of(new chz.d(40, 80), 1),
                     Pair.of(new chz.f(40, 80), 1),
                     Pair.of(bxj.a(btc.by, 6.0F), 1),
                     Pair.of(bxc.a(1.0F), 1),
                     Pair.of(new bvu(5, 20), 2)
                  )
               )
            )
         ),
         Set.of(Pair.of(ccv.aS, ccw.b))
      );
   }

   static void a(chy $$0) {
      $$0.dS().a(ImmutableList.of(cop.z, cop.v, cop.b));
   }

   static class a extends bvk<chy> {
      a(int $$0, int $$1) {
         super(Map.of(ccv.Z, ccw.b, ccv.m, ccw.b, ccv.aS, ccw.a, ccv.aG, ccw.b), $$0, $$1);
      }

      protected boolean a(arf $$0, chy $$1) {
         return $$1.gq();
      }

      protected boolean a(arf $$0, chy $$1, long $$2) {
         return $$1.dS().c(ccv.aS).isPresent() && $$1.gy() && !$$1.gu();
      }

      protected void b(arf $$0, chy $$1, long $$2) {
         $$1.a(chy.a.f);
      }

      protected void c(arf $$0, chy $$1, long $$2) {
         boolean $$3 = this.a($$2);
         if ($$3) {
            $$1.dS().a(ccv.aG, bac.a, 9600L);
         } else {
            chz.b($$1);
         }
      }
   }

   static class b extends bvk<chy> {
      b(int $$0, int $$1) {
         super(Map.of(ccv.aT, ccw.a), $$0, $$1);
      }

      protected boolean a(arf $$0, chy $$1, long $$2) {
         return true;
      }

      protected void b(arf $$0, chy $$1, long $$2) {
         $$1.a(chy.a.b);
      }

      protected void c(arf $$0, chy $$1, long $$2) {
         $$1.a(chy.a.a);
         $$1.dS().b(ccv.aT);
      }
   }

   static class c extends bvk<chy> {
      c(int $$0) {
         super(Map.of(ccv.Z, ccw.b, ccv.m, ccw.b, ccv.aS, ccw.a, ccv.aG, ccw.a), $$0, $$0);
      }

      protected boolean a(arf $$0, chy $$1) {
         return true;
      }

      protected boolean a(arf $$0, chy $$1, long $$2) {
         return $$1.dS().c(ccv.aS).isPresent();
      }

      protected void b(arf $$0, chy $$1, long $$2) {
         $$1.a(chy.a.g);
      }

      protected void c(arf $$0, chy $$1, long $$2) {
         boolean $$3 = this.a($$2);
         $$1.a(chy.a.a).w($$3);
         $$1.dS().b(ccv.aS);
         $$1.dS().a(ccv.aT, true);
      }
   }

   static class d extends bvk<chy> {
      d(int $$0, int $$1) {
         super(Map.of(ccv.Z, ccw.b, ccv.aS, ccw.b, ccv.aR, ccw.b, ccv.aT, ccw.b, ccv.r, ccw.b), $$0, $$1);
      }

      protected boolean a(arf $$0, chy $$1) {
         return !$$1.y();
      }

      protected boolean a(arf $$0, chy $$1, long $$2) {
         return true;
      }

      protected void b(arf $$0, chy $$1, long $$2) {
         $$1.a(chy.a.c);
      }

      protected void c(arf $$0, chy $$1, long $$2) {
         $$1.a(chy.a.a);
      }
   }

   static class e extends bvk<chy> {
      e() {
         super(Map.of(ccv.m, ccw.a, ccv.Z, ccw.b, ccv.aR, ccw.a), 600);
      }

      protected boolean a(arf $$0, chy $$1) {
         return $$1.gq();
      }

      protected boolean a(arf $$0, chy $$1, long $$2) {
         if (!$$1.gq()) {
            $$1.a(chy.a.a);
            return false;
         } else {
            Optional<iz> $$3 = $$1.dS().c(ccv.m).map(ccy::a).map(bwy::b);
            Optional<iz> $$4 = $$1.dS().c(ccv.aR);
            return !$$3.isEmpty() && !$$4.isEmpty() ? $$4.get().equals($$3.get()) : false;
         }
      }

      protected void b(arf $$0, chy $$1, long $$2) {
         $$1.a(chy.a.e);
      }

      protected void c(arf $$0, chy $$1, long $$2) {
         if ($$1.gy() && $$1.gq()) {
            $$1.dS().a(ccv.aS, true);
         }

         $$1.dS().b(ccv.m);
         $$1.dS().b(ccv.aR);
      }
   }

   static class f extends bvk<chy> {
      f(int $$0, int $$1) {
         super(Map.of(ccv.m, ccw.b, ccv.aR, ccw.b, ccv.aG, ccw.b), $$0, $$1);
      }

      protected boolean a(arf $$0, chy $$1) {
         return !$$1.p_() && $$1.gq();
      }

      protected boolean a(arf $$0, chy $$1, long $$2) {
         return $$1.gq();
      }

      protected void b(arf $$0, chy $$1, long $$2) {
         $$1.a(chy.a.d);
      }

      protected void c(arf $$0, chy $$1, long $$2) {
         boolean $$3 = this.a($$2);
         $$1.a(chy.a.a);
         if ($$3) {
            $$1.gx().ifPresent($$1x -> {
               $$1.dS().a(ccv.aR, $$1x);
               $$1.dS().a(ccv.m, new ccy($$1x, 1.25F, 0));
            });
         }
      }
   }
}
