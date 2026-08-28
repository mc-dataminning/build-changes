import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.function.Predicate;

public class clq {
   public static final int a = 20;
   public static final int b = 7;
   private static final buc i = buc.a(5, 16);
   private static final float j = 1.0F;
   private static final float k = 1.25F;
   private static final float l = 1.25F;
   private static final float m = 2.0F;
   private static final float n = 1.25F;
   private static final buc o = buc.a(600, 1200);
   public static final int c = 5;
   public static final int d = 5;
   public static final float e = 3.5714288F;
   private static final buc p = buc.a(600, 6000);
   private static final buc q = buc.a(100, 300);
   private static final cij r = cij.a().a(($$0, $$1) -> !$$0.an().equals(bxc.ai) && ($$1.O().c(djt.d) || !$$0.an().equals(bxc.g)) && $$1.E_().a($$0.cR()));
   private static final float s = 3.0F;
   public static final int f = 4;
   public static final float g = 2.5F;
   public static final float h = 1.0F;

   protected static void a(clp $$0, azx $$1) {
      $$0.ec().a(cgw.T, o.a($$1));
      $$0.ec().a(cgw.W, p.a($$1));
   }

   protected static byu<?> a(byu<clp> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      $$0.a(ImmutableSet.of(ctr.a));
      $$0.b(ctr.b);
      $$0.f();
      return $$0;
   }

   private static void b(byu<clp> $$0) {
      $$0.a(ctr.a, 0, ImmutableList.of(new ccf(0.8F), new bzg(2.0F), new car(45, 90), new cav(), new bzr(cgw.Q), new bzr(cgw.T), new bzr(cgw.W)));
   }

   private static void c(byu<clp> $$0) {
      $$0.a(
         ctr.b,
         ImmutableList.of(
            Pair.of(0, cbl.a(bxc.bT, 6.0F, buc.a(30, 60))),
            Pair.of(0, new bzf(bxc.ai)),
            Pair.of(1, new bzy($$0x -> 1.25F)),
            Pair.of(2, bzi.a(i, 1.25F)),
            Pair.of(3, new cbi(ImmutableList.of(Pair.of(cbd.a(1.0F), 2), Pair.of(cbs.a(1.0F, 3), 2), Pair.of(new bzv(30, 60), 1))))
         ),
         ImmutableSet.of(Pair.of(cgw.X, cgx.b), Pair.of(cgw.U, cgx.b))
      );
   }

   private static void d(byu<clp> $$0) {
      $$0.a(
         ctr.q,
         ImmutableList.of(Pair.of(0, new cam(o, awp.lF)), Pair.of(1, new cao<>(o, 5, 5, 3.5714288F, $$0x -> $$0x.gG() ? awp.lB : awp.ls))),
         ImmutableSet.of(Pair.of(cgw.P, cgx.b), Pair.of(cgw.s, cgx.b), Pair.of(cgw.n, cgx.b), Pair.of(cgw.T, cgx.b))
      );
   }

   private static void e(byu<clp> $$0) {
      $$0.a(
         ctr.r,
         ImmutableList.of(
            Pair.of(0, new cbb($$0x -> $$0x.gG() ? q : p, r, 3.0F, $$0x -> $$0x.n_() ? 1.0 : 2.5, $$0x -> $$0x.gG() ? awp.lE : awp.lv, $$0x -> awp.lw)),
            Pair.of(1, new cba<>($$0x -> $$0x.gG() ? q.a() : p.a(), 4, 7, 1.25F, r, 20, $$0x -> $$0x.gG() ? awp.lD : awp.lu))
         ),
         ImmutableSet.of(Pair.of(cgw.P, cgx.b), Pair.of(cgw.s, cgx.b), Pair.of(cgw.W, cgx.b))
      );
   }

   public static void a(clp $$0) {
      $$0.ec().a(ImmutableList.of(ctr.r, ctr.q, ctr.b));
   }

   public static Predicate<czy> a() {
      return $$0 -> $$0.a(axm.af);
   }
}
