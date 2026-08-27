import javax.annotation.Nullable;

public class cfu extends bhf {
   @Nullable
   private ddp c;

   public cfu() {
      super(27);
   }

   public void a(ddp $$0) {
      this.c = $$0;
   }

   public boolean b(ddp $$0) {
      return this.c == $$0;
   }

   @Override
   public void a(rc $$0) {
      for (int $$1 = 0; $$1 < this.b(); $$1++) {
         this.a($$1, cjf.b);
      }

      for (int $$2 = 0; $$2 < $$0.size(); $$2++) {
         qw $$3 = $$0.a($$2);
         int $$4 = $$3.f("Slot") & 255;
         if ($$4 >= 0 && $$4 < this.b()) {
            this.a($$4, cjf.a($$3));
         }
      }
   }

   @Override
   public rc g() {
      rc $$0 = new rc();

      for (int $$1 = 0; $$1 < this.b(); $$1++) {
         cjf $$2 = this.a($$1);
         if (!$$2.b()) {
            qw $$3 = new qw();
            $$3.a("Slot", (byte)$$1);
            $$2.b($$3);
            $$0.add($$3);
         }
      }

      return $$0;
   }

   @Override
   public boolean a(cbu $$0) {
      return this.c != null && !this.c.c($$0) ? false : super.a($$0);
   }

   @Override
   public void d_(cbu $$0) {
      if (this.c != null) {
         this.c.a($$0);
      }

      super.d_($$0);
   }

   @Override
   public void c(cbu $$0) {
      if (this.c != null) {
         this.c.b($$0);
      }

      super.c($$0);
      this.c = null;
   }
}
