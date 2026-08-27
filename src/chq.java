import javax.annotation.Nullable;

public class chq extends bix {
   @Nullable
   private dfm c;

   public chq() {
      super(27);
   }

   public void a(dfm $$0) {
      this.c = $$0;
   }

   public boolean b(dfm $$0) {
      return this.c == $$0;
   }

   @Override
   public void a(sf $$0) {
      for (int $$1 = 0; $$1 < this.b(); $$1++) {
         this.a($$1, clb.b);
      }

      for (int $$2 = 0; $$2 < $$0.size(); $$2++) {
         rz $$3 = $$0.a($$2);
         int $$4 = $$3.f("Slot") & 255;
         if ($$4 >= 0 && $$4 < this.b()) {
            this.a($$4, clb.a($$3));
         }
      }
   }

   @Override
   public sf g() {
      sf $$0 = new sf();

      for (int $$1 = 0; $$1 < this.b(); $$1++) {
         clb $$2 = this.a($$1);
         if (!$$2.b()) {
            rz $$3 = new rz();
            $$3.a("Slot", (byte)$$1);
            $$2.b($$3);
            $$0.add($$3);
         }
      }

      return $$0;
   }

   @Override
   public boolean a(cdm $$0) {
      return this.c != null && !this.c.c($$0) ? false : super.a($$0);
   }

   @Override
   public void d_(cdm $$0) {
      if (this.c != null) {
         this.c.a($$0);
      }

      super.d_($$0);
   }

   @Override
   public void c(cdm $$0) {
      if (this.c != null) {
         this.c.b($$0);
      }

      super.c($$0);
      this.c = null;
   }
}
