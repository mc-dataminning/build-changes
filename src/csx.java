import javax.annotation.Nullable;

public class csx extends bsf {
   @Nullable
   private dtc b;

   public csx() {
      super(27);
   }

   public void a(dtc $$0) {
      this.b = $$0;
   }

   public boolean b(dtc $$0) {
      return this.b == $$0;
   }

   @Override
   public void a(up $$0, jr.a $$1) {
      for (int $$2 = 0; $$2 < this.b(); $$2++) {
         this.a($$2, cvx.k);
      }

      for (int $$3 = 0; $$3 < $$0.size(); $$3++) {
         uj $$4 = $$0.a($$3);
         int $$5 = $$4.f("Slot") & 255;
         if ($$5 >= 0 && $$5 < this.b()) {
            this.a($$5, cvx.a($$1, (vg)$$4).orElse(cvx.k));
         }
      }
   }

   @Override
   public up a(jr.a $$0) {
      up $$1 = new up();

      for (int $$2 = 0; $$2 < this.b(); $$2++) {
         cvx $$3 = this.a($$2);
         if (!$$3.f()) {
            uj $$4 = new uj();
            $$4.a("Slot", (byte)$$2);
            $$1.add($$3.b($$0, $$4));
         }
      }

      return $$1;
   }

   @Override
   public boolean a(coh $$0) {
      return this.b != null && !this.b.c($$0) ? false : super.a($$0);
   }

   @Override
   public void d_(coh $$0) {
      if (this.b != null) {
         this.b.a($$0);
      }

      super.d_($$0);
   }

   @Override
   public void c(coh $$0) {
      if (this.b != null) {
         this.b.b($$0);
      }

      super.c($$0);
      this.b = null;
   }
}
