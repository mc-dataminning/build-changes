import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;

public class cfq {
   private static final float a = 2.0F;
   private static final float b = 1.0F;
   private static final float c = 1.25F;
   private static final float d = 1.25F;
   private static final float e = 1.0F;
   private static final double f = 2.0;
   private static final double g = 1.0;
   private static final bph h = bph.a(5, 16);
   private static final ImmutableList<cdb<? extends cda<? super cfp>>> i = ImmutableList.of(cdb.c, cdb.f, cdb.u, cdb.o, cdb.k);
   private static final ImmutableList<cbu<?>> j = ImmutableList.of(
      cbu.Z, cbu.x, cbu.y, cbu.m, cbu.n, cbu.E, cbu.t, cbu.h, cbu.O, cbu.P, cbu.Q, cbu.R, new cbu[]{cbu.r, cbu.K, cbu.G}
   );
   private static final bvu<cfp> k = bxw.a(
      (Function<bxw.b<cfp>, ? extends App<bxw.c<cfp>, bxz<cfp>>>)($$0 -> $$0.group($$0.c(cbu.G)).apply($$0, $$0x -> ($$0xx, $$1, $$2) -> {
               if ($$1.u()) {
                  $$1.gx();
                  return true;
               } else {
                  return false;
               }
            }))
   );

   public static bts.b<cfp> a() {
      return bts.a(j, i);
   }

   protected static bts<?> a(bts<cfp> $$0) {
      b($$0);
      c($$0);
      d($$0);
      $$0.a(Set.of(cnn.a));
      $$0.b(cnn.b);
      $$0.f();
      return $$0;
   }

   private static void b(bts<cfp> $$0) {
      $$0.a(cnn.a, 0, ImmutableList.of(new bxd(0.8F), new cfq.b(2.0F), new bvp(45, 90), new bvt() {
         @Override
         protected boolean a(aqn $$0, bss $$1) {
            if ($$1 instanceof cfp $$2 && $$2.u()) {
               return false;
            }

            return super.a($$0, $$1);
         }
      }, new bup(cbu.P), new bup(cbu.Q), k));
   }

   private static void c(bts<cfp> $$0) {
      $$0.a(
         cnn.b,
         ImmutableList.of(
            Pair.of(0, bwj.a(bsc.by, 6.0F, bph.a(30, 60))),
            Pair.of(1, new bud(bsc.c, 1.0F, 1)),
            Pair.of(2, new bwg(ImmutableList.of(Pair.of(new buw($$0x -> 1.25F, $$0x -> $$0x.p_() ? 1.0 : 2.0), 1), Pair.of(bug.a(h, 1.25F), 1)))),
            Pair.of(3, new bwa(bph.a(150, 250), 30.0F, 0.0F, 0.0F)),
            Pair.of(
               4, new bwg(ImmutableMap.of(cbu.m, cbv.b), ImmutableList.of(Pair.of(bwb.a(1.0F), 1), Pair.of(bwq.a(1.0F, 3), 1), Pair.of(new but(30, 60), 1)))
            )
         )
      );
   }

   private static void d(bts<cfp> $$0) {
      $$0.a(cnn.g, ImmutableList.of(Pair.of(0, new cfq.a())), Set.of(Pair.of(cbu.G, cbv.a), Pair.of(cbu.Z, cbv.b)));
   }

   public static void a(cfp $$0) {
      $$0.dS().a(ImmutableList.of(cnn.g, cnn.b));
   }

   public static Predicate<ctq> b() {
      return $$0 -> $$0.a(awf.ai);
   }

   public static class a extends buj<cfp> {
      static final int c = 5 * aze.e * 20;
      static final int d = 5;
      static final int e = 75;
      int f = 0;
      boolean g;

      public a() {
         super(Map.of(), c);
      }

      protected void a(aqn $$0, cfp $$1, long $$2) {
         super.c($$0, $$1, $$2);
         if (this.f > 0) {
            this.f--;
         }

         if ($$1.gp()) {
            $$1.a(cfp.a.c);
            if ($$1.aE()) {
               $$1.a(avi.aj);
            }
         } else {
            cfp.a $$3 = $$1.gv();
            long $$4 = $$1.dS().e(cbu.G);
            boolean $$5 = $$4 > 75L;
            if ($$5 != this.g) {
               this.f = this.a($$1);
            }

            this.g = $$5;
            if ($$3 == cfp.a.c) {
               if (this.f == 0 && $$1.aE() && $$5) {
                  $$0.a($$1, (byte)64);
                  this.f = this.a($$1);
               }

               if ($$4 < (long)cfp.a.d.b()) {
                  $$1.a(avi.an);
                  $$1.a(cfp.a.d);
               }
            } else if ($$3 == cfp.a.d && $$4 > (long)cfp.a.d.b()) {
               $$1.a(cfp.a.c);
            }
         }
      }

      private int a(cfp $$0) {
         return cfp.a.c.b() + $$0.el().a(100, 400);
      }

      protected boolean a(aqn $$0, cfp $$1) {
         return $$1.aE();
      }

      protected boolean b(aqn $$0, cfp $$1, long $$2) {
         return $$1.gv().a();
      }

      protected void c(aqn $$0, cfp $$1, long $$2) {
         $$1.gw();
      }

      protected void d(aqn $$0, cfp $$1, long $$2) {
         if (!$$1.gA()) {
            $$1.gx();
         }
      }
   }

   public static class b extends bue<cfp> {
      public b(float $$0) {
         super($$0, cfp::gy);
      }

      protected void a(aqn $$0, cfp $$1, long $$2) {
         $$1.gx();
         super.b($$0, $$1, $$2);
      }
   }
}
