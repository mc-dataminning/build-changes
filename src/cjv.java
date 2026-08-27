import javax.annotation.Nullable;

public class cjv extends bkl {
   @Nullable
   private dhy c;

   public cjv() {
      super(27);
   }

   public void a(dhy $$0) {
      this.c = $$0;
   }

   public boolean b(dhy $$0) {
      return this.c == $$0;
   }

   @Override
   public void a(su $$0) {
      for (int $$1 = 0; $$1 < this.b(); $$1++) {
         this.a($$1, cng.f);
      }

      for (int $$2 = 0; $$2 < $$0.size(); $$2++) {
         so $$3 = $$0.a($$2);
         int $$4 = $$3.f("Slot") & 255;
         if ($$4 >= 0 && $$4 < this.b()) {
            this.a($$4, cng.a($$3));
         }
      }
   }

   @Override
   public su g() {
      su $$0 = new su();

      for (int $$1 = 0; $$1 < this.b(); $$1++) {
         cng $$2 = this.a($$1);
         if (!$$2.b()) {
            so $$3 = new so();
            $$3.a("Slot", (byte)$$1);
            $$2.b($$3);
            $$0.add($$3);
         }
      }

      return $$0;
   }

   @Override
   public boolean a(cfq $$0) {
      return this.c != null && !this.c.c($$0) ? false : super.a($$0);
   }

   @Override
   public void d_(cfq $$0) {
      if (this.c != null) {
         this.c.a($$0);
      }

      super.d_($$0);
   }

   @Override
   public void c(cfq $$0) {
      if (this.c != null) {
         this.c.b($$0);
      }

      super.c($$0);
      this.c = null;
   }
}
