import javax.annotation.Nullable;

public class cfp extends bha {
   @Nullable
   private ddk c;

   public cfp() {
      super(27);
   }

   public void a(ddk $$0) {
      this.c = $$0;
   }

   public boolean b(ddk $$0) {
      return this.c == $$0;
   }

   @Override
   public void a(ra $$0) {
      for (int $$1 = 0; $$1 < this.b(); $$1++) {
         this.a($$1, cja.b);
      }

      for (int $$2 = 0; $$2 < $$0.size(); $$2++) {
         qu $$3 = $$0.a($$2);
         int $$4 = $$3.f("Slot") & 255;
         if ($$4 >= 0 && $$4 < this.b()) {
            this.a($$4, cja.a($$3));
         }
      }
   }

   @Override
   public ra g() {
      ra $$0 = new ra();

      for (int $$1 = 0; $$1 < this.b(); $$1++) {
         cja $$2 = this.a($$1);
         if (!$$2.b()) {
            qu $$3 = new qu();
            $$3.a("Slot", (byte)$$1);
            $$2.b($$3);
            $$0.add($$3);
         }
      }

      return $$0;
   }

   @Override
   public boolean a(cbp $$0) {
      return this.c != null && !this.c.c($$0) ? false : super.a($$0);
   }

   @Override
   public void d_(cbp $$0) {
      if (this.c != null) {
         this.c.a($$0);
      }

      super.d_($$0);
   }

   @Override
   public void c(cbp $$0) {
      if (this.c != null) {
         this.c.b($$0);
      }

      super.c($$0);
      this.c = null;
   }
}
