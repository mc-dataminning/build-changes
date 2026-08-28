import javax.annotation.Nullable;

public class cxe extends buy {
   @Nullable
   private dza b;

   public cxe() {
      super(27);
   }

   public void a(dza $$0) {
      this.b = $$0;
   }

   public boolean b(dza $$0) {
      return this.b == $$0;
   }

   @Override
   public void a(uf $$0, jh.a $$1) {
      for (int $$2 = 0; $$2 < this.b(); $$2++) {
         this.a($$2, czy.k);
      }

      for (int $$3 = 0; $$3 < $$0.size(); $$3++) {
         tz $$4 = $$0.b($$3);
         int $$5 = $$4.b("Slot", (byte)0) & 255;
         if ($$5 >= 0 && $$5 < this.b()) {
            this.a($$5, czy.a($$1, $$4).orElse(czy.k));
         }
      }
   }

   @Override
   public uf a(jh.a $$0) {
      uf $$1 = new uf();

      for (int $$2 = 0; $$2 < this.b(); $$2++) {
         czy $$3 = this.a($$2);
         if (!$$3.f()) {
            tz $$4 = new tz();
            $$4.a("Slot", (byte)$$2);
            $$1.add($$3.b($$0, $$4));
         }
      }

      return $$1;
   }

   @Override
   public boolean a(crx $$0) {
      return this.b != null && !this.b.c($$0) ? false : super.a($$0);
   }

   @Override
   public void c_(crx $$0) {
      if (this.b != null) {
         this.b.a($$0);
      }

      super.c_($$0);
   }

   @Override
   public void c(crx $$0) {
      if (this.b != null) {
         this.b.b($$0);
      }

      super.c($$0);
      this.b = null;
   }
}
