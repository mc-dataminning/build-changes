import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import java.util.Set;
import java.util.stream.Collectors;

public class bza extends bwf<cnk> {
   private Set<cvn> c = ImmutableSet.of();

   public bza() {
      super(ImmutableMap.of(cdq.q, cdr.a, cdq.h, cdr.a));
   }

   protected boolean a(arj $$0, cnk $$1) {
      return bwh.a($$1.dY(), cdq.q, bty.bj);
   }

   protected boolean a(arj $$0, cnk $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(arj $$0, cnk $$1, long $$2) {
      cnk $$3 = (cnk)$$1.dY().c(cdq.q).get();
      bwh.a($$1, $$3, 0.5F, 2);
      this.c = a($$1, $$3);
   }

   protected void c(arj $$0, cnk $$1, long $$2) {
      cnk $$3 = (cnk)$$1.dY().c(cdq.q).get();
      if (!($$1.g($$3) > 5.0)) {
         bwh.a($$1, $$3, 0.5F, 2);
         $$1.a($$0, $$3, $$2);
         if ($$1.gF() && ($$1.gy().b() == cnn.g || $$3.gG())) {
            a($$1, cnk.cb.keySet(), $$3);
         }

         if ($$3.gy().b() == cnn.g && $$1.y().a_(cvw.px) > cvw.px.p() / 2) {
            a($$1, ImmutableSet.of(cvw.px), $$3);
         }

         if (!this.c.isEmpty() && $$1.y().a_(this.c)) {
            a($$1, this.c, $$3);
         }
      }
   }

   protected void d(arj $$0, cnk $$1, long $$2) {
      $$1.dY().b(cdq.q);
   }

   private static Set<cvn> a(cnk $$0, cnk $$1) {
      ImmutableSet<cvn> $$2 = $$1.gy().b().d();
      ImmutableSet<cvn> $$3 = $$0.gy().b().d();
      return $$2.stream().filter($$1x -> !$$3.contains($$1x)).collect(Collectors.toSet());
   }

   private static void a(cnk $$0, Set<cvn> $$1, bun $$2) {
      brz $$3 = $$0.y();
      cvs $$4 = cvs.k;
      int $$5 = 0;

      while ($$5 < $$3.b()) {
         cvs $$6;
         cvn $$7;
         int $$8;
         label28: {
            $$6 = $$3.a($$5);
            if (!$$6.f()) {
               $$7 = $$6.h();
               if ($$1.contains($$7)) {
                  if ($$6.K() > $$6.k() / 2) {
                     $$8 = $$6.K() / 2;
                     break label28;
                  }

                  if ($$6.K() > 24) {
                     $$8 = $$6.K() - 24;
                     break label28;
                  }
               }
            }

            $$5++;
            continue;
         }

         $$6.h($$8);
         $$4 = new cvs($$7, $$8);
         break;
      }

      if (!$$4.f()) {
         bwh.a($$0, $$4, $$2.dq());
      }
   }
}
