import javax.annotation.Nullable;

public class cjn extends bkj {
   @Nullable
   private dhq c;

   public cjn() {
      super(27);
   }

   public void a(dhq $$0) {
      this.c = $$0;
   }

   public boolean b(dhq $$0) {
      return this.c == $$0;
   }

   @Override
   public void a(st $$0) {
      for (int $$1 = 0; $$1 < this.b(); $$1++) {
         this.a($$1, cmy.f);
      }

      for (int $$2 = 0; $$2 < $$0.size(); $$2++) {
         sn $$3 = $$0.a($$2);
         int $$4 = $$3.f("Slot") & 255;
         if ($$4 >= 0 && $$4 < this.b()) {
            this.a($$4, cmy.a($$3));
         }
      }
   }

   @Override
   public st g() {
      st $$0 = new st();

      for (int $$1 = 0; $$1 < this.b(); $$1++) {
         cmy $$2 = this.a($$1);
         if (!$$2.b()) {
            sn $$3 = new sn();
            $$3.a("Slot", (byte)$$1);
            $$2.b($$3);
            $$0.add($$3);
         }
      }

      return $$0;
   }

   @Override
   public boolean a(cfi $$0) {
      return this.c != null && !this.c.c($$0) ? false : super.a($$0);
   }

   @Override
   public void d_(cfi $$0) {
      if (this.c != null) {
         this.c.a($$0);
      }

      super.d_($$0);
   }

   @Override
   public void c(cfi $$0) {
      if (this.c != null) {
         this.c.b($$0);
      }

      super.c($$0);
      this.c = null;
   }
}
