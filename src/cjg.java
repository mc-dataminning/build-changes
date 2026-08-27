import javax.annotation.Nullable;

public class cjg extends bkd {
   @Nullable
   private dhj c;

   public cjg() {
      super(27);
   }

   public void a(dhj $$0) {
      this.c = $$0;
   }

   public boolean b(dhj $$0) {
      return this.c == $$0;
   }

   @Override
   public void a(sr $$0) {
      for (int $$1 = 0; $$1 < this.b(); $$1++) {
         this.a($$1, cmr.f);
      }

      for (int $$2 = 0; $$2 < $$0.size(); $$2++) {
         sl $$3 = $$0.a($$2);
         int $$4 = $$3.f("Slot") & 255;
         if ($$4 >= 0 && $$4 < this.b()) {
            this.a($$4, cmr.a($$3));
         }
      }
   }

   @Override
   public sr g() {
      sr $$0 = new sr();

      for (int $$1 = 0; $$1 < this.b(); $$1++) {
         cmr $$2 = this.a($$1);
         if (!$$2.b()) {
            sl $$3 = new sl();
            $$3.a("Slot", (byte)$$1);
            $$2.b($$3);
            $$0.add($$3);
         }
      }

      return $$0;
   }

   @Override
   public boolean a(cfb $$0) {
      return this.c != null && !this.c.c($$0) ? false : super.a($$0);
   }

   @Override
   public void d_(cfb $$0) {
      if (this.c != null) {
         this.c.a($$0);
      }

      super.d_($$0);
   }

   @Override
   public void c(cfb $$0) {
      if (this.c != null) {
         this.c.b($$0);
      }

      super.c($$0);
      this.c = null;
   }
}
