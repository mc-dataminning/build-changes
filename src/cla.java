import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.function.Predicate;

public class cla {
   public static final int a = 20;
   public static final int b = 7;
   private static final btm i = btm.a(5, 16);
   private static final float j = 1.0F;
   private static final float k = 1.25F;
   private static final float l = 1.25F;
   private static final float m = 2.0F;
   private static final float n = 1.25F;
   private static final btm o = btm.a(600, 1200);
   public static final int c = 5;
   public static final int d = 5;
   public static final float e = 3.5714288F;
   private static final btm p = btm.a(600, 6000);
   private static final btm q = btm.a(100, 300);
   private static final chr r = chr.a().a(($$0, $$1) -> !$$0.aq().equals(bwm.ah) && (!$$1.O().c(dir.c) || !$$0.aq().equals(bwm.f)) && $$1.A_().a($$0.cR()));
   private static final float s = 3.0F;
   public static final int f = 4;
   public static final float g = 2.5F;
   public static final float h = 1.0F;

   protected static void a(ckz $$0, azv $$1) {
      $$0.eb().a(cge.T, o.a($$1));
      $$0.eb().a(cge.W, p.a($$1));
   }

   protected static byc<?> a(byc<ckz> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      $$0.a(ImmutableSet.of(csr.a));
      $$0.b(csr.b);
      $$0.f();
      return $$0;
   }

   private static void b(byc<ckz> $$0) {
      $$0.a(csr.a, 0, ImmutableList.of(new cbn(0.8F), new byo(2.0F), new bzz(45, 90), new cad(), new byz(cge.Q), new byz(cge.T), new byz(cge.W)));
   }

   private static void c(byc<ckz> $$0) {
      $$0.a(
         csr.b,
         ImmutableList.of(
            Pair.of(0, cat.a(bwm.bS, 6.0F, btm.a(30, 60))),
            Pair.of(0, new byn(bwm.ah)),
            Pair.of(1, new bzg($$0x -> 1.25F)),
            Pair.of(2, byq.a(i, 1.25F)),
            Pair.of(3, new caq(ImmutableList.of(Pair.of(cal.a(1.0F), 2), Pair.of(cba.a(1.0F, 3), 2), Pair.of(new bzd(30, 60), 1))))
         ),
         ImmutableSet.of(Pair.of(cge.X, cgf.b), Pair.of(cge.U, cgf.b))
      );
   }

   private static void d(byc<ckz> $$0) {
      $$0.a(
         csr.q,
         ImmutableList.of(Pair.of(0, new bzu(o, awn.lC)), Pair.of(1, new bzw<>(o, 5, 5, 3.5714288F, $$0x -> $$0x.gC() ? awn.ly : awn.lp))),
         ImmutableSet.of(Pair.of(cge.P, cgf.b), Pair.of(cge.s, cgf.b), Pair.of(cge.n, cgf.b), Pair.of(cge.T, cgf.b))
      );
   }

   private static void e(byc<ckz> $$0) {
      $$0.a(
         csr.r,
         ImmutableList.of(
            Pair.of(0, new caj($$0x -> $$0x.gC() ? q : p, r, 3.0F, $$0x -> $$0x.n_() ? 1.0 : 2.5, $$0x -> $$0x.gC() ? awn.lB : awn.ls, $$0x -> awn.lt)),
            Pair.of(1, new cai<>($$0x -> $$0x.gC() ? q.a() : p.a(), 4, 7, 1.25F, r, 20, $$0x -> $$0x.gC() ? awn.lA : awn.lr))
         ),
         ImmutableSet.of(Pair.of(cge.P, cgf.b), Pair.of(cge.s, cgf.b), Pair.of(cge.W, cgf.b))
      );
   }

   public static void a(ckz $$0) {
      $$0.eb().a(ImmutableList.of(csr.r, csr.q, csr.b));
   }

   public static Predicate<cyy> a() {
      return $$0 -> $$0.a(axk.ae);
   }
}
