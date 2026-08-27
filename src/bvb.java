import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import java.util.Set;
import java.util.stream.Collectors;

public class bvb extends bsg<cjg> {
   private Set<cre> c = ImmutableSet.of();

   public bvb() {
      super(ImmutableMap.of(bzr.q, bzs.a, bzr.h, bzs.a));
   }

   protected boolean a(aps $$0, cjg $$1) {
      return bsi.a($$1.dP(), bzr.q, bqb.bi);
   }

   protected boolean a(aps $$0, cjg $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(aps $$0, cjg $$1, long $$2) {
      cjg $$3 = (cjg)$$1.dP().c(bzr.q).get();
      bsi.a($$1, $$3, 0.5F, 2);
      this.c = a($$1, $$3);
   }

   protected void c(aps $$0, cjg $$1, long $$2) {
      cjg $$3 = (cjg)$$1.dP().c(bzr.q).get();
      if (!($$1.g($$3) > 5.0)) {
         bsi.a($$1, $$3, 0.5F, 2);
         $$1.a($$0, $$3, $$2);
         if ($$1.gF() && ($$1.gy().b() == cjj.g || $$3.gG())) {
            a($$1, cjg.ca.keySet(), $$3);
         }

         if ($$3.gy().b() == cjj.g && $$1.y().a_(crm.pv) > crm.pv.q() / 2) {
            a($$1, ImmutableSet.of(crm.pv), $$3);
         }

         if (!this.c.isEmpty() && $$1.y().a(this.c)) {
            a($$1, this.c, $$3);
         }
      }
   }

   protected void d(aps $$0, cjg $$1, long $$2) {
      $$1.dP().b(bzr.q);
   }

   private static Set<cre> a(cjg $$0, cjg $$1) {
      ImmutableSet<cre> $$2 = $$1.gy().b().d();
      ImmutableSet<cre> $$3 = $$0.gy().b().d();
      return $$2.stream().filter($$1x -> !$$3.contains($$1x)).collect(Collectors.toSet());
   }

   private static void a(cjg $$0, Set<cre> $$1, bqo $$2) {
      boj $$3 = $$0.y();
      crj $$4 = crj.i;
      int $$5 = 0;

      while ($$5 < $$3.b()) {
         crj $$6;
         cre $$7;
         int $$8;
         label28: {
            $$6 = $$3.a($$5);
            if (!$$6.d()) {
               $$7 = $$6.f();
               if ($$1.contains($$7)) {
                  if ($$6.G() > $$6.i() / 2) {
                     $$8 = $$6.G() / 2;
                     break label28;
                  }

                  if ($$6.G() > 24) {
                     $$8 = $$6.G() - 24;
                     break label28;
                  }
               }
            }

            $$5++;
            continue;
         }

         $$6.g($$8);
         $$4 = new crj($$7, $$8);
         break;
      }

      if (!$$4.d()) {
         bsi.a($$0, $$4, $$2.dk());
      }
   }
}
