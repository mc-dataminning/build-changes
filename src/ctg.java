import javax.annotation.Nullable;

public class ctg extends bso {
   @Nullable
   private dtn b;

   public ctg() {
      super(27);
   }

   public void a(dtn $$0) {
      this.b = $$0;
   }

   public boolean b(dtn $$0) {
      return this.b == $$0;
   }

   @Override
   public void a(ut $$0, js.a $$1) {
      for (int $$2 = 0; $$2 < this.b(); $$2++) {
         this.a($$2, cwf.k);
      }

      for (int $$3 = 0; $$3 < $$0.size(); $$3++) {
         un $$4 = $$0.a($$3);
         int $$5 = $$4.f("Slot") & 255;
         if ($$5 >= 0 && $$5 < this.b()) {
            this.a($$5, cwf.a($$1, (vk)$$4).orElse(cwf.k));
         }
      }
   }

   @Override
   public ut a(js.a $$0) {
      ut $$1 = new ut();

      for (int $$2 = 0; $$2 < this.b(); $$2++) {
         cwf $$3 = this.a($$2);
         if (!$$3.f()) {
            un $$4 = new un();
            $$4.a("Slot", (byte)$$2);
            $$1.add($$3.b($$0, $$4));
         }
      }

      return $$1;
   }

   @Override
   public boolean a(cor $$0) {
      return this.b != null && !this.b.c($$0) ? false : super.a($$0);
   }

   @Override
   public void d_(cor $$0) {
      if (this.b != null) {
         this.b.a($$0);
      }

      super.d_($$0);
   }

   @Override
   public void c(cor $$0) {
      if (this.b != null) {
         this.b.b($$0);
      }

      super.c($$0);
      this.b = null;
   }
}
