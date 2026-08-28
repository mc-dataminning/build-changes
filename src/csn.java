import javax.annotation.Nullable;

public class csn extends brz {
   @Nullable
   private dsr b;

   public csn() {
      super(27);
   }

   public void a(dsr $$0) {
      this.b = $$0;
   }

   public boolean b(dsr $$0) {
      return this.b == $$0;
   }

   @Override
   public void a(um $$0, jq.a $$1) {
      for (int $$2 = 0; $$2 < this.b(); $$2++) {
         this.a($$2, cvs.k);
      }

      for (int $$3 = 0; $$3 < $$0.size(); $$3++) {
         ug $$4 = $$0.a($$3);
         int $$5 = $$4.f("Slot") & 255;
         if ($$5 >= 0 && $$5 < this.b()) {
            this.a($$5, cvs.a($$1, (vd)$$4).orElse(cvs.k));
         }
      }
   }

   @Override
   public um a(jq.a $$0) {
      um $$1 = new um();

      for (int $$2 = 0; $$2 < this.b(); $$2++) {
         cvs $$3 = this.a($$2);
         if (!$$3.f()) {
            ug $$4 = new ug();
            $$4.a("Slot", (byte)$$2);
            $$1.add($$3.b($$0, $$4));
         }
      }

      return $$1;
   }

   @Override
   public boolean a(cnx $$0) {
      return this.b != null && !this.b.c($$0) ? false : super.a($$0);
   }

   @Override
   public void d_(cnx $$0) {
      if (this.b != null) {
         this.b.a($$0);
      }

      super.d_($$0);
   }

   @Override
   public void c(cnx $$0) {
      if (this.b != null) {
         this.b.b($$0);
      }

      super.c($$0);
      this.b = null;
   }
}
