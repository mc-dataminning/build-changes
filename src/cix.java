import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.function.Predicate;

public class cix {
   public static final int a = 20;
   public static final int b = 7;
   private static final brt i = brt.a(5, 16);
   private static final float j = 1.0F;
   private static final float k = 1.25F;
   private static final float l = 1.25F;
   private static final float m = 2.0F;
   private static final float n = 1.25F;
   private static final brt o = brt.a(600, 1200);
   public static final int c = 5;
   public static final int d = 5;
   public static final float e = 3.5714288F;
   private static final brt p = brt.a(600, 6000);
   private static final brt q = brt.a(100, 300);
   private static final cfw r = cfw.a().a(($$0, $$1) -> !$$0.aq().equals(buq.ah) && (!$$1.O().b(dgc.c) || !$$0.aq().equals(buq.f)) && $$1.F_().a($$0.cR()));
   private static final float s = 3.0F;
   public static final int f = 4;
   public static final float g = 2.5F;
   public static final float h = 1.0F;

   protected static void a(ciw $$0, azg $$1) {
      $$0.ec().a(cej.S, o.a($$1));
      $$0.ec().a(cej.V, p.a($$1));
   }

   protected static bwh<?> a(bwh<ciw> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      $$0.a(ImmutableSet.of(cqm.a));
      $$0.b(cqm.b);
      $$0.f();
      return $$0;
   }

   private static void b(bwh<ciw> $$0) {
      $$0.a(cqm.a, 0, ImmutableList.of(new bzs(0.8F), new bwt(2.0F), new bye(45, 90), new byi(), new bxe(cej.P), new bxe(cej.S), new bxe(cej.V)));
   }

   private static void c(bwh<ciw> $$0) {
      $$0.a(
         cqm.b,
         ImmutableList.of(
            Pair.of(0, byy.a(buq.bR, 6.0F, brt.a(30, 60))),
            Pair.of(0, new bws(buq.ah)),
            Pair.of(1, new bxl($$0x -> 1.25F)),
            Pair.of(2, bwv.a(i, 1.25F)),
            Pair.of(3, new byv(ImmutableList.of(Pair.of(byq.a(1.0F), 2), Pair.of(bzf.a(1.0F, 3), 2), Pair.of(new bxi(30, 60), 1))))
         ),
         ImmutableSet.of(Pair.of(cej.W, cek.b), Pair.of(cej.T, cek.b))
      );
   }

   private static void d(bwh<ciw> $$0) {
      $$0.a(
         cqm.q,
         ImmutableList.of(Pair.of(0, new bxz(o, avz.lB)), Pair.of(1, new byb<>(o, 5, 5, 3.5714288F, $$0x -> $$0x.gB() ? avz.lx : avz.lo))),
         ImmutableSet.of(Pair.of(cej.O, cek.b), Pair.of(cej.r, cek.b), Pair.of(cej.m, cek.b), Pair.of(cej.S, cek.b))
      );
   }

   private static void e(bwh<ciw> $$0) {
      $$0.a(
         cqm.r,
         ImmutableList.of(
            Pair.of(0, new byo($$0x -> $$0x.gB() ? q : p, r, 3.0F, $$0x -> $$0x.e_() ? 1.0 : 2.5, $$0x -> $$0x.gB() ? avz.lA : avz.lr, $$0x -> avz.ls)),
            Pair.of(1, new byn<>($$0x -> $$0x.gB() ? q.a() : p.a(), 4, 7, 1.25F, r, 20, $$0x -> $$0x.gB() ? avz.lz : avz.lq))
         ),
         ImmutableSet.of(Pair.of(cej.O, cek.b), Pair.of(cej.r, cek.b), Pair.of(cej.V, cek.b))
      );
   }

   public static void a(ciw $$0) {
      $$0.ec().a(ImmutableList.of(cqm.r, cqm.q, cqm.b));
   }

   public static Predicate<cwn> a() {
      return $$0 -> $$0.a(awx.ae);
   }
}
