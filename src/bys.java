import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;

public class bys {
   public static final int a = 20;
   public static final int b = 7;
   private static final bim i = bim.a(5, 16);
   private static final float j = 1.0F;
   private static final float k = 1.0F;
   private static final float l = 1.25F;
   private static final float m = 1.25F;
   private static final float n = 2.0F;
   private static final float o = 1.25F;
   private static final bim p = bim.a(600, 1200);
   public static final int c = 5;
   public static final int d = 5;
   public static final float e = 1.5F;
   private static final bim q = bim.a(600, 6000);
   private static final bim r = bim.a(100, 300);
   private static final bvx s = bvx.a().a($$0 -> !$$0.ai().equals(bkz.U) && $$0.dN().D_().a($$0.cH()));
   private static final float t = 3.0F;
   public static final int f = 4;
   public static final float g = 2.5F;
   public static final float h = 1.0F;

   protected static void a(byr $$0, atw $$1) {
      $$0.dP().a(bum.R, p.a($$1));
      $$0.dP().a(bum.U, q.a($$1));
   }

   protected static bml<?> a(bml<byr> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      $$0.a(ImmutableSet.of(cfk.a));
      $$0.b(cfk.b);
      $$0.f();
      return $$0;
   }

   private static void b(bml<byr> $$0) {
      $$0.a(cfk.a, 0, ImmutableList.of(new bpv(0.8F), new bmx(2.0F), new boh(45, 90), new bol(), new bni(bum.O), new bni(bum.R), new bni(bum.U)));
   }

   private static void c(bml<byr> $$0) {
      $$0.a(
         cfk.b,
         ImmutableList.of(
            Pair.of(0, bpb.a(bkz.bt, 6.0F, bim.a(30, 60))),
            Pair.of(0, new bmw(bkz.U, 1.0F)),
            Pair.of(1, new bnp($$0x -> 1.25F)),
            Pair.of(2, bmz.a(i, 1.25F)),
            Pair.of(3, new boy(ImmutableList.of(Pair.of(bot.a(1.0F), 2), Pair.of(bpi.a(1.0F, 3), 2), Pair.of(new bnm(30, 60), 1))))
         ),
         ImmutableSet.of(Pair.of(bum.V, bun.b), Pair.of(bum.S, bun.b))
      );
   }

   private static void d(bml<byr> $$0) {
      $$0.a(
         cfk.q,
         ImmutableList.of(Pair.of(0, new bod(p, aqv.kq)), Pair.of(1, new bof<>(p, 5, 5, 1.5F, $$0x -> $$0x.gp() ? aqv.kl : aqv.kb))),
         ImmutableSet.of(Pair.of(bum.N, bun.b), Pair.of(bum.r, bun.b), Pair.of(bum.m, bun.b), Pair.of(bum.R, bun.b))
      );
   }

   private static void e(bml<byr> $$0) {
      $$0.a(
         cfk.r,
         ImmutableList.of(
            Pair.of(
               0,
               new bor(
                  $$0x -> $$0x.gp() ? r : q, s, 3.0F, $$0x -> $$0x.o_() ? 1.0 : 2.5, $$0x -> $$0x.gp() ? aqv.ko : aqv.ke, $$0x -> $$0x.gp() ? aqv.kp : aqv.kf
               )
            ),
            Pair.of(1, new boq<>($$0x -> $$0x.gp() ? r.a() : q.a(), 4, 7, 1.25F, s, 20, $$0x -> $$0x.gp() ? aqv.kn : aqv.kd))
         ),
         ImmutableSet.of(Pair.of(bum.N, bun.b), Pair.of(bum.r, bun.b), Pair.of(bum.U, bun.b))
      );
   }

   public static void a(byr $$0) {
      $$0.dP().a(ImmutableList.of(cfk.r, cfk.q, cfk.b));
   }

   public static coq a() {
      return coq.a(clr.pt);
   }
}
