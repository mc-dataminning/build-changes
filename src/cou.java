import javax.annotation.Nullable;

public class cou extends boz {
   @Nullable
   private dny c;

   public cou() {
      super(27);
   }

   public void a(dny $$0) {
      this.c = $$0;
   }

   public boolean b(dny $$0) {
      return this.c == $$0;
   }

   @Override
   public void a(ue $$0, ix.a $$1) {
      for (int $$2 = 0; $$2 < this.b(); $$2++) {
         this.a($$2, csd.i);
      }

      for (int $$3 = 0; $$3 < $$0.size(); $$3++) {
         ty $$4 = $$0.a($$3);
         int $$5 = $$4.f("Slot") & 255;
         if ($$5 >= 0 && $$5 < this.b()) {
            this.a($$5, csd.a($$1, (uv)$$4).orElse(csd.i));
         }
      }
   }

   @Override
   public ue a(ix.a $$0) {
      ue $$1 = new ue();

      for (int $$2 = 0; $$2 < this.b(); $$2++) {
         csd $$3 = this.a($$2);
         if (!$$3.d()) {
            ty $$4 = new ty();
            $$4.a("Slot", (byte)$$2);
            $$1.add($$3.b($$0, $$4));
         }
      }

      return $$1;
   }

   @Override
   public boolean a(ckl $$0) {
      return this.c != null && !this.c.c($$0) ? false : super.a($$0);
   }

   @Override
   public void d_(ckl $$0) {
      if (this.c != null) {
         this.c.a($$0);
      }

      super.d_($$0);
   }

   @Override
   public void c(ckl $$0) {
      if (this.c != null) {
         this.c.b($$0);
      }

      super.c($$0);
      this.c = null;
   }
}
