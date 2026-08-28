import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import java.util.Set;
import java.util.stream.Collectors;

public class bxy extends bvd<cmf> {
   private Set<cuf> c = ImmutableSet.of();

   public bxy() {
      super(ImmutableMap.of(cco.q, ccp.a, cco.h, ccp.a));
   }

   protected boolean a(arb $$0, cmf $$1) {
      return bvf.a($$1.dS(), cco.q, bsv.bj);
   }

   protected boolean a(arb $$0, cmf $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(arb $$0, cmf $$1, long $$2) {
      cmf $$3 = (cmf)$$1.dS().c(cco.q).get();
      bvf.a($$1, $$3, 0.5F, 2);
      this.c = a($$1, $$3);
   }

   protected void c(arb $$0, cmf $$1, long $$2) {
      cmf $$3 = (cmf)$$1.dS().c(cco.q).get();
      if (!($$1.g($$3) > 5.0)) {
         bvf.a($$1, $$3, 0.5F, 2);
         $$1.a($$0, $$3, $$2);
         if ($$1.gI() && ($$1.gB().b() == cmi.g || $$3.gJ())) {
            a($$1, cmf.cb.keySet(), $$3);
         }

         if ($$3.gB().b() == cmi.g && $$1.y().a_(cun.pw) > cun.pw.q() / 2) {
            a($$1, ImmutableSet.of(cun.pw), $$3);
         }

         if (!this.c.isEmpty() && $$1.y().a(this.c)) {
            a($$1, this.c, $$3);
         }
      }
   }

   protected void d(arb $$0, cmf $$1, long $$2) {
      $$1.dS().b(cco.q);
   }

   private static Set<cuf> a(cmf $$0, cmf $$1) {
      ImmutableSet<cuf> $$2 = $$1.gB().b().d();
      ImmutableSet<cuf> $$3 = $$0.gB().b().d();
      return $$2.stream().filter($$1x -> !$$3.contains($$1x)).collect(Collectors.toSet());
   }

   private static void a(cmf $$0, Set<cuf> $$1, btk $$2) {
      bqy $$3 = $$0.y();
      cuk $$4 = cuk.l;
      int $$5 = 0;

      while ($$5 < $$3.b()) {
         cuk $$6;
         cuf $$7;
         int $$8;
         label28: {
            $$6 = $$3.a($$5);
            if (!$$6.e()) {
               $$7 = $$6.g();
               if ($$1.contains($$7)) {
                  if ($$6.I() > $$6.j() / 2) {
                     $$8 = $$6.I() / 2;
                     break label28;
                  }

                  if ($$6.I() > 24) {
                     $$8 = $$6.I() - 24;
                     break label28;
                  }
               }
            }

            $$5++;
            continue;
         }

         $$6.h($$8);
         $$4 = new cuk($$7, $$8);
         break;
      }

      if (!$$4.e()) {
         bvf.a($$0, $$4, $$2.dn());
      }
   }
}
