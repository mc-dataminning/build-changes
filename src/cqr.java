import javax.annotation.Nullable;

public class cqr extends bqm {
   @Nullable
   private dqi b;

   public cqr() {
      super(27);
   }

   public void a(dqi $$0) {
      this.b = $$0;
   }

   public boolean b(dqi $$0) {
      return this.b == $$0;
   }

   @Override
   public void a(ud $$0, jl.a $$1) {
      for (int $$2 = 0; $$2 < this.b(); $$2++) {
         this.a($$2, cua.l);
      }

      for (int $$3 = 0; $$3 < $$0.size(); $$3++) {
         tx $$4 = $$0.a($$3);
         int $$5 = $$4.f("Slot") & 255;
         if ($$5 >= 0 && $$5 < this.b()) {
            this.a($$5, cua.a($$1, (uu)$$4).orElse(cua.l));
         }
      }
   }

   @Override
   public ud a(jl.a $$0) {
      ud $$1 = new ud();

      for (int $$2 = 0; $$2 < this.b(); $$2++) {
         cua $$3 = this.a($$2);
         if (!$$3.e()) {
            tx $$4 = new tx();
            $$4.a("Slot", (byte)$$2);
            $$1.add($$3.b($$0, $$4));
         }
      }

      return $$1;
   }

   @Override
   public boolean a(cmh $$0) {
      return this.b != null && !this.b.c($$0) ? false : super.a($$0);
   }

   @Override
   public void d_(cmh $$0) {
      if (this.b != null) {
         this.b.a($$0);
      }

      super.d_($$0);
   }

   @Override
   public void c(cmh $$0) {
      if (this.b != null) {
         this.b.b($$0);
      }

      super.c($$0);
      this.b = null;
   }
}
