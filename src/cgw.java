import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.function.Predicate;

public class cgw {
   private static final float a = 4.0F;
   private static final float b = 2.0F;
   private static final float c = 2.5F;
   private static final float d = 2.5F;
   private static final float e = 1.0F;
   private static final bqe f = bqe.a(5, 16);
   private static final ImmutableList<cdz<? extends cdy<? super cgv>>> g = ImmutableList.of(cdz.c, cdz.f, cdz.t, cdz.o);
   private static final ImmutableList<ccs<?>> h = ImmutableList.of(
      ccs.Z, ccs.x, ccs.y, ccs.m, ccs.n, ccs.E, ccs.t, ccs.h, ccs.O, ccs.P, ccs.Q, ccs.R, new ccs[]{ccs.r, ccs.K}
   );

   protected static void a(cgv $$0, azg $$1) {
   }

   public static buq.b<cgv> a() {
      return buq.a(h, g);
   }

   protected static buq<?> a(buq<cgv> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(col.a));
      $$0.b(col.b);
      $$0.f();
      return $$0;
   }

   private static void b(buq<cgv> $$0) {
      $$0.a(col.a, 0, ImmutableList.of(new byb(0.8F), new cgw.a(4.0F), new bwn(45, 90), new bwr(), new bvn(ccs.P), new bvn(ccs.Q)));
   }

   private static void c(buq<cgv> $$0) {
      $$0.a(
         col.b,
         ImmutableList.of(
            Pair.of(0, bxh.a(bsz.by, 6.0F, bqe.a(30, 60))),
            Pair.of(1, new bvb(bsz.o)),
            Pair.of(
               2,
               new bxe(
                  ImmutableList.of(Pair.of(new bvu($$0x -> 2.5F, $$0x -> $$0x.p_() ? 2.5 : 3.5), 1), Pair.of(byu.a(Predicate.not(cgv::u), bve.a(f, 2.5F)), 1))
               )
            ),
            Pair.of(3, new bwy(bqe.a(150, 250), 30.0F, 0.0F, 0.0F)),
            Pair.of(
               4,
               new bxe(
                  ImmutableMap.of(ccs.m, cct.b),
                  ImmutableList.of(
                     Pair.of(byu.a(Predicate.not(cgv::u), bwz.a(2.0F)), 1),
                     Pair.of(byu.a(Predicate.not(cgv::u), bxo.a(2.0F, 3)), 1),
                     Pair.of(new cgw.b(20), 1),
                     Pair.of(new bvr(30, 60), 1)
                  )
               )
            )
         )
      );
   }

   public static void a(cgv $$0) {
      $$0.dS().a(ImmutableList.of(col.b));
   }

   public static Predicate<cuo> b() {
      return $$0 -> $$0.a(awx.ah);
   }

   public static class a extends bvc<cgv> {
      public a(float $$0) {
         super($$0);
      }

      protected void a(are $$0, cgv $$1, long $$2) {
         $$1.gD();
         super.b($$0, $$1, $$2);
      }
   }

   public static class b extends bvh<cgv> {
      private final int c;

      public b(int $$0) {
         super(ImmutableMap.of());
         this.c = $$0 * 20;
      }

      protected boolean a(are $$0, cgv $$1) {
         return !$$1.be() && $$1.gE() >= (long)this.c && !$$1.gd() && $$1.aE() && !$$1.cR() && $$1.gq();
      }

      protected void a(are $$0, cgv $$1, long $$2) {
         if ($$1.gy()) {
            $$1.gC();
         } else if (!$$1.gn()) {
            $$1.gB();
         }
      }
   }
}
