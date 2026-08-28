import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.function.Predicate;

public class ckm {
   private static final float a = 2.0F;
   private static final float b = 1.0F;
   private static final float c = 1.0F;
   private static final float d = 0.75F;
   private static final btj e = btj.a(100, 140);
   private static final int f = 2;
   private static final int g = 4;
   private static final float h = 3.5714288F;
   private static final float i = 1.25F;

   protected static void a(ckl $$0, azt $$1) {
      $$0.eb().a(cgb.T, e.a($$1));
   }

   protected static bxz<?> a(bxz<ckl> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      g($$0);
      f($$0);
      $$0.a(ImmutableSet.of(csl.a));
      $$0.b(csl.b);
      $$0.f();
      return $$0;
   }

   private static void b(bxz<ckl> $$0) {
      $$0.a(csl.a, 0, ImmutableList.of(new byl(2.0F), new bzw(45, 90), new caa(), new byw(cgb.Q), new byw(cgb.T)));
   }

   private static void c(bxz<ckl> $$0) {
      $$0.a(
         csl.b,
         ImmutableList.of(
            Pair.of(0, caq.a(bwj.bS, 6.0F, btj.a(30, 60))),
            Pair.of(0, new byk(bwj.ab)),
            Pair.of(1, new bzd($$0x -> 1.25F)),
            Pair.of(2, cbc.a(($$0x, $$1) -> b($$1), ($$0x, $$1) -> $$1.eb().c(cgb.C))),
            Pair.of(3, cbn.a(6, 1.0F)),
            Pair.of(
               4,
               new can(
                  ImmutableMap.of(cgb.n, cgc.b),
                  ImmutableList.of(Pair.of(cai.a(1.0F), 1), Pair.of(cax.a(1.0F, 3), 1), Pair.of(new byx(), 3), Pair.of(ccd.a(bwa::aJ), 2))
               )
            )
         ),
         ImmutableSet.of(Pair.of(cgb.U, cgc.b), Pair.of(cgb.Y, cgc.b))
      );
   }

   private static void d(bxz<ckl> $$0) {
      $$0.a(
         csl.t,
         ImmutableList.of(
            Pair.of(0, caq.a(bwj.bS, 6.0F, btj.a(30, 60))),
            Pair.of(1, new bzd($$0x -> 1.25F)),
            Pair.of(2, cbc.a(($$0x, $$1) -> b($$1), ($$0x, $$1) -> $$1.eb().c(cgb.C))),
            Pair.of(3, cbn.a(8, 1.5F)),
            Pair.of(
               5,
               new bze(
                  ImmutableMap.of(cgb.n, cgc.b),
                  ImmutableSet.of(),
                  bze.a.a,
                  bze.b.b,
                  ImmutableList.of(Pair.of(cai.c(0.75F), 1), Pair.of(cai.a(1.0F, true), 1), Pair.of(cax.a(1.0F, 3), 1), Pair.of(ccd.a(bwa::bj), 5))
               )
            )
         ),
         ImmutableSet.of(Pair.of(cgb.U, cgc.b), Pair.of(cgb.Y, cgc.a))
      );
   }

   private static void e(bxz<ckl> $$0) {
      $$0.a(
         csl.u,
         ImmutableList.of(
            Pair.of(0, caq.a(bwj.bS, 6.0F, btj.a(30, 60))),
            Pair.of(1, cbc.a(($$0x, $$1) -> b($$1), ($$0x, $$1) -> $$1.eb().c(cgb.C))),
            Pair.of(2, cbo.a(8, 1.0F)),
            Pair.of(3, cbq.a(dlw.tT)),
            Pair.of(4, new can(ImmutableList.of(Pair.of(cai.a(1.0F), 2), Pair.of(cax.a(1.0F, 3), 1), Pair.of(new byx(), 2), Pair.of(ccd.a(bwa::aJ), 1))))
         ),
         ImmutableSet.of(Pair.of(cgb.U, cgc.b), Pair.of(cgb.Z, cgc.a))
      );
   }

   private static void f(bxz<ckl> $$0) {
      $$0.a(
         csl.q,
         ImmutableList.of(Pair.of(0, new bzr(e, awl.kr)), Pair.of(1, new bzs<>(e, 2, 4, 3.5714288F, $$0x -> awl.kq, axa.bU, 0.5F, ckm::a))),
         ImmutableSet.of(Pair.of(cgb.P, cgc.b), Pair.of(cgb.s, cgc.b), Pair.of(cgb.T, cgc.b), Pair.of(cgb.Y, cgc.b))
      );
   }

   private static void g(bxz<ckl> $$0) {
      $$0.a(csl.s, 0, ImmutableList.of(cbf.a(), new ckp(awl.ks, awl.kn)), cgb.p);
   }

   private static <E extends bxb> boolean a(E $$0, iu $$1) {
      dip $$2 = $$0.dV();
      iu $$3 = $$1.e();
      if ($$2.b_($$1).c() && $$2.b_($$3).c() && $$2.b_($$1.d()).c()) {
         dzo $$4 = $$2.a_($$1);
         dzo $$5 = $$2.a_($$3);
         if (!$$4.a(axa.bU) && !$$5.a(axa.bU)) {
            ewo $$6 = new ewo($$0.dV(), $$0);
            ewm $$7 = ewr.a($$6, $$1.k());
            ewm $$8 = ewr.a($$6, $$3.k());
            return $$7 != ewm.e && (!$$4.l() || $$8 != ewm.e) ? bzt.a($$0, $$1) : true;
         } else {
            return true;
         }
      } else {
         return false;
      }
   }

   private static boolean b(ckl $$0) {
      return !bys.a($$0);
   }

   public static void a(ckl $$0) {
      $$0.eb().a(ImmutableList.of(csl.s, csl.u, csl.q, csl.t, csl.b));
   }

   public static Predicate<cys> a() {
      return $$0 -> $$0.a(axi.ao);
   }
}
