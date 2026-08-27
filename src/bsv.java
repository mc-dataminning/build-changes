import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import java.util.Set;
import java.util.stream.Collectors;

public class bsv extends bqa<cgy> {
   private Set<coy> c = ImmutableSet.of();

   public bsv() {
      super(ImmutableMap.of(bxl.q, bxm.a, bxl.h, bxm.a));
   }

   protected boolean a(aow $$0, cgy $$1) {
      return bqc.a($$1.dO(), bxl.q, bnw.bh);
   }

   protected boolean a(aow $$0, cgy $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(aow $$0, cgy $$1, long $$2) {
      cgy $$3 = (cgy)$$1.dO().c(bxl.q).get();
      bqc.a($$1, $$3, 0.5F, 2);
      this.c = a($$1, $$3);
   }

   protected void c(aow $$0, cgy $$1, long $$2) {
      cgy $$3 = (cgy)$$1.dO().c(bxl.q).get();
      if (!($$1.f($$3) > 5.0)) {
         bqc.a($$1, $$3, 0.5F, 2);
         $$1.a($$0, $$3, $$2);
         if ($$1.gy() && ($$1.gr().b() == chb.g || $$3.gz())) {
            a($$1, cgy.bW.keySet(), $$3);
         }

         if ($$3.gr().b() == chb.g && $$1.A().a_(cpg.pv) > cpg.pv.k() / 2) {
            a($$1, ImmutableSet.of(cpg.pv), $$3);
         }

         if (!this.c.isEmpty() && $$1.A().a(this.c)) {
            a($$1, this.c, $$3);
         }
      }
   }

   protected void d(aow $$0, cgy $$1, long $$2) {
      $$1.dO().b(bxl.q);
   }

   private static Set<coy> a(cgy $$0, cgy $$1) {
      ImmutableSet<coy> $$2 = $$1.gr().b().d();
      ImmutableSet<coy> $$3 = $$0.gr().b().d();
      return $$2.stream().filter($$1x -> !$$3.contains($$1x)).collect(Collectors.toSet());
   }

   private static void a(cgy $$0, Set<coy> $$1, boi $$2) {
      bmf $$3 = $$0.A();
      cpd $$4 = cpd.h;
      int $$5 = 0;

      while ($$5 < $$3.b()) {
         cpd $$6;
         coy $$7;
         int $$8;
         label28: {
            $$6 = $$3.a($$5);
            if (!$$6.b()) {
               $$7 = $$6.d();
               if ($$1.contains($$7)) {
                  if ($$6.M() > $$6.g() / 2) {
                     $$8 = $$6.M() / 2;
                     break label28;
                  }

                  if ($$6.M() > 24) {
                     $$8 = $$6.M() - 24;
                     break label28;
                  }
               }
            }

            $$5++;
            continue;
         }

         $$6.h($$8);
         $$4 = new cpd($$7, $$8);
         break;
      }

      if (!$$4.b()) {
         bqc.a($$0, $$4, $$2.dk());
      }
   }
}
