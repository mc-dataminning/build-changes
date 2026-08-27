import javax.annotation.Nullable;

public class cgy extends bii {
   @Nullable
   private der c;

   public cgy() {
      super(27);
   }

   public void a(der $$0) {
      this.c = $$0;
   }

   public boolean b(der $$0) {
      return this.c == $$0;
   }

   @Override
   public void a(rz $$0) {
      for (int $$1 = 0; $$1 < this.b(); $$1++) {
         this.a($$1, ckj.b);
      }

      for (int $$2 = 0; $$2 < $$0.size(); $$2++) {
         rt $$3 = $$0.a($$2);
         int $$4 = $$3.f("Slot") & 255;
         if ($$4 >= 0 && $$4 < this.b()) {
            this.a($$4, ckj.a($$3));
         }
      }
   }

   @Override
   public rz g() {
      rz $$0 = new rz();

      for (int $$1 = 0; $$1 < this.b(); $$1++) {
         ckj $$2 = this.a($$1);
         if (!$$2.b()) {
            rt $$3 = new rt();
            $$3.a("Slot", (byte)$$1);
            $$2.b($$3);
            $$0.add($$3);
         }
      }

      return $$0;
   }

   @Override
   public boolean a(ccx $$0) {
      return this.c != null && !this.c.c($$0) ? false : super.a($$0);
   }

   @Override
   public void d_(ccx $$0) {
      if (this.c != null) {
         this.c.a($$0);
      }

      super.d_($$0);
   }

   @Override
   public void c(ccx $$0) {
      if (this.c != null) {
         this.c.b($$0);
      }

      super.c($$0);
      this.c = null;
   }
}
