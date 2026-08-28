import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import java.util.Set;
import java.util.stream.Collectors;

public class byf extends bvk<cmm> {
   private Set<cum> c = ImmutableSet.of();

   public byf() {
      super(ImmutableMap.of(ccv.q, ccw.a, ccv.h, ccw.a));
   }

   protected boolean a(arf $$0, cmm $$1) {
      return bvm.a($$1.dS(), ccv.q, btc.bj);
   }

   protected boolean a(arf $$0, cmm $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(arf $$0, cmm $$1, long $$2) {
      cmm $$3 = (cmm)$$1.dS().c(ccv.q).get();
      bvm.a($$1, $$3, 0.5F, 2);
      this.c = a($$1, $$3);
   }

   protected void c(arf $$0, cmm $$1, long $$2) {
      cmm $$3 = (cmm)$$1.dS().c(ccv.q).get();
      if (!($$1.g($$3) > 5.0)) {
         bvm.a($$1, $$3, 0.5F, 2);
         $$1.a($$0, $$3, $$2);
         if ($$1.gI() && ($$1.gB().b() == cmp.g || $$3.gJ())) {
            a($$1, cmm.cb.keySet(), $$3);
         }

         if ($$3.gB().b() == cmp.g && $$1.y().a_(cuu.pw) > cuu.pw.q() / 2) {
            a($$1, ImmutableSet.of(cuu.pw), $$3);
         }

         if (!this.c.isEmpty() && $$1.y().a(this.c)) {
            a($$1, this.c, $$3);
         }
      }
   }

   protected void d(arf $$0, cmm $$1, long $$2) {
      $$1.dS().b(ccv.q);
   }

   private static Set<cum> a(cmm $$0, cmm $$1) {
      ImmutableSet<cum> $$2 = $$1.gB().b().d();
      ImmutableSet<cum> $$3 = $$0.gB().b().d();
      return $$2.stream().filter($$1x -> !$$3.contains($$1x)).collect(Collectors.toSet());
   }

   private static void a(cmm $$0, Set<cum> $$1, btr $$2) {
      brf $$3 = $$0.y();
      cur $$4 = cur.l;
      int $$5 = 0;

      while ($$5 < $$3.b()) {
         cur $$6;
         cum $$7;
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
         $$4 = new cur($$7, $$8);
         break;
      }

      if (!$$4.e()) {
         bvm.a($$0, $$4, $$2.dn());
      }
   }
}
