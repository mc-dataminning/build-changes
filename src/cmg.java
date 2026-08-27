import javax.annotation.Nullable;

public class cmg extends bmu {
   @Nullable
   private dkg c;

   public cmg() {
      super(27);
   }

   public void a(dkg $$0) {
      this.c = $$0;
   }

   public boolean b(dkg $$0) {
      return this.c == $$0;
   }

   @Override
   public void a(te $$0) {
      for (int $$1 = 0; $$1 < this.b(); $$1++) {
         this.a($$1, cpq.h);
      }

      for (int $$2 = 0; $$2 < $$0.size(); $$2++) {
         sy $$3 = $$0.a($$2);
         int $$4 = $$3.f("Slot") & 255;
         if ($$4 >= 0 && $$4 < this.b()) {
            this.a($$4, cpq.a($$3));
         }
      }
   }

   @Override
   public te g() {
      te $$0 = new te();

      for (int $$1 = 0; $$1 < this.b(); $$1++) {
         cpq $$2 = this.a($$1);
         if (!$$2.b()) {
            sy $$3 = new sy();
            $$3.a("Slot", (byte)$$1);
            $$2.b($$3);
            $$0.add($$3);
         }
      }

      return $$0;
   }

   @Override
   public boolean a(cia $$0) {
      return this.c != null && !this.c.c($$0) ? false : super.a($$0);
   }

   @Override
   public void d_(cia $$0) {
      if (this.c != null) {
         this.c.a($$0);
      }

      super.d_($$0);
   }

   @Override
   public void c(cia $$0) {
      if (this.c != null) {
         this.c.b($$0);
      }

      super.c($$0);
      this.c = null;
   }
}
