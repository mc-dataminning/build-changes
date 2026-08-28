import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.function.Predicate;

public class cle {
   public static final int a = 20;
   public static final int b = 7;
   private static final bto i = bto.a(5, 16);
   private static final float j = 1.0F;
   private static final float k = 1.25F;
   private static final float l = 1.25F;
   private static final float m = 2.0F;
   private static final float n = 1.25F;
   private static final bto o = bto.a(600, 1200);
   public static final int c = 5;
   public static final int d = 5;
   public static final float e = 3.5714288F;
   private static final bto p = bto.a(600, 6000);
   private static final bto q = bto.a(100, 300);
   private static final cht r = cht.a().a(($$0, $$1) -> !$$0.aq().equals(bwo.ah) && (!$$1.O().c(diw.d) || !$$0.aq().equals(bwo.f)) && $$1.A_().a($$0.cR()));
   private static final float s = 3.0F;
   public static final int f = 4;
   public static final float g = 2.5F;
   public static final float h = 1.0F;

   protected static void a(cld $$0, azv $$1) {
      $$0.ec().a(cgg.T, o.a($$1));
      $$0.ec().a(cgg.W, p.a($$1));
   }

   protected static bye<?> a(bye<cld> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      $$0.a(ImmutableSet.of(csw.a));
      $$0.b(csw.b);
      $$0.f();
      return $$0;
   }

   private static void b(bye<cld> $$0) {
      $$0.a(csw.a, 0, ImmutableList.of(new cbp(0.8F), new byq(2.0F), new cab(45, 90), new caf(), new bzb(cgg.Q), new bzb(cgg.T), new bzb(cgg.W)));
   }

   private static void c(bye<cld> $$0) {
      $$0.a(
         csw.b,
         ImmutableList.of(
            Pair.of(0, cav.a(bwo.bS, 6.0F, bto.a(30, 60))),
            Pair.of(0, new byp(bwo.ah)),
            Pair.of(1, new bzi($$0x -> 1.25F)),
            Pair.of(2, bys.a(i, 1.25F)),
            Pair.of(3, new cas(ImmutableList.of(Pair.of(can.a(1.0F), 2), Pair.of(cbc.a(1.0F, 3), 2), Pair.of(new bzf(30, 60), 1))))
         ),
         ImmutableSet.of(Pair.of(cgg.X, cgh.b), Pair.of(cgg.U, cgh.b))
      );
   }

   private static void d(bye<cld> $$0) {
      $$0.a(
         csw.q,
         ImmutableList.of(Pair.of(0, new bzw(o, awn.lF)), Pair.of(1, new bzy<>(o, 5, 5, 3.5714288F, $$0x -> $$0x.gD() ? awn.lB : awn.ls))),
         ImmutableSet.of(Pair.of(cgg.P, cgh.b), Pair.of(cgg.s, cgh.b), Pair.of(cgg.n, cgh.b), Pair.of(cgg.T, cgh.b))
      );
   }

   private static void e(bye<cld> $$0) {
      $$0.a(
         csw.r,
         ImmutableList.of(
            Pair.of(0, new cal($$0x -> $$0x.gD() ? q : p, r, 3.0F, $$0x -> $$0x.n_() ? 1.0 : 2.5, $$0x -> $$0x.gD() ? awn.lE : awn.lv, $$0x -> awn.lw)),
            Pair.of(1, new cak<>($$0x -> $$0x.gD() ? q.a() : p.a(), 4, 7, 1.25F, r, 20, $$0x -> $$0x.gD() ? awn.lD : awn.lu))
         ),
         ImmutableSet.of(Pair.of(cgg.P, cgh.b), Pair.of(cgg.s, cgh.b), Pair.of(cgg.W, cgh.b))
      );
   }

   public static void a(cld $$0) {
      $$0.ec().a(ImmutableList.of(csw.r, csw.q, csw.b));
   }

   public static Predicate<czd> a() {
      return $$0 -> $$0.a(axk.af);
   }
}
