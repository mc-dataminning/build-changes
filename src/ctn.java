import javax.annotation.Nullable;

public class ctn extends bsr {
   @Nullable
   private dtu b;

   public ctn() {
      super(27);
   }

   public void a(dtu $$0) {
      this.b = $$0;
   }

   public boolean b(dtu $$0) {
      return this.b == $$0;
   }

   @Override
   public void a(ur $$0, js.a $$1) {
      for (int $$2 = 0; $$2 < this.b(); $$2++) {
         this.a($$2, cwm.k);
      }

      for (int $$3 = 0; $$3 < $$0.size(); $$3++) {
         ul $$4 = $$0.a($$3);
         int $$5 = $$4.f("Slot") & 255;
         if ($$5 >= 0 && $$5 < this.b()) {
            this.a($$5, cwm.a($$1, (vi)$$4).orElse(cwm.k));
         }
      }
   }

   @Override
   public ur a(js.a $$0) {
      ur $$1 = new ur();

      for (int $$2 = 0; $$2 < this.b(); $$2++) {
         cwm $$3 = this.a($$2);
         if (!$$3.f()) {
            ul $$4 = new ul();
            $$4.a("Slot", (byte)$$2);
            $$1.add($$3.b($$0, $$4));
         }
      }

      return $$1;
   }

   @Override
   public boolean a(cou $$0) {
      return this.b != null && !this.b.c($$0) ? false : super.a($$0);
   }

   @Override
   public void c_(cou $$0) {
      if (this.b != null) {
         this.b.a($$0);
      }

      super.c_($$0);
   }

   @Override
   public void c(cou $$0) {
      if (this.b != null) {
         this.b.b($$0);
      }

      super.c($$0);
      this.b = null;
   }
}
