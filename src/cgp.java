import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.function.Predicate;

public class cgp {
   public static final int a = 20;
   public static final int b = 7;
   private static final bpo i = bpo.a(5, 16);
   private static final float j = 1.0F;
   private static final float k = 1.25F;
   private static final float l = 1.25F;
   private static final float m = 2.0F;
   private static final float n = 1.25F;
   private static final bpo o = bpo.a(600, 1200);
   public static final int c = 5;
   public static final int d = 5;
   public static final float e = 3.5714288F;
   private static final bpo p = bpo.a(600, 6000);
   private static final bpo q = bpo.a(100, 300);
   private static final cdp r = cdp.a().a($$0 -> !$$0.ak().equals(bsj.X) && $$0.dP().C_().a($$0.cK()));
   private static final float s = 3.0F;
   public static final int f = 4;
   public static final float g = 2.5F;
   public static final float h = 1.0F;

   protected static void a(cgo $$0, aym $$1) {
      $$0.dT().a(ccc.S, o.a($$1));
      $$0.dT().a(ccc.V, p.a($$1));
   }

   protected static bua<?> a(bua<cgo> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      $$0.a(ImmutableSet.of(cnw.a));
      $$0.b(cnw.b);
      $$0.f();
      return $$0;
   }

   private static void b(bua<cgo> $$0) {
      $$0.a(cnw.a, 0, ImmutableList.of(new bxl(0.8F), new bum(2.0F), new bvx(45, 90), new bwb(), new bux(ccc.P), new bux(ccc.S), new bux(ccc.V)));
   }

   private static void c(bua<cgo> $$0) {
      $$0.a(
         cnw.b,
         ImmutableList.of(
            Pair.of(0, bwr.a(bsj.by, 6.0F, bpo.a(30, 60))),
            Pair.of(0, new bul(bsj.X)),
            Pair.of(1, new bve($$0x -> 1.25F)),
            Pair.of(2, buo.a(i, 1.25F)),
            Pair.of(3, new bwo(ImmutableList.of(Pair.of(bwj.a(1.0F), 2), Pair.of(bwy.a(1.0F, 3), 2), Pair.of(new bvb(30, 60), 1))))
         ),
         ImmutableSet.of(Pair.of(ccc.W, ccd.b), Pair.of(ccc.T, ccd.b))
      );
   }

   private static void d(bua<cgo> $$0) {
      $$0.a(
         cnw.q,
         ImmutableList.of(Pair.of(0, new bvs(o, avf.ld)), Pair.of(1, new bvu<>(o, 5, 5, 3.5714288F, $$0x -> $$0x.gx() ? avf.kY : avf.kO))),
         ImmutableSet.of(Pair.of(ccc.O, ccd.b), Pair.of(ccc.r, ccd.b), Pair.of(ccc.m, ccd.b), Pair.of(ccc.S, ccd.b))
      );
   }

   private static void e(bua<cgo> $$0) {
      $$0.a(
         cnw.r,
         ImmutableList.of(
            Pair.of(
               0,
               new bwh(
                  $$0x -> $$0x.gx() ? q : p, r, 3.0F, $$0x -> $$0x.p_() ? 1.0 : 2.5, $$0x -> $$0x.gx() ? avf.lb : avf.kR, $$0x -> $$0x.gx() ? avf.lc : avf.kS
               )
            ),
            Pair.of(1, new bwg<>($$0x -> $$0x.gx() ? q.a() : p.a(), 4, 7, 1.25F, r, 20, $$0x -> $$0x.gx() ? avf.la : avf.kQ))
         ),
         ImmutableSet.of(Pair.of(ccc.O, ccd.b), Pair.of(ccc.r, ccd.b), Pair.of(ccc.V, ccd.b))
      );
   }

   public static void a(cgo $$0) {
      $$0.dT().a(ImmutableList.of(cnw.r, cnw.q, cnw.b));
   }

   public static Predicate<cua> a() {
      return $$0 -> $$0.a(awd.ab);
   }
}
