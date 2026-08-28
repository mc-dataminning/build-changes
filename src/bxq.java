import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import java.util.Set;
import java.util.stream.Collectors;

public class bxq extends buv<cly> {
   private Set<cty> c = ImmutableSet.of();

   public bxq() {
      super(ImmutableMap.of(ccg.q, cch.a, ccg.h, cch.a));
   }

   protected boolean a(aqm $$0, cly $$1) {
      return bux.a($$1.dV(), ccg.q, bsn.bj);
   }

   protected boolean a(aqm $$0, cly $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(aqm $$0, cly $$1, long $$2) {
      cly $$3 = (cly)$$1.dV().c(ccg.q).get();
      bux.a($$1, $$3, 0.5F, 2);
      this.c = a($$1, $$3);
   }

   protected void c(aqm $$0, cly $$1, long $$2) {
      cly $$3 = (cly)$$1.dV().c(ccg.q).get();
      if (!($$1.g($$3) > 5.0)) {
         bux.a($$1, $$3, 0.5F, 2);
         $$1.a($$0, $$3, $$2);
         if ($$1.gF() && ($$1.gy().b() == cmb.g || $$3.gG())) {
            a($$1, cly.cd.keySet(), $$3);
         }

         if ($$3.gy().b() == cmb.g && $$1.x().a_(cug.pw) > cug.pw.q() / 2) {
            a($$1, ImmutableSet.of(cug.pw), $$3);
         }

         if (!this.c.isEmpty() && $$1.x().a(this.c)) {
            a($$1, this.c, $$3);
         }
      }
   }

   protected void d(aqm $$0, cly $$1, long $$2) {
      $$1.dV().b(ccg.q);
   }

   private static Set<cty> a(cly $$0, cly $$1) {
      ImmutableSet<cty> $$2 = $$1.gy().b().d();
      ImmutableSet<cty> $$3 = $$0.gy().b().d();
      return $$2.stream().filter($$1x -> !$$3.contains($$1x)).collect(Collectors.toSet());
   }

   private static void a(cly $$0, Set<cty> $$1, btc $$2) {
      bqq $$3 = $$0.x();
      cud $$4 = cud.l;
      int $$5 = 0;

      while ($$5 < $$3.b()) {
         cud $$6;
         cty $$7;
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
         $$4 = new cud($$7, $$8);
         break;
      }

      if (!$$4.e()) {
         bux.a($$0, $$4, $$2.dp());
      }
   }
}
