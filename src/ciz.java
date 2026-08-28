import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.function.Predicate;

public class ciz {
   public static final int a = 20;
   public static final int b = 7;
   private static final brv i = brv.a(5, 16);
   private static final float j = 1.0F;
   private static final float k = 1.25F;
   private static final float l = 1.25F;
   private static final float m = 2.0F;
   private static final float n = 1.25F;
   private static final brv o = brv.a(600, 1200);
   public static final int c = 5;
   public static final int d = 5;
   public static final float e = 3.5714288F;
   private static final brv p = brv.a(600, 6000);
   private static final brv q = brv.a(100, 300);
   private static final cfy r = cfy.a().a(($$0, $$1) -> !$$0.aq().equals(bus.ah) && (!$$1.O().b(dge.c) || !$$0.aq().equals(bus.f)) && $$1.F_().a($$0.cR()));
   private static final float s = 3.0F;
   public static final int f = 4;
   public static final float g = 2.5F;
   public static final float h = 1.0F;

   protected static void a(ciy $$0, azh $$1) {
      $$0.eb().a(cel.S, o.a($$1));
      $$0.eb().a(cel.V, p.a($$1));
   }

   protected static bwj<?> a(bwj<ciy> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      $$0.a(ImmutableSet.of(cqo.a));
      $$0.b(cqo.b);
      $$0.f();
      return $$0;
   }

   private static void b(bwj<ciy> $$0) {
      $$0.a(cqo.a, 0, ImmutableList.of(new bzu(0.8F), new bwv(2.0F), new byg(45, 90), new byk(), new bxg(cel.P), new bxg(cel.S), new bxg(cel.V)));
   }

   private static void c(bwj<ciy> $$0) {
      $$0.a(
         cqo.b,
         ImmutableList.of(
            Pair.of(0, bza.a(bus.bR, 6.0F, brv.a(30, 60))),
            Pair.of(0, new bwu(bus.ah)),
            Pair.of(1, new bxn($$0x -> 1.25F)),
            Pair.of(2, bwx.a(i, 1.25F)),
            Pair.of(3, new byx(ImmutableList.of(Pair.of(bys.a(1.0F), 2), Pair.of(bzh.a(1.0F, 3), 2), Pair.of(new bxk(30, 60), 1))))
         ),
         ImmutableSet.of(Pair.of(cel.W, cem.b), Pair.of(cel.T, cem.b))
      );
   }

   private static void d(bwj<ciy> $$0) {
      $$0.a(
         cqo.q,
         ImmutableList.of(Pair.of(0, new byb(o, awa.lB)), Pair.of(1, new byd<>(o, 5, 5, 3.5714288F, $$0x -> $$0x.gE() ? awa.lx : awa.lo))),
         ImmutableSet.of(Pair.of(cel.O, cem.b), Pair.of(cel.r, cem.b), Pair.of(cel.m, cem.b), Pair.of(cel.S, cem.b))
      );
   }

   private static void e(bwj<ciy> $$0) {
      $$0.a(
         cqo.r,
         ImmutableList.of(
            Pair.of(0, new byq($$0x -> $$0x.gE() ? q : p, r, 3.0F, $$0x -> $$0x.e_() ? 1.0 : 2.5, $$0x -> $$0x.gE() ? awa.lA : awa.lr, $$0x -> awa.ls)),
            Pair.of(1, new byp<>($$0x -> $$0x.gE() ? q.a() : p.a(), 4, 7, 1.25F, r, 20, $$0x -> $$0x.gE() ? awa.lz : awa.lq))
         ),
         ImmutableSet.of(Pair.of(cel.O, cem.b), Pair.of(cel.r, cem.b), Pair.of(cel.V, cem.b))
      );
   }

   public static void a(ciy $$0) {
      $$0.eb().a(ImmutableList.of(cqo.r, cqo.q, cqo.b));
   }

   public static Predicate<cwp> a() {
      return $$0 -> $$0.a(awy.ae);
   }
}
