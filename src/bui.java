import javax.annotation.Nullable;

public class bui extends bug {
   @Nullable
   private ht p;

   public bui(bla $$0, crs $$1) {
      super($$0, $$1);
   }

   @Override
   public ecv a(ht $$0, int $$1) {
      this.p = $$0;
      return super.a($$0, $$1);
   }

   @Override
   public ecv a(bki $$0, int $$1) {
      this.p = $$0.dl();
      return super.a($$0, $$1);
   }

   @Override
   public boolean a(bki $$0, double $$1) {
      ecv $$2 = this.a($$0, 0);
      if ($$2 != null) {
         return this.a($$2, $$1);
      } else {
         this.p = $$0.dl();
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
            if (!this.p.a(this.a.dj(), (double)this.a.df())
               && (!(this.a.ds() > (double)this.p.v()) || !ht.a((double)this.p.u(), this.a.ds(), (double)this.p.w()).a(this.a.dj(), (double)this.a.df()))) {
               this.a.I().a((double)this.p.u(), (double)this.p.v(), (double)this.p.w(), this.d);
            } else {
               this.p = null;
            }
         }
      }
   }
}
