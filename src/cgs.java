import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.function.Predicate;

public class cgs {
   private static final float a = 4.0F;
   private static final float b = 2.0F;
   private static final float c = 2.5F;
   private static final float d = 2.5F;
   private static final float e = 1.0F;
   private static final bqa f = bqa.a(5, 16);
   private static final ImmutableList<cdv<? extends cdu<? super cgr>>> g = ImmutableList.of(cdv.c, cdv.f, cdv.t, cdv.o);
   private static final ImmutableList<cco<?>> h = ImmutableList.of(
      cco.Z, cco.x, cco.y, cco.m, cco.n, cco.E, cco.t, cco.h, cco.O, cco.P, cco.Q, cco.R, new cco[]{cco.r, cco.K}
   );

   protected static void a(cgr $$0, azc $$1) {
   }

   public static bum.b<cgr> a() {
      return bum.a(h, g);
   }

   protected static bum<?> a(bum<cgr> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(coh.a));
      $$0.b(coh.b);
      $$0.f();
      return $$0;
   }

   private static void b(bum<cgr> $$0) {
      $$0.a(coh.a, 0, ImmutableList.of(new bxx(0.8F), new cgs.a(4.0F), new bwj(45, 90), new bwn(), new bvj(cco.P), new bvj(cco.Q)));
   }

   private static void c(bum<cgr> $$0) {
      $$0.a(
         coh.b,
         ImmutableList.of(
            Pair.of(0, bxd.a(bsv.by, 6.0F, bqa.a(30, 60))),
            Pair.of(1, new bux(bsv.o)),
            Pair.of(
               2,
               new bxa(
                  ImmutableList.of(Pair.of(new bvq($$0x -> 2.5F, $$0x -> $$0x.p_() ? 2.5 : 3.5), 1), Pair.of(byq.a(Predicate.not(cgr::u), bva.a(f, 2.5F)), 1))
               )
            ),
            Pair.of(3, new bwu(bqa.a(150, 250), 30.0F, 0.0F, 0.0F)),
            Pair.of(
               4,
               new bxa(
                  ImmutableMap.of(cco.m, ccp.b),
                  ImmutableList.of(
                     Pair.of(byq.a(Predicate.not(cgr::u), bwv.a(2.0F)), 1),
                     Pair.of(byq.a(Predicate.not(cgr::u), bxk.a(2.0F, 3)), 1),
                     Pair.of(new cgs.b(20), 1),
                     Pair.of(new bvn(30, 60), 1)
                  )
               )
            )
         )
      );
   }

   public static void a(cgr $$0) {
      $$0.dS().a(ImmutableList.of(coh.b));
   }

   public static Predicate<cuk> b() {
      return $$0 -> $$0.a(awu.ah);
   }

   public static class a extends buy<cgr> {
      public a(float $$0) {
         super($$0);
      }

      protected void a(arb $$0, cgr $$1, long $$2) {
         $$1.gD();
         super.b($$0, $$1, $$2);
      }
   }

   public static class b extends bvd<cgr> {
      private final int c;

      public b(int $$0) {
         super(ImmutableMap.of());
         this.c = $$0 * 20;
      }

      protected boolean a(arb $$0, cgr $$1) {
         return !$$1.be() && $$1.gE() >= (long)this.c && !$$1.gd() && $$1.aE() && !$$1.cR() && $$1.gq();
      }

      protected void a(arb $$0, cgr $$1, long $$2) {
         if ($$1.gy()) {
            $$1.gC();
         } else if (!$$1.gn()) {
            $$1.gB();
         }
      }
   }
}
