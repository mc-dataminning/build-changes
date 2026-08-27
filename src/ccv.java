import javax.annotation.Nullable;

public class ccv extends bvu {
   private final ccu a;

   public ccv(ccu $$0) {
      this.a = $$0;
   }

   @Override
   public boolean a() {
      return this.a.dJ().a(this.a.do(), this.a.dq(), this.a.du(), 10.0);
   }

   @Override
   public void e() {
      apa $$0 = (apa)this.a.dJ();
      bmj $$1 = $$0.d_(this.a.dj());
      this.a.w(false);
      this.a.x(true);
      this.a.c_(0);
      bow $$2 = bol.ak.a((cwe)$$0);
      if ($$2 != null) {
         $$2.e(this.a.do(), this.a.dq(), this.a.du());
         $$2.a(true);
         $$0.b($$2);
         cfo $$3 = this.a($$1, this.a);
         if ($$3 != null) {
            $$3.m(this.a);
            $$0.a_($$3);

            for (int $$4 = 0; $$4 < 3; $$4++) {
               cco $$5 = this.a($$1);
               if ($$5 != null) {
                  cfo $$6 = this.a($$1, $$5);
                  if ($$6 != null) {
                     $$6.m($$5);
                     $$5.j(this.a.ef().a(0.0, 1.1485), 0.0, this.a.ef().a(0.0, 1.1485));
                     $$0.a_($$5);
                  }
               }
            }
         }
      }
   }

   @Nullable
   private cco a(bmj $$0) {
      ccu $$1 = bol.aM.a(this.a.dJ());
      if ($$1 != null) {
         $$1.a((apa)this.a.dJ(), $$0, bpb.k, null);
         $$1.a_(this.a.do(), this.a.dq(), this.a.du());
         $$1.ak = 60;
         $$1.fQ();
         $$1.x(true);
         $$1.c_(0);
      }

      return $$1;
   }

   @Nullable
   private cfo a(bmj $$0, cco $$1) {
      cfo $$2 = bol.aL.a($$1.dJ());
      if ($$2 != null) {
         $$2.a((apa)$$1.dJ(), $$0, bpb.k, null);
         $$2.a_($$1.do(), $$1.dq(), $$1.du());
         $$2.ak = 60;
         $$2.fQ();
         if ($$2.c(bom.f).b()) {
            $$2.a(bom.f, new cpq(cpt.pF));
         }

         $$2.a(bom.a, cua.a($$2.ef(), this.a($$2.eR()), (int)(5.0F + $$0.d() * (float)$$2.ef().a(18)), false));
         $$2.a(bom.f, cua.a($$2.ef(), this.a($$2.c(bom.f)), (int)(5.0F + $$0.d() * (float)$$2.ef().a(18)), false));
      }

      return $$2;
   }

   private cpq a(cpq $$0) {
      $$0.d("Enchantments");
      return $$0;
   }
}
