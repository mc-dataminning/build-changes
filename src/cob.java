import javax.annotation.Nullable;

public class cob extends boj {
   @Nullable
   private dna c;

   public cob() {
      super(27);
   }

   public void a(dna $$0) {
      this.c = $$0;
   }

   public boolean b(dna $$0) {
      return this.c == $$0;
   }

   @Override
   public void a(ts $$0, in.a $$1) {
      for (int $$2 = 0; $$2 < this.b(); $$2++) {
         this.a($$2, crj.i);
      }

      for (int $$3 = 0; $$3 < $$0.size(); $$3++) {
         tm $$4 = $$0.a($$3);
         int $$5 = $$4.f("Slot") & 255;
         if ($$5 >= 0 && $$5 < this.b()) {
            this.a($$5, crj.a($$1, (uj)$$4).orElse(crj.i));
         }
      }
   }

   @Override
   public ts a(in.a $$0) {
      ts $$1 = new ts();

      for (int $$2 = 0; $$2 < this.b(); $$2++) {
         crj $$3 = this.a($$2);
         if (!$$3.d()) {
            tm $$4 = new tm();
            $$4.a("Slot", (byte)$$2);
            $$1.add($$3.b($$0, $$4));
         }
      }

      return $$1;
   }

   @Override
   public boolean a(cjt $$0) {
      return this.c != null && !this.c.c($$0) ? false : super.a($$0);
   }

   @Override
   public void d_(cjt $$0) {
      if (this.c != null) {
         this.c.a($$0);
      }

      super.d_($$0);
   }

   @Override
   public void c(cjt $$0) {
      if (this.c != null) {
         this.c.b($$0);
      }

      super.c($$0);
      this.c = null;
   }
}
