import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;

public class cjg {
   private static final float a = 2.0F;
   private static final float b = 1.0F;
   private static final float c = 1.25F;
   private static final float d = 1.25F;
   private static final float e = 1.0F;
   private static final double f = 2.0;
   private static final double g = 1.0;
   private static final bst h = bst.a(5, 16);
   private static final ImmutableList<cgq<? extends cgp<? super cjf>>> i = ImmutableList.of(cgq.c, cgq.f, cgq.u, cgq.o, cgq.k);
   private static final ImmutableList<cfj<?>> j = ImmutableList.of(
      cfj.Z, cfj.x, cfj.y, cfj.m, cfj.n, cfj.E, cfj.t, cfj.h, cfj.O, cfj.P, cfj.Q, cfj.R, new cfj[]{cfj.r, cfj.K, cfj.G}
   );
   private static final bzj<cjf> k = cbl.a(
      (Function<cbl.b<cjf>, ? extends App<cbl.c<cjf>, cbo<cjf>>>)($$0 -> $$0.group($$0.c(cfj.G)).apply($$0, $$0x -> ($$0xx, $$1, $$2) -> {
               if ($$1.t()) {
                  $$1.gp();
                  return true;
               } else {
                  return false;
               }
            }))
   );

   public static bxh.b<cjf> a() {
      return bxh.a(j, i);
   }

   protected static bxh<?> a(bxh<cjf> $$0) {
      b($$0);
      c($$0);
      d($$0);
      $$0.a(Set.of(crn.a));
      $$0.b(crn.b);
      $$0.f();
      return $$0;
   }

   private static void b(bxh<cjf> $$0) {
      $$0.a(crn.a, 0, ImmutableList.of(new cas(0.8F), new cjg.b(2.0F), new bze(45, 90), new bzi() {
         @Override
         protected boolean a(ash $$0, bwh $$1) {
            if ($$1 instanceof cjf $$2 && $$2.t()) {
               return false;
            }

            return super.a($$0, $$1);
         }
      }, new bye(cfj.P), new bye(cfj.Q), k));
   }

   private static void c(bxh<cjf> $$0) {
      $$0.a(
         crn.b,
         ImmutableList.of(
            Pair.of(0, bzy.a(bvq.bS, 6.0F, bst.a(30, 60))),
            Pair.of(1, new bxs(bvq.e, 1.0F, 1)),
            Pair.of(2, new bzv(ImmutableList.of(Pair.of(new byl($$0x -> 1.25F, $$0x -> $$0x.e_() ? 1.0 : 2.0), 1), Pair.of(bxv.a(h, 1.25F), 1)))),
            Pair.of(3, new bzp(bst.a(150, 250), 30.0F, 0.0F, 0.0F)),
            Pair.of(
               4, new bzv(ImmutableMap.of(cfj.m, cfk.b), ImmutableList.of(Pair.of(bzq.a(1.0F), 1), Pair.of(caf.a(1.0F, 3), 1), Pair.of(new byi(30, 60), 1)))
            )
         )
      );
   }

   private static void d(bxh<cjf> $$0) {
      $$0.a(crn.g, ImmutableList.of(Pair.of(0, new cjg.a())), Set.of(Pair.of(cfj.G, cfk.a), Pair.of(cfj.Z, cfk.b)));
   }

   public static void a(cjf $$0) {
      $$0.eb().a(ImmutableList.of(crn.g, crn.b));
   }

   public static Predicate<cxo> b() {
      return $$0 -> $$0.a(ayd.an);
   }

   public static class a extends bxy<cjf> {
      static final int c = 5 * bbg.e * 20;
      static final int d = 5;
      static final int e = 75;
      int f = 0;
      boolean g;

      public a() {
         super(Map.of(), c);
      }

      protected void a(ash $$0, cjf $$1, long $$2) {
         super.c($$0, $$1, $$2);
         if (this.f > 0) {
            this.f--;
         }

         if ($$1.gm()) {
            $$1.a(cjf.a.c);
            if ($$1.aJ()) {
               $$1.a(axf.aj);
            }
         } else {
            cjf.a $$3 = $$1.gn();
            long $$4 = $$1.eb().e(cfj.G);
            boolean $$5 = $$4 > 75L;
            if ($$5 != this.g) {
               this.f = this.a($$1);
            }

            this.g = $$5;
            if ($$3 == cjf.a.c) {
               if (this.f == 0 && $$1.aJ() && $$5) {
                  $$0.a($$1, (byte)64);
                  this.f = this.a($$1);
               }

               if ($$4 < (long)cjf.a.d.b()) {
                  $$1.a(axf.an);
                  $$1.a(cjf.a.d);
               }
            } else if ($$3 == cjf.a.d && $$4 > (long)cjf.a.d.b()) {
               $$1.a(cjf.a.c);
            }
         }
      }

      private int a(cjf $$0) {
         return cjf.a.c.b() + $$0.dY().a(100, 400);
      }

      protected boolean a(ash $$0, cjf $$1) {
         return $$1.aJ();
      }

      protected boolean b(ash $$0, cjf $$1, long $$2) {
         return $$1.gn().a();
      }

      protected void c(ash $$0, cjf $$1, long $$2) {
         $$1.go();
      }

      protected void d(ash $$0, cjf $$1, long $$2) {
         if (!$$1.gy()) {
            $$1.gp();
         }
      }
   }

   public static class b extends bxt<cjf> {
      public b(float $$0) {
         super($$0, $$0x -> axw.G);
      }

      protected void a(ash $$0, cjf $$1, long $$2) {
         $$1.gp();
         super.b($$0, $$1, $$2);
      }
   }
}
