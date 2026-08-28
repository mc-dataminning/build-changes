import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.function.Predicate;

public class cke {
   private static final float a = 2.0F;
   private static final float b = 1.0F;
   private static final float c = 1.0F;
   private static final float d = 0.75F;
   private static final btb e = btb.a(100, 140);
   private static final int f = 2;
   private static final int g = 4;
   private static final float h = 3.5714288F;
   private static final float i = 1.25F;

   protected static void a(ckd $$0, azs $$1) {
      $$0.eb().a(cft.T, e.a($$1));
   }

   protected static bxr<?> a(bxr<ckd> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      g($$0);
      f($$0);
      $$0.a(ImmutableSet.of(crz.a));
      $$0.b(crz.b);
      $$0.f();
      return $$0;
   }

   private static void b(bxr<ckd> $$0) {
      $$0.a(crz.a, 0, ImmutableList.of(new byd(2.0F), new bzo(45, 90), new bzs(), new byo(cft.Q), new byo(cft.T)));
   }

   private static void c(bxr<ckd> $$0) {
      $$0.a(
         crz.b,
         ImmutableList.of(
            Pair.of(0, cai.a(bwb.bR, 6.0F, btb.a(30, 60))),
            Pair.of(0, new byc(bwb.ab)),
            Pair.of(1, new byv($$0x -> 1.25F)),
            Pair.of(2, cau.a(($$0x, $$1) -> b($$1), ($$0x, $$1) -> $$1.eb().c(cft.C))),
            Pair.of(3, cbf.a(6, 1.0F)),
            Pair.of(
               4,
               new caf(
                  ImmutableMap.of(cft.n, cfu.b),
                  ImmutableList.of(Pair.of(caa.a(1.0F), 1), Pair.of(cap.a(1.0F, 3), 1), Pair.of(new byp(), 3), Pair.of(cbv.a(bvs::aJ), 2))
               )
            )
         ),
         ImmutableSet.of(Pair.of(cft.U, cfu.b), Pair.of(cft.Y, cfu.b))
      );
   }

   private static void d(bxr<ckd> $$0) {
      $$0.a(
         crz.t,
         ImmutableList.of(
            Pair.of(0, cai.a(bwb.bR, 6.0F, btb.a(30, 60))),
            Pair.of(1, new byv($$0x -> 1.25F)),
            Pair.of(2, cau.a(($$0x, $$1) -> b($$1), ($$0x, $$1) -> $$1.eb().c(cft.C))),
            Pair.of(3, cbf.a(8, 1.5F)),
            Pair.of(
               5,
               new byw(
                  ImmutableMap.of(cft.n, cfu.b),
                  ImmutableSet.of(),
                  byw.a.a,
                  byw.b.b,
                  ImmutableList.of(Pair.of(caa.c(0.75F), 1), Pair.of(caa.a(1.0F, true), 1), Pair.of(cap.a(1.0F, 3), 1), Pair.of(cbv.a(bvs::bj), 5))
               )
            )
         ),
         ImmutableSet.of(Pair.of(cft.U, cfu.b), Pair.of(cft.Y, cfu.a))
      );
   }

   private static void e(bxr<ckd> $$0) {
      $$0.a(
         crz.u,
         ImmutableList.of(
            Pair.of(0, cai.a(bwb.bR, 6.0F, btb.a(30, 60))),
            Pair.of(1, cau.a(($$0x, $$1) -> b($$1), ($$0x, $$1) -> $$1.eb().c(cft.C))),
            Pair.of(2, cbg.a(8, 1.0F)),
            Pair.of(3, cbi.a(dkw.tT)),
            Pair.of(4, new caf(ImmutableList.of(Pair.of(caa.a(1.0F), 2), Pair.of(cap.a(1.0F, 3), 1), Pair.of(new byp(), 2), Pair.of(cbv.a(bvs::aJ), 1))))
         ),
         ImmutableSet.of(Pair.of(cft.U, cfu.b), Pair.of(cft.Z, cfu.a))
      );
   }

   private static void f(bxr<ckd> $$0) {
      $$0.a(
         crz.q,
         ImmutableList.of(Pair.of(0, new bzj(e, awk.kr)), Pair.of(1, new bzk<>(e, 2, 4, 3.5714288F, $$0x -> awk.kq, awz.bU, 0.5F, cke::a))),
         ImmutableSet.of(Pair.of(cft.P, cfu.b), Pair.of(cft.s, cfu.b), Pair.of(cft.T, cfu.b), Pair.of(cft.Y, cfu.b))
      );
   }

   private static void g(bxr<ckd> $$0) {
      $$0.a(crz.s, 0, ImmutableList.of(cax.a(), new ckf(awk.ks, awk.kn)), cft.p);
   }

   private static <E extends bwt> boolean a(E $$0, jj $$1) {
      dhp $$2 = $$0.dV();
      jj $$3 = $$1.e();
      if ($$2.b_($$1).c() && $$2.b_($$3).c() && $$2.b_($$1.d()).c()) {
         dym $$4 = $$2.a_($$1);
         dym $$5 = $$2.a_($$3);
         if (!$$4.a(awz.bU) && !$$5.a(awz.bU)) {
            evm $$6 = new evm($$0.dV(), $$0);
            evk $$7 = evp.a($$6, $$1.k());
            evk $$8 = evp.a($$6, $$3.k());
            return $$7 != evk.e && (!$$4.l() || $$8 != evk.e) ? bzl.a($$0, $$1) : true;
         } else {
            return true;
         }
      } else {
         return false;
      }
   }

   private static boolean b(ckd $$0) {
      return !byk.a($$0);
   }

   public static void a(ckd $$0) {
      $$0.eb().a(ImmutableList.of(crz.s, crz.u, crz.q, crz.t, crz.b));
   }

   public static Predicate<cxy> a() {
      return $$0 -> $$0.a(axi.ao);
   }
}
