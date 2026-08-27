import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import java.util.Set;
import java.util.stream.Collectors;

public class bxc extends buh<clj> {
   private Set<ctj> c = ImmutableSet.of();

   public bxc() {
      super(ImmutableMap.of(cbs.q, cbt.a, cbs.h, cbt.a));
   }

   protected boolean a(aqm $$0, clj $$1) {
      return buj.a($$1.dS(), cbs.q, bsa.bj);
   }

   protected boolean a(aqm $$0, clj $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(aqm $$0, clj $$1, long $$2) {
      clj $$3 = (clj)$$1.dS().c(cbs.q).get();
      buj.a($$1, $$3, 0.5F, 2);
      this.c = a($$1, $$3);
   }

   protected void c(aqm $$0, clj $$1, long $$2) {
      clj $$3 = (clj)$$1.dS().c(cbs.q).get();
      if (!($$1.g($$3) > 5.0)) {
         buj.a($$1, $$3, 0.5F, 2);
         $$1.a($$0, $$3, $$2);
         if ($$1.gH() && ($$1.gA().b() == clm.g || $$3.gI())) {
            a($$1, clj.cb.keySet(), $$3);
         }

         if ($$3.gA().b() == clm.g && $$1.y().a_(ctr.pw) > ctr.pw.p() / 2) {
            a($$1, ImmutableSet.of(ctr.pw), $$3);
         }

         if (!this.c.isEmpty() && $$1.y().a(this.c)) {
            a($$1, this.c, $$3);
         }
      }
   }

   protected void d(aqm $$0, clj $$1, long $$2) {
      $$1.dS().b(cbs.q);
   }

   private static Set<ctj> a(clj $$0, clj $$1) {
      ImmutableSet<ctj> $$2 = $$1.gA().b().d();
      ImmutableSet<ctj> $$3 = $$0.gA().b().d();
      return $$2.stream().filter($$1x -> !$$3.contains($$1x)).collect(Collectors.toSet());
   }

   private static void a(clj $$0, Set<ctj> $$1, bso $$2) {
      bqd $$3 = $$0.y();
      cto $$4 = cto.i;
      int $$5 = 0;

      while ($$5 < $$3.b()) {
         cto $$6;
         ctj $$7;
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
         $$4 = new cto($$7, $$8);
         break;
      }

      if (!$$4.e()) {
         buj.a($$0, $$4, $$2.dn());
      }
   }
}
