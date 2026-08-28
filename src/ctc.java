import javax.annotation.Nullable;

public class ctc extends bsk {
   @Nullable
   private dti b;

   public ctc() {
      super(27);
   }

   public void a(dti $$0) {
      this.b = $$0;
   }

   public boolean b(dti $$0) {
      return this.b == $$0;
   }

   @Override
   public void a(uq $$0, js.a $$1) {
      for (int $$2 = 0; $$2 < this.b(); $$2++) {
         this.a($$2, cwb.k);
      }

      for (int $$3 = 0; $$3 < $$0.size(); $$3++) {
         uk $$4 = $$0.a($$3);
         int $$5 = $$4.f("Slot") & 255;
         if ($$5 >= 0 && $$5 < this.b()) {
            this.a($$5, cwb.a($$1, (vh)$$4).orElse(cwb.k));
         }
      }
   }

   @Override
   public uq a(js.a $$0) {
      uq $$1 = new uq();

      for (int $$2 = 0; $$2 < this.b(); $$2++) {
         cwb $$3 = this.a($$2);
         if (!$$3.f()) {
            uk $$4 = new uk();
            $$4.a("Slot", (byte)$$2);
            $$1.add($$3.b($$0, $$4));
         }
      }

      return $$1;
   }

   @Override
   public boolean a(com $$0) {
      return this.b != null && !this.b.c($$0) ? false : super.a($$0);
   }

   @Override
   public void d_(com $$0) {
      if (this.b != null) {
         this.b.a($$0);
      }

      super.d_($$0);
   }

   @Override
   public void c(com $$0) {
      if (this.b != null) {
         this.b.b($$0);
      }

      super.c($$0);
      this.b = null;
   }
}
