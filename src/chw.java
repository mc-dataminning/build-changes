import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;

public class chw {
   private static final float a = 2.0F;
   private static final float b = 1.0F;
   private static final float c = 1.25F;
   private static final float d = 1.25F;
   private static final float e = 1.0F;
   private static final double f = 2.0;
   private static final double g = 1.0;
   private static final brj h = brj.a(5, 16);
   private static final ImmutableList<cfg<? extends cff<? super chv>>> i = ImmutableList.of(cfg.c, cfg.f, cfg.u, cfg.o, cfg.k);
   private static final ImmutableList<cdz<?>> j = ImmutableList.of(
      cdz.Z, cdz.x, cdz.y, cdz.m, cdz.n, cdz.E, cdz.t, cdz.h, cdz.O, cdz.P, cdz.Q, cdz.R, new cdz[]{cdz.r, cdz.K, cdz.G}
   );
   private static final bxz<chv> k = cab.a(
      (Function<cab.b<chv>, ? extends App<cab.c<chv>, cae<chv>>>)($$0 -> $$0.group($$0.c(cdz.G)).apply($$0, $$0x -> ($$0xx, $$1, $$2) -> {
               if ($$1.t()) {
                  $$1.gy();
                  return true;
               } else {
                  return false;
               }
            }))
   );

   public static bvx.b<chv> a() {
      return bvx.a(j, i);
   }

   protected static bvx<?> a(bvx<chv> $$0) {
      b($$0);
      c($$0);
      d($$0);
      $$0.a(Set.of(cpz.a));
      $$0.b(cpz.b);
      $$0.f();
      return $$0;
   }

   private static void b(bvx<chv> $$0) {
      $$0.a(cpz.a, 0, ImmutableList.of(new bzi(0.8F), new chw.b(2.0F), new bxu(45, 90), new bxy() {
         @Override
         protected boolean a(arm $$0, bux $$1) {
            if ($$1 instanceof chv $$2 && $$2.t()) {
               return false;
            }

            return super.a($$0, $$1);
         }
      }, new bwu(cdz.P), new bwu(cdz.Q), k));
   }

   private static void c(bvx<chv> $$0) {
      $$0.a(
         cpz.b,
         ImmutableList.of(
            Pair.of(0, byo.a(bug.by, 6.0F, brj.a(30, 60))),
            Pair.of(1, new bwi(bug.c, 1.0F, 1)),
            Pair.of(2, new byl(ImmutableList.of(Pair.of(new bxb($$0x -> 1.25F, $$0x -> $$0x.p_() ? 1.0 : 2.0), 1), Pair.of(bwl.a(h, 1.25F), 1)))),
            Pair.of(3, new byf(brj.a(150, 250), 30.0F, 0.0F, 0.0F)),
            Pair.of(
               4, new byl(ImmutableMap.of(cdz.m, cea.b), ImmutableList.of(Pair.of(byg.a(1.0F), 1), Pair.of(byv.a(1.0F, 3), 1), Pair.of(new bwy(30, 60), 1)))
            )
         )
      );
   }

   private static void d(bvx<chv> $$0) {
      $$0.a(cpz.g, ImmutableList.of(Pair.of(0, new chw.a())), Set.of(Pair.of(cdz.G, cea.a), Pair.of(cdz.Z, cea.b)));
   }

   public static void a(chv $$0) {
      $$0.ed().a(ImmutableList.of(cpz.g, cpz.b));
   }

   public static Predicate<cvx> b() {
      return $$0 -> $$0.a(axi.aj);
   }

   public static class a extends bwo<chv> {
      static final int c = 5 * bak.e * 20;
      static final int d = 5;
      static final int e = 75;
      int f = 0;
      boolean g;

      public a() {
         super(Map.of(), c);
      }

      protected void a(arm $$0, chv $$1, long $$2) {
         super.c($$0, $$1, $$2);
         if (this.f > 0) {
            this.f--;
         }

         if ($$1.gv()) {
            $$1.a(chv.a.c);
            if ($$1.aJ()) {
               $$1.a(awk.aj);
            }
         } else {
            chv.a $$3 = $$1.gw();
            long $$4 = $$1.ed().e(cdz.G);
            boolean $$5 = $$4 > 75L;
            if ($$5 != this.g) {
               this.f = this.a($$1);
            }

            this.g = $$5;
            if ($$3 == chv.a.c) {
               if (this.f == 0 && $$1.aJ() && $$5) {
                  $$0.a($$1, (byte)64);
                  this.f = this.a($$1);
               }

               if ($$4 < (long)chv.a.d.b()) {
                  $$1.a(awk.an);
                  $$1.a(chv.a.d);
               }
            } else if ($$3 == chv.a.d && $$4 > (long)chv.a.d.b()) {
               $$1.a(chv.a.c);
            }
         }
      }

      private int a(chv $$0) {
         return chv.a.c.b() + $$0.ea().a(100, 400);
      }

      protected boolean a(arm $$0, chv $$1) {
         return $$1.aJ();
      }

      protected boolean b(arm $$0, chv $$1, long $$2) {
         return $$1.gw().a();
      }

      protected void c(arm $$0, chv $$1, long $$2) {
         $$1.gx();
      }

      protected void d(arm $$0, chv $$1, long $$2) {
         if (!$$1.gH()) {
            $$1.gy();
         }
      }
   }

   public static class b extends bwj<chv> {
      public b(float $$0) {
         super($$0, $$0x -> axb.G);
      }

      protected void a(arm $$0, chv $$1, long $$2) {
         $$1.gy();
         super.b($$0, $$1, $$2);
      }
   }
}
