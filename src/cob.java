import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;

public class cob {
   protected static final ImmutableList<? extends cgq<? extends cgp<? super coa>>> a = ImmutableList.of(cgq.c, cgq.d);
   protected static final ImmutableList<? extends cfj<?>> b = ImmutableList.of(cfj.g, cfj.h, cfj.k, cfj.l, cfj.n, cfj.m, cfj.E, cfj.t, cfj.o, cfj.p);

   static void a(bxh<coa> $$0) {
      $$0.a(crn.a, 0, ImmutableList.of(new cas<coa>(0.8F) {
         protected boolean a(ash $$0, coa $$1) {
            return $$1.p() && super.a($$0, (bwf)$$1);
         }
      }, new bze(45, 90), new bzi()));
   }

   static void b(bxh<coa> $$0) {
      $$0.a(
         crn.b,
         10,
         ImmutableList.of(
            cak.a(($$0x, $$1) -> $$1.x(), ($$0x, $$1) -> $$1.ec().c(cfj.l)),
            bzy.a(8.0F, bst.a(30, 60)),
            new bzv(ImmutableList.of(Pair.of(bzq.a(0.2F), 2), Pair.of(caf.a(0.2F, 3), 2), Pair.of(new byi(30, 60), 1)))
         )
      );
   }

   static void c(bxh<coa> $$0) {
      $$0.a(crn.k, 10, ImmutableList.of(cad.a(1.0F), bzf.a(coa::p, 40), can.a()), cfj.o);
   }

   public static bxh.b<coa> a() {
      return bxh.a(b, a);
   }

   public static bxh<coa> d(bxh<coa> $$0) {
      a($$0);
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(crn.a));
      $$0.b(crn.b);
      $$0.f();
      return $$0;
   }

   public static void a(coa $$0) {
      if (!$$0.p()) {
         $$0.ec().f();
      } else {
         $$0.ec().a(ImmutableList.of(crn.k, crn.b));
      }
   }
}
