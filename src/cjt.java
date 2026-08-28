import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.function.Predicate;

public class cjt {
   public static final int a = 20;
   public static final int b = 7;
   private static final bsj i = bsj.a(5, 16);
   private static final float j = 1.0F;
   private static final float k = 1.25F;
   private static final float l = 1.25F;
   private static final float m = 2.0F;
   private static final float n = 1.25F;
   private static final bsj o = bsj.a(600, 1200);
   public static final int c = 5;
   public static final int d = 5;
   public static final float e = 3.5714288F;
   private static final bsj p = bsj.a(600, 6000);
   private static final bsj q = bsj.a(100, 300);
   private static final cgp r = cgp.a().a(($$0, $$1) -> !$$0.aq().equals(bvi.ah) && (!$$1.O().b(dgv.c) || !$$0.aq().equals(bvi.f)) && $$1.A_().a($$0.cQ()));
   private static final float s = 3.0F;
   public static final int f = 4;
   public static final float g = 2.5F;
   public static final float h = 1.0F;

   protected static void a(cjs $$0, azh $$1) {
      $$0.ea().a(cfc.S, o.a($$1));
      $$0.ea().a(cfc.V, p.a($$1));
   }

   protected static bxa<?> a(bxa<cjs> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      $$0.a(ImmutableSet.of(cri.a));
      $$0.b(cri.b);
      $$0.f();
      return $$0;
   }

   private static void b(bxa<cjs> $$0) {
      $$0.a(cri.a, 0, ImmutableList.of(new cal(0.8F), new bxm(2.0F), new byx(45, 90), new bzb(), new bxx(cfc.P), new bxx(cfc.S), new bxx(cfc.V)));
   }

   private static void c(bxa<cjs> $$0) {
      $$0.a(
         cri.b,
         ImmutableList.of(
            Pair.of(0, bzr.a(bvi.bR, 6.0F, bsj.a(30, 60))),
            Pair.of(0, new bxl(bvi.ah)),
            Pair.of(1, new bye($$0x -> 1.25F)),
            Pair.of(2, bxo.a(i, 1.25F)),
            Pair.of(3, new bzo(ImmutableList.of(Pair.of(bzj.a(1.0F), 2), Pair.of(bzy.a(1.0F, 3), 2), Pair.of(new byb(30, 60), 1))))
         ),
         ImmutableSet.of(Pair.of(cfc.W, cfd.b), Pair.of(cfc.T, cfd.b))
      );
   }

   private static void d(bxa<cjs> $$0) {
      $$0.a(
         cri.q,
         ImmutableList.of(Pair.of(0, new bys(o, awa.lB)), Pair.of(1, new byu<>(o, 5, 5, 3.5714288F, $$0x -> $$0x.gE() ? awa.lx : awa.lo))),
         ImmutableSet.of(Pair.of(cfc.O, cfd.b), Pair.of(cfc.r, cfd.b), Pair.of(cfc.m, cfd.b), Pair.of(cfc.S, cfd.b))
      );
   }

   private static void e(bxa<cjs> $$0) {
      $$0.a(
         cri.r,
         ImmutableList.of(
            Pair.of(0, new bzh($$0x -> $$0x.gE() ? q : p, r, 3.0F, $$0x -> $$0x.n_() ? 1.0 : 2.5, $$0x -> $$0x.gE() ? awa.lA : awa.lr, $$0x -> awa.ls)),
            Pair.of(1, new bzg<>($$0x -> $$0x.gE() ? q.a() : p.a(), 4, 7, 1.25F, r, 20, $$0x -> $$0x.gE() ? awa.lz : awa.lq))
         ),
         ImmutableSet.of(Pair.of(cfc.O, cfd.b), Pair.of(cfc.r, cfd.b), Pair.of(cfc.V, cfd.b))
      );
   }

   public static void a(cjs $$0) {
      $$0.ea().a(ImmutableList.of(cri.r, cri.q, cri.b));
   }

   public static Predicate<cxh> a() {
      return $$0 -> $$0.a(awy.ae);
   }
}
