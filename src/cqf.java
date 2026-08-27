import javax.annotation.Nullable;

public class cqf extends bqd {
   @Nullable
   private dpb b;

   public cqf() {
      super(27);
   }

   public void a(dpb $$0) {
      this.b = $$0;
   }

   public boolean b(dpb $$0) {
      return this.b == $$0;
   }

   @Override
   public void a(uj $$0, iz.a $$1) {
      for (int $$2 = 0; $$2 < this.b(); $$2++) {
         this.a($$2, cto.i);
      }

      for (int $$3 = 0; $$3 < $$0.size(); $$3++) {
         ud $$4 = $$0.a($$3);
         int $$5 = $$4.f("Slot") & 255;
         if ($$5 >= 0 && $$5 < this.b()) {
            this.a($$5, cto.a($$1, (va)$$4).orElse(cto.i));
         }
      }
   }

   @Override
   public uj a(iz.a $$0) {
      uj $$1 = new uj();

      for (int $$2 = 0; $$2 < this.b(); $$2++) {
         cto $$3 = this.a($$2);
         if (!$$3.e()) {
            ud $$4 = new ud();
            $$4.a("Slot", (byte)$$2);
            $$1.add($$3.b($$0, $$4));
         }
      }

      return $$1;
   }

   @Override
   public boolean a(clw $$0) {
      return this.b != null && !this.b.c($$0) ? false : super.a($$0);
   }

   @Override
   public void d_(clw $$0) {
      if (this.b != null) {
         this.b.a($$0);
      }

      super.d_($$0);
   }

   @Override
   public void c(clw $$0) {
      if (this.b != null) {
         this.b.b($$0);
      }

      super.c($$0);
      this.b = null;
   }
}
