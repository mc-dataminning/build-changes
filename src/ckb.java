import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.function.Predicate;

public class ckb {
   private static final float a = 4.0F;
   private static final float b = 2.0F;
   private static final float c = 2.5F;
   private static final float d = 2.5F;
   private static final float e = 1.0F;
   private static final btb f = btb.a(5, 16);
   private static final ImmutableList<cha<? extends cgz<? super cka>>> g = ImmutableList.of(cha.c, cha.f, cha.t, cha.o);
   private static final ImmutableList<cft<?>> h = ImmutableList.of(
      cft.aa, cft.y, cft.z, cft.n, cft.o, cft.F, cft.u, cft.h, cft.P, cft.Q, cft.R, cft.S, new cft[]{cft.s, cft.L}
   );

   protected static void a(cka $$0, azs $$1) {
   }

   public static bxr.b<cka> a() {
      return bxr.a(h, g);
   }

   protected static bxr<?> a(bxr<cka> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(crz.a));
      $$0.b(crz.b);
      $$0.f();
      return $$0;
   }

   private static void b(bxr<cka> $$0) {
      $$0.a(crz.a, 0, ImmutableList.of(new cbc(0.8F), new ckb.a(4.0F), new bzo(45, 90), new bzs(), new byo(cft.Q), new byo(cft.R)));
   }

   private static void c(bxr<cka> $$0) {
      $$0.a(
         crz.b,
         ImmutableList.of(
            Pair.of(0, cai.a(bwb.bR, 6.0F, btb.a(30, 60))),
            Pair.of(1, new byc(bwb.t)),
            Pair.of(
               2,
               new caf(
                  ImmutableList.of(Pair.of(new byv($$0x -> 2.5F, $$0x -> $$0x.n_() ? 2.5 : 3.5), 1), Pair.of(cbv.a(Predicate.not(cka::t), byf.a(f, 2.5F)), 1))
               )
            ),
            Pair.of(3, new bzz(btb.a(150, 250), 30.0F, 0.0F, 0.0F)),
            Pair.of(
               4,
               new caf(
                  ImmutableMap.of(cft.n, cfu.b),
                  ImmutableList.of(
                     Pair.of(cbv.a(Predicate.not(cka::t), caa.a(2.0F)), 1),
                     Pair.of(cbv.a(Predicate.not(cka::t), cap.a(2.0F, 3)), 1),
                     Pair.of(new ckb.b(20), 1),
                     Pair.of(new bys(30, 60), 1)
                  )
               )
            )
         )
      );
   }

   public static void a(cka $$0) {
      $$0.eb().a(ImmutableList.of(crz.b));
   }

   public static Predicate<cxy> b() {
      return $$0 -> $$0.a(axi.ak);
   }

   public static class a extends byd<cka> {
      public a(float $$0) {
         super($$0);
      }

      protected void a(arn $$0, cka $$1, long $$2) {
         $$1.gF();
         super.b($$0, $$1, $$2);
      }
   }

   public static class b extends byi<cka> {
      private final int c;

      public b(int $$0) {
         super(ImmutableMap.of());
         this.c = $$0 * 20;
      }

      protected boolean a(arn $$0, cka $$1) {
         return !$$1.bj() && $$1.gG() >= (long)this.c && !$$1.O_() && $$1.aJ() && !$$1.cX() && $$1.gq();
      }

      protected void a(arn $$0, cka $$1, long $$2) {
         if ($$1.gt()) {
            $$1.gE();
         } else if (!$$1.gn()) {
            $$1.gD();
         }
      }
   }
}
