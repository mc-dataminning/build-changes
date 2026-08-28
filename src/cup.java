import javax.annotation.Nullable;

public class cup extends btp {
   @Nullable
   private dvt b;

   public cup() {
      super(27);
   }

   public void a(dvt $$0) {
      this.b = $$0;
   }

   public boolean b(dvt $$0) {
      return this.b == $$0;
   }

   @Override
   public void a(vd $$0, js.a $$1) {
      for (int $$2 = 0; $$2 < this.b(); $$2++) {
         this.a($$2, cxo.j);
      }

      for (int $$3 = 0; $$3 < $$0.size(); $$3++) {
         ux $$4 = $$0.a($$3);
         int $$5 = $$4.f("Slot") & 255;
         if ($$5 >= 0 && $$5 < this.b()) {
            this.a($$5, cxo.a($$1, (vu)$$4).orElse(cxo.j));
         }
      }
   }

   @Override
   public vd a(js.a $$0) {
      vd $$1 = new vd();

      for (int $$2 = 0; $$2 < this.b(); $$2++) {
         cxo $$3 = this.a($$2);
         if (!$$3.f()) {
            ux $$4 = new ux();
            $$4.a("Slot", (byte)$$2);
            $$1.add($$3.b($$0, $$4));
         }
      }

      return $$1;
   }

   @Override
   public boolean a(cpw $$0) {
      return this.b != null && !this.b.c($$0) ? false : super.a($$0);
   }

   @Override
   public void c_(cpw $$0) {
      if (this.b != null) {
         this.b.a($$0);
      }

      super.c_($$0);
   }

   @Override
   public void c(cpw $$0) {
      if (this.b != null) {
         this.b.b($$0);
      }

      super.c($$0);
      this.b = null;
   }
}
