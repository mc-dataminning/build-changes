import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.function.Predicate;

public class cbn {
   private static final float a = 4.0F;
   private static final float b = 2.0F;
   private static final float c = 2.5F;
   private static final float d = 2.5F;
   private static final float e = 1.0F;
   private static final blh f = blh.a(5, 16);
   private static final ImmutableList<bys<? extends byr<? super cbm>>> g = ImmutableList.of(bys.c, bys.f, bys.t, bys.o);
   private static final ImmutableList<bxl<?>> h = ImmutableList.of(
      bxl.Z, bxl.x, bxl.y, bxl.m, bxl.n, bxl.E, bxl.t, bxl.h, bxl.O, bxl.P, bxl.Q, bxl.R, new bxl[]{bxl.r, bxl.K}
   );

   protected static void a(cbm $$0, awp $$1) {
   }

   public static bpj.b<cbm> a() {
      return bpj.a(h, g);
   }

   protected static bpj<?> a(bpj<cbm> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(ciy.a));
      $$0.b(ciy.b);
      $$0.f();
      return $$0;
   }

   private static void b(bpj<cbm> $$0) {
      $$0.a(ciy.a, 0, ImmutableList.of(new bsu(0.8F), new cbn.a(4.0F), new brg(45, 90), new brk(), new bqg(bxl.P), new bqg(bxl.Q)));
   }

   private static void c(bpj<cbm> $$0) {
      $$0.a(
         ciy.b,
         ImmutableList.of(
            Pair.of(0, bsa.a(bnw.bw, 6.0F, blh.a(30, 60))),
            Pair.of(1, new bpu(bnw.n)),
            Pair.of(
               2,
               new brx(
                  ImmutableList.of(Pair.of(new bqn($$0x -> 2.5F, $$0x -> $$0x.o_() ? 2.5 : 3.5), 1), Pair.of(btn.a(Predicate.not(cbm::w), bpx.a(f, 2.5F)), 1))
               )
            ),
            Pair.of(3, new brr(blh.a(150, 250), 30.0F, 0.0F, 0.0F)),
            Pair.of(
               4,
               new brx(
                  ImmutableMap.of(bxl.m, bxm.b),
                  ImmutableList.of(
                     Pair.of(btn.a(Predicate.not(cbm::w), brs.a(2.0F)), 1),
                     Pair.of(btn.a(Predicate.not(cbm::w), bsh.a(2.0F, 3)), 1),
                     Pair.of(new cbn.b(20), 1),
                     Pair.of(new bqk(30, 60), 1)
                  )
               )
            )
         )
      );
   }

   public static void a(cbm $$0) {
      $$0.dO().a(ImmutableList.of(ciy.b));
   }

   public static csc b() {
      return cbm.bT;
   }

   public static class a extends bpv {
      public a(float $$0) {
         super($$0);
      }

      @Override
      protected void b(aow $$0, boq $$1, long $$2) {
         if ($$1 instanceof cbm $$3) {
            $$3.gt();
         }

         super.b($$0, $$1, $$2);
      }
   }

   public static class b extends bqa<cbm> {
      private final int c;

      public b(int $$0) {
         super(ImmutableMap.of());
         this.c = $$0 * 20;
      }

      protected boolean a(aow $$0, cbm $$1) {
         return !$$1.aZ() && $$1.gu() >= (long)this.c && !$$1.fU() && $$1.aC() && !$$1.cO() && $$1.gg();
      }

      protected void a(aow $$0, cbm $$1, long $$2) {
         if ($$1.go()) {
            $$1.gs();
         } else if (!$$1.gd()) {
            $$1.gr();
         }
      }
   }
}
