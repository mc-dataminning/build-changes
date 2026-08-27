import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import org.slf4j.Logger;

public class ccj {
   private static final Logger c = LogUtils.getLogger();
   private static final int d = 6;
   static final List<byo<? extends byn<? super cci>>> a = ImmutableList.of(byo.c, byo.f, byo.d, byo.y);
   static final List<bxh<?>> b = ImmutableList.of(
      bxh.n, bxh.m, bxh.E, bxh.t, bxh.Z, bxh.aR, bxh.aS, bxh.aT, bxh.aG, bxh.aQ, bxh.h, bxh.r, new bxh[]{bxh.O, bxh.P, bxh.R}
   );
   private static final int e = 9600;
   private static final float f = 1.0F;
   private static final float g = 2.0F;
   private static final float h = 1.25F;
   private static final float i = 1.25F;

   public static cry a() {
      return cry.a(cpc.ve);
   }

   protected static bpf<?> a(bpf<cci> $$0) {
      b($$0);
      e($$0);
      c($$0);
      d($$0);
      $$0.a(Set.of(ciu.a));
      $$0.b(ciu.b);
      $$0.f();
      return $$0;
   }

   static cci b(cci $$0) {
      $$0.dO().b(bxh.aS);
      $$0.dO().b(bxh.aR);
      return $$0.a(cci.a.a);
   }

   private static void b(bpf<cci> $$0) {
      $$0.a(ciu.a, 0, ImmutableList.of(new bsq(0.8F), new bpr(2.0F) {
         @Override
         protected void b(aov $$0, boo $$1, long $$2) {
            ccj.b((cci)$$1);
            super.b($$0, $$1, $$2);
         }
      }, new brg(500, 700), new bqc(bxh.P)));
   }

   private static void c(bpf<cci> $$0) {
      $$0.a(ciu.v, ImmutableList.of(Pair.of(0, new ccj.e())), Set.of(Pair.of(bxh.Z, bxi.b), Pair.of(bxh.aR, bxi.a), Pair.of(bxh.m, bxi.a)));
   }

   private static void d(bpf<cci> $$0) {
      $$0.a(
         ciu.z,
         ImmutableList.of(Pair.of(0, new ccj.a(160, 180)), Pair.of(0, new ccj.c(40))),
         Set.of(Pair.of(bxh.Z, bxi.b), Pair.of(bxh.m, bxi.b), Pair.of(bxh.aS, bxi.a))
      );
   }

   private static void e(bpf<cci> $$0) {
      $$0.a(
         ciu.b,
         ImmutableList.of(
            Pair.of(0, new bpq(bnu.aP) {
               @Override
               protected void a(aov $$0, bzt $$1, long $$2) {
                  ccj.b((cci)$$1);
                  super.a($$0, $$1, $$2);
               }
            }),
            Pair.of(1, new bqj($$0x -> 1.25F, $$0x -> $$0x.o_() ? 2.5 : 3.5) {
               @Override
               protected void b(aov $$0, boo $$1, long $$2) {
                  ccj.b((cci)$$1);
                  super.b($$0, $$1, $$2);
               }
            }),
            Pair.of(2, new brc(45, 90)),
            Pair.of(3, new ccj.b(40, 100)),
            Pair.of(
               4,
               new brt(
                  ImmutableList.of(
                     Pair.of(bsd.a(1.0F, 3), 2),
                     Pair.of(new ccj.d(40, 80), 1),
                     Pair.of(new ccj.f(40, 80), 1),
                     Pair.of(brv.a(bnu.bw, 6.0F), 1),
                     Pair.of(bro.a(1.0F), 1),
                     Pair.of(new bqg(5, 20), 2)
                  )
               )
            )
         ),
         Set.of(Pair.of(bxh.aS, bxi.b))
      );
   }

   static void a(cci $$0) {
      $$0.dO().a(ImmutableList.of(ciu.z, ciu.v, ciu.b));
   }

   static class a extends bpw<cci> {
      a(int $$0, int $$1) {
         super(Map.of(bxh.Z, bxi.b, bxh.m, bxi.b, bxh.aS, bxi.a, bxh.aG, bxi.b), $$0, $$1);
      }

      protected boolean a(aov $$0, cci $$1) {
         return $$1.gg();
      }

      protected boolean a(aov $$0, cci $$1, long $$2) {
         return $$1.dO().c(bxh.aS).isPresent() && $$1.go() && !$$1.gk();
      }

      protected void b(aov $$0, cci $$1, long $$2) {
         $$1.a(cci.a.f);
      }

      protected void c(aov $$0, cci $$1, long $$2) {
         boolean $$3 = this.a($$2);
         if ($$3) {
            $$1.dO().a(bxh.aG, axk.a, 9600L);
         } else {
            ccj.b($$1);
         }
      }
   }

   static class b extends bpw<cci> {
      b(int $$0, int $$1) {
         super(Map.of(bxh.aT, bxi.a), $$0, $$1);
      }

      protected boolean a(aov $$0, cci $$1, long $$2) {
         return true;
      }

      protected void b(aov $$0, cci $$1, long $$2) {
         $$1.a(cci.a.b);
      }

      protected void c(aov $$0, cci $$1, long $$2) {
         $$1.a(cci.a.a);
         $$1.dO().b(bxh.aT);
      }
   }

   static class c extends bpw<cci> {
      c(int $$0) {
         super(Map.of(bxh.Z, bxi.b, bxh.m, bxi.b, bxh.aS, bxi.a, bxh.aG, bxi.a), $$0, $$0);
      }

      protected boolean a(aov $$0, cci $$1) {
         return true;
      }

      protected boolean a(aov $$0, cci $$1, long $$2) {
         return $$1.dO().c(bxh.aS).isPresent();
      }

      protected void b(aov $$0, cci $$1, long $$2) {
         $$1.a(cci.a.g);
      }

      protected void c(aov $$0, cci $$1, long $$2) {
         boolean $$3 = this.a($$2);
         $$1.a(cci.a.a).w($$3);
         $$1.dO().b(bxh.aS);
         $$1.dO().a(bxh.aT, true);
      }
   }

   static class d extends bpw<cci> {
      d(int $$0, int $$1) {
         super(Map.of(bxh.Z, bxi.b, bxh.aS, bxi.b, bxh.aR, bxi.b, bxh.aT, bxi.b, bxh.r, bxi.b), $$0, $$1);
      }

      protected boolean a(aov $$0, cci $$1) {
         return !$$1.A();
      }

      protected boolean a(aov $$0, cci $$1, long $$2) {
         return true;
      }

      protected void b(aov $$0, cci $$1, long $$2) {
         $$1.a(cci.a.c);
      }

      protected void c(aov $$0, cci $$1, long $$2) {
         $$1.a(cci.a.a);
      }
   }

   static class e extends bpw<cci> {
      e() {
         super(Map.of(bxh.m, bxi.a, bxh.Z, bxi.b, bxh.aR, bxi.a), 600);
      }

      protected boolean a(aov $$0, cci $$1) {
         return $$1.gg();
      }

      protected boolean a(aov $$0, cci $$1, long $$2) {
         if (!$$1.gg()) {
            $$1.a(cci.a.a);
            return false;
         } else {
            Optional<hz> $$3 = $$1.dO().c(bxh.m).map(bxk::a).map(brk::b);
            Optional<hz> $$4 = $$1.dO().c(bxh.aR);
            return !$$3.isEmpty() && !$$4.isEmpty() ? $$4.get().equals($$3.get()) : false;
         }
      }

      protected void b(aov $$0, cci $$1, long $$2) {
         $$1.a(cci.a.e);
      }

      protected void c(aov $$0, cci $$1, long $$2) {
         if ($$1.go() && $$1.gg()) {
            $$1.dO().a(bxh.aS, true);
         }

         $$1.dO().b(bxh.m);
         $$1.dO().b(bxh.aR);
      }
   }

   static class f extends bpw<cci> {
      f(int $$0, int $$1) {
         super(Map.of(bxh.m, bxi.b, bxh.aR, bxi.b, bxh.aG, bxi.b), $$0, $$1);
      }

      protected boolean a(aov $$0, cci $$1) {
         return !$$1.o_() && $$1.gg();
      }

      protected boolean a(aov $$0, cci $$1, long $$2) {
         return $$1.gg();
      }

      protected void b(aov $$0, cci $$1, long $$2) {
         $$1.a(cci.a.d);
      }

      protected void c(aov $$0, cci $$1, long $$2) {
         boolean $$3 = this.a($$2);
         $$1.a(cci.a.a);
         if ($$3) {
            $$1.gn().ifPresent($$1x -> {
               $$1.dO().a(bxh.aR, $$1x);
               $$1.dO().a(bxh.m, new bxk($$1x, 1.25F, 0));
            });
         }
      }
   }
}
