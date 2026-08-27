import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.function.Predicate;

public class cfq {
   public static final int a = 20;
   public static final int b = 7;
   private static final box i = box.a(5, 16);
   private static final float j = 1.0F;
   private static final float k = 1.25F;
   private static final float l = 1.25F;
   private static final float m = 2.0F;
   private static final float n = 1.25F;
   private static final box o = box.a(600, 1200);
   public static final int c = 5;
   public static final int d = 5;
   public static final float e = 3.5714288F;
   private static final box p = box.a(600, 6000);
   private static final box q = box.a(100, 300);
   private static final ccq r = ccq.a().a($$0 -> !$$0.ai().equals(brn.X) && $$0.dN().C_().a($$0.cI()));
   private static final float s = 3.0F;
   public static final int f = 4;
   public static final float g = 2.5F;
   public static final float h = 1.0F;

   protected static void a(cfp $$0, ayg $$1) {
      $$0.dQ().a(cbd.S, o.a($$1));
      $$0.dQ().a(cbd.V, p.a($$1));
   }

   protected static btb<?> a(btb<cfp> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      $$0.a(ImmutableSet.of(cmw.a));
      $$0.b(cmw.b);
      $$0.f();
      return $$0;
   }

   private static void b(btb<cfp> $$0) {
      $$0.a(cmw.a, 0, ImmutableList.of(new bwm(0.8F), new btn(2.0F), new buy(45, 90), new bvc(), new bty(cbd.P), new bty(cbd.S), new bty(cbd.V)));
   }

   private static void c(btb<cfp> $$0) {
      $$0.a(
         cmw.b,
         ImmutableList.of(
            Pair.of(0, bvs.a(brn.bx, 6.0F, box.a(30, 60))),
            Pair.of(0, new btm(brn.X)),
            Pair.of(1, new buf($$0x -> 1.25F)),
            Pair.of(2, btp.a(i, 1.25F)),
            Pair.of(3, new bvp(ImmutableList.of(Pair.of(bvk.a(1.0F), 2), Pair.of(bvz.a(1.0F, 3), 2), Pair.of(new buc(30, 60), 1))))
         ),
         ImmutableSet.of(Pair.of(cbd.W, cbe.b), Pair.of(cbd.T, cbe.b))
      );
   }

   private static void d(btb<cfp> $$0) {
      $$0.a(
         cmw.q,
         ImmutableList.of(Pair.of(0, new but(o, avc.kY)), Pair.of(1, new buv<>(o, 5, 5, 3.5714288F, $$0x -> $$0x.gz() ? avc.kT : avc.kJ))),
         ImmutableSet.of(Pair.of(cbd.O, cbe.b), Pair.of(cbd.r, cbe.b), Pair.of(cbd.m, cbe.b), Pair.of(cbd.S, cbe.b))
      );
   }

   private static void e(btb<cfp> $$0) {
      $$0.a(
         cmw.r,
         ImmutableList.of(
            Pair.of(
               0,
               new bvi(
                  $$0x -> $$0x.gz() ? q : p, r, 3.0F, $$0x -> $$0x.p_() ? 1.0 : 2.5, $$0x -> $$0x.gz() ? avc.kW : avc.kM, $$0x -> $$0x.gz() ? avc.kX : avc.kN
               )
            ),
            Pair.of(1, new bvh<>($$0x -> $$0x.gz() ? q.a() : p.a(), 4, 7, 1.25F, r, 20, $$0x -> $$0x.gz() ? avc.kV : avc.kL))
         ),
         ImmutableSet.of(Pair.of(cbd.O, cbe.b), Pair.of(cbd.r, cbe.b), Pair.of(cbd.V, cbe.b))
      );
   }

   public static void a(cfp $$0) {
      $$0.dQ().a(ImmutableList.of(cmw.r, cmw.q, cmw.b));
   }

   public static Predicate<csz> a() {
      return $$0 -> $$0.a(avz.ab);
   }
}
