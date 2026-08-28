import javax.annotation.Nullable;

public class crf extends brc {
   @Nullable
   private dqb b;

   public crf() {
      super(27);
   }

   public void a(dqb $$0) {
      this.b = $$0;
   }

   public boolean b(dqb $$0) {
      return this.b == $$0;
   }

   @Override
   public void a(ux $$0, jk.a $$1) {
      for (int $$2 = 0; $$2 < this.b(); $$2++) {
         this.a($$2, cuo.l);
      }

      for (int $$3 = 0; $$3 < $$0.size(); $$3++) {
         ur $$4 = $$0.a($$3);
         int $$5 = $$4.f("Slot") & 255;
         if ($$5 >= 0 && $$5 < this.b()) {
            this.a($$5, cuo.a($$1, (vo)$$4).orElse(cuo.l));
         }
      }
   }

   @Override
   public ux a(jk.a $$0) {
      ux $$1 = new ux();

      for (int $$2 = 0; $$2 < this.b(); $$2++) {
         cuo $$3 = this.a($$2);
         if (!$$3.e()) {
            ur $$4 = new ur();
            $$4.a("Slot", (byte)$$2);
            $$1.add($$3.b($$0, $$4));
         }
      }

      return $$1;
   }

   @Override
   public boolean a(cmw $$0) {
      return this.b != null && !this.b.c($$0) ? false : super.a($$0);
   }

   @Override
   public void d_(cmw $$0) {
      if (this.b != null) {
         this.b.a($$0);
      }

      super.d_($$0);
   }

   @Override
   public void c(cmw $$0) {
      if (this.b != null) {
         this.b.b($$0);
      }

      super.c($$0);
      this.b = null;
   }
}
