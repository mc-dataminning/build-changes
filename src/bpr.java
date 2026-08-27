import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import java.util.Set;
import java.util.stream.Collectors;

public class bpr extends bmx<cdh> {
   private static final int c = 5;
   private static final float d = 0.5F;
   private Set<cle> e = ImmutableSet.of();

   public bpr() {
      super(ImmutableMap.of(buh.q, bui.a, buh.h, bui.a));
   }

   protected boolean a(ame $$0, cdh $$1) {
      return bmz.a($$1.dP(), buh.q, bku.bf);
   }

   protected boolean a(ame $$0, cdh $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(ame $$0, cdh $$1, long $$2) {
      cdh $$3 = (cdh)$$1.dP().c(buh.q).get();
      bmz.a($$1, $$3, 0.5F);
      this.e = a($$1, $$3);
   }

   protected void c(ame $$0, cdh $$1, long $$2) {
      cdh $$3 = (cdh)$$1.dP().c(buh.q).get();
      if (!($$1.f($$3) > 5.0)) {
         bmz.a($$1, $$3, 0.5F);
         $$1.a($$0, $$3, $$2);
         if ($$1.gx() && ($$1.gq().b() == cdk.g || $$3.gy())) {
            a($$1, cdh.bW.keySet(), $$3);
         }

         if ($$3.gq().b() == cdk.g && $$1.A().a_(clm.pt) > clm.pt.l() / 2) {
            a($$1, ImmutableSet.of(clm.pt), $$3);
         }

         if (!this.e.isEmpty() && $$1.A().a(this.e)) {
            a($$1, this.e, $$3);
         }
      }
   }

   protected void d(ame $$0, cdh $$1, long $$2) {
      $$1.dP().b(buh.q);
   }

   private static Set<cle> a(cdh $$0, cdh $$1) {
      ImmutableSet<cle> $$2 = $$1.gq().b().d();
      ImmutableSet<cle> $$3 = $$0.gq().b().d();
      return $$2.stream().filter($$1x -> !$$3.contains($$1x)).collect(Collectors.toSet());
   }

   private static void a(cdh $$0, Set<cle> $$1, blg $$2) {
      bje $$3 = $$0.A();
      clj $$4 = clj.b;
      int $$5 = 0;

      while ($$5 < $$3.b()) {
         clj $$6;
         cle $$7;
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
         $$4 = new clj($$7, $$8);
         break;
      }

      if (!$$4.b()) {
         bmz.a($$0, $$4, $$2.dl());
      }
   }
}
