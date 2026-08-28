import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import java.util.Set;
import java.util.stream.Collectors;

public class bxp extends buu<clx> {
   private Set<ctx> c = ImmutableSet.of();

   public bxp() {
      super(ImmutableMap.of(ccf.q, ccg.a, ccf.h, ccg.a));
   }

   protected boolean a(aqm $$0, clx $$1) {
      return buw.a($$1.dU(), ccf.q, bsm.bj);
   }

   protected boolean a(aqm $$0, clx $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(aqm $$0, clx $$1, long $$2) {
      clx $$3 = (clx)$$1.dU().c(ccf.q).get();
      buw.a($$1, $$3, 0.5F, 2);
      this.c = a($$1, $$3);
   }

   protected void c(aqm $$0, clx $$1, long $$2) {
      clx $$3 = (clx)$$1.dU().c(ccf.q).get();
      if (!($$1.g($$3) > 5.0)) {
         buw.a($$1, $$3, 0.5F, 2);
         $$1.a($$0, $$3, $$2);
         if ($$1.gG() && ($$1.gz().b() == cma.g || $$3.gH())) {
            a($$1, clx.cd.keySet(), $$3);
         }

         if ($$3.gz().b() == cma.g && $$1.y().a_(cuf.pw) > cuf.pw.q() / 2) {
            a($$1, ImmutableSet.of(cuf.pw), $$3);
         }

         if (!this.c.isEmpty() && $$1.y().a(this.c)) {
            a($$1, this.c, $$3);
         }
      }
   }

   protected void d(aqm $$0, clx $$1, long $$2) {
      $$1.dU().b(ccf.q);
   }

   private static Set<ctx> a(clx $$0, clx $$1) {
      ImmutableSet<ctx> $$2 = $$1.gz().b().d();
      ImmutableSet<ctx> $$3 = $$0.gz().b().d();
      return $$2.stream().filter($$1x -> !$$3.contains($$1x)).collect(Collectors.toSet());
   }

   private static void a(clx $$0, Set<ctx> $$1, btb $$2) {
      bqp $$3 = $$0.y();
      cuc $$4 = cuc.l;
      int $$5 = 0;

      while ($$5 < $$3.b()) {
         cuc $$6;
         ctx $$7;
         int $$8;
         label28: {
            $$6 = $$3.a($$5);
            if (!$$6.e()) {
               $$7 = $$6.g();
               if ($$1.contains($$7)) {
                  if ($$6.H() > $$6.j() / 2) {
                     $$8 = $$6.H() / 2;
                     break label28;
                  }

                  if ($$6.H() > 24) {
                     $$8 = $$6.H() - 24;
                     break label28;
                  }
               }
            }

            $$5++;
            continue;
         }

         $$6.h($$8);
         $$4 = new cuc($$7, $$8);
         break;
      }

      if (!$$4.e()) {
         buw.a($$0, $$4, $$2.do());
      }
   }
}
