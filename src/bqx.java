import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import java.util.Set;
import java.util.stream.Collectors;

public class bqx extends boc<cev> {
   private static final int c = 5;
   private static final float d = 0.5F;
   private Set<cmt> e = ImmutableSet.of();

   public bqx() {
      super(ImmutableMap.of(bvn.q, bvo.a, bvn.h, bvo.a));
   }

   protected boolean a(and $$0, cev $$1) {
      return boe.a($$1.dO(), bvn.q, blz.bg);
   }

   protected boolean a(and $$0, cev $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(and $$0, cev $$1, long $$2) {
      cev $$3 = (cev)$$1.dO().c(bvn.q).get();
      boe.a($$1, $$3, 0.5F);
      this.e = a($$1, $$3);
   }

   protected void c(and $$0, cev $$1, long $$2) {
      cev $$3 = (cev)$$1.dO().c(bvn.q).get();
      if (!($$1.f($$3) > 5.0)) {
         boe.a($$1, $$3, 0.5F);
         $$1.a($$0, $$3, $$2);
         if ($$1.gw() && ($$1.gp().b() == cey.g || $$3.gx())) {
            a($$1, cev.bW.keySet(), $$3);
         }

         if ($$3.gp().b() == cey.g && $$1.A().a_(cnb.pt) > cnb.pt.l() / 2) {
            a($$1, ImmutableSet.of(cnb.pt), $$3);
         }

         if (!this.e.isEmpty() && $$1.A().a(this.e)) {
            a($$1, this.e, $$3);
         }
      }
   }

   protected void d(and $$0, cev $$1, long $$2) {
      $$1.dO().b(bvn.q);
   }

   private static Set<cmt> a(cev $$0, cev $$1) {
      ImmutableSet<cmt> $$2 = $$1.gp().b().d();
      ImmutableSet<cmt> $$3 = $$0.gp().b().d();
      return $$2.stream().filter($$1x -> !$$3.contains($$1x)).collect(Collectors.toSet());
   }

   private static void a(cev $$0, Set<cmt> $$1, bml $$2) {
      bkj $$3 = $$0.A();
      cmy $$4 = cmy.f;
      int $$5 = 0;

      while ($$5 < $$3.b()) {
         cmy $$6;
         cmt $$7;
         int $$8;
         label28: {
            $$6 = $$3.a($$5);
            if (!$$6.b()) {
               $$7 = $$6.d();
               if ($$1.contains($$7)) {
                  if ($$6.L() > $$6.g() / 2) {
                     $$8 = $$6.L() / 2;
                     break label28;
                  }

                  if ($$6.L() > 24) {
                     $$8 = $$6.L() - 24;
                     break label28;
                  }
               }
            }

            $$5++;
            continue;
         }

         $$6.h($$8);
         $$4 = new cmy($$7, $$8);
         break;
      }

      if (!$$4.b()) {
         boe.a($$0, $$4, $$2.dk());
      }
   }
}
