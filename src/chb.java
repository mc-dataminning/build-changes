import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.function.Predicate;

public class chb {
   public static final int a = 20;
   public static final int b = 7;
   private static final bqa i = bqa.a(5, 16);
   private static final float j = 1.0F;
   private static final float k = 1.25F;
   private static final float l = 1.25F;
   private static final float m = 2.0F;
   private static final float n = 1.25F;
   private static final bqa o = bqa.a(600, 1200);
   public static final int c = 5;
   public static final int d = 5;
   public static final float e = 3.5714288F;
   private static final bqa p = bqa.a(600, 6000);
   private static final bqa q = bqa.a(100, 300);
   private static final ceb r = ceb.a().a($$0 -> !$$0.ak().equals(bsv.X) && $$0.dP().C_().a($$0.cK()));
   private static final float s = 3.0F;
   public static final int f = 4;
   public static final float g = 2.5F;
   public static final float h = 1.0F;

   protected static void a(cha $$0, azc $$1) {
      $$0.dS().a(cco.S, o.a($$1));
      $$0.dS().a(cco.V, p.a($$1));
   }

   protected static bum<?> a(bum<cha> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      $$0.a(ImmutableSet.of(coh.a));
      $$0.b(coh.b);
      $$0.f();
      return $$0;
   }

   private static void b(bum<cha> $$0) {
      $$0.a(coh.a, 0, ImmutableList.of(new bxx(0.8F), new buy(2.0F), new bwj(45, 90), new bwn(), new bvj(cco.P), new bvj(cco.S), new bvj(cco.V)));
   }

   private static void c(bum<cha> $$0) {
      $$0.a(
         coh.b,
         ImmutableList.of(
            Pair.of(0, bxd.a(bsv.by, 6.0F, bqa.a(30, 60))),
            Pair.of(0, new bux(bsv.X)),
            Pair.of(1, new bvq($$0x -> 1.25F)),
            Pair.of(2, bva.a(i, 1.25F)),
            Pair.of(3, new bxa(ImmutableList.of(Pair.of(bwv.a(1.0F), 2), Pair.of(bxk.a(1.0F, 3), 2), Pair.of(new bvn(30, 60), 1))))
         ),
         ImmutableSet.of(Pair.of(cco.W, ccp.b), Pair.of(cco.T, ccp.b))
      );
   }

   private static void d(bum<cha> $$0) {
      $$0.a(
         coh.q,
         ImmutableList.of(Pair.of(0, new bwe(o, avw.ld)), Pair.of(1, new bwg<>(o, 5, 5, 3.5714288F, $$0x -> $$0x.gA() ? avw.kY : avw.kO))),
         ImmutableSet.of(Pair.of(cco.O, ccp.b), Pair.of(cco.r, ccp.b), Pair.of(cco.m, ccp.b), Pair.of(cco.S, ccp.b))
      );
   }

   private static void e(bum<cha> $$0) {
      $$0.a(
         coh.r,
         ImmutableList.of(
            Pair.of(
               0,
               new bwt(
                  $$0x -> $$0x.gA() ? q : p, r, 3.0F, $$0x -> $$0x.p_() ? 1.0 : 2.5, $$0x -> $$0x.gA() ? avw.lb : avw.kR, $$0x -> $$0x.gA() ? avw.lc : avw.kS
               )
            ),
            Pair.of(1, new bws<>($$0x -> $$0x.gA() ? q.a() : p.a(), 4, 7, 1.25F, r, 20, $$0x -> $$0x.gA() ? avw.la : avw.kQ))
         ),
         ImmutableSet.of(Pair.of(cco.O, ccp.b), Pair.of(cco.r, ccp.b), Pair.of(cco.V, ccp.b))
      );
   }

   public static void a(cha $$0) {
      $$0.dS().a(ImmutableList.of(coh.r, coh.q, coh.b));
   }

   public static Predicate<cuk> a() {
      return $$0 -> $$0.a(awu.ab);
   }
}
