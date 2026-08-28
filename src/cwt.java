import javax.annotation.Nullable;

public class cwt extends bun {
   @Nullable
   private dyp b;

   public cwt() {
      super(27);
   }

   public void a(dyp $$0) {
      this.b = $$0;
   }

   public boolean b(dyp $$0) {
      return this.b == $$0;
   }

   @Override
   public void a(uf $$0, jh.a $$1) {
      for (int $$2 = 0; $$2 < this.b(); $$2++) {
         this.a($$2, czn.k);
      }

      for (int $$3 = 0; $$3 < $$0.size(); $$3++) {
         tz $$4 = $$0.a($$3);
         int $$5 = $$4.d("Slot") & 255;
         if ($$5 >= 0 && $$5 < this.b()) {
            this.a($$5, czn.a($$1, $$4).orElse(czn.k));
         }
      }
   }

   @Override
   public uf a(jh.a $$0) {
      uf $$1 = new uf();

      for (int $$2 = 0; $$2 < this.b(); $$2++) {
         czn $$3 = this.a($$2);
         if (!$$3.f()) {
            tz $$4 = new tz();
            $$4.a("Slot", (byte)$$2);
            $$1.add($$3.b($$0, $$4));
         }
      }

      return $$1;
   }

   @Override
   public boolean a(crm $$0) {
      return this.b != null && !this.b.c($$0) ? false : super.a($$0);
   }

   @Override
   public void c_(crm $$0) {
      if (this.b != null) {
         this.b.a($$0);
      }

      super.c_($$0);
   }

   @Override
   public void c(crm $$0) {
      if (this.b != null) {
         this.b.b($$0);
      }

      super.c($$0);
      this.b = null;
   }
}
