import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.function.Predicate;

public class cjo {
   private static final float a = 4.0F;
   private static final float b = 2.0F;
   private static final float c = 2.5F;
   private static final float d = 2.5F;
   private static final float e = 1.0F;
   private static final bst f = bst.a(5, 16);
   private static final ImmutableList<cgq<? extends cgp<? super cjn>>> g = ImmutableList.of(cgq.c, cgq.f, cgq.t, cgq.o);
   private static final ImmutableList<cfj<?>> h = ImmutableList.of(
      cfj.Z, cfj.x, cfj.y, cfj.m, cfj.n, cfj.E, cfj.t, cfj.h, cfj.O, cfj.P, cfj.Q, cfj.R, new cfj[]{cfj.r, cfj.K}
   );

   protected static void a(cjn $$0, bam $$1) {
   }

   public static bxh.b<cjn> a() {
      return bxh.a(h, g);
   }

   protected static bxh<?> a(bxh<cjn> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(crn.a));
      $$0.b(crn.b);
      $$0.f();
      return $$0;
   }

   private static void b(bxh<cjn> $$0) {
      $$0.a(crn.a, 0, ImmutableList.of(new cas(0.8F), new cjo.a(4.0F), new bze(45, 90), new bzi(), new bye(cfj.P), new bye(cfj.Q)));
   }

   private static void c(bxh<cjn> $$0) {
      $$0.a(
         crn.b,
         ImmutableList.of(
            Pair.of(0, bzy.a(bvq.bS, 6.0F, bst.a(30, 60))),
            Pair.of(1, new bxs(bvq.t)),
            Pair.of(
               2,
               new bzv(
                  ImmutableList.of(Pair.of(new byl($$0x -> 2.5F, $$0x -> $$0x.e_() ? 2.5 : 3.5), 1), Pair.of(cbl.a(Predicate.not(cjn::t), bxv.a(f, 2.5F)), 1))
               )
            ),
            Pair.of(3, new bzp(bst.a(150, 250), 30.0F, 0.0F, 0.0F)),
            Pair.of(
               4,
               new bzv(
                  ImmutableMap.of(cfj.m, cfk.b),
                  ImmutableList.of(
                     Pair.of(cbl.a(Predicate.not(cjn::t), bzq.a(2.0F)), 1),
                     Pair.of(cbl.a(Predicate.not(cjn::t), caf.a(2.0F, 3)), 1),
                     Pair.of(new cjo.b(20), 1),
                     Pair.of(new byi(30, 60), 1)
                  )
               )
            )
         )
      );
   }

   public static void a(cjn $$0) {
      $$0.eb().a(ImmutableList.of(crn.b));
   }

   public static Predicate<cxo> b() {
      return $$0 -> $$0.a(ayd.am);
   }

   public static class a extends bxt<cjn> {
      public a(float $$0) {
         super($$0);
      }

      protected void a(ash $$0, cjn $$1, long $$2) {
         $$1.gB();
         super.b($$0, $$1, $$2);
      }
   }

   public static class b extends bxy<cjn> {
      private final int c;

      public b(int $$0) {
         super(ImmutableMap.of());
         this.c = $$0 * 20;
      }

      protected boolean a(ash $$0, cjn $$1) {
         return !$$1.bj() && $$1.gC() >= (long)this.c && !$$1.P_() && $$1.aJ() && !$$1.cY() && $$1.gm();
      }

      protected void a(ash $$0, cjn $$1, long $$2) {
         if ($$1.gp()) {
            $$1.gA();
         } else if (!$$1.gj()) {
            $$1.gz();
         }
      }
   }
}
