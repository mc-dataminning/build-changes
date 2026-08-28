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

public class chy {
   private static final Logger c = LogUtils.getLogger();
   private static final int d = 6;
   static final List<ceb<? extends cea<? super chx>>> a = ImmutableList.of(ceb.c, ceb.f, ceb.d, ceb.y);
   static final List<ccu<?>> b = ImmutableList.of(
      ccu.n, ccu.m, ccu.E, ccu.t, ccu.Z, ccu.aR, ccu.aS, ccu.aT, ccu.aG, ccu.aQ, ccu.h, ccu.r, new ccu[]{ccu.O, ccu.P, ccu.R}
   );
   private static final int e = 9600;
   private static final float f = 1.0F;
   private static final float g = 2.0F;
   private static final float h = 1.25F;
   private static final float i = 1.25F;

   public static Predicate<cuq> a() {
      return $$0 -> $$0.a(awy.X);
   }

   protected static bus<?> a(bus<chx> $$0) {
      b($$0);
      e($$0);
      c($$0);
      d($$0);
      $$0.a(Set.of(coo.a));
      $$0.b(coo.b);
      $$0.f();
      return $$0;
   }

   static chx b(chx $$0) {
      $$0.dS().b(ccu.aS);
      $$0.dS().b(ccu.aR);
      return $$0.a(chx.a.a);
   }

   private static void b(bus<chx> $$0) {
      $$0.a(coo.a, 0, ImmutableList.of(new byd(0.8F), new bve<chx>(2.0F) {
         protected void a(arf $$0, chx $$1, long $$2) {
            chy.b($$1);
            super.b($$0, $$1, $$2);
         }
      }, new bwt(500, 700), new bvp(ccu.P)));
   }

   private static void c(bus<chx> $$0) {
      $$0.a(coo.v, ImmutableList.of(Pair.of(0, new chy.e())), Set.of(Pair.of(ccu.Z, ccv.b), Pair.of(ccu.aR, ccv.a), Pair.of(ccu.m, ccv.a)));
   }

   private static void d(bus<chx> $$0) {
      $$0.a(
         coo.z,
         ImmutableList.of(Pair.of(0, new chy.a(160, 180)), Pair.of(0, new chy.c(40))),
         Set.of(Pair.of(ccu.Z, ccv.b), Pair.of(ccu.m, ccv.b), Pair.of(ccu.aS, ccv.a))
      );
   }

   private static void e(bus<chx> $$0) {
      $$0.a(
         coo.b,
         ImmutableList.of(
            Pair.of(0, new bvd(btb.aR) {
               @Override
               protected void a(arf $$0, cfg $$1, long $$2) {
                  chy.b((chx)$$1);
                  super.a($$0, $$1, $$2);
               }
            }),
            Pair.of(1, new bvw($$0x -> 1.25F, $$0x -> $$0x.p_() ? 2.5 : 3.5) {
               @Override
               protected void b(arf $$0, btz $$1, long $$2) {
                  chy.b((chx)$$1);
                  super.b($$0, $$1, $$2);
               }
            }),
            Pair.of(2, new bwp(45, 90)),
            Pair.of(3, new chy.b(40, 100)),
            Pair.of(
               4,
               new bxg(
                  ImmutableList.of(
                     Pair.of(bxq.a(1.0F, 3), 2),
                     Pair.of(new chy.d(40, 80), 1),
                     Pair.of(new chy.f(40, 80), 1),
                     Pair.of(bxi.a(btb.by, 6.0F), 1),
                     Pair.of(bxb.a(1.0F), 1),
                     Pair.of(new bvt(5, 20), 2)
                  )
               )
            )
         ),
         Set.of(Pair.of(ccu.aS, ccv.b))
      );
   }

   static void a(chx $$0) {
      $$0.dS().a(ImmutableList.of(coo.z, coo.v, coo.b));
   }

   static class a extends bvj<chx> {
      a(int $$0, int $$1) {
         super(Map.of(ccu.Z, ccv.b, ccu.m, ccv.b, ccu.aS, ccv.a, ccu.aG, ccv.b), $$0, $$1);
      }

      protected boolean a(arf $$0, chx $$1) {
         return $$1.gq();
      }

      protected boolean a(arf $$0, chx $$1, long $$2) {
         return $$1.dS().c(ccu.aS).isPresent() && $$1.gy() && !$$1.gu();
      }

      protected void b(arf $$0, chx $$1, long $$2) {
         $$1.a(chx.a.f);
      }

      protected void c(arf $$0, chx $$1, long $$2) {
         boolean $$3 = this.a($$2);
         if ($$3) {
            $$1.dS().a(ccu.aG, bac.a, 9600L);
         } else {
            chy.b($$1);
         }
      }
   }

   static class b extends bvj<chx> {
      b(int $$0, int $$1) {
         super(Map.of(ccu.aT, ccv.a), $$0, $$1);
      }

      protected boolean a(arf $$0, chx $$1, long $$2) {
         return true;
      }

      protected void b(arf $$0, chx $$1, long $$2) {
         $$1.a(chx.a.b);
      }

      protected void c(arf $$0, chx $$1, long $$2) {
         $$1.a(chx.a.a);
         $$1.dS().b(ccu.aT);
      }
   }

   static class c extends bvj<chx> {
      c(int $$0) {
         super(Map.of(ccu.Z, ccv.b, ccu.m, ccv.b, ccu.aS, ccv.a, ccu.aG, ccv.a), $$0, $$0);
      }

      protected boolean a(arf $$0, chx $$1) {
         return true;
      }

      protected boolean a(arf $$0, chx $$1, long $$2) {
         return $$1.dS().c(ccu.aS).isPresent();
      }

      protected void b(arf $$0, chx $$1, long $$2) {
         $$1.a(chx.a.g);
      }

      protected void c(arf $$0, chx $$1, long $$2) {
         boolean $$3 = this.a($$2);
         $$1.a(chx.a.a).w($$3);
         $$1.dS().b(ccu.aS);
         $$1.dS().a(ccu.aT, true);
      }
   }

   static class d extends bvj<chx> {
      d(int $$0, int $$1) {
         super(Map.of(ccu.Z, ccv.b, ccu.aS, ccv.b, ccu.aR, ccv.b, ccu.aT, ccv.b, ccu.r, ccv.b), $$0, $$1);
      }

      protected boolean a(arf $$0, chx $$1) {
         return !$$1.y();
      }

      protected boolean a(arf $$0, chx $$1, long $$2) {
         return true;
      }

      protected void b(arf $$0, chx $$1, long $$2) {
         $$1.a(chx.a.c);
      }

      protected void c(arf $$0, chx $$1, long $$2) {
         $$1.a(chx.a.a);
      }
   }

   static class e extends bvj<chx> {
      e() {
         super(Map.of(ccu.m, ccv.a, ccu.Z, ccv.b, ccu.aR, ccv.a), 600);
      }

      protected boolean a(arf $$0, chx $$1) {
         return $$1.gq();
      }

      protected boolean a(arf $$0, chx $$1, long $$2) {
         if (!$$1.gq()) {
            $$1.a(chx.a.a);
            return false;
         } else {
            Optional<iz> $$3 = $$1.dS().c(ccu.m).map(ccx::a).map(bwx::b);
            Optional<iz> $$4 = $$1.dS().c(ccu.aR);
            return !$$3.isEmpty() && !$$4.isEmpty() ? $$4.get().equals($$3.get()) : false;
         }
      }

      protected void b(arf $$0, chx $$1, long $$2) {
         $$1.a(chx.a.e);
      }

      protected void c(arf $$0, chx $$1, long $$2) {
         if ($$1.gy() && $$1.gq()) {
            $$1.dS().a(ccu.aS, true);
         }

         $$1.dS().b(ccu.m);
         $$1.dS().b(ccu.aR);
      }
   }

   static class f extends bvj<chx> {
      f(int $$0, int $$1) {
         super(Map.of(ccu.m, ccv.b, ccu.aR, ccv.b, ccu.aG, ccv.b), $$0, $$1);
      }

      protected boolean a(arf $$0, chx $$1) {
         return !$$1.p_() && $$1.gq();
      }

      protected boolean a(arf $$0, chx $$1, long $$2) {
         return $$1.gq();
      }

      protected void b(arf $$0, chx $$1, long $$2) {
         $$1.a(chx.a.d);
      }

      protected void c(arf $$0, chx $$1, long $$2) {
         boolean $$3 = this.a($$2);
         $$1.a(chx.a.a);
         if ($$3) {
            $$1.gx().ifPresent($$1x -> {
               $$1.dS().a(ccu.aR, $$1x);
               $$1.dS().a(ccu.m, new ccx($$1x, 1.25F, 0));
            });
         }
      }
   }
}
