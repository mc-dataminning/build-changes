import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.function.Predicate;

public class bzs {
   private static final float a = 4.0F;
   private static final float b = 2.0F;
   private static final float c = 2.5F;
   private static final float d = 2.5F;
   private static final float e = 1.0F;
   private static final bjn f = bjn.a(5, 16);
   private static final ImmutableList<bwx<? extends bww<? super bzr>>> g = ImmutableList.of(bwx.c, bwx.f, bwx.t, bwx.o);
   private static final ImmutableList<bvq<?>> h = ImmutableList.of(
      bvq.Z, bvq.x, bvq.y, bvq.m, bvq.n, bvq.E, bvq.t, bvq.h, bvq.O, bvq.P, bvq.Q, bvq.R, new bvq[]{bvq.r, bvq.K}
   );

   protected static void a(bzr $$0, auw $$1) {
   }

   public static bno.b<bzr> a() {
      return bno.a(h, g);
   }

   protected static bno<?> a(bno<bzr> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(chc.a));
      $$0.b(chc.b);
      $$0.f();
      return $$0;
   }

   private static void b(bno<bzr> $$0) {
      $$0.a(chc.a, 0, ImmutableList.of(new bqz(0.8F), new bzs.a(4.0F), new bpl(45, 90), new bpp(), new bol(bvq.P), new bol(bvq.Q)));
   }

   private static void c(bno<bzr> $$0) {
      $$0.a(
         chc.b,
         ImmutableList.of(
            Pair.of(0, bqf.a(bmc.bw, 6.0F, bjn.a(30, 60))),
            Pair.of(1, new bnz(bmc.n, 1.0F)),
            Pair.of(
               2,
               new bqc(
                  ImmutableList.of(Pair.of(new bos($$0x -> 2.5F, $$0x -> $$0x.o_() ? 2.5 : 3.5), 1), Pair.of(brs.a(Predicate.not(bzr::w), boc.a(f, 2.5F)), 1))
               )
            ),
            Pair.of(3, new bpw(bjn.a(150, 250), 30.0F, 0.0F, 0.0F)),
            Pair.of(
               4,
               new bqc(
                  ImmutableMap.of(bvq.m, bvr.b),
                  ImmutableList.of(
                     Pair.of(brs.a(Predicate.not(bzr::w), bpx.a(2.0F)), 1),
                     Pair.of(brs.a(Predicate.not(bzr::w), bqm.a(2.0F, 3)), 1),
                     Pair.of(new bzs.b(20), 1),
                     Pair.of(new bop(30, 60), 1)
                  )
               )
            )
         )
      );
   }

   public static void a(bzr $$0) {
      $$0.dN().a(ImmutableList.of(chc.b));
   }

   public static cqh b() {
      return bzr.bU;
   }

   public static class a extends boa {
      public a(float $$0) {
         super($$0);
      }

      @Override
      protected void b(ane $$0, bmx $$1, long $$2) {
         if ($$1 instanceof bzr $$3) {
            $$3.gs();
         }

         super.b($$0, $$1, $$2);
      }
   }

   public static class b extends bof<bzr> {
      private final int c;

      public b(int $$0) {
         super(ImmutableMap.of());
         this.c = $$0 * 20;
      }

      protected boolean a(ane $$0, bzr $$1) {
         return !$$1.aZ() && $$1.gt() >= (long)this.c && !$$1.fT() && $$1.aC() && !$$1.cO() && $$1.gf();
      }

      protected void a(ane $$0, bzr $$1, long $$2) {
         if ($$1.gn()) {
            $$1.gr();
         } else if (!$$1.gc()) {
            $$1.gq();
         }
      }
   }
}
