import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.function.Predicate;

public class cie {
   public static final int a = 20;
   public static final int b = 7;
   private static final brd i = brd.a(5, 16);
   private static final float j = 1.0F;
   private static final float k = 1.25F;
   private static final float l = 1.25F;
   private static final float m = 2.0F;
   private static final float n = 1.25F;
   private static final brd o = brd.a(600, 1200);
   public static final int c = 5;
   public static final int d = 5;
   public static final float e = 3.5714288F;
   private static final brd p = brd.a(600, 6000);
   private static final brd q = brd.a(100, 300);
   private static final cfd r = cfd.a().a($$0 -> !$$0.ao().equals(bty.X) && ($$0.dS().ac().b(def.c) || !$$0.ao().equals(bty.d)) && $$0.dS().B_().a($$0.cO()));
   private static final float s = 3.0F;
   public static final int f = 4;
   public static final float g = 2.5F;
   public static final float h = 1.0F;

   protected static void a(cid $$0, azn $$1) {
      $$0.dY().a(cdq.S, o.a($$1));
      $$0.dY().a(cdq.V, p.a($$1));
   }

   protected static bvo<?> a(bvo<cid> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      $$0.a(ImmutableSet.of(cpp.a));
      $$0.b(cpp.b);
      $$0.f();
      return $$0;
   }

   private static void b(bvo<cid> $$0) {
      $$0.a(cpp.a, 0, ImmutableList.of(new byz(0.8F), new bwa(2.0F), new bxl(45, 90), new bxp(), new bwl(cdq.P), new bwl(cdq.S), new bwl(cdq.V)));
   }

   private static void c(bvo<cid> $$0) {
      $$0.a(
         cpp.b,
         ImmutableList.of(
            Pair.of(0, byf.a(bty.by, 6.0F, brd.a(30, 60))),
            Pair.of(0, new bvz(bty.X)),
            Pair.of(1, new bws($$0x -> 1.25F)),
            Pair.of(2, bwc.a(i, 1.25F)),
            Pair.of(3, new byc(ImmutableList.of(Pair.of(bxx.a(1.0F), 2), Pair.of(bym.a(1.0F, 3), 2), Pair.of(new bwp(30, 60), 1))))
         ),
         ImmutableSet.of(Pair.of(cdq.W, cdr.b), Pair.of(cdq.T, cdr.b))
      );
   }

   private static void d(bvo<cid> $$0) {
      $$0.a(
         cpp.q,
         ImmutableList.of(Pair.of(0, new bxg(o, awg.le)), Pair.of(1, new bxi<>(o, 5, 5, 3.5714288F, $$0x -> $$0x.gA() ? awg.kZ : awg.kP))),
         ImmutableSet.of(Pair.of(cdq.O, cdr.b), Pair.of(cdq.r, cdr.b), Pair.of(cdq.m, cdr.b), Pair.of(cdq.S, cdr.b))
      );
   }

   private static void e(bvo<cid> $$0) {
      $$0.a(
         cpp.r,
         ImmutableList.of(
            Pair.of(
               0,
               new bxv(
                  $$0x -> $$0x.gA() ? q : p, r, 3.0F, $$0x -> $$0x.p_() ? 1.0 : 2.5, $$0x -> $$0x.gA() ? awg.lc : awg.kS, $$0x -> $$0x.gA() ? awg.ld : awg.kT
               )
            ),
            Pair.of(1, new bxu<>($$0x -> $$0x.gA() ? q.a() : p.a(), 4, 7, 1.25F, r, 20, $$0x -> $$0x.gA() ? awg.lb : awg.kR))
         ),
         ImmutableSet.of(Pair.of(cdq.O, cdr.b), Pair.of(cdq.r, cdr.b), Pair.of(cdq.V, cdr.b))
      );
   }

   public static void a(cid $$0) {
      $$0.dY().a(ImmutableList.of(cpp.r, cpp.q, cpp.b));
   }

   public static Predicate<cvs> a() {
      return $$0 -> $$0.a(axe.ab);
   }
}
