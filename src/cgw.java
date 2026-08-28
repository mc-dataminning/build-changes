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
   private static final bqc f = bqc.a(5, 16);
   private static final ImmutableList<cdz<? extends cdy<? super cgv>>> g = ImmutableList.of(cdz.c, cdz.f, cdz.t, cdz.o);
   private static final ImmutableList<ccs<?>> h = ImmutableList.of(
      ccs.Z, ccs.x, ccs.y, ccs.m, ccs.n, ccs.E, ccs.t, ccs.h, ccs.O, ccs.P, ccs.Q, ccs.R, new ccs[]{ccs.r, ccs.K}
   );

   protected static void a(cgv $$0, ayw $$1) {
   }

   public static buq.b<cgv> a() {
      return buq.a(h, g);
   }

   protected static buq<?> a(buq<cgv> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(com.a));
      $$0.b(com.b);
      $$0.f();
      return $$0;
   }

   private static void b(buq<cgv> $$0) {
      $$0.a(com.a, 0, ImmutableList.of(new byb(0.8F), new cgw.a(4.0F), new bwn(45, 90), new bwr(), new bvn(ccs.P), new bvn(ccs.Q)));
   }

   private static void c(buq<cgv> $$0) {
      $$0.a(
         com.b,
         ImmutableList.of(
            Pair.of(0, bxh.a(bsx.by, 6.0F, bqc.a(30, 60))),
            Pair.of(1, new bvb(bsx.o)),
            Pair.of(
               2,
               new bxe(
                  ImmutableList.of(Pair.of(new bvu($$0x -> 2.5F, $$0x -> $$0x.o_() ? 2.5 : 3.5), 1), Pair.of(byu.a(Predicate.not(cgv::t), bve.a(f, 2.5F)), 1))
               )
            ),
            Pair.of(3, new bwy(bqc.a(150, 250), 30.0F, 0.0F, 0.0F)),
            Pair.of(
               4,
               new bxe(
                  ImmutableMap.of(ccs.m, cct.b),
                  ImmutableList.of(
                     Pair.of(byu.a(Predicate.not(cgv::t), bwz.a(2.0F)), 1),
                     Pair.of(byu.a(Predicate.not(cgv::t), bxo.a(2.0F, 3)), 1),
                     Pair.of(new cgw.b(20), 1),
                     Pair.of(new bvr(30, 60), 1)
                  )
               )
            )
         )
      );
   }

   public static void a(cgv $$0) {
      $$0.dT().a(ImmutableList.of(com.b));
   }

   public static Predicate<cuq> b() {
      return $$0 -> $$0.a(awn.ah);
   }

   public static class a extends bvc<cgv> {
      public a(float $$0) {
         super($$0);
      }

      protected void a(aqu $$0, cgv $$1, long $$2) {
         $$1.gx();
         super.b($$0, $$1, $$2);
      }
   }

   public static class b extends bvh<cgv> {
      private final int c;

      public b(int $$0) {
         super(ImmutableMap.of());
         this.c = $$0 * 20;
      }

      protected boolean a(aqu $$0, cgv $$1) {
         return !$$1.bf() && $$1.gy() >= (long)this.c && !$$1.N_() && $$1.aF() && !$$1.cR() && $$1.gk();
      }

      protected void a(aqu $$0, cgv $$1, long $$2) {
         if ($$1.gn()) {
            $$1.gw();
         } else if (!$$1.gh()) {
            $$1.gv();
         }
      }
   }
}
