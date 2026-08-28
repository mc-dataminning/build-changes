import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.function.Predicate;

public class ckp {
   private static final float a = 4.0F;
   private static final float b = 2.0F;
   private static final float c = 2.5F;
   private static final float d = 2.5F;
   private static final float e = 1.0F;
   private static final btm f = btm.a(5, 16);
   private static final ImmutableList<chl<? extends chk<? super cko>>> g = ImmutableList.of(chl.c, chl.f, chl.t, chl.o);
   private static final ImmutableList<cge<?>> h = ImmutableList.of(
      cge.aa, cge.y, cge.z, cge.n, cge.o, cge.F, cge.u, cge.h, cge.P, cge.Q, cge.R, cge.S, new cge[]{cge.s, cge.L}
   );

   protected static void a(cko $$0, azv $$1) {
   }

   public static byc.b<cko> a() {
      return byc.a(h, g);
   }

   protected static byc<?> a(byc<cko> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(csr.a));
      $$0.b(csr.b);
      $$0.f();
      return $$0;
   }

   private static void b(byc<cko> $$0) {
      $$0.a(csr.a, 0, ImmutableList.of(new cbn(0.8F), new ckp.a(4.0F), new bzz(45, 90), new cad(), new byz(cge.Q), new byz(cge.R)));
   }

   private static void c(byc<cko> $$0) {
      $$0.a(
         csr.b,
         ImmutableList.of(
            Pair.of(0, cat.a(bwm.bS, 6.0F, btm.a(30, 60))),
            Pair.of(1, new byn(bwm.t)),
            Pair.of(
               2,
               new caq(
                  ImmutableList.of(Pair.of(new bzg($$0x -> 2.5F, $$0x -> $$0x.n_() ? 2.5 : 3.5), 1), Pair.of(ccg.a(Predicate.not(cko::t), byq.a(f, 2.5F)), 1))
               )
            ),
            Pair.of(3, new cak(btm.a(150, 250), 30.0F, 0.0F, 0.0F)),
            Pair.of(
               4,
               new caq(
                  ImmutableMap.of(cge.n, cgf.b),
                  ImmutableList.of(
                     Pair.of(ccg.a(Predicate.not(cko::t), cal.a(2.0F)), 1),
                     Pair.of(ccg.a(Predicate.not(cko::t), cba.a(2.0F, 3)), 1),
                     Pair.of(new ckp.b(20), 1),
                     Pair.of(new bzd(30, 60), 1)
                  )
               )
            )
         )
      );
   }

   public static void a(cko $$0) {
      $$0.eb().a(ImmutableList.of(csr.b));
   }

   public static Predicate<cyy> b() {
      return $$0 -> $$0.a(axk.ak);
   }

   public static class a extends byo<cko> {
      public a(float $$0) {
         super($$0);
      }

      protected void a(arq $$0, cko $$1, long $$2) {
         $$1.gF();
         super.b($$0, $$1, $$2);
      }
   }

   public static class b extends byt<cko> {
      private final int c;

      public b(int $$0) {
         super(ImmutableMap.of());
         this.c = $$0 * 20;
      }

      protected boolean a(arq $$0, cko $$1) {
         return !$$1.bj() && $$1.gG() >= (long)this.c && !$$1.O_() && $$1.aJ() && !$$1.cX() && $$1.gq();
      }

      protected void a(arq $$0, cko $$1, long $$2) {
         if ($$1.gt()) {
            $$1.gE();
         } else if (!$$1.gn()) {
            $$1.gD();
         }
      }
   }
}
