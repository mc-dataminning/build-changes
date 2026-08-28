import javax.annotation.Nullable;

public class cvb extends btx {
   @Nullable
   private dwj b;

   public cvb() {
      super(27);
   }

   public void a(dwj $$0) {
      this.b = $$0;
   }

   public boolean b(dwj $$0) {
      return this.b == $$0;
   }

   @Override
   public void a(uc $$0, ju.a $$1) {
      for (int $$2 = 0; $$2 < this.b(); $$2++) {
         this.a($$2, cxy.k);
      }

      for (int $$3 = 0; $$3 < $$0.size(); $$3++) {
         tw $$4 = $$0.a($$3);
         int $$5 = $$4.f("Slot") & 255;
         if ($$5 >= 0 && $$5 < this.b()) {
            this.a($$5, cxy.a($$1, (ut)$$4).orElse(cxy.k));
         }
      }
   }

   @Override
   public uc a(ju.a $$0) {
      uc $$1 = new uc();

      for (int $$2 = 0; $$2 < this.b(); $$2++) {
         cxy $$3 = this.a($$2);
         if (!$$3.f()) {
            tw $$4 = new tw();
            $$4.a("Slot", (byte)$$2);
            $$1.add($$3.b($$0, $$4));
         }
      }

      return $$1;
   }

   @Override
   public boolean a(cqi $$0) {
      return this.b != null && !this.b.c($$0) ? false : super.a($$0);
   }

   @Override
   public void c_(cqi $$0) {
      if (this.b != null) {
         this.b.a($$0);
      }

      super.c_($$0);
   }

   @Override
   public void c(cqi $$0) {
      if (this.b != null) {
         this.b.b($$0);
      }

      super.c($$0);
      this.b = null;
   }
}
