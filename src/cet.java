import javax.annotation.Nullable;

public class cet extends cer {
   @Nullable
   private ji p;

   public cet(bvi $$0, dgi $$1) {
      super($$0, $$1);
   }

   @Override
   public etn a(ji $$0, int $$1) {
      this.p = $$0;
      return super.a($$0, $$1);
   }

   @Override
   public etn a(buk $$0, int $$1) {
      this.p = $$0.dw();
      return super.a($$0, $$1);
   }

   @Override
   public boolean a(buk $$0, double $$1) {
      etn $$2 = this.a($$0, 0);
      if ($$2 != null) {
         return this.a($$2, $$1);
      } else {
         this.p = $$0.dw();
         this.d = $$1;
         return true;
      }
   }

   @Override
   public void c() {
      if (!this.k()) {
         super.c();
      } else {
         if (this.p != null) {
            if (!this.p.a(this.a.du(), (double)this.a.dr())
               && (!(this.a.dD() > (double)this.p.v()) || !ji.a((double)this.p.u(), this.a.dD(), (double)this.p.w()).a(this.a.du(), (double)this.a.dr()))) {
               this.a.I().a((double)this.p.u(), (double)this.p.v(), (double)this.p.w(), this.d);
            } else {
               this.p = null;
            }
         }
      }
   }
}
