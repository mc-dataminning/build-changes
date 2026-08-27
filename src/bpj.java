import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import java.util.Set;
import java.util.stream.Collectors;

public class bpj extends bmp<ccz> {
   private static final int c = 5;
   private static final float d = 0.5F;
   private Set<ckw> e = ImmutableSet.of();

   public bpj() {
      super(ImmutableMap.of(btz.q, bua.a, btz.h, bua.a));
   }

   protected boolean a(ama $$0, ccz $$1) {
      return bmr.a($$1.dN(), btz.q, bkm.bf);
   }

   protected boolean a(ama $$0, ccz $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(ama $$0, ccz $$1, long $$2) {
      ccz $$3 = (ccz)$$1.dN().c(btz.q).get();
      bmr.a($$1, $$3, 0.5F);
      this.e = a($$1, $$3);
   }

   protected void c(ama $$0, ccz $$1, long $$2) {
      ccz $$3 = (ccz)$$1.dN().c(btz.q).get();
      if (!($$1.f($$3) > 5.0)) {
         bmr.a($$1, $$3, 0.5F);
         $$1.a($$0, $$3, $$2);
         if ($$1.gw() && ($$1.gp().b() == cdc.g || $$3.gx())) {
            a($$1, ccz.bW.keySet(), $$3);
         }

         if ($$3.gp().b() == cdc.g && $$1.y().a_(cle.oI) > cle.oI.l() / 2) {
            a($$1, ImmutableSet.of(cle.oI), $$3);
         }

         if (!this.e.isEmpty() && $$1.y().a(this.e)) {
            a($$1, this.e, $$3);
         }
      }
   }

   protected void d(ama $$0, ccz $$1, long $$2) {
      $$1.dN().b(btz.q);
   }

   private static Set<ckw> a(ccz $$0, ccz $$1) {
      ImmutableSet<ckw> $$2 = $$1.gp().b().d();
      ImmutableSet<ckw> $$3 = $$0.gp().b().d();
      return $$2.stream().filter($$1x -> !$$3.contains($$1x)).collect(Collectors.toSet());
   }

   private static void a(ccz $$0, Set<ckw> $$1, bky $$2) {
      bix $$3 = $$0.y();
      clb $$4 = clb.b;
      int $$5 = 0;

      while ($$5 < $$3.b()) {
         clb $$6;
         ckw $$7;
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
         $$4 = new clb($$7, $$8);
         break;
      }

      if (!$$4.b()) {
         bmr.a($$0, $$4, $$2.dj());
      }
   }
}
