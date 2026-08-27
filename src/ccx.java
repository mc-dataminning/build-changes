import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;

public class ccx {
   private static final float a = 2.0F;
   private static final float b = 1.0F;
   private static final float c = 1.0F;
   private static final float d = 0.75F;
   private static final bmo e = bmo.a(100, 140);
   private static final int f = 2;
   private static final int g = 4;
   private static final float h = 3.5714288F;
   private static final float i = 1.25F;

   protected static void a(ccw $$0, axd $$1) {
      $$0.dP().a(bys.S, e.a($$1));
   }

   protected static bqq<?> a(bqq<ccw> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      g($$0);
      f($$0);
      $$0.a(ImmutableSet.of(ckj.a));
      $$0.b(ckj.b);
      $$0.f();
      return $$0;
   }

   private static void b(bqq<ccw> $$0) {
      $$0.a(ckj.a, 0, ImmutableList.of(new brc(2.0F), new bsn(45, 90), new bsr(), new brn(bys.P), new brn(bys.S)));
   }

   private static void c(bqq<ccw> $$0) {
      $$0.a(
         ckj.b,
         ImmutableList.of(
            Pair.of(0, bth.a(bpd.by, 6.0F, bmo.a(30, 60))),
            Pair.of(0, new brb(bpd.S)),
            Pair.of(1, new bru($$0x -> 1.25F)),
            Pair.of(2, btt.a(ccx::b, $$0x -> $$0x.dP().c(bys.B))),
            Pair.of(3, bue.a(6, 1.0F)),
            Pair.of(
               4,
               new bte(
                  ImmutableMap.of(bys.m, byt.b),
                  ImmutableList.of(Pair.of(bsz.a(1.0F), 1), Pair.of(bto.a(1.0F, 3), 1), Pair.of(new bro(), 3), Pair.of(buu.a(box::aC), 2))
               )
            )
         ),
         ImmutableSet.of(Pair.of(bys.T, byt.b), Pair.of(bys.X, byt.b))
      );
   }

   private static void d(bqq<ccw> $$0) {
      $$0.a(
         ckj.t,
         ImmutableList.of(
            Pair.of(0, bth.a(bpd.by, 6.0F, bmo.a(30, 60))),
            Pair.of(1, new bru($$0x -> 1.25F)),
            Pair.of(2, btt.a(ccx::b, $$0x -> $$0x.dP().c(bys.B))),
            Pair.of(3, bue.a(8, 1.5F)),
            Pair.of(
               5,
               new brv(
                  ImmutableMap.of(bys.m, byt.b),
                  ImmutableSet.of(),
                  brv.a.a,
                  brv.b.b,
                  ImmutableList.of(Pair.of(bsz.c(0.75F), 1), Pair.of(bsz.a(1.0F, true), 1), Pair.of(bto.a(1.0F, 3), 1), Pair.of(buu.a(box::bf), 5))
               )
            )
         ),
         ImmutableSet.of(Pair.of(bys.T, byt.b), Pair.of(bys.X, byt.a))
      );
   }

   private static void e(bqq<ccw> $$0) {
      $$0.a(
         ckj.u,
         ImmutableList.of(
            Pair.of(0, bth.a(bpd.by, 6.0F, bmo.a(30, 60))),
            Pair.of(1, btt.a(ccx::b, $$0x -> $$0x.dP().c(bys.B))),
            Pair.of(2, buf.a(8, 1.0F)),
            Pair.of(3, buh.a(dae.tn)),
            Pair.of(4, new bte(ImmutableList.of(Pair.of(bsz.a(1.0F), 2), Pair.of(bto.a(1.0F, 3), 1), Pair.of(new bro(), 2), Pair.of(buu.a(box::aC), 1))))
         ),
         ImmutableSet.of(Pair.of(bys.T, byt.b), Pair.of(bys.Y, byt.a))
      );
   }

   private static void f(bqq<ccw> $$0) {
      $$0.a(
         ckj.q,
         ImmutableList.of(Pair.of(0, new bsi(e, aty.jK)), Pair.of(1, new bsj<>(e, 2, 4, 3.5714288F, $$0x -> aty.jJ, aun.bL, 0.5F, ccx::a))),
         ImmutableSet.of(Pair.of(bys.O, byt.b), Pair.of(bys.r, byt.b), Pair.of(bys.S, byt.b), Pair.of(bys.X, byt.b))
      );
   }

   private static void g(bqq<ccw> $$0) {
      $$0.a(ckj.s, 0, ImmutableList.of(btw.a(), new ccy(aty.jL, aty.jG)), bys.o);
   }

   private static <E extends bpr> boolean a(E $$0, ib $$1) {
      cxb $$2 = $$0.dM();
      ib $$3 = $$1.d();
      if ($$2.b_($$1).c() && $$2.b_($$3).c() && $$2.b_($$1.c()).c()) {
         dnb $$4 = $$2.a_($$1);
         dnb $$5 = $$2.a_($$3);
         if (!$$4.a(aun.bL) && !$$5.a(aun.bL)) {
            ejg $$6 = ejj.a($$2, $$1.j());
            ejg $$7 = ejj.a($$2, $$3.j());
            return $$6 != ejg.e && (!$$4.i() || $$7 != ejg.e) ? bsk.a($$0, $$1) : true;
         } else {
            return true;
         }
      } else {
         return false;
      }
   }

   private static boolean b(ccw $$0) {
      return !brj.a($$0);
   }

   public static void a(ccw $$0) {
      $$0.dP().a(ImmutableList.of(ckj.s, ckj.u, ckj.q, ckj.t, ckj.b));
   }

   public static ctm a() {
      return ccw.bX;
   }
}
