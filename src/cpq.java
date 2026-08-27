import javax.annotation.Nullable;

public class cpq extends bpv {
   @Nullable
   private doh b;

   public cpq() {
      super(27);
   }

   public void a(doh $$0) {
      this.b = $$0;
   }

   public boolean b(doh $$0) {
      return this.b == $$0;
   }

   @Override
   public void a(ug $$0, iy.a $$1) {
      for (int $$2 = 0; $$2 < this.b(); $$2++) {
         this.a($$2, csz.i);
      }

      for (int $$3 = 0; $$3 < $$0.size(); $$3++) {
         ua $$4 = $$0.a($$3);
         int $$5 = $$4.f("Slot") & 255;
         if ($$5 >= 0 && $$5 < this.b()) {
            this.a($$5, csz.a($$1, (ux)$$4).orElse(csz.i));
         }
      }
   }

   @Override
   public ug a(iy.a $$0) {
      ug $$1 = new ug();

      for (int $$2 = 0; $$2 < this.b(); $$2++) {
         csz $$3 = this.a($$2);
         if (!$$3.d()) {
            ua $$4 = new ua();
            $$4.a("Slot", (byte)$$2);
            $$1.add($$3.b($$0, $$4));
         }
      }

      return $$1;
   }

   @Override
   public boolean a(clh $$0) {
      return this.b != null && !this.b.c($$0) ? false : super.a($$0);
   }

   @Override
   public void d_(clh $$0) {
      if (this.b != null) {
         this.b.a($$0);
      }

      super.d_($$0);
   }

   @Override
   public void c(clh $$0) {
      if (this.b != null) {
         this.b.b($$0);
      }

      super.c($$0);
      this.b = null;
   }
}
