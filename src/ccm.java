import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;

public class ccm {
   public static final ctm a = ctm.a(cqp.sl);
   private static final float b = 2.0F;
   private static final float c = 1.0F;
   private static final float d = 1.25F;
   private static final float e = 1.25F;
   private static final float f = 1.0F;
   private static final double g = 2.0;
   private static final double h = 1.0;
   private static final bmo i = bmo.a(5, 16);
   private static final ImmutableList<bzz<? extends bzy<? super ccl>>> j = ImmutableList.of(bzz.c, bzz.f, bzz.u, bzz.o, bzz.k);
   private static final ImmutableList<bys<?>> k = ImmutableList.of(
      bys.Z, bys.x, bys.y, bys.m, bys.n, bys.E, bys.t, bys.h, bys.O, bys.P, bys.Q, bys.R, new bys[]{bys.r, bys.K, bys.G}
   );
   private static final bss<ccl> l = buu.a(
      (Function<buu.b<ccl>, ? extends App<buu.c<ccl>, bux<ccl>>>)($$0 -> $$0.group($$0.c(bys.G)).apply($$0, $$0x -> ($$0xx, $$1, $$2) -> {
               if ($$1.s()) {
                  $$1.gv();
                  return true;
               } else {
                  return false;
               }
            }))
   );

   public static bqq.b<ccl> a() {
      return bqq.a(k, j);
   }

   protected static bqq<?> a(bqq<ccl> $$0) {
      b($$0);
      c($$0);
      d($$0);
      $$0.a(Set.of(ckj.a));
      $$0.b(ckj.b);
      $$0.f();
      return $$0;
   }

   private static void b(bqq<ccl> $$0) {
      $$0.a(ckj.a, 0, ImmutableList.of(new bub(0.8F), new ccm.b(2.0F), new bsn(45, 90), new bsr() {
         @Override
         protected boolean a(apf $$0, bpr $$1) {
            if ($$1 instanceof ccl $$2 && $$2.s()) {
               return false;
            }

            return super.a($$0, $$1);
         }
      }, new brn(bys.P), new brn(bys.Q), l));
   }

   private static void c(bqq<ccl> $$0) {
      $$0.a(
         ckj.b,
         ImmutableList.of(
            Pair.of(0, bth.a(bpd.by, 6.0F, bmo.a(30, 60))),
            Pair.of(1, new brb(bpd.d, 1.0F, 1)),
            Pair.of(2, new bte(ImmutableList.of(Pair.of(new bru($$0x -> 1.25F, $$0x -> $$0x.o_() ? 1.0 : 2.0), 1), Pair.of(bre.a(i, 1.25F), 1)))),
            Pair.of(3, new bsy(bmo.a(150, 250), 30.0F, 0.0F, 0.0F)),
            Pair.of(
               4, new bte(ImmutableMap.of(bys.m, byt.b), ImmutableList.of(Pair.of(bsz.a(1.0F), 1), Pair.of(bto.a(1.0F, 3), 1), Pair.of(new brr(30, 60), 1)))
            )
         )
      );
   }

   private static void d(bqq<ccl> $$0) {
      $$0.a(ckj.g, ImmutableList.of(Pair.of(0, new ccm.a())), Set.of(Pair.of(bys.G, byt.a), Pair.of(bys.Z, byt.b)));
   }

   public static void a(ccl $$0) {
      $$0.dP().a(ImmutableList.of(ckj.g, ckj.b));
   }

   public static ctm b() {
      return a;
   }

   public static class a extends brh<ccl> {
      static final int c = 5 * axv.e * 20;
      static final int d = 5;
      static final int e = 75;
      int f = 0;
      boolean g;

      public a() {
         super(Map.of(), c);
      }

      protected void a(apf $$0, ccl $$1, long $$2) {
         super.c($$0, $$1, $$2);
         if (this.f > 0) {
            this.f--;
         }

         if ($$1.gn()) {
            $$1.a(ccl.a.c);
            if ($$1.aC()) {
               $$1.a(aty.aj);
            }
         } else {
            ccl.a $$3 = $$1.gt();
            long $$4 = $$1.dP().e(bys.G);
            boolean $$5 = $$4 > 75L;
            if ($$5 != this.g) {
               this.f = this.a($$1);
            }

            this.g = $$5;
            if ($$3 == ccl.a.c) {
               if (this.f == 0 && $$1.aC() && $$5) {
                  $$0.a($$1, (byte)64);
                  this.f = this.a($$1);
               }

               if ($$4 < (long)ccl.a.d.b()) {
                  $$1.a(aty.an);
                  $$1.a(ccl.a.d);
               }
            } else if ($$3 == ccl.a.d && $$4 > (long)ccl.a.d.b()) {
               $$1.a(ccl.a.c);
            }
         }
      }

      private int a(ccl $$0) {
         return ccl.a.c.b() + $$0.ei().a(100, 400);
      }

      protected boolean a(apf $$0, ccl $$1) {
         return $$1.aC();
      }

      protected boolean b(apf $$0, ccl $$1, long $$2) {
         return $$1.gt().a();
      }

      protected void c(apf $$0, ccl $$1, long $$2) {
         $$1.gu();
      }

      protected void d(apf $$0, ccl $$1, long $$2) {
         if (!$$1.gy()) {
            $$1.gv();
         }
      }
   }

   public static class b extends brc<ccl> {
      public b(float $$0) {
         super($$0, ccl::gw);
      }

      protected void a(apf $$0, ccl $$1, long $$2) {
         $$1.gv();
         super.b($$0, $$1, $$2);
      }
   }
}
