import javax.annotation.Nullable;

public class cxg extends bva {
   @Nullable
   private dzc b;

   public cxg() {
      super(27);
   }

   public void a(dzc $$0) {
      this.b = $$0;
   }

   public boolean b(dzc $$0) {
      return this.b == $$0;
   }

   @Override
   public void a(ug $$0, ji.a $$1) {
      for (int $$2 = 0; $$2 < this.b(); $$2++) {
         this.a($$2, daa.k);
      }

      for (int $$3 = 0; $$3 < $$0.size(); $$3++) {
         ua $$4 = $$0.b($$3);
         int $$5 = $$4.b("Slot", (byte)0) & 255;
         if ($$5 >= 0 && $$5 < this.b()) {
            this.a($$5, daa.a($$1, $$4).orElse(daa.k));
         }
      }
   }

   @Override
   public ug a(ji.a $$0) {
      ug $$1 = new ug();

      for (int $$2 = 0; $$2 < this.b(); $$2++) {
         daa $$3 = this.a($$2);
         if (!$$3.f()) {
            ua $$4 = new ua();
            $$4.a("Slot", (byte)$$2);
            $$1.add($$3.b($$0, $$4));
         }
      }

      return $$1;
   }

   @Override
   public boolean a(crz $$0) {
      return this.b != null && !this.b.c($$0) ? false : super.a($$0);
   }

   @Override
   public void c_(crz $$0) {
      if (this.b != null) {
         this.b.a($$0);
      }

      super.c_($$0);
   }

   @Override
   public void c(crz $$0) {
      if (this.b != null) {
         this.b.b($$0);
      }

      super.c($$0);
      this.b = null;
   }
}
