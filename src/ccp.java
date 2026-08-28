import javax.annotation.Nullable;

public class ccp extends ccn {
   @Nullable
   private ja p;

   public ccp(bte $$0, dcg $$1) {
      super($$0, $$1);
   }

   @Override
   public eox a(ja $$0, int $$1) {
      this.p = $$0;
      return super.a($$0, $$1);
   }

   @Override
   public eox a(bsh $$0, int $$1) {
      this.p = $$0.dr();
      return super.a($$0, $$1);
   }

   @Override
   public boolean a(bsh $$0, double $$1) {
      eox $$2 = this.a($$0, 0);
      if ($$2 != null) {
         return this.a($$2, $$1);
      } else {
         this.p = $$0.dr();
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
            if (!this.p.a(this.a.dp(), (double)this.a.dl())
               && (!(this.a.dy() > (double)this.p.v()) || !ja.a((double)this.p.u(), this.a.dy(), (double)this.p.w()).a(this.a.dp(), (double)this.a.dl()))) {
               this.a.H().a((double)this.p.u(), (double)this.p.v(), (double)this.p.w(), this.d);
            } else {
               this.p = null;
            }
         }
      }
   }
}
