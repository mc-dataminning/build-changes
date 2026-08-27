import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;

public class bym {
   private static final float a = 2.0F;
   private static final float b = 1.0F;
   private static final float c = 1.0F;
   private static final float d = 1.0F;
   private static final float e = 0.75F;
   private static final bim f = bim.a(100, 140);
   private static final int g = 2;
   private static final int h = 4;
   private static final float i = 1.5F;
   private static final float j = 1.25F;

   protected static void a(byl $$0, atw $$1) {
      $$0.dP().a(bum.R, f.a($$1));
   }

   protected static bml<?> a(bml<byl> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      g($$0);
      f($$0);
      $$0.a(ImmutableSet.of(cfk.a));
      $$0.b(cfk.b);
      $$0.f();
      return $$0;
   }

   private static void b(bml<byl> $$0) {
      $$0.a(cfk.a, 0, ImmutableList.of(new bmx(2.0F), new boh(45, 90), new bol(), new bni(bum.O), new bni(bum.R)));
   }

   private static void c(bml<byl> $$0) {
      $$0.a(
         cfk.b,
         ImmutableList.of(
            Pair.of(0, bpb.a(bkz.bt, 6.0F, bim.a(30, 60))),
            Pair.of(0, new bmw(bkz.O, 1.0F)),
            Pair.of(1, new bnp($$0x -> 1.25F)),
            Pair.of(2, bpn.a(bym::b, $$0x -> $$0x.dP().c(bum.B))),
            Pair.of(3, bpy.a(6, 1.0F)),
            Pair.of(
               4,
               new boy(
                  ImmutableMap.of(bum.m, bun.b),
                  ImmutableList.of(Pair.of(bot.a(1.0F), 1), Pair.of(bpi.a(1.0F, 3), 1), Pair.of(new bnj(), 3), Pair.of(bqo.a(bkv::aC), 2))
               )
            )
         ),
         ImmutableSet.of(Pair.of(bum.S, bun.b), Pair.of(bum.W, bun.b))
      );
   }

   private static void d(bml<byl> $$0) {
      $$0.a(
         cfk.t,
         ImmutableList.of(
            Pair.of(0, bpb.a(bkz.bt, 6.0F, bim.a(30, 60))),
            Pair.of(1, new bnp($$0x -> 1.25F)),
            Pair.of(2, bpn.a(bym::b, $$0x -> $$0x.dP().c(bum.B))),
            Pair.of(3, bpy.a(8, 1.5F)),
            Pair.of(
               5,
               new bnq(
                  ImmutableMap.of(bum.m, bun.b),
                  ImmutableSet.of(),
                  bnq.a.a,
                  bnq.b.b,
                  ImmutableList.of(Pair.of(bot.c(0.75F), 1), Pair.of(bot.a(1.0F, true), 1), Pair.of(bpi.a(1.0F, 3), 1), Pair.of(bqo.a(bkv::bc), 5))
               )
            )
         ),
         ImmutableSet.of(Pair.of(bum.S, bun.b), Pair.of(bum.W, bun.a))
      );
   }

   private static void e(bml<byl> $$0) {
      $$0.a(
         cfk.u,
         ImmutableList.of(
            Pair.of(0, bpb.a(bkz.bt, 6.0F, bim.a(30, 60))),
            Pair.of(1, bpn.a(bym::b, $$0x -> $$0x.dP().c(bum.B))),
            Pair.of(2, bpz.a(8, 1.0F)),
            Pair.of(3, bqb.a(cvh.tn)),
            Pair.of(4, new boy(ImmutableList.of(Pair.of(bot.a(1.0F), 2), Pair.of(bpi.a(1.0F, 3), 1), Pair.of(new bnj(), 2), Pair.of(bqo.a(bkv::aC), 1))))
         ),
         ImmutableSet.of(Pair.of(bum.S, bun.b), Pair.of(bum.X, bun.a))
      );
   }

   private static void f(bml<byl> $$0) {
      $$0.a(
         cfk.q,
         ImmutableList.of(Pair.of(0, new bod(f, aqv.je)), Pair.of(1, new boe<>(f, 2, 4, 1.5F, $$0x -> aqv.jd, ark.bK, 0.5F, bym::a))),
         ImmutableSet.of(Pair.of(bum.N, bun.b), Pair.of(bum.r, bun.b), Pair.of(bum.R, bun.b), Pair.of(bum.W, bun.b))
      );
   }

   private static void g(bml<byl> $$0) {
      $$0.a(cfk.s, 0, ImmutableList.of(bpq.a(), new byn(aqv.jf, aqv.ja)), bum.o);
   }

   private static <E extends bln> boolean a(E $$0, hx $$1) {
      csf $$2 = $$0.dN();
      hx $$3 = $$1.d();
      if ($$2.b_($$1).c() && $$2.b_($$3).c() && $$2.b_($$1.c()).c()) {
         dhn $$4 = $$2.a_($$1);
         dhn $$5 = $$2.a_($$3);
         if (!$$4.a(ark.bK) && !$$5.a(ark.bK)) {
            edi $$6 = edr.a($$2, $$1.j());
            edi $$7 = edr.a($$2, $$3.j());
            return $$6 != edi.e && (!$$4.i() || $$7 != edi.e) ? bof.a($$0, $$1) : true;
         } else {
            return true;
         }
      } else {
         return false;
      }
   }

   private static boolean b(byl $$0) {
      return !bne.a($$0);
   }

   public static void a(byl $$0) {
      $$0.dP().a(ImmutableList.of(cfk.s, cfk.u, cfk.q, cfk.t, cfk.b));
   }

   public static coq a() {
      return byl.bT;
   }
}
