import javax.annotation.Nullable;

public class cfw extends bhh {
   @Nullable
   private ddr c;

   public cfw() {
      super(27);
   }

   public void a(ddr $$0) {
      this.c = $$0;
   }

   public boolean b(ddr $$0) {
      return this.c == $$0;
   }

   @Override
   public void a(re $$0) {
      for (int $$1 = 0; $$1 < this.b(); $$1++) {
         this.a($$1, cjh.b);
      }

      for (int $$2 = 0; $$2 < $$0.size(); $$2++) {
         qy $$3 = $$0.a($$2);
         int $$4 = $$3.f("Slot") & 255;
         if ($$4 >= 0 && $$4 < this.b()) {
            this.a($$4, cjh.a($$3));
         }
      }
   }

   @Override
   public re g() {
      re $$0 = new re();

      for (int $$1 = 0; $$1 < this.b(); $$1++) {
         cjh $$2 = this.a($$1);
         if (!$$2.b()) {
            qy $$3 = new qy();
            $$3.a("Slot", (byte)$$1);
            $$2.b($$3);
            $$0.add($$3);
         }
      }

      return $$0;
   }

   @Override
   public boolean a(cbw $$0) {
      return this.c != null && !this.c.c($$0) ? false : super.a($$0);
   }

   @Override
   public void d_(cbw $$0) {
      if (this.c != null) {
         this.c.a($$0);
      }

      super.d_($$0);
   }

   @Override
   public void c(cbw $$0) {
      if (this.c != null) {
         this.c.b($$0);
      }

      super.c($$0);
      this.c = null;
   }
}
