import javax.annotation.Nullable;

public class crh extends bra {
   @Nullable
   private drd b;

   public crh() {
      super(27);
   }

   public void a(drd $$0) {
      this.b = $$0;
   }

   public boolean b(drd $$0) {
      return this.b == $$0;
   }

   @Override
   public void a(uh $$0, jo.a $$1) {
      for (int $$2 = 0; $$2 < this.b(); $$2++) {
         this.a($$2, cuq.l);
      }

      for (int $$3 = 0; $$3 < $$0.size(); $$3++) {
         ub $$4 = $$0.a($$3);
         int $$5 = $$4.f("Slot") & 255;
         if ($$5 >= 0 && $$5 < this.b()) {
            this.a($$5, cuq.a($$1, (uy)$$4).orElse(cuq.l));
         }
      }
   }

   @Override
   public uh a(jo.a $$0) {
      uh $$1 = new uh();

      for (int $$2 = 0; $$2 < this.b(); $$2++) {
         cuq $$3 = this.a($$2);
         if (!$$3.e()) {
            ub $$4 = new ub();
            $$4.a("Slot", (byte)$$2);
            $$1.add($$3.b($$0, $$4));
         }
      }

      return $$1;
   }

   @Override
   public boolean a(cmx $$0) {
      return this.b != null && !this.b.c($$0) ? false : super.a($$0);
   }

   @Override
   public void d_(cmx $$0) {
      if (this.b != null) {
         this.b.a($$0);
      }

      super.d_($$0);
   }

   @Override
   public void c(cmx $$0) {
      if (this.b != null) {
         this.b.b($$0);
      }

      super.c($$0);
      this.b = null;
   }
}
