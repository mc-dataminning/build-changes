import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;

public class cdc {
   public static final int a = 20;
   public static final int b = 7;
   private static final bmn i = bmn.a(5, 16);
   private static final float j = 1.0F;
   private static final float k = 1.25F;
   private static final float l = 1.25F;
   private static final float m = 2.0F;
   private static final float n = 1.25F;
   private static final bmn o = bmn.a(600, 1200);
   public static final int c = 5;
   public static final int d = 5;
   public static final float e = 3.5714288F;
   private static final bmn p = bmn.a(600, 6000);
   private static final bmn q = bmn.a(100, 300);
   private static final cae r = cae.a().a($$0 -> !$$0.ai().equals(bpc.X) && $$0.dM().C_().a($$0.cH()));
   private static final float s = 3.0F;
   public static final int f = 4;
   public static final float g = 2.5F;
   public static final float h = 1.0F;

   protected static void a(cdb $$0, axd $$1) {
      $$0.dP().a(byr.S, o.a($$1));
      $$0.dP().a(byr.V, p.a($$1));
   }

   protected static bqp<?> a(bqp<cdb> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      $$0.a(ImmutableSet.of(ckh.a));
      $$0.b(ckh.b);
      $$0.f();
      return $$0;
   }

   private static void b(bqp<cdb> $$0) {
      $$0.a(ckh.a, 0, ImmutableList.of(new bua(0.8F), new brb(2.0F), new bsm(45, 90), new bsq(), new brm(byr.P), new brm(byr.S), new brm(byr.V)));
   }

   private static void c(bqp<cdb> $$0) {
      $$0.a(
         ckh.b,
         ImmutableList.of(
            Pair.of(0, btg.a(bpc.bx, 6.0F, bmn.a(30, 60))),
            Pair.of(0, new bra(bpc.X)),
            Pair.of(1, new brt($$0x -> 1.25F)),
            Pair.of(2, brd.a(i, 1.25F)),
            Pair.of(3, new btd(ImmutableList.of(Pair.of(bsy.a(1.0F), 2), Pair.of(btn.a(1.0F, 3), 2), Pair.of(new brq(30, 60), 1))))
         ),
         ImmutableSet.of(Pair.of(byr.W, bys.b), Pair.of(byr.T, bys.b))
      );
   }

   private static void d(bqp<cdb> $$0) {
      $$0.a(
         ckh.q,
         ImmutableList.of(Pair.of(0, new bsh(o, aty.kS)), Pair.of(1, new bsj<>(o, 5, 5, 3.5714288F, $$0x -> $$0x.gx() ? aty.kN : aty.kD))),
         ImmutableSet.of(Pair.of(byr.O, bys.b), Pair.of(byr.r, bys.b), Pair.of(byr.m, bys.b), Pair.of(byr.S, bys.b))
      );
   }

   private static void e(bqp<cdb> $$0) {
      $$0.a(
         ckh.r,
         ImmutableList.of(
            Pair.of(
               0,
               new bsw(
                  $$0x -> $$0x.gx() ? q : p, r, 3.0F, $$0x -> $$0x.o_() ? 1.0 : 2.5, $$0x -> $$0x.gx() ? aty.kQ : aty.kG, $$0x -> $$0x.gx() ? aty.kR : aty.kH
               )
            ),
            Pair.of(1, new bsv<>($$0x -> $$0x.gx() ? q.a() : p.a(), 4, 7, 1.25F, r, 20, $$0x -> $$0x.gx() ? aty.kP : aty.kF))
         ),
         ImmutableSet.of(Pair.of(byr.O, bys.b), Pair.of(byr.r, bys.b), Pair.of(byr.V, bys.b))
      );
   }

   public static void a(cdb $$0) {
      $$0.dP().a(ImmutableList.of(ckh.r, ckh.q, ckh.b));
   }

   public static ctk a() {
      return ctk.a(cqn.pv);
   }
}
