import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;

public class cgo {
   private static final float a = 2.0F;
   private static final float b = 1.0F;
   private static final float c = 1.25F;
   private static final float d = 1.25F;
   private static final float e = 1.0F;
   private static final double f = 2.0;
   private static final double g = 1.0;
   private static final bqe h = bqe.a(5, 16);
   private static final ImmutableList<cdz<? extends cdy<? super cgn>>> i = ImmutableList.of(cdz.c, cdz.f, cdz.u, cdz.o, cdz.k);
   private static final ImmutableList<ccs<?>> j = ImmutableList.of(
      ccs.Z, ccs.x, ccs.y, ccs.m, ccs.n, ccs.E, ccs.t, ccs.h, ccs.O, ccs.P, ccs.Q, ccs.R, new ccs[]{ccs.r, ccs.K, ccs.G}
   );
   private static final bws<cgn> k = byu.a(
      (Function<byu.b<cgn>, ? extends App<byu.c<cgn>, byx<cgn>>>)($$0 -> $$0.group($$0.c(ccs.G)).apply($$0, $$0x -> ($$0xx, $$1, $$2) -> {
               if ($$1.u()) {
                  $$1.gy();
                  return true;
               } else {
                  return false;
               }
            }))
   );

   public static buq.b<cgn> a() {
      return buq.a(j, i);
   }

   protected static buq<?> a(buq<cgn> $$0) {
      b($$0);
      c($$0);
      d($$0);
      $$0.a(Set.of(col.a));
      $$0.b(col.b);
      $$0.f();
      return $$0;
   }

   private static void b(buq<cgn> $$0) {
      $$0.a(col.a, 0, ImmutableList.of(new byb(0.8F), new cgo.b(2.0F), new bwn(45, 90), new bwr() {
         @Override
         protected boolean a(are $$0, btq $$1) {
            if ($$1 instanceof cgn $$2 && $$2.u()) {
               return false;
            }

            return super.a($$0, $$1);
         }
      }, new bvn(ccs.P), new bvn(ccs.Q), k));
   }

   private static void c(buq<cgn> $$0) {
      $$0.a(
         col.b,
         ImmutableList.of(
            Pair.of(0, bxh.a(bsz.by, 6.0F, bqe.a(30, 60))),
            Pair.of(1, new bvb(bsz.c, 1.0F, 1)),
            Pair.of(2, new bxe(ImmutableList.of(Pair.of(new bvu($$0x -> 1.25F, $$0x -> $$0x.p_() ? 1.0 : 2.0), 1), Pair.of(bve.a(h, 1.25F), 1)))),
            Pair.of(3, new bwy(bqe.a(150, 250), 30.0F, 0.0F, 0.0F)),
            Pair.of(
               4, new bxe(ImmutableMap.of(ccs.m, cct.b), ImmutableList.of(Pair.of(bwz.a(1.0F), 1), Pair.of(bxo.a(1.0F, 3), 1), Pair.of(new bvr(30, 60), 1)))
            )
         )
      );
   }

   private static void d(buq<cgn> $$0) {
      $$0.a(col.g, ImmutableList.of(Pair.of(0, new cgo.a())), Set.of(Pair.of(ccs.G, cct.a), Pair.of(ccs.Z, cct.b)));
   }

   public static void a(cgn $$0) {
      $$0.dS().a(ImmutableList.of(col.g, col.b));
   }

   public static Predicate<cuo> b() {
      return $$0 -> $$0.a(awx.ai);
   }

   public static class a extends bvh<cgn> {
      static final int c = 5 * azy.e * 20;
      static final int d = 5;
      static final int e = 75;
      int f = 0;
      boolean g;

      public a() {
         super(Map.of(), c);
      }

      protected void a(are $$0, cgn $$1, long $$2) {
         super.c($$0, $$1, $$2);
         if (this.f > 0) {
            this.f--;
         }

         if ($$1.gq()) {
            $$1.a(cgn.a.c);
            if ($$1.aE()) {
               $$1.a(avz.aj);
            }
         } else {
            cgn.a $$3 = $$1.gw();
            long $$4 = $$1.dS().e(ccs.G);
            boolean $$5 = $$4 > 75L;
            if ($$5 != this.g) {
               this.f = this.a($$1);
            }

            this.g = $$5;
            if ($$3 == cgn.a.c) {
               if (this.f == 0 && $$1.aE() && $$5) {
                  $$0.a($$1, (byte)64);
                  this.f = this.a($$1);
               }

               if ($$4 < (long)cgn.a.d.b()) {
                  $$1.a(avz.an);
                  $$1.a(cgn.a.d);
               }
            } else if ($$3 == cgn.a.d && $$4 > (long)cgn.a.d.b()) {
               $$1.a(cgn.a.c);
            }
         }
      }

      private int a(cgn $$0) {
         return cgn.a.c.b() + $$0.el().a(100, 400);
      }

      protected boolean a(are $$0, cgn $$1) {
         return $$1.aE();
      }

      protected boolean b(are $$0, cgn $$1, long $$2) {
         return $$1.gw().a();
      }

      protected void c(are $$0, cgn $$1, long $$2) {
         $$1.gx();
      }

      protected void d(are $$0, cgn $$1, long $$2) {
         if (!$$1.gB()) {
            $$1.gy();
         }
      }
   }

   public static class b extends bvc<cgn> {
      public b(float $$0) {
         super($$0, cgn::gz);
      }

      protected void a(are $$0, cgn $$1, long $$2) {
         $$1.gy();
         super.b($$0, $$1, $$2);
      }
   }
}
