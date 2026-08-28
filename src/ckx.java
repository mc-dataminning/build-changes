import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;

public class ckx {
   private static final float a = 2.0F;
   private static final float b = 1.0F;
   private static final float c = 1.25F;
   private static final float d = 1.25F;
   private static final float e = 1.0F;
   private static final double f = 2.0;
   private static final double g = 1.0;
   private static final buc h = buc.a(5, 16);
   private static final ImmutableList<cid<? extends cic<? super ckw>>> i = ImmutableList.of(cid.c, cid.f, cid.u, cid.o, cid.k);
   private static final ImmutableList<cgw<?>> j = ImmutableList.of(
      cgw.aa, cgw.y, cgw.z, cgw.n, cgw.o, cgw.F, cgw.u, cgw.h, cgw.P, cgw.Q, cgw.R, cgw.S, new cgw[]{cgw.s, cgw.L, cgw.H}
   );
   private static final caw<ckw> k = ccy.a(
      (Function<ccy.b<ckw>, ? extends App<ccy.c<ckw>, cdb<ckw>>>)($$0 -> $$0.group($$0.c(cgw.H)).apply($$0, $$0x -> ($$0xx, $$1, $$2) -> {
               if ($$1.t()) {
                  $$1.gx();
                  return true;
               } else {
                  return false;
               }
            }))
   );

   public static byu.b<ckw> a() {
      return byu.a(j, i);
   }

   protected static byu<?> a(byu<ckw> $$0) {
      b($$0);
      c($$0);
      d($$0);
      $$0.a(Set.of(ctr.a));
      $$0.b(ctr.b);
      $$0.f();
      return $$0;
   }

   private static void b(byu<ckw> $$0) {
      $$0.a(ctr.a, 0, ImmutableList.of(new ccf(0.8F), new ckx.b(2.0F), new car(45, 90), new cav() {
         @Override
         protected boolean a(ars $$0, bxw $$1) {
            if ($$1 instanceof ckw $$2 && $$2.t()) {
               return false;
            }

            return super.a($$0, $$1);
         }
      }, new bzr(cgw.Q), new bzr(cgw.R), k));
   }

   private static void c(byu<ckw> $$0) {
      $$0.a(
         ctr.b,
         ImmutableList.of(
            Pair.of(0, cbl.a(bxc.bT, 6.0F, buc.a(30, 60))),
            Pair.of(1, new bzf(bxc.f, 1.0F, 1)),
            Pair.of(2, new cbi(ImmutableList.of(Pair.of(new bzy($$0x -> 1.25F, $$0x -> $$0x.n_() ? 1.0 : 2.0), 1), Pair.of(bzi.a(h, 1.25F), 1)))),
            Pair.of(3, new cbc(buc.a(150, 250), 30.0F, 0.0F, 0.0F)),
            Pair.of(
               4, new cbi(ImmutableMap.of(cgw.n, cgx.b), ImmutableList.of(Pair.of(cbd.a(1.0F), 1), Pair.of(cbs.a(1.0F, 3), 1), Pair.of(new bzv(30, 60), 1)))
            )
         )
      );
   }

   private static void d(byu<ckw> $$0) {
      $$0.a(ctr.g, ImmutableList.of(Pair.of(0, new ckx.a())), Set.of(Pair.of(cgw.H, cgx.a), Pair.of(cgw.aa, cgx.b)));
   }

   public static void a(ckw $$0) {
      $$0.ec().a(ImmutableList.of(ctr.g, ctr.b));
   }

   public static Predicate<czy> b() {
      return $$0 -> $$0.a(axm.am);
   }

   public static class a extends bzl<ckw> {
      static final int c = 5 * bas.e * 20;
      static final int d = 5;
      static final int e = 75;
      int f = 0;
      boolean g;

      public a() {
         super(Map.of(), c);
      }

      protected void a(ars $$0, ckw $$1, long $$2) {
         super.c($$0, $$1, $$2);
         if (this.f > 0) {
            this.f--;
         }

         if ($$1.gu()) {
            $$1.a(ckw.a.c);
            if ($$1.aH()) {
               $$1.a(awp.aj);
            }
         } else {
            ckw.a $$3 = $$1.gv();
            long $$4 = $$1.ec().e(cgw.H);
            boolean $$5 = $$4 > 75L;
            if ($$5 != this.g) {
               this.f = this.a($$1);
            }

            this.g = $$5;
            if ($$3 == ckw.a.c) {
               if (this.f == 0 && $$1.aH() && $$5) {
                  $$0.a($$1, (byte)64);
                  this.f = this.a($$1);
               }

               if ($$4 < (long)ckw.a.d.b()) {
                  $$1.a(awp.an);
                  $$1.a(ckw.a.d);
               }
            } else if ($$3 == ckw.a.d && $$4 > (long)ckw.a.d.b()) {
               $$1.a(ckw.a.c);
            }
         }
      }

      private int a(ckw $$0) {
         return ckw.a.c.b() + $$0.dY().a(100, 400);
      }

      protected boolean a(ars $$0, ckw $$1) {
         return $$1.aH();
      }

      protected boolean b(ars $$0, ckw $$1, long $$2) {
         return $$1.gv().a();
      }

      protected void c(ars $$0, ckw $$1, long $$2) {
         $$1.gw();
      }

      protected void d(ars $$0, ckw $$1, long $$2) {
         if (!$$1.gG()) {
            $$1.gx();
         }
      }
   }

   public static class b extends bzg<ckw> {
      public b(float $$0) {
         super($$0, $$0x -> axf.G);
      }

      protected void a(ars $$0, ckw $$1, long $$2) {
         $$1.gx();
         super.b($$0, $$1, $$2);
      }
   }
}
