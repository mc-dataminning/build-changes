import javax.annotation.Nullable;

public class ciw extends bjt {
   @Nullable
   private dgy c;

   public ciw() {
      super(27);
   }

   public void a(dgy $$0) {
      this.c = $$0;
   }

   public boolean b(dgy $$0) {
      return this.c == $$0;
   }

   @Override
   public void a(sp $$0) {
      for (int $$1 = 0; $$1 < this.b(); $$1++) {
         this.a($$1, cmh.f);
      }

      for (int $$2 = 0; $$2 < $$0.size(); $$2++) {
         sj $$3 = $$0.a($$2);
         int $$4 = $$3.f("Slot") & 255;
         if ($$4 >= 0 && $$4 < this.b()) {
            this.a($$4, cmh.a($$3));
         }
      }
   }

   @Override
   public sp g() {
      sp $$0 = new sp();

      for (int $$1 = 0; $$1 < this.b(); $$1++) {
         cmh $$2 = this.a($$1);
         if (!$$2.b()) {
            sj $$3 = new sj();
            $$3.a("Slot", (byte)$$1);
            $$2.b($$3);
            $$0.add($$3);
         }
      }

      return $$0;
   }

   @Override
   public boolean a(cer $$0) {
      return this.c != null && !this.c.c($$0) ? false : super.a($$0);
   }

   @Override
   public void d_(cer $$0) {
      if (this.c != null) {
         this.c.a($$0);
      }

      super.d_($$0);
   }

   @Override
   public void c(cer $$0) {
      if (this.c != null) {
         this.c.b($$0);
      }

      super.c($$0);
      this.c = null;
   }
}
