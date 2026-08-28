import javax.annotation.Nullable;

public class cuk extends btf {
   @Nullable
   private dvp b;

   public cuk() {
      super(27);
   }

   public void a(dvp $$0) {
      this.b = $$0;
   }

   public boolean b(dvp $$0) {
      return this.b == $$0;
   }

   @Override
   public void a(tw $$0, jt.a $$1) {
      for (int $$2 = 0; $$2 < this.b(); $$2++) {
         this.a($$2, cxh.k);
      }

      for (int $$3 = 0; $$3 < $$0.size(); $$3++) {
         tq $$4 = $$0.a($$3);
         int $$5 = $$4.f("Slot") & 255;
         if ($$5 >= 0 && $$5 < this.b()) {
            this.a($$5, cxh.a($$1, (un)$$4).orElse(cxh.k));
         }
      }
   }

   @Override
   public tw a(jt.a $$0) {
      tw $$1 = new tw();

      for (int $$2 = 0; $$2 < this.b(); $$2++) {
         cxh $$3 = this.a($$2);
         if (!$$3.f()) {
            tq $$4 = new tq();
            $$4.a("Slot", (byte)$$2);
            $$1.add($$3.b($$0, $$4));
         }
      }

      return $$1;
   }

   @Override
   public boolean a(cpr $$0) {
      return this.b != null && !this.b.c($$0) ? false : super.a($$0);
   }

   @Override
   public void c_(cpr $$0) {
      if (this.b != null) {
         this.b.a($$0);
      }

      super.c_($$0);
   }

   @Override
   public void c(cpr $$0) {
      if (this.b != null) {
         this.b.b($$0);
      }

      super.c($$0);
      this.b = null;
   }
}
