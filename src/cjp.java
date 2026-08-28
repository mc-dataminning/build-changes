import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.function.Predicate;

public class cjp {
   public static final int a = 20;
   public static final int b = 7;
   private static final bsl i = bsl.a(5, 16);
   private static final float j = 1.0F;
   private static final float k = 1.25F;
   private static final float l = 1.25F;
   private static final float m = 2.0F;
   private static final float n = 1.25F;
   private static final bsl o = bsl.a(600, 1200);
   public static final int c = 5;
   public static final int d = 5;
   public static final float e = 3.5714288F;
   private static final bsl p = bsl.a(600, 6000);
   private static final bsl q = bsl.a(100, 300);
   private static final cgo r = cgo.a().a(($$0, $$1) -> !$$0.aq().equals(bvi.ai) && (!$$1.O().b(dgv.c) || !$$0.aq().equals(bvi.f)) && $$1.F_().a($$0.cR()));
   private static final float s = 3.0F;
   public static final int f = 4;
   public static final float g = 2.5F;
   public static final float h = 1.0F;

   protected static void a(cjo $$0, bac $$1) {
      $$0.ec().a(cfb.S, o.a($$1));
      $$0.ec().a(cfb.V, p.a($$1));
   }

   protected static bwz<?> a(bwz<cjo> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      $$0.a(ImmutableSet.of(crf.a));
      $$0.b(crf.b);
      $$0.f();
      return $$0;
   }

   private static void b(bwz<cjo> $$0) {
      $$0.a(crf.a, 0, ImmutableList.of(new cak(0.8F), new bxl(2.0F), new byw(45, 90), new bza(), new bxw(cfb.P), new bxw(cfb.S), new bxw(cfb.V)));
   }

   private static void c(bwz<cjo> $$0) {
      $$0.a(
         crf.b,
         ImmutableList.of(
            Pair.of(0, bzq.a(bvi.bS, 6.0F, bsl.a(30, 60))),
            Pair.of(0, new bxk(bvi.ai)),
            Pair.of(1, new byd($$0x -> 1.25F)),
            Pair.of(2, bxn.a(i, 1.25F)),
            Pair.of(3, new bzn(ImmutableList.of(Pair.of(bzi.a(1.0F), 2), Pair.of(bzx.a(1.0F, 3), 2), Pair.of(new bya(30, 60), 1))))
         ),
         ImmutableSet.of(Pair.of(cfb.W, cfc.b), Pair.of(cfb.T, cfc.b))
      );
   }

   private static void d(bwz<cjo> $$0) {
      $$0.a(
         crf.q,
         ImmutableList.of(Pair.of(0, new byr(o, awv.lB)), Pair.of(1, new byt<>(o, 5, 5, 3.5714288F, $$0x -> $$0x.gA() ? awv.lx : awv.lo))),
         ImmutableSet.of(Pair.of(cfb.O, cfc.b), Pair.of(cfb.r, cfc.b), Pair.of(cfb.m, cfc.b), Pair.of(cfb.S, cfc.b))
      );
   }

   private static void e(bwz<cjo> $$0) {
      $$0.a(
         crf.r,
         ImmutableList.of(
            Pair.of(0, new bzg($$0x -> $$0x.gA() ? q : p, r, 3.0F, $$0x -> $$0x.e_() ? 1.0 : 2.5, $$0x -> $$0x.gA() ? awv.lA : awv.lr, $$0x -> awv.ls)),
            Pair.of(1, new bzf<>($$0x -> $$0x.gA() ? q.a() : p.a(), 4, 7, 1.25F, r, 20, $$0x -> $$0x.gA() ? awv.lz : awv.lq))
         ),
         ImmutableSet.of(Pair.of(cfb.O, cfc.b), Pair.of(cfb.r, cfc.b), Pair.of(cfb.V, cfc.b))
      );
   }

   public static void a(cjo $$0) {
      $$0.ec().a(ImmutableList.of(crf.r, crf.q, crf.b));
   }

   public static Predicate<cxg> a() {
      return $$0 -> $$0.a(axt.ag);
   }
}
