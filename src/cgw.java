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

public class cgw {
   private static final Logger c = LogUtils.getLogger();
   private static final int d = 6;
   static final List<ccy<? extends ccx<? super cgv>>> a = ImmutableList.of(ccy.c, ccy.f, ccy.d, ccy.y);
   static final List<cbr<?>> b = ImmutableList.of(
      cbr.n, cbr.m, cbr.E, cbr.t, cbr.Z, cbr.aR, cbr.aS, cbr.aT, cbr.aG, cbr.aQ, cbr.h, cbr.r, new cbr[]{cbr.O, cbr.P, cbr.R}
   );
   private static final int e = 9600;
   private static final float f = 1.0F;
   private static final float g = 2.0F;
   private static final float h = 1.25F;
   private static final float i = 1.25F;

   public static Predicate<cuh> a() {
      return $$0 -> $$0.a(awm.X);
   }

   protected static btp<?> a(btp<cgv> $$0) {
      b($$0);
      e($$0);
      c($$0);
      d($$0);
      $$0.a(Set.of(cnq.a));
      $$0.b(cnq.b);
      $$0.f();
      return $$0;
   }

   static cgv b(cgv $$0) {
      $$0.dZ().b(cbr.aS);
      $$0.dZ().b(cbr.aR);
      return $$0.a(cgv.a.a);
   }

   private static void b(btp<cgv> $$0) {
      $$0.a(cnq.a, 0, ImmutableList.of(new bxa(0.8F), new bub<cgv>(2.0F) {
         protected void a(aqt $$0, cgv $$1, long $$2) {
            cgw.b($$1);
            super.b($$0, $$1, $$2);
         }
      }, new bvq(500, 700), new bum(cbr.P)));
   }

   private static void c(btp<cgv> $$0) {
      $$0.a(cnq.v, ImmutableList.of(Pair.of(0, new cgw.e())), Set.of(Pair.of(cbr.Z, cbs.b), Pair.of(cbr.aR, cbs.a), Pair.of(cbr.m, cbs.a)));
   }

   private static void d(btp<cgv> $$0) {
      $$0.a(
         cnq.z,
         ImmutableList.of(Pair.of(0, new cgw.a(160, 180)), Pair.of(0, new cgw.c(40))),
         Set.of(Pair.of(cbr.Z, cbs.b), Pair.of(cbr.m, cbs.b), Pair.of(cbr.aS, cbs.a))
      );
   }

   private static void e(btp<cgv> $$0) {
      $$0.a(
         cnq.b,
         ImmutableList.of(
            Pair.of(0, new bua(bsb.aU) {
               @Override
               protected void a(aqt $$0, cee $$1, long $$2) {
                  cgw.b((cgv)$$1);
                  super.a($$0, $$1, $$2);
               }
            }),
            Pair.of(1, new but($$0x -> 1.25F, $$0x -> $$0x.o_() ? 2.5 : 3.5) {
               @Override
               protected void b(aqt $$0, bsw $$1, long $$2) {
                  cgw.b((cgv)$$1);
                  super.b($$0, $$1, $$2);
               }
            }),
            Pair.of(2, new bvm(45, 90)),
            Pair.of(3, new cgw.b(40, 100)),
            Pair.of(
               4,
               new bwd(
                  ImmutableList.of(
                     Pair.of(bwn.a(1.0F, 3), 2),
                     Pair.of(new cgw.d(40, 80), 1),
                     Pair.of(new cgw.f(40, 80), 1),
                     Pair.of(bwf.a(bsb.bE, 6.0F), 1),
                     Pair.of(bvy.a(1.0F), 1),
                     Pair.of(new buq(5, 20), 2)
                  )
               )
            )
         ),
         Set.of(Pair.of(cbr.aS, cbs.b))
      );
   }

   static void a(cgv $$0) {
      $$0.dZ().a(ImmutableList.of(cnq.z, cnq.v, cnq.b));
   }

   static class a extends bug<cgv> {
      a(int $$0, int $$1) {
         super(Map.of(cbr.Z, cbs.b, cbr.m, cbs.b, cbr.aS, cbs.a, cbr.aG, cbs.b), $$0, $$1);
      }

      protected boolean a(aqt $$0, cgv $$1) {
         return $$1.gy();
      }

      protected boolean a(aqt $$0, cgv $$1, long $$2) {
         return $$1.dZ().c(cbr.aS).isPresent() && $$1.gG() && !$$1.gC();
      }

      protected void b(aqt $$0, cgv $$1, long $$2) {
         $$1.a(cgv.a.f);
      }

      protected void c(aqt $$0, cgv $$1, long $$2) {
         boolean $$3 = this.a($$2);
         if ($$3) {
            $$1.dZ().a(cbr.aG, azo.a, 9600L);
         } else {
            cgw.b($$1);
         }
      }
   }

   static class b extends bug<cgv> {
      b(int $$0, int $$1) {
         super(Map.of(cbr.aT, cbs.a), $$0, $$1);
      }

      protected boolean a(aqt $$0, cgv $$1, long $$2) {
         return true;
      }

      protected void b(aqt $$0, cgv $$1, long $$2) {
         $$1.a(cgv.a.b);
      }

      protected void c(aqt $$0, cgv $$1, long $$2) {
         $$1.a(cgv.a.a);
         $$1.dZ().b(cbr.aT);
      }
   }

   static class c extends bug<cgv> {
      c(int $$0) {
         super(Map.of(cbr.Z, cbs.b, cbr.m, cbs.b, cbr.aS, cbs.a, cbr.aG, cbs.a), $$0, $$0);
      }

      protected boolean a(aqt $$0, cgv $$1) {
         return true;
      }

      protected boolean a(aqt $$0, cgv $$1, long $$2) {
         return $$1.dZ().c(cbr.aS).isPresent();
      }

      protected void b(aqt $$0, cgv $$1, long $$2) {
         $$1.a(cgv.a.g);
      }

      protected void c(aqt $$0, cgv $$1, long $$2) {
         boolean $$3 = this.a($$2);
         $$1.a(cgv.a.a).w($$3);
         $$1.dZ().b(cbr.aS);
         $$1.dZ().a(cbr.aT, true);
      }
   }

   static class d extends bug<cgv> {
      d(int $$0, int $$1) {
         super(Map.of(cbr.Z, cbs.b, cbr.aS, cbs.b, cbr.aR, cbs.b, cbr.aT, cbs.b, cbr.r, cbs.b), $$0, $$1);
      }

      protected boolean a(aqt $$0, cgv $$1) {
         return !$$1.x();
      }

      protected boolean a(aqt $$0, cgv $$1, long $$2) {
         return true;
      }

      protected void b(aqt $$0, cgv $$1, long $$2) {
         $$1.a(cgv.a.c);
      }

      protected void c(aqt $$0, cgv $$1, long $$2) {
         $$1.a(cgv.a.a);
      }
   }

   static class e extends bug<cgv> {
      e() {
         super(Map.of(cbr.m, cbs.a, cbr.Z, cbs.b, cbr.aR, cbs.a), 600);
      }

      protected boolean a(aqt $$0, cgv $$1) {
         return $$1.gy();
      }

      protected boolean a(aqt $$0, cgv $$1, long $$2) {
         if (!$$1.gy()) {
            $$1.a(cgv.a.a);
            return false;
         } else {
            Optional<ir> $$3 = $$1.dZ().c(cbr.m).map(cbu::a).map(bvu::b);
            Optional<ir> $$4 = $$1.dZ().c(cbr.aR);
            return !$$3.isEmpty() && !$$4.isEmpty() ? $$4.get().equals($$3.get()) : false;
         }
      }

      protected void b(aqt $$0, cgv $$1, long $$2) {
         $$1.a(cgv.a.e);
      }

      protected void c(aqt $$0, cgv $$1, long $$2) {
         if ($$1.gG() && $$1.gy()) {
            $$1.dZ().a(cbr.aS, true);
         }

         $$1.dZ().b(cbr.m);
         $$1.dZ().b(cbr.aR);
      }
   }

   static class f extends bug<cgv> {
      f(int $$0, int $$1) {
         super(Map.of(cbr.m, cbs.b, cbr.aR, cbs.b, cbr.aG, cbs.b), $$0, $$1);
      }

      protected boolean a(aqt $$0, cgv $$1) {
         return !$$1.o_() && $$1.gy();
      }

      protected boolean a(aqt $$0, cgv $$1, long $$2) {
         return $$1.gy();
      }

      protected void b(aqt $$0, cgv $$1, long $$2) {
         $$1.a(cgv.a.d);
      }

      protected void c(aqt $$0, cgv $$1, long $$2) {
         boolean $$3 = this.a($$2);
         $$1.a(cgv.a.a);
         if ($$3) {
            $$1.gF().ifPresent($$1x -> {
               $$1.dZ().a(cbr.aR, $$1x);
               $$1.dZ().a(cbr.m, new cbu($$1x, 1.25F, 0));
            });
         }
      }
   }
}
