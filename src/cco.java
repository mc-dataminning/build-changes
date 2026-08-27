import javax.annotation.Nullable;

public class cco extends bee {
   @Nullable
   private dah c;

   public cco() {
      super(27);
   }

   public void a(dah $$0) {
      this.c = $$0;
   }

   public boolean b(dah $$0) {
      return this.c == $$0;
   }

   @Override
   public void a(qx $$0) {
      for (int $$1 = 0; $$1 < this.b(); $$1++) {
         this.a($$1, cfz.b);
      }

      for (int $$2 = 0; $$2 < $$0.size(); $$2++) {
         qr $$3 = $$0.a($$2);
         int $$4 = $$3.f("Slot") & 255;
         if ($$4 >= 0 && $$4 < this.b()) {
            this.a($$4, cfz.a($$3));
         }
      }
   }

   @Override
   public qx g() {
      qx $$0 = new qx();

      for (int $$1 = 0; $$1 < this.b(); $$1++) {
         cfz $$2 = this.a($$1);
         if (!$$2.b()) {
            qr $$3 = new qr();
            $$3.a("Slot", (byte)$$1);
            $$2.b($$3);
            $$0.add($$3);
         }
      }

      return $$0;
   }

   @Override
   public boolean a(byo $$0) {
      return this.c != null && !this.c.c($$0) ? false : super.a($$0);
   }

   @Override
   public void d_(byo $$0) {
      if (this.c != null) {
         this.c.a($$0);
      }

      super.d_($$0);
   }

   @Override
   public void c(byo $$0) {
      if (this.c != null) {
         this.c.b($$0);
      }

      super.c($$0);
      this.c = null;
   }
}
