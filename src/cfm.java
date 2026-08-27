import javax.annotation.Nullable;

public class cfm extends bgx {
   @Nullable
   private ddf c;

   public cfm() {
      super(27);
   }

   public void a(ddf $$0) {
      this.c = $$0;
   }

   public boolean b(ddf $$0) {
      return this.c == $$0;
   }

   @Override
   public void a(qx $$0) {
      for (int $$1 = 0; $$1 < this.b(); $$1++) {
         this.a($$1, cix.b);
      }

      for (int $$2 = 0; $$2 < $$0.size(); $$2++) {
         qr $$3 = $$0.a($$2);
         int $$4 = $$3.f("Slot") & 255;
         if ($$4 >= 0 && $$4 < this.b()) {
            this.a($$4, cix.a($$3));
         }
      }
   }

   @Override
   public qx g() {
      qx $$0 = new qx();

      for (int $$1 = 0; $$1 < this.b(); $$1++) {
         cix $$2 = this.a($$1);
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
   public boolean a(cbm $$0) {
      return this.c != null && !this.c.c($$0) ? false : super.a($$0);
   }

   @Override
   public void d_(cbm $$0) {
      if (this.c != null) {
         this.c.a($$0);
      }

      super.d_($$0);
   }

   @Override
   public void c(cbm $$0) {
      if (this.c != null) {
         this.c.b($$0);
      }

      super.c($$0);
      this.c = null;
   }
}
