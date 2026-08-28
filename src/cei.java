import javax.annotation.Nullable;

public class cei extends ceg {
   @Nullable
   private jg p;

   public cei(bux $$0, dev $$1) {
      super($$0, $$1);
   }

   @Override
   public ers a(jg $$0, int $$1) {
      this.p = $$0;
      return super.a($$0, $$1);
   }

   @Override
   public ers a(btz $$0, int $$1) {
      this.p = $$0.dx();
      return super.a($$0, $$1);
   }

   @Override
   public boolean a(btz $$0, double $$1) {
      ers $$2 = this.a($$0, 0);
      if ($$2 != null) {
         return this.a($$2, $$1);
      } else {
         this.p = $$0.dx();
         this.d = $$1;
         return true;
      }
   }

   @Override
   public void c() {
      if (!this.m()) {
         super.c();
      } else {
         if (this.p != null) {
            if (!this.p.a(this.a.dv(), (double)this.a.ds())
               && (!(this.a.dE() > (double)this.p.v()) || !jg.a((double)this.p.u(), this.a.dE(), (double)this.p.w()).a(this.a.dv(), (double)this.a.ds()))) {
               this.a.M().a((double)this.p.u(), (double)this.p.v(), (double)this.p.w(), this.d);
            } else {
               this.p = null;
            }
         }
      }
   }
}
