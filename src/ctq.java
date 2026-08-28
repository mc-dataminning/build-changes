import javax.annotation.Nullable;

public class ctq extends bsr {
   @Nullable
   private duw b;

   public ctq() {
      super(27);
   }

   public void a(duw $$0) {
      this.b = $$0;
   }

   public boolean b(duw $$0) {
      return this.b == $$0;
   }

   @Override
   public void a(tw $$0, jt.a $$1) {
      for (int $$2 = 0; $$2 < this.b(); $$2++) {
         this.a($$2, cwp.j);
      }

      for (int $$3 = 0; $$3 < $$0.size(); $$3++) {
         tq $$4 = $$0.a($$3);
         int $$5 = $$4.f("Slot") & 255;
         if ($$5 >= 0 && $$5 < this.b()) {
            this.a($$5, cwp.a($$1, (un)$$4).orElse(cwp.j));
         }
      }
   }

   @Override
   public tw a(jt.a $$0) {
      tw $$1 = new tw();

      for (int $$2 = 0; $$2 < this.b(); $$2++) {
         cwp $$3 = this.a($$2);
         if (!$$3.f()) {
            tq $$4 = new tq();
            $$4.a("Slot", (byte)$$2);
            $$1.add($$3.b($$0, $$4));
         }
      }

      return $$1;
   }

   @Override
   public boolean a(cox $$0) {
      return this.b != null && !this.b.c($$0) ? false : super.a($$0);
   }

   @Override
   public void c_(cox $$0) {
      if (this.b != null) {
         this.b.a($$0);
      }

      super.c_($$0);
   }

   @Override
   public void c(cox $$0) {
      if (this.b != null) {
         this.b.b($$0);
      }

      super.c($$0);
      this.b = null;
   }
}
