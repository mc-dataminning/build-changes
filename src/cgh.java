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

public class cgh {
   private static final Logger c = LogUtils.getLogger();
   private static final int d = 6;
   static final List<cck<? extends ccj<? super cgg>>> a = ImmutableList.of(cck.c, cck.f, cck.d, cck.y);
   static final List<cbd<?>> b = ImmutableList.of(
      cbd.n, cbd.m, cbd.E, cbd.t, cbd.Z, cbd.aR, cbd.aS, cbd.aT, cbd.aG, cbd.aQ, cbd.h, cbd.r, new cbd[]{cbd.O, cbd.P, cbd.R}
   );
   private static final int e = 9600;
   private static final float f = 1.0F;
   private static final float g = 2.0F;
   private static final float h = 1.25F;
   private static final float i = 1.25F;

   public static Predicate<csz> a() {
      return $$0 -> $$0.a(avz.X);
   }

   protected static btb<?> a(btb<cgg> $$0) {
      b($$0);
      e($$0);
      c($$0);
      d($$0);
      $$0.a(Set.of(cmw.a));
      $$0.b(cmw.b);
      $$0.f();
      return $$0;
   }

   static cgg b(cgg $$0) {
      $$0.dQ().b(cbd.aS);
      $$0.dQ().b(cbd.aR);
      return $$0.a(cgg.a.a);
   }

   private static void b(btb<cgg> $$0) {
      $$0.a(cmw.a, 0, ImmutableList.of(new bwm(0.8F), new btn<cgg>(2.0F) {
         protected void a(aqh $$0, cgg $$1, long $$2) {
            cgh.b($$1);
            super.b($$0, $$1, $$2);
         }
      }, new bvc(500, 700), new bty(cbd.P)));
   }

   private static void c(btb<cgg> $$0) {
      $$0.a(cmw.v, ImmutableList.of(Pair.of(0, new cgh.e())), Set.of(Pair.of(cbd.Z, cbe.b), Pair.of(cbd.aR, cbe.a), Pair.of(cbd.m, cbe.a)));
   }

   private static void d(btb<cgg> $$0) {
      $$0.a(
         cmw.z,
         ImmutableList.of(Pair.of(0, new cgh.a(160, 180)), Pair.of(0, new cgh.c(40))),
         Set.of(Pair.of(cbd.Z, cbe.b), Pair.of(cbd.m, cbe.b), Pair.of(cbd.aS, cbe.a))
      );
   }

   private static void e(btb<cgg> $$0) {
      $$0.a(
         cmw.b,
         ImmutableList.of(
            Pair.of(0, new btm(brn.aQ) {
               @Override
               protected void a(aqh $$0, cdp $$1, long $$2) {
                  cgh.b((cgg)$$1);
                  super.a($$0, $$1, $$2);
               }
            }),
            Pair.of(1, new buf($$0x -> 1.25F, $$0x -> $$0x.p_() ? 2.5 : 3.5) {
               @Override
               protected void b(aqh $$0, bsi $$1, long $$2) {
                  cgh.b((cgg)$$1);
                  super.b($$0, $$1, $$2);
               }
            }),
            Pair.of(2, new buy(45, 90)),
            Pair.of(3, new cgh.b(40, 100)),
            Pair.of(
               4,
               new bvp(
                  ImmutableList.of(
                     Pair.of(bvz.a(1.0F, 3), 2),
                     Pair.of(new cgh.d(40, 80), 1),
                     Pair.of(new cgh.f(40, 80), 1),
                     Pair.of(bvr.a(brn.bx, 6.0F), 1),
                     Pair.of(bvk.a(1.0F), 1),
                     Pair.of(new buc(5, 20), 2)
                  )
               )
            )
         ),
         Set.of(Pair.of(cbd.aS, cbe.b))
      );
   }

   static void a(cgg $$0) {
      $$0.dQ().a(ImmutableList.of(cmw.z, cmw.v, cmw.b));
   }

   static class a extends bts<cgg> {
      a(int $$0, int $$1) {
         super(Map.of(cbd.Z, cbe.b, cbd.m, cbe.b, cbd.aS, cbe.a, cbd.aG, cbe.b), $$0, $$1);
      }

      protected boolean a(aqh $$0, cgg $$1) {
         return $$1.gp();
      }

      protected boolean a(aqh $$0, cgg $$1, long $$2) {
         return $$1.dQ().c(cbd.aS).isPresent() && $$1.gx() && !$$1.gt();
      }

      protected void b(aqh $$0, cgg $$1, long $$2) {
         $$1.a(cgg.a.f);
      }

      protected void c(aqh $$0, cgg $$1, long $$2) {
         boolean $$3 = this.a($$2);
         if ($$3) {
            $$1.dQ().a(cbd.aG, azb.a, 9600L);
         } else {
            cgh.b($$1);
         }
      }
   }

   static class b extends bts<cgg> {
      b(int $$0, int $$1) {
         super(Map.of(cbd.aT, cbe.a), $$0, $$1);
      }

      protected boolean a(aqh $$0, cgg $$1, long $$2) {
         return true;
      }

      protected void b(aqh $$0, cgg $$1, long $$2) {
         $$1.a(cgg.a.b);
      }

      protected void c(aqh $$0, cgg $$1, long $$2) {
         $$1.a(cgg.a.a);
         $$1.dQ().b(cbd.aT);
      }
   }

   static class c extends bts<cgg> {
      c(int $$0) {
         super(Map.of(cbd.Z, cbe.b, cbd.m, cbe.b, cbd.aS, cbe.a, cbd.aG, cbe.a), $$0, $$0);
      }

      protected boolean a(aqh $$0, cgg $$1) {
         return true;
      }

      protected boolean a(aqh $$0, cgg $$1, long $$2) {
         return $$1.dQ().c(cbd.aS).isPresent();
      }

      protected void b(aqh $$0, cgg $$1, long $$2) {
         $$1.a(cgg.a.g);
      }

      protected void c(aqh $$0, cgg $$1, long $$2) {
         boolean $$3 = this.a($$2);
         $$1.a(cgg.a.a).w($$3);
         $$1.dQ().b(cbd.aS);
         $$1.dQ().a(cbd.aT, true);
      }
   }

   static class d extends bts<cgg> {
      d(int $$0, int $$1) {
         super(Map.of(cbd.Z, cbe.b, cbd.aS, cbe.b, cbd.aR, cbe.b, cbd.aT, cbe.b, cbd.r, cbe.b), $$0, $$1);
      }

      protected boolean a(aqh $$0, cgg $$1) {
         return !$$1.y();
      }

      protected boolean a(aqh $$0, cgg $$1, long $$2) {
         return true;
      }

      protected void b(aqh $$0, cgg $$1, long $$2) {
         $$1.a(cgg.a.c);
      }

      protected void c(aqh $$0, cgg $$1, long $$2) {
         $$1.a(cgg.a.a);
      }
   }

   static class e extends bts<cgg> {
      e() {
         super(Map.of(cbd.m, cbe.a, cbd.Z, cbe.b, cbd.aR, cbe.a), 600);
      }

      protected boolean a(aqh $$0, cgg $$1) {
         return $$1.gp();
      }

      protected boolean a(aqh $$0, cgg $$1, long $$2) {
         if (!$$1.gp()) {
            $$1.a(cgg.a.a);
            return false;
         } else {
            Optional<in> $$3 = $$1.dQ().c(cbd.m).map(cbg::a).map(bvg::b);
            Optional<in> $$4 = $$1.dQ().c(cbd.aR);
            return !$$3.isEmpty() && !$$4.isEmpty() ? $$4.get().equals($$3.get()) : false;
         }
      }

      protected void b(aqh $$0, cgg $$1, long $$2) {
         $$1.a(cgg.a.e);
      }

      protected void c(aqh $$0, cgg $$1, long $$2) {
         if ($$1.gx() && $$1.gp()) {
            $$1.dQ().a(cbd.aS, true);
         }

         $$1.dQ().b(cbd.m);
         $$1.dQ().b(cbd.aR);
      }
   }

   static class f extends bts<cgg> {
      f(int $$0, int $$1) {
         super(Map.of(cbd.m, cbe.b, cbd.aR, cbe.b, cbd.aG, cbe.b), $$0, $$1);
      }

      protected boolean a(aqh $$0, cgg $$1) {
         return !$$1.p_() && $$1.gp();
      }

      protected boolean a(aqh $$0, cgg $$1, long $$2) {
         return $$1.gp();
      }

      protected void b(aqh $$0, cgg $$1, long $$2) {
         $$1.a(cgg.a.d);
      }

      protected void c(aqh $$0, cgg $$1, long $$2) {
         boolean $$3 = this.a($$2);
         $$1.a(cgg.a.a);
         if ($$3) {
            $$1.gw().ifPresent($$1x -> {
               $$1.dQ().a(cbd.aR, $$1x);
               $$1.dQ().a(cbd.m, new cbg($$1x, 1.25F, 0));
            });
         }
      }
   }
}
