import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import java.util.Set;
import java.util.stream.Collectors;

public class byx extends bwc<cnh> {
   private Set<cvk> c = ImmutableSet.of();

   public byx() {
      super(ImmutableMap.of(cdn.q, cdo.a, cdn.h, cdo.a));
   }

   protected boolean a(arh $$0, cnh $$1) {
      return bwe.a($$1.dX(), cdn.q, btv.bj);
   }

   protected boolean a(arh $$0, cnh $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(arh $$0, cnh $$1, long $$2) {
      cnh $$3 = (cnh)$$1.dX().c(cdn.q).get();
      bwe.a($$1, $$3, 0.5F, 2);
      this.c = a($$1, $$3);
   }

   protected void c(arh $$0, cnh $$1, long $$2) {
      cnh $$3 = (cnh)$$1.dX().c(cdn.q).get();
      if (!($$1.g($$3) > 5.0)) {
         bwe.a($$1, $$3, 0.5F, 2);
         $$1.a($$0, $$3, $$2);
         if ($$1.gH() && ($$1.gz().b() == cnk.g || $$3.gI())) {
            a($$1, cnh.cb.keySet(), $$3);
         }

         if ($$3.gz().b() == cnk.g && $$1.y().a_(cvt.px) > cvt.px.p() / 2) {
            a($$1, ImmutableSet.of(cvt.px), $$3);
         }

         if (!this.c.isEmpty() && $$1.y().a_(this.c)) {
            a($$1, this.c, $$3);
         }
      }
   }

   protected void d(arh $$0, cnh $$1, long $$2) {
      $$1.dX().b(cdn.q);
   }

   private static Set<cvk> a(cnh $$0, cnh $$1) {
      ImmutableSet<cvk> $$2 = $$1.gz().b().d();
      ImmutableSet<cvk> $$3 = $$0.gz().b().d();
      return $$2.stream().filter($$1x -> !$$3.contains($$1x)).collect(Collectors.toSet());
   }

   private static void a(cnh $$0, Set<cvk> $$1, buk $$2) {
      brw $$3 = $$0.y();
      cvp $$4 = cvp.k;
      int $$5 = 0;

      while ($$5 < $$3.b()) {
         cvp $$6;
         cvk $$7;
         int $$8;
         label28: {
            $$6 = $$3.a($$5);
            if (!$$6.f()) {
               $$7 = $$6.h();
               if ($$1.contains($$7)) {
                  if ($$6.J() > $$6.k() / 2) {
                     $$8 = $$6.J() / 2;
                     break label28;
                  }

                  if ($$6.J() > 24) {
                     $$8 = $$6.J() - 24;
                     break label28;
                  }
               }
            }

            $$5++;
            continue;
         }

         $$6.h($$8);
         $$4 = new cvp($$7, $$8);
         break;
      }

      if (!$$4.f()) {
         bwe.a($$0, $$4, $$2.dq());
      }
   }
}
