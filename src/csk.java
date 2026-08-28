import javax.annotation.Nullable;

public class csk extends brw {
   @Nullable
   private dso b;

   public csk() {
      super(27);
   }

   public void a(dso $$0) {
      this.b = $$0;
   }

   public boolean b(dso $$0) {
      return this.b == $$0;
   }

   @Override
   public void a(ul $$0, jp.a $$1) {
      for (int $$2 = 0; $$2 < this.b(); $$2++) {
         this.a($$2, cvp.k);
      }

      for (int $$3 = 0; $$3 < $$0.size(); $$3++) {
         uf $$4 = $$0.a($$3);
         int $$5 = $$4.f("Slot") & 255;
         if ($$5 >= 0 && $$5 < this.b()) {
            this.a($$5, cvp.a($$1, (vc)$$4).orElse(cvp.k));
         }
      }
   }

   @Override
   public ul a(jp.a $$0) {
      ul $$1 = new ul();

      for (int $$2 = 0; $$2 < this.b(); $$2++) {
         cvp $$3 = this.a($$2);
         if (!$$3.f()) {
            uf $$4 = new uf();
            $$4.a("Slot", (byte)$$2);
            $$1.add($$3.b($$0, $$4));
         }
      }

      return $$1;
   }

   @Override
   public boolean a(cnu $$0) {
      return this.b != null && !this.b.c($$0) ? false : super.a($$0);
   }

   @Override
   public void d_(cnu $$0) {
      if (this.b != null) {
         this.b.a($$0);
      }

      super.d_($$0);
   }

   @Override
   public void c(cnu $$0) {
      if (this.b != null) {
         this.b.b($$0);
      }

      super.c($$0);
      this.b = null;
   }
}
