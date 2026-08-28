import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.function.Predicate;

public class clf {
   public static final int a = 20;
   public static final int b = 7;
   private static final btr i = btr.a(5, 16);
   private static final float j = 1.0F;
   private static final float k = 1.25F;
   private static final float l = 1.25F;
   private static final float m = 2.0F;
   private static final float n = 1.25F;
   private static final btr o = btr.a(600, 1200);
   public static final int c = 5;
   public static final int d = 5;
   public static final float e = 3.5714288F;
   private static final btr p = btr.a(600, 6000);
   private static final btr q = btr.a(100, 300);
   private static final chy r = chy.a().a(($$0, $$1) -> !$$0.an().equals(bwr.ah) && (!$$1.O().c(dji.d) || !$$0.an().equals(bwr.f)) && $$1.A_().a($$0.cQ()));
   private static final float s = 3.0F;
   public static final int f = 4;
   public static final float g = 2.5F;
   public static final float h = 1.0F;

   protected static void a(cle $$0, azv $$1) {
      $$0.eb().a(cgl.T, o.a($$1));
      $$0.eb().a(cgl.W, p.a($$1));
   }

   protected static byj<?> a(byj<cle> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      $$0.a(ImmutableSet.of(ctg.a));
      $$0.b(ctg.b);
      $$0.f();
      return $$0;
   }

   private static void b(byj<cle> $$0) {
      $$0.a(ctg.a, 0, ImmutableList.of(new cbu(0.8F), new byv(2.0F), new cag(45, 90), new cak(), new bzg(cgl.Q), new bzg(cgl.T), new bzg(cgl.W)));
   }

   private static void c(byj<cle> $$0) {
      $$0.a(
         ctg.b,
         ImmutableList.of(
            Pair.of(0, cba.a(bwr.bS, 6.0F, btr.a(30, 60))),
            Pair.of(0, new byu(bwr.ah)),
            Pair.of(1, new bzn($$0x -> 1.25F)),
            Pair.of(2, byx.a(i, 1.25F)),
            Pair.of(3, new cax(ImmutableList.of(Pair.of(cas.a(1.0F), 2), Pair.of(cbh.a(1.0F, 3), 2), Pair.of(new bzk(30, 60), 1))))
         ),
         ImmutableSet.of(Pair.of(cgl.X, cgm.b), Pair.of(cgl.U, cgm.b))
      );
   }

   private static void d(byj<cle> $$0) {
      $$0.a(
         ctg.q,
         ImmutableList.of(Pair.of(0, new cab(o, awn.lF)), Pair.of(1, new cad<>(o, 5, 5, 3.5714288F, $$0x -> $$0x.gF() ? awn.lB : awn.ls))),
         ImmutableSet.of(Pair.of(cgl.P, cgm.b), Pair.of(cgl.s, cgm.b), Pair.of(cgl.n, cgm.b), Pair.of(cgl.T, cgm.b))
      );
   }

   private static void e(byj<cle> $$0) {
      $$0.a(
         ctg.r,
         ImmutableList.of(
            Pair.of(0, new caq($$0x -> $$0x.gF() ? q : p, r, 3.0F, $$0x -> $$0x.n_() ? 1.0 : 2.5, $$0x -> $$0x.gF() ? awn.lE : awn.lv, $$0x -> awn.lw)),
            Pair.of(1, new cap<>($$0x -> $$0x.gF() ? q.a() : p.a(), 4, 7, 1.25F, r, 20, $$0x -> $$0x.gF() ? awn.lD : awn.lu))
         ),
         ImmutableSet.of(Pair.of(cgl.P, cgm.b), Pair.of(cgl.s, cgm.b), Pair.of(cgl.W, cgm.b))
      );
   }

   public static void a(cle $$0) {
      $$0.eb().a(ImmutableList.of(ctg.r, ctg.q, ctg.b));
   }

   public static Predicate<czn> a() {
      return $$0 -> $$0.a(axk.af);
   }
}
