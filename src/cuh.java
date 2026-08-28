import javax.annotation.Nullable;

public class cuh extends bth {
   @Nullable
   private dvn b;

   public cuh() {
      super(27);
   }

   public void a(dvn $$0) {
      this.b = $$0;
   }

   public boolean b(dvn $$0) {
      return this.b == $$0;
   }

   @Override
   public void a(us $$0, js.a $$1) {
      for (int $$2 = 0; $$2 < this.b(); $$2++) {
         this.a($$2, cxg.j);
      }

      for (int $$3 = 0; $$3 < $$0.size(); $$3++) {
         um $$4 = $$0.a($$3);
         int $$5 = $$4.f("Slot") & 255;
         if ($$5 >= 0 && $$5 < this.b()) {
            this.a($$5, cxg.a($$1, (vj)$$4).orElse(cxg.j));
         }
      }
   }

   @Override
   public us a(js.a $$0) {
      us $$1 = new us();

      for (int $$2 = 0; $$2 < this.b(); $$2++) {
         cxg $$3 = this.a($$2);
         if (!$$3.f()) {
            um $$4 = new um();
            $$4.a("Slot", (byte)$$2);
            $$1.add($$3.b($$0, $$4));
         }
      }

      return $$1;
   }

   @Override
   public boolean a(cpo $$0) {
      return this.b != null && !this.b.c($$0) ? false : super.a($$0);
   }

   @Override
   public void c_(cpo $$0) {
      if (this.b != null) {
         this.b.a($$0);
      }

      super.c_($$0);
   }

   @Override
   public void c(cpo $$0) {
      if (this.b != null) {
         this.b.b($$0);
      }

      super.c($$0);
      this.b = null;
   }
}
