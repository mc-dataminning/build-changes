import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.function.Predicate;

public class cjx {
   public static final int a = 20;
   public static final int b = 7;
   private static final bst i = bst.a(5, 16);
   private static final float j = 1.0F;
   private static final float k = 1.25F;
   private static final float l = 1.25F;
   private static final float m = 2.0F;
   private static final float n = 1.25F;
   private static final bst o = bst.a(600, 1200);
   public static final int c = 5;
   public static final int d = 5;
   public static final float e = 3.5714288F;
   private static final bst p = bst.a(600, 6000);
   private static final bst q = bst.a(100, 300);
   private static final cgw r = cgw.a().a(($$0, $$1) -> !$$0.aq().equals(bvq.ai) && (!$$1.N().b(dhd.c) || !$$0.aq().equals(bvq.f)) && $$1.F_().a($$0.cR()));
   private static final float s = 3.0F;
   public static final int f = 4;
   public static final float g = 2.5F;
   public static final float h = 1.0F;

   protected static void a(cjw $$0, bam $$1) {
      $$0.eb().a(cfj.S, o.a($$1));
      $$0.eb().a(cfj.V, p.a($$1));
   }

   protected static bxh<?> a(bxh<cjw> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      $$0.a(ImmutableSet.of(crn.a));
      $$0.b(crn.b);
      $$0.f();
      return $$0;
   }

   private static void b(bxh<cjw> $$0) {
      $$0.a(crn.a, 0, ImmutableList.of(new cas(0.8F), new bxt(2.0F), new bze(45, 90), new bzi(), new bye(cfj.P), new bye(cfj.S), new bye(cfj.V)));
   }

   private static void c(bxh<cjw> $$0) {
      $$0.a(
         crn.b,
         ImmutableList.of(
            Pair.of(0, bzy.a(bvq.bS, 6.0F, bst.a(30, 60))),
            Pair.of(0, new bxs(bvq.ai)),
            Pair.of(1, new byl($$0x -> 1.25F)),
            Pair.of(2, bxv.a(i, 1.25F)),
            Pair.of(3, new bzv(ImmutableList.of(Pair.of(bzq.a(1.0F), 2), Pair.of(caf.a(1.0F, 3), 2), Pair.of(new byi(30, 60), 1))))
         ),
         ImmutableSet.of(Pair.of(cfj.W, cfk.b), Pair.of(cfj.T, cfk.b))
      );
   }

   private static void d(bxh<cjw> $$0) {
      $$0.a(
         crn.q,
         ImmutableList.of(Pair.of(0, new byz(o, axf.lv)), Pair.of(1, new bzb<>(o, 5, 5, 3.5714288F, $$0x -> $$0x.gy() ? axf.lr : axf.li))),
         ImmutableSet.of(Pair.of(cfj.O, cfk.b), Pair.of(cfj.r, cfk.b), Pair.of(cfj.m, cfk.b), Pair.of(cfj.S, cfk.b))
      );
   }

   private static void e(bxh<cjw> $$0) {
      $$0.a(
         crn.r,
         ImmutableList.of(
            Pair.of(0, new bzo($$0x -> $$0x.gy() ? q : p, r, 3.0F, $$0x -> $$0x.e_() ? 1.0 : 2.5, $$0x -> $$0x.gy() ? axf.lu : axf.ll, $$0x -> axf.lm)),
            Pair.of(1, new bzn<>($$0x -> $$0x.gy() ? q.a() : p.a(), 4, 7, 1.25F, r, 20, $$0x -> $$0x.gy() ? axf.lt : axf.lk))
         ),
         ImmutableSet.of(Pair.of(cfj.O, cfk.b), Pair.of(cfj.r, cfk.b), Pair.of(cfj.V, cfk.b))
      );
   }

   public static void a(cjw $$0) {
      $$0.eb().a(ImmutableList.of(crn.r, crn.q, crn.b));
   }

   public static Predicate<cxo> a() {
      return $$0 -> $$0.a(ayd.ag);
   }
}
