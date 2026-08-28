import javax.annotation.Nullable;

public class cer extends cep {
   @Nullable
   private jh p;

   public cer(bvg $$0, dff $$1) {
      super($$0, $$1);
   }

   @Override
   public esc a(jh $$0, int $$1) {
      this.p = $$0;
      return super.a($$0, $$1);
   }

   @Override
   public esc a(bui $$0, int $$1) {
      this.p = $$0.dy();
      return super.a($$0, $$1);
   }

   @Override
   public boolean a(bui $$0, double $$1) {
      esc $$2 = this.a($$0, 0);
      if ($$2 != null) {
         return this.a($$2, $$1);
      } else {
         this.p = $$0.dy();
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
            if (!this.p.a(this.a.dw(), (double)this.a.dt())
               && (!(this.a.dF() > (double)this.p.v()) || !jh.a((double)this.p.u(), this.a.dF(), (double)this.p.w()).a(this.a.dw(), (double)this.a.dt()))) {
               this.a.M().a((double)this.p.u(), (double)this.p.v(), (double)this.p.w(), this.d);
            } else {
               this.p = null;
            }
         }
      }
   }
}
