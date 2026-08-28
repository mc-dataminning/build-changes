import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import java.util.Set;
import java.util.stream.Collectors;

public class byd extends bvi<cmk> {
   private Set<cuk> c = ImmutableSet.of();

   public byd() {
      super(ImmutableMap.of(cct.q, ccu.a, cct.h, ccu.a));
   }

   protected boolean a(arf $$0, cmk $$1) {
      return bvk.a($$1.dS(), cct.q, bta.bj);
   }

   protected boolean a(arf $$0, cmk $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(arf $$0, cmk $$1, long $$2) {
      cmk $$3 = (cmk)$$1.dS().c(cct.q).get();
      bvk.a($$1, $$3, 0.5F, 2);
      this.c = a($$1, $$3);
   }

   protected void c(arf $$0, cmk $$1, long $$2) {
      cmk $$3 = (cmk)$$1.dS().c(cct.q).get();
      if (!($$1.g($$3) > 5.0)) {
         bvk.a($$1, $$3, 0.5F, 2);
         $$1.a($$0, $$3, $$2);
         if ($$1.gI() && ($$1.gB().b() == cmn.g || $$3.gJ())) {
            a($$1, cmk.cb.keySet(), $$3);
         }

         if ($$3.gB().b() == cmn.g && $$1.y().a_(cus.pw) > cus.pw.q() / 2) {
            a($$1, ImmutableSet.of(cus.pw), $$3);
         }

         if (!this.c.isEmpty() && $$1.y().a(this.c)) {
            a($$1, this.c, $$3);
         }
      }
   }

   protected void d(arf $$0, cmk $$1, long $$2) {
      $$1.dS().b(cct.q);
   }

   private static Set<cuk> a(cmk $$0, cmk $$1) {
      ImmutableSet<cuk> $$2 = $$1.gB().b().d();
      ImmutableSet<cuk> $$3 = $$0.gB().b().d();
      return $$2.stream().filter($$1x -> !$$3.contains($$1x)).collect(Collectors.toSet());
   }

   private static void a(cmk $$0, Set<cuk> $$1, btp $$2) {
      brd $$3 = $$0.y();
      cup $$4 = cup.l;
      int $$5 = 0;

      while ($$5 < $$3.b()) {
         cup $$6;
         cuk $$7;
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
         $$4 = new cup($$7, $$8);
         break;
      }

      if (!$$4.e()) {
         bvk.a($$0, $$4, $$2.dn());
      }
   }
}
