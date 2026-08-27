import javax.annotation.Nullable;

public class cln extends bmd {
   @Nullable
   private djo c;

   public cln() {
      super(27);
   }

   public void a(djo $$0) {
      this.c = $$0;
   }

   public boolean b(djo $$0) {
      return this.c == $$0;
   }

   @Override
   public void a(tc $$0) {
      for (int $$1 = 0; $$1 < this.b(); $$1++) {
         this.a($$1, coz.h);
      }

      for (int $$2 = 0; $$2 < $$0.size(); $$2++) {
         sw $$3 = $$0.a($$2);
         int $$4 = $$3.f("Slot") & 255;
         if ($$4 >= 0 && $$4 < this.b()) {
            this.a($$4, coz.a($$3));
         }
      }
   }

   @Override
   public tc g() {
      tc $$0 = new tc();

      for (int $$1 = 0; $$1 < this.b(); $$1++) {
         coz $$2 = this.a($$1);
         if (!$$2.b()) {
            sw $$3 = new sw();
            $$3.a("Slot", (byte)$$1);
            $$2.b($$3);
            $$0.add($$3);
         }
      }

      return $$0;
   }

   @Override
   public boolean a(chh $$0) {
      return this.c != null && !this.c.c($$0) ? false : super.a($$0);
   }

   @Override
   public void d_(chh $$0) {
      if (this.c != null) {
         this.c.a($$0);
      }

      super.d_($$0);
   }

   @Override
   public void c(chh $$0) {
      if (this.c != null) {
         this.c.b($$0);
      }

      super.c($$0);
      this.c = null;
   }
}
