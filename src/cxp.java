import javax.annotation.Nullable;

public class cxp extends bvj {
   @Nullable
   private dzm b;

   public cxp() {
      super(27);
   }

   public void a(dzm $$0) {
      this.b = $$0;
   }

   public boolean b(dzm $$0) {
      return this.b == $$0;
   }

   @Override
   public void a(ug $$0, ji.a $$1) {
      for (int $$2 = 0; $$2 < this.b(); $$2++) {
         this.a($$2, dak.l);
      }

      for (int $$3 = 0; $$3 < $$0.size(); $$3++) {
         ua $$4 = $$0.b($$3);
         int $$5 = $$4.b("Slot", (byte)0) & 255;
         if ($$5 >= 0 && $$5 < this.b()) {
            this.a($$5, dak.a($$1, $$4).orElse(dak.l));
         }
      }
   }

   @Override
   public ug a(ji.a $$0) {
      ug $$1 = new ug();

      for (int $$2 = 0; $$2 < this.b(); $$2++) {
         dak $$3 = this.a($$2);
         if (!$$3.f()) {
            ua $$4 = new ua();
            $$4.a("Slot", (byte)$$2);
            $$1.add($$3.b($$0, $$4));
         }
      }

      return $$1;
   }

   @Override
   public boolean a(csi $$0) {
      return this.b != null && !this.b.c($$0) ? false : super.a($$0);
   }

   @Override
   public void c_(csi $$0) {
      if (this.b != null) {
         this.b.a($$0);
      }

      super.c_($$0);
   }

   @Override
   public void c(csi $$0) {
      if (this.b != null) {
         this.b.b($$0);
      }

      super.c($$0);
      this.b = null;
   }
}
