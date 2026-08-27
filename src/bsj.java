import javax.annotation.Nullable;

public class bsj extends bsh {
   @Nullable
   private gu p;

   public bsj(bja $$0, cpm $$1) {
      super($$0, $$1);
   }

   @Override
   public eas a(gu $$0, int $$1) {
      this.p = $$0;
      return super.a($$0, $$1);
   }

   @Override
   public eas a(bii $$0, int $$1) {
      this.p = $$0.dk();
      return super.a($$0, $$1);
   }

   @Override
   public boolean a(bii $$0, double $$1) {
      eas $$2 = this.a($$0, 0);
      if ($$2 != null) {
         return this.a($$2, $$1);
      } else {
         this.p = $$0.dk();
         this.d = $$1;
         return true;
      }
   }

   @Override
   public void c() {
      if (!this.l()) {
         super.c();
      } else {
         if (this.p != null) {
            if (!this.p.a(this.a.di(), (double)this.a.df())
               && (!(this.a.dr() > (double)this.p.v()) || !gu.a((double)this.p.u(), this.a.dr(), (double)this.p.w()).a(this.a.di(), (double)this.a.df()))) {
               this.a.E().a((double)this.p.u(), (double)this.p.v(), (double)this.p.w(), this.d);
            } else {
               this.p = null;
            }
         }
      }
   }
}
