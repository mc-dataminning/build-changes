import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.function.Predicate;

public class cmb {
   public static final int a = 20;
   public static final int b = 7;
   private static final bun i = bun.a(5, 16);
   private static final float j = 1.0F;
   private static final float k = 1.25F;
   private static final float l = 1.25F;
   private static final float m = 2.0F;
   private static final float n = 1.25F;
   private static final bun o = bun.a(600, 1200);
   public static final int c = 5;
   public static final int d = 5;
   public static final float e = 3.5714288F;
   private static final bun p = bun.a(600, 6000);
   private static final bun q = bun.a(100, 300);
   private static final ciu r = ciu.a().a(($$0, $$1) -> !$$0.an().equals(bxn.ai) && ($$1.O().c(dkf.d) || !$$0.an().equals(bxn.g)) && $$1.E_().a($$0.cR()));
   private static final float s = 3.0F;
   public static final int f = 4;
   public static final float g = 2.5F;
   public static final float h = 1.0F;

   protected static void a(cma $$0, bai $$1) {
      $$0.ec().a(chh.T, o.a($$1));
      $$0.ec().a(chh.W, p.a($$1));
   }

   protected static bzf<?> a(bzf<cma> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      $$0.a(ImmutableSet.of(cuc.a));
      $$0.b(cuc.b);
      $$0.f();
      return $$0;
   }

   private static void b(bzf<cma> $$0) {
      $$0.a(cuc.a, 0, ImmutableList.of(new ccq(0.8F), new bzr(2.0F), new cbc(45, 90), new cbg(), new cac(chh.Q), new cac(chh.T), new cac(chh.W)));
   }

   private static void c(bzf<cma> $$0) {
      $$0.a(
         cuc.b,
         ImmutableList.of(
            Pair.of(0, cbw.a(bxn.bT, 6.0F, bun.a(30, 60))),
            Pair.of(0, new bzq(bxn.ai)),
            Pair.of(1, new caj($$0x -> 1.25F)),
            Pair.of(2, bzt.a(i, 1.25F)),
            Pair.of(3, new cbt(ImmutableList.of(Pair.of(cbo.a(1.0F), 2), Pair.of(ccd.a(1.0F, 3), 2), Pair.of(new cag(30, 60), 1))))
         ),
         ImmutableSet.of(Pair.of(chh.X, chi.b), Pair.of(chh.U, chi.b))
      );
   }

   private static void d(bzf<cma> $$0) {
      $$0.a(
         cuc.q,
         ImmutableList.of(Pair.of(0, new cax(o, awy.lF)), Pair.of(1, new caz<>(o, 5, 5, 3.5714288F, $$0x -> $$0x.gG() ? awy.lB : awy.ls))),
         ImmutableSet.of(Pair.of(chh.P, chi.b), Pair.of(chh.s, chi.b), Pair.of(chh.n, chi.b), Pair.of(chh.T, chi.b))
      );
   }

   private static void e(bzf<cma> $$0) {
      $$0.a(
         cuc.r,
         ImmutableList.of(
            Pair.of(0, new cbm($$0x -> $$0x.gG() ? q : p, r, 3.0F, $$0x -> $$0x.e_() ? 1.0 : 2.5, $$0x -> $$0x.gG() ? awy.lE : awy.lv, $$0x -> awy.lw)),
            Pair.of(1, new cbl<>($$0x -> $$0x.gG() ? q.a() : p.a(), 4, 7, 1.25F, r, 20, $$0x -> $$0x.gG() ? awy.lD : awy.lu))
         ),
         ImmutableSet.of(Pair.of(chh.P, chi.b), Pair.of(chh.s, chi.b), Pair.of(chh.W, chi.b))
      );
   }

   public static void a(cma $$0) {
      $$0.ec().a(ImmutableList.of(cuc.r, cuc.q, cuc.b));
   }

   public static Predicate<dak> a() {
      return $$0 -> $$0.a(axv.ag);
   }
}
