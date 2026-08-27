import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;

public class ccl {
   public static final ctk a = ctk.a(cqn.sl);
   private static final float b = 2.0F;
   private static final float c = 1.0F;
   private static final float d = 1.25F;
   private static final float e = 1.25F;
   private static final float f = 1.0F;
   private static final double g = 2.0;
   private static final double h = 1.0;
   private static final bmn i = bmn.a(5, 16);
   private static final ImmutableList<bzy<? extends bzx<? super cck>>> j = ImmutableList.of(bzy.c, bzy.f, bzy.u, bzy.o, bzy.k);
   private static final ImmutableList<byr<?>> k = ImmutableList.of(
      byr.Z, byr.x, byr.y, byr.m, byr.n, byr.E, byr.t, byr.h, byr.O, byr.P, byr.Q, byr.R, new byr[]{byr.r, byr.K, byr.G}
   );
   private static final bsr<cck> l = but.a(
      (Function<but.b<cck>, ? extends App<but.c<cck>, buw<cck>>>)($$0 -> $$0.group($$0.c(byr.G)).apply($$0, $$0x -> ($$0xx, $$1, $$2) -> {
               if ($$1.s()) {
                  $$1.gv();
                  return true;
               } else {
                  return false;
               }
            }))
   );

   public static bqp.b<cck> a() {
      return bqp.a(k, j);
   }

   protected static bqp<?> a(bqp<cck> $$0) {
      b($$0);
      c($$0);
      d($$0);
      $$0.a(Set.of(ckh.a));
      $$0.b(ckh.b);
      $$0.f();
      return $$0;
   }

   private static void b(bqp<cck> $$0) {
      $$0.a(ckh.a, 0, ImmutableList.of(new bua(0.8F), new ccl.b(2.0F), new bsm(45, 90), new bsq() {
         @Override
         protected boolean a(apf $$0, bpq $$1) {
            if ($$1 instanceof cck $$2 && $$2.s()) {
               return false;
            }

            return super.a($$0, $$1);
         }
      }, new brm(byr.P), new brm(byr.Q), l));
   }

   private static void c(bqp<cck> $$0) {
      $$0.a(
         ckh.b,
         ImmutableList.of(
            Pair.of(0, btg.a(bpc.bx, 6.0F, bmn.a(30, 60))),
            Pair.of(1, new bra(bpc.d, 1.0F, 1)),
            Pair.of(2, new btd(ImmutableList.of(Pair.of(new brt($$0x -> 1.25F, $$0x -> $$0x.o_() ? 1.0 : 2.0), 1), Pair.of(brd.a(i, 1.25F), 1)))),
            Pair.of(3, new bsx(bmn.a(150, 250), 30.0F, 0.0F, 0.0F)),
            Pair.of(
               4, new btd(ImmutableMap.of(byr.m, bys.b), ImmutableList.of(Pair.of(bsy.a(1.0F), 1), Pair.of(btn.a(1.0F, 3), 1), Pair.of(new brq(30, 60), 1)))
            )
         )
      );
   }

   private static void d(bqp<cck> $$0) {
      $$0.a(ckh.g, ImmutableList.of(Pair.of(0, new ccl.a())), Set.of(Pair.of(byr.G, bys.a), Pair.of(byr.Z, bys.b)));
   }

   public static void a(cck $$0) {
      $$0.dP().a(ImmutableList.of(ckh.g, ckh.b));
   }

   public static ctk b() {
      return a;
   }

   public static class a extends brg<cck> {
      static final int c = 5 * axv.e * 20;
      static final int d = 5;
      static final int e = 75;
      int f = 0;
      boolean g;

      public a() {
         super(Map.of(), c);
      }

      protected void a(apf $$0, cck $$1, long $$2) {
         super.c($$0, $$1, $$2);
         if (this.f > 0) {
            this.f--;
         }

         if ($$1.gn()) {
            $$1.a(cck.a.c);
            if ($$1.aC()) {
               $$1.a(aty.aj);
            }
         } else {
            cck.a $$3 = $$1.gt();
            long $$4 = $$1.dP().e(byr.G);
            boolean $$5 = $$4 > 75L;
            if ($$5 != this.g) {
               this.f = this.a($$1);
            }

            this.g = $$5;
            if ($$3 == cck.a.c) {
               if (this.f == 0 && $$1.aC() && $$5) {
                  $$0.a($$1, (byte)64);
                  this.f = this.a($$1);
               }

               if ($$4 < (long)cck.a.d.b()) {
                  $$1.a(aty.an);
                  $$1.a(cck.a.d);
               }
            } else if ($$3 == cck.a.d && $$4 > (long)cck.a.d.b()) {
               $$1.a(cck.a.c);
            }
         }
      }

      private int a(cck $$0) {
         return cck.a.c.b() + $$0.ei().a(100, 400);
      }

      protected boolean a(apf $$0, cck $$1) {
         return $$1.aC();
      }

      protected boolean b(apf $$0, cck $$1, long $$2) {
         return $$1.gt().a();
      }

      protected void c(apf $$0, cck $$1, long $$2) {
         $$1.gu();
      }

      protected void d(apf $$0, cck $$1, long $$2) {
         if (!$$1.gy()) {
            $$1.gv();
         }
      }
   }

   public static class b extends brb<cck> {
      public b(float $$0) {
         super($$0, cck::gw);
      }

      protected void a(apf $$0, cck $$1, long $$2) {
         $$1.gv();
         super.b($$0, $$1, $$2);
      }
   }
}
