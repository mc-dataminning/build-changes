import javax.annotation.Nullable;

public class crg extends brd {
   @Nullable
   private dqc b;

   public crg() {
      super(27);
   }

   public void a(dqc $$0) {
      this.b = $$0;
   }

   public boolean b(dqc $$0) {
      return this.b == $$0;
   }

   @Override
   public void a(uy $$0, jk.a $$1) {
      for (int $$2 = 0; $$2 < this.b(); $$2++) {
         this.a($$2, cup.l);
      }

      for (int $$3 = 0; $$3 < $$0.size(); $$3++) {
         us $$4 = $$0.a($$3);
         int $$5 = $$4.f("Slot") & 255;
         if ($$5 >= 0 && $$5 < this.b()) {
            this.a($$5, cup.a($$1, (vp)$$4).orElse(cup.l));
         }
      }
   }

   @Override
   public uy a(jk.a $$0) {
      uy $$1 = new uy();

      for (int $$2 = 0; $$2 < this.b(); $$2++) {
         cup $$3 = this.a($$2);
         if (!$$3.e()) {
            us $$4 = new us();
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
