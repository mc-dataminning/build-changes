import java.util.List;

public class cij extends cih {
   public static final float e = 4.0F;

   public cij(bol<? extends cij> $$0, cwe $$1) {
      super($$0, $$1);
   }

   public cij(cwe $$0, box $$1, double $$2, double $$3, double $$4) {
      super(bol.z, $$1, $$2, $$3, $$4, $$0);
   }

   @Override
   protected void a(eot $$0) {
      super.a($$0);
      if ($$0.c() != eot.a.c || !this.d(((eos)$$0).a())) {
         if (!this.dJ().B) {
            List<box> $$1 = this.dJ().a(box.class, this.cE().c(4.0, 2.0, 4.0));
            boc $$2 = new boc(this.dJ(), this.do(), this.dq(), this.du());
            bof $$3 = this.w();
            if ($$3 instanceof box) {
               $$2.a((box)$$3);
            }

            $$2.a(kb.i);
            $$2.a(3.0F);
            $$2.b(600);
            $$2.c((7.0F - $$2.h()) / (float)$$2.m());
            $$2.a(new bns(bnu.g, 1, 1));
            if (!$$1.isEmpty()) {
               for (box $$4 : $$1) {
                  double $$5 = this.f($$4);
                  if ($$5 < 16.0) {
                     $$2.a_($$4.do(), $$4.dq(), $$4.du());
                     break;
                  }
               }
            }

            this.dJ().c(2006, this.dj(), this.aU() ? -1 : 1);
            this.dJ().b($$2);
            this.am();
         }
      }
   }

   @Override
   public boolean bt() {
      return false;
   }

   @Override
   public boolean a(bne $$0, float $$1) {
      return false;
   }

   @Override
   protected jz u() {
      return kb.i;
   }

   @Override
   protected boolean s() {
      return false;
   }
}
