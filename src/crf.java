import javax.annotation.Nullable;

public class crf extends bqz {
   @Nullable
   private drb b;

   public crf() {
      super(27);
   }

   public void a(drb $$0) {
      this.b = $$0;
   }

   public boolean b(drb $$0) {
      return this.b == $$0;
   }

   @Override
   public void a(ug $$0, jo.a $$1) {
      for (int $$2 = 0; $$2 < this.b(); $$2++) {
         this.a($$2, cuo.l);
      }

      for (int $$3 = 0; $$3 < $$0.size(); $$3++) {
         ua $$4 = $$0.a($$3);
         int $$5 = $$4.f("Slot") & 255;
         if ($$5 >= 0 && $$5 < this.b()) {
            this.a($$5, cuo.a($$1, (ux)$$4).orElse(cuo.l));
         }
      }
   }

   @Override
   public ug a(jo.a $$0) {
      ug $$1 = new ug();

      for (int $$2 = 0; $$2 < this.b(); $$2++) {
         cuo $$3 = this.a($$2);
         if (!$$3.e()) {
            ua $$4 = new ua();
            $$4.a("Slot", (byte)$$2);
            $$1.add($$3.b($$0, $$4));
         }
      }

      return $$1;
   }

   @Override
   public boolean a(cmv $$0) {
      return this.b != null && !this.b.c($$0) ? false : super.a($$0);
   }

   @Override
   public void d_(cmv $$0) {
      if (this.b != null) {
         this.b.a($$0);
      }

      super.d_($$0);
   }

   @Override
   public void c(cmv $$0) {
      if (this.b != null) {
         this.b.b($$0);
      }

      super.c($$0);
      this.b = null;
   }
}
