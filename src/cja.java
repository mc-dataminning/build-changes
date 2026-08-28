import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.function.Predicate;

public class cja {
   public static final int a = 20;
   public static final int b = 7;
   private static final brw i = brw.a(5, 16);
   private static final float j = 1.0F;
   private static final float k = 1.25F;
   private static final float l = 1.25F;
   private static final float m = 2.0F;
   private static final float n = 1.25F;
   private static final brw o = brw.a(600, 1200);
   public static final int c = 5;
   public static final int d = 5;
   public static final float e = 3.5714288F;
   private static final brw p = brw.a(600, 6000);
   private static final brw q = brw.a(100, 300);
   private static final cfz r = cfz.a().a(($$0, $$1) -> !$$0.aq().equals(but.ah) && (!$$1.O().b(dgf.c) || !$$0.aq().equals(but.f)) && $$1.F_().a($$0.cR()));
   private static final float s = 3.0F;
   public static final int f = 4;
   public static final float g = 2.5F;
   public static final float h = 1.0F;

   protected static void a(ciz $$0, azh $$1) {
      $$0.eb().a(cem.S, o.a($$1));
      $$0.eb().a(cem.V, p.a($$1));
   }

   protected static bwk<?> a(bwk<ciz> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      $$0.a(ImmutableSet.of(cqp.a));
      $$0.b(cqp.b);
      $$0.f();
      return $$0;
   }

   private static void b(bwk<ciz> $$0) {
      $$0.a(cqp.a, 0, ImmutableList.of(new bzv(0.8F), new bww(2.0F), new byh(45, 90), new byl(), new bxh(cem.P), new bxh(cem.S), new bxh(cem.V)));
   }

   private static void c(bwk<ciz> $$0) {
      $$0.a(
         cqp.b,
         ImmutableList.of(
            Pair.of(0, bzb.a(but.bR, 6.0F, brw.a(30, 60))),
            Pair.of(0, new bwv(but.ah)),
            Pair.of(1, new bxo($$0x -> 1.25F)),
            Pair.of(2, bwy.a(i, 1.25F)),
            Pair.of(3, new byy(ImmutableList.of(Pair.of(byt.a(1.0F), 2), Pair.of(bzi.a(1.0F, 3), 2), Pair.of(new bxl(30, 60), 1))))
         ),
         ImmutableSet.of(Pair.of(cem.W, cen.b), Pair.of(cem.T, cen.b))
      );
   }

   private static void d(bwk<ciz> $$0) {
      $$0.a(
         cqp.q,
         ImmutableList.of(Pair.of(0, new byc(o, awa.lB)), Pair.of(1, new bye<>(o, 5, 5, 3.5714288F, $$0x -> $$0x.gE() ? awa.lx : awa.lo))),
         ImmutableSet.of(Pair.of(cem.O, cen.b), Pair.of(cem.r, cen.b), Pair.of(cem.m, cen.b), Pair.of(cem.S, cen.b))
      );
   }

   private static void e(bwk<ciz> $$0) {
      $$0.a(
         cqp.r,
         ImmutableList.of(
            Pair.of(0, new byr($$0x -> $$0x.gE() ? q : p, r, 3.0F, $$0x -> $$0x.e_() ? 1.0 : 2.5, $$0x -> $$0x.gE() ? awa.lA : awa.lr, $$0x -> awa.ls)),
            Pair.of(1, new byq<>($$0x -> $$0x.gE() ? q.a() : p.a(), 4, 7, 1.25F, r, 20, $$0x -> $$0x.gE() ? awa.lz : awa.lq))
         ),
         ImmutableSet.of(Pair.of(cem.O, cen.b), Pair.of(cem.r, cen.b), Pair.of(cem.V, cen.b))
      );
   }

   public static void a(ciz $$0) {
      $$0.eb().a(ImmutableList.of(cqp.r, cqp.q, cqp.b));
   }

   public static Predicate<cwq> a() {
      return $$0 -> $$0.a(awy.ae);
   }
}
