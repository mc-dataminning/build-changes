import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.function.Predicate;

public class bvw {
   private static final float a = 4.0F;
   private static final float b = 2.0F;
   private static final float c = 2.5F;
   private static final float d = 2.5F;
   private static final float e = 1.0F;
   private static final bgb f = bgb.a(5, 16);
   private static final ImmutableList<bte<? extends btd<? super bvv>>> g = ImmutableList.of(bte.c, bte.f, bte.s, bte.n);
   private static final ImmutableList<brz<?>> h = ImmutableList.of(
      brz.Y, brz.x, brz.y, brz.m, brz.n, brz.E, brz.t, brz.h, brz.N, brz.O, brz.P, brz.Q, new brz[]{brz.r, brz.J}
   );

   protected static void a(bvv $$0, aru $$1) {
   }

   public static bjy.b<bvv> a() {
      return bjy.a(h, g);
   }

   protected static bjy<?> a(bjy<bvv> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(ccx.a));
      $$0.b(ccx.b);
      $$0.f();
      return $$0;
   }

   private static void b(bjy<bvv> $$0) {
      $$0.a(ccx.a, 0, ImmutableList.of(new bni(0.8F), new bvw.a(4.0F), new blu(45, 90), new bly(), new bkv(brz.O), new bkv(brz.P)));
   }

   private static void c(bjy<bvv> $$0) {
      $$0.a(
         ccx.b,
         ImmutableList.of(
            Pair.of(0, bmo.a(bim.bt, 6.0F, bgb.a(30, 60))),
            Pair.of(1, new bkj(bim.l, 1.0F)),
            Pair.of(2, new blc($$0x -> 2.5F, $$0x -> $$0x.i_() ? 2.5 : 3.5)),
            Pair.of(3, bob.a(Predicate.not(bvv::q), bkm.a(f, 2.5F))),
            Pair.of(4, new bmf(bgb.a(150, 250), 30.0F, 0.0F, 0.0F)),
            Pair.of(
               5,
               new bml(
                  ImmutableMap.of(brz.m, bsa.b),
                  ImmutableList.of(
                     Pair.of(bob.a(Predicate.not(bvv::q), bmg.a(2.0F)), 1),
                     Pair.of(bob.a(Predicate.not(bvv::q), bmv.a(2.0F, 3)), 1),
                     Pair.of(new bvw.b(20), 1),
                     Pair.of(new bkz(30, 60), 1)
                  )
               )
            )
         )
      );
   }

   public static void a(bvv $$0) {
      $$0.dM().a(ImmutableList.of(ccx.b));
   }

   public static clx b() {
      return bvv.bT;
   }

   public static class a extends bkk {
      public a(float $$0) {
         super($$0);
      }

      @Override
      protected void b(akk $$0, bjh $$1, long $$2) {
         if ($$1 instanceof bvv $$3) {
            $$3.gn();
         }

         super.b($$0, $$1, $$2);
      }
   }

   public static class b extends bkp<bvv> {
      private final int c;

      public b(int $$0) {
         super(ImmutableMap.of());
         this.c = $$0 * 20;
      }

      protected boolean a(akk $$0, bvv $$1) {
         return !$$1.aX() && $$1.go() >= (long)this.c && !$$1.fO() && $$1.aA() && !$$1.cO() && $$1.ga();
      }

      protected void a(akk $$0, bvv $$1, long $$2) {
         if ($$1.gi()) {
            $$1.gm();
         } else if (!$$1.fX()) {
            $$1.gl();
         }
      }
   }
}
