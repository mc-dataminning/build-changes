import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.function.Predicate;

public class bwk {
   private static final float a = 4.0F;
   private static final float b = 2.0F;
   private static final float c = 2.5F;
   private static final float d = 2.5F;
   private static final float e = 1.0F;
   private static final bgp f = bgp.a(5, 16);
   private static final ImmutableList<bts<? extends btr<? super bwj>>> g = ImmutableList.of(bts.c, bts.f, bts.s, bts.n);
   private static final ImmutableList<bsn<?>> h = ImmutableList.of(
      bsn.Y, bsn.x, bsn.y, bsn.m, bsn.n, bsn.E, bsn.t, bsn.h, bsn.N, bsn.O, bsn.P, bsn.Q, new bsn[]{bsn.r, bsn.J}
   );

   protected static void a(bwj $$0, ash $$1) {
   }

   public static bkm.b<bwj> a() {
      return bkm.a(h, g);
   }

   protected static bkm<?> a(bkm<bwj> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(cdl.a));
      $$0.b(cdl.b);
      $$0.f();
      return $$0;
   }

   private static void b(bkm<bwj> $$0) {
      $$0.a(cdl.a, 0, ImmutableList.of(new bnw(0.8F), new bwk.a(4.0F), new bmi(45, 90), new bmm(), new blj(bsn.O), new blj(bsn.P)));
   }

   private static void c(bkm<bwj> $$0) {
      $$0.a(
         cdl.b,
         ImmutableList.of(
            Pair.of(0, bnc.a(bja.bt, 6.0F, bgp.a(30, 60))),
            Pair.of(1, new bkx(bja.l, 1.0F)),
            Pair.of(
               2,
               new bmz(
                  ImmutableList.of(Pair.of(new blq($$0x -> 2.5F, $$0x -> $$0x.m_() ? 2.5 : 3.5), 1), Pair.of(bop.a(Predicate.not(bwj::t), bla.a(f, 2.5F)), 1))
               )
            ),
            Pair.of(3, new bmt(bgp.a(150, 250), 30.0F, 0.0F, 0.0F)),
            Pair.of(
               4,
               new bmz(
                  ImmutableMap.of(bsn.m, bso.b),
                  ImmutableList.of(
                     Pair.of(bop.a(Predicate.not(bwj::t), bmu.a(2.0F)), 1),
                     Pair.of(bop.a(Predicate.not(bwj::t), bnj.a(2.0F, 3)), 1),
                     Pair.of(new bwk.b(20), 1),
                     Pair.of(new bln(30, 60), 1)
                  )
               )
            )
         )
      );
   }

   public static void a(bwj $$0) {
      $$0.dN().a(ImmutableList.of(cdl.b));
   }

   public static cmm b() {
      return bwj.bT;
   }

   public static class a extends bky {
      public a(float $$0) {
         super($$0);
      }

      @Override
      protected void b(akt $$0, bjv $$1, long $$2) {
         if ($$1 instanceof bwj $$3) {
            $$3.gr();
         }

         super.b($$0, $$1, $$2);
      }
   }

   public static class b extends bld<bwj> {
      private final int c;

      public b(int $$0) {
         super(ImmutableMap.of());
         this.c = $$0 * 20;
      }

      protected boolean a(akt $$0, bwj $$1) {
         return !$$1.aX() && $$1.gs() >= (long)this.c && !$$1.fS() && $$1.aA() && !$$1.cO() && $$1.ge();
      }

      protected void a(akt $$0, bwj $$1, long $$2) {
         if ($$1.gm()) {
            $$1.gq();
         } else if (!$$1.gb()) {
            $$1.gp();
         }
      }
   }
}
