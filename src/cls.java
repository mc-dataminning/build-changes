import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.function.Predicate;

public class cls {
   public static final int a = 20;
   public static final int b = 7;
   private static final bue i = bue.a(5, 16);
   private static final float j = 1.0F;
   private static final float k = 1.25F;
   private static final float l = 1.25F;
   private static final float m = 2.0F;
   private static final float n = 1.25F;
   private static final bue o = bue.a(600, 1200);
   public static final int c = 5;
   public static final int d = 5;
   public static final float e = 3.5714288F;
   private static final bue p = bue.a(600, 6000);
   private static final bue q = bue.a(100, 300);
   private static final cil r = cil.a().a(($$0, $$1) -> !$$0.an().equals(bxe.ai) && ($$1.O().c(djv.d) || !$$0.an().equals(bxe.g)) && $$1.E_().a($$0.cR()));
   private static final float s = 3.0F;
   public static final int f = 4;
   public static final float g = 2.5F;
   public static final float h = 1.0F;

   protected static void a(clr $$0, azz $$1) {
      $$0.ec().a(cgy.T, o.a($$1));
      $$0.ec().a(cgy.W, p.a($$1));
   }

   protected static byw<?> a(byw<clr> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      $$0.a(ImmutableSet.of(ctt.a));
      $$0.b(ctt.b);
      $$0.f();
      return $$0;
   }

   private static void b(byw<clr> $$0) {
      $$0.a(ctt.a, 0, ImmutableList.of(new cch(0.8F), new bzi(2.0F), new cat(45, 90), new cax(), new bzt(cgy.Q), new bzt(cgy.T), new bzt(cgy.W)));
   }

   private static void c(byw<clr> $$0) {
      $$0.a(
         ctt.b,
         ImmutableList.of(
            Pair.of(0, cbn.a(bxe.bT, 6.0F, bue.a(30, 60))),
            Pair.of(0, new bzh(bxe.ai)),
            Pair.of(1, new caa($$0x -> 1.25F)),
            Pair.of(2, bzk.a(i, 1.25F)),
            Pair.of(3, new cbk(ImmutableList.of(Pair.of(cbf.a(1.0F), 2), Pair.of(cbu.a(1.0F, 3), 2), Pair.of(new bzx(30, 60), 1))))
         ),
         ImmutableSet.of(Pair.of(cgy.X, cgz.b), Pair.of(cgy.U, cgz.b))
      );
   }

   private static void d(byw<clr> $$0) {
      $$0.a(
         ctt.q,
         ImmutableList.of(Pair.of(0, new cao(o, awr.lF)), Pair.of(1, new caq<>(o, 5, 5, 3.5714288F, $$0x -> $$0x.gG() ? awr.lB : awr.ls))),
         ImmutableSet.of(Pair.of(cgy.P, cgz.b), Pair.of(cgy.s, cgz.b), Pair.of(cgy.n, cgz.b), Pair.of(cgy.T, cgz.b))
      );
   }

   private static void e(byw<clr> $$0) {
      $$0.a(
         ctt.r,
         ImmutableList.of(
            Pair.of(0, new cbd($$0x -> $$0x.gG() ? q : p, r, 3.0F, $$0x -> $$0x.n_() ? 1.0 : 2.5, $$0x -> $$0x.gG() ? awr.lE : awr.lv, $$0x -> awr.lw)),
            Pair.of(1, new cbc<>($$0x -> $$0x.gG() ? q.a() : p.a(), 4, 7, 1.25F, r, 20, $$0x -> $$0x.gG() ? awr.lD : awr.lu))
         ),
         ImmutableSet.of(Pair.of(cgy.P, cgz.b), Pair.of(cgy.s, cgz.b), Pair.of(cgy.W, cgz.b))
      );
   }

   public static void a(clr $$0) {
      $$0.ec().a(ImmutableList.of(ctt.r, ctt.q, ctt.b));
   }

   public static Predicate<daa> a() {
      return $$0 -> $$0.a(axo.ag);
   }
}
