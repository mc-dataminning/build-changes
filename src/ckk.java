import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.function.Predicate;

public class ckk {
   public static final int a = 20;
   public static final int b = 7;
   private static final btb i = btb.a(5, 16);
   private static final float j = 1.0F;
   private static final float k = 1.25F;
   private static final float l = 1.25F;
   private static final float m = 2.0F;
   private static final float n = 1.25F;
   private static final btb o = btb.a(600, 1200);
   public static final int c = 5;
   public static final int d = 5;
   public static final float e = 3.5714288F;
   private static final btb p = btb.a(600, 6000);
   private static final btb q = btb.a(100, 300);
   private static final chg r = chg.a().a(($$0, $$1) -> !$$0.aq().equals(bwb.ah) && (!$$1.O().c(dhl.c) || !$$0.aq().equals(bwb.f)) && $$1.A_().a($$0.cR()));
   private static final float s = 3.0F;
   public static final int f = 4;
   public static final float g = 2.5F;
   public static final float h = 1.0F;

   protected static void a(ckj $$0, azs $$1) {
      $$0.eb().a(cft.T, o.a($$1));
      $$0.eb().a(cft.W, p.a($$1));
   }

   protected static bxr<?> a(bxr<ckj> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      $$0.a(ImmutableSet.of(crz.a));
      $$0.b(crz.b);
      $$0.f();
      return $$0;
   }

   private static void b(bxr<ckj> $$0) {
      $$0.a(crz.a, 0, ImmutableList.of(new cbc(0.8F), new byd(2.0F), new bzo(45, 90), new bzs(), new byo(cft.Q), new byo(cft.T), new byo(cft.W)));
   }

   private static void c(bxr<ckj> $$0) {
      $$0.a(
         crz.b,
         ImmutableList.of(
            Pair.of(0, cai.a(bwb.bR, 6.0F, btb.a(30, 60))),
            Pair.of(0, new byc(bwb.ah)),
            Pair.of(1, new byv($$0x -> 1.25F)),
            Pair.of(2, byf.a(i, 1.25F)),
            Pair.of(3, new caf(ImmutableList.of(Pair.of(caa.a(1.0F), 2), Pair.of(cap.a(1.0F, 3), 2), Pair.of(new bys(30, 60), 1))))
         ),
         ImmutableSet.of(Pair.of(cft.X, cfu.b), Pair.of(cft.U, cfu.b))
      );
   }

   private static void d(bxr<ckj> $$0) {
      $$0.a(
         crz.q,
         ImmutableList.of(Pair.of(0, new bzj(o, awk.lB)), Pair.of(1, new bzl<>(o, 5, 5, 3.5714288F, $$0x -> $$0x.gC() ? awk.lx : awk.lo))),
         ImmutableSet.of(Pair.of(cft.P, cfu.b), Pair.of(cft.s, cfu.b), Pair.of(cft.n, cfu.b), Pair.of(cft.T, cfu.b))
      );
   }

   private static void e(bxr<ckj> $$0) {
      $$0.a(
         crz.r,
         ImmutableList.of(
            Pair.of(0, new bzy($$0x -> $$0x.gC() ? q : p, r, 3.0F, $$0x -> $$0x.n_() ? 1.0 : 2.5, $$0x -> $$0x.gC() ? awk.lA : awk.lr, $$0x -> awk.ls)),
            Pair.of(1, new bzx<>($$0x -> $$0x.gC() ? q.a() : p.a(), 4, 7, 1.25F, r, 20, $$0x -> $$0x.gC() ? awk.lz : awk.lq))
         ),
         ImmutableSet.of(Pair.of(cft.P, cfu.b), Pair.of(cft.s, cfu.b), Pair.of(cft.W, cfu.b))
      );
   }

   public static void a(ckj $$0) {
      $$0.eb().a(ImmutableList.of(crz.r, crz.q, crz.b));
   }

   public static Predicate<cxy> a() {
      return $$0 -> $$0.a(axi.ae);
   }
}
