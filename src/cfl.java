import javax.annotation.Nullable;

public class cfl extends bgv {
   @Nullable
   private dde c;

   public cfl() {
      super(27);
   }

   public void a(dde $$0) {
      this.c = $$0;
   }

   public boolean b(dde $$0) {
      return this.c == $$0;
   }

   @Override
   public void a(qy $$0) {
      for (int $$1 = 0; $$1 < this.b(); $$1++) {
         this.a($$1, ciw.b);
      }

      for (int $$2 = 0; $$2 < $$0.size(); $$2++) {
         qs $$3 = $$0.a($$2);
         int $$4 = $$3.f("Slot") & 255;
         if ($$4 >= 0 && $$4 < this.b()) {
            this.a($$4, ciw.a($$3));
         }
      }
   }

   @Override
   public qy g() {
      qy $$0 = new qy();

      for (int $$1 = 0; $$1 < this.b(); $$1++) {
         ciw $$2 = this.a($$1);
         if (!$$2.b()) {
            qs $$3 = new qs();
            $$3.a("Slot", (byte)$$1);
            $$2.b($$3);
            $$0.add($$3);
         }
      }

      return $$0;
   }

   @Override
   public boolean a(cbl $$0) {
      return this.c != null && !this.c.c($$0) ? false : super.a($$0);
   }

   @Override
   public void d_(cbl $$0) {
      if (this.c != null) {
         this.c.a($$0);
      }

      super.d_($$0);
   }

   @Override
   public void c(cbl $$0) {
      if (this.c != null) {
         this.c.b($$0);
      }

      super.c($$0);
      this.c = null;
   }
}
