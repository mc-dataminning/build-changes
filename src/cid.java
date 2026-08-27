import javax.annotation.Nullable;

public class cid extends bjj {
   @Nullable
   private dgd c;

   public cid() {
      super(27);
   }

   public void a(dgd $$0) {
      this.c = $$0;
   }

   public boolean b(dgd $$0) {
      return this.c == $$0;
   }

   @Override
   public void a(sj $$0) {
      for (int $$1 = 0; $$1 < this.b(); $$1++) {
         this.a($$1, clo.b);
      }

      for (int $$2 = 0; $$2 < $$0.size(); $$2++) {
         sd $$3 = $$0.a($$2);
         int $$4 = $$3.f("Slot") & 255;
         if ($$4 >= 0 && $$4 < this.b()) {
            this.a($$4, clo.a($$3));
         }
      }
   }

   @Override
   public sj g() {
      sj $$0 = new sj();

      for (int $$1 = 0; $$1 < this.b(); $$1++) {
         clo $$2 = this.a($$1);
         if (!$$2.b()) {
            sd $$3 = new sd();
            $$3.a("Slot", (byte)$$1);
            $$2.b($$3);
            $$0.add($$3);
         }
      }

      return $$0;
   }

   @Override
   public boolean a(cdz $$0) {
      return this.c != null && !this.c.c($$0) ? false : super.a($$0);
   }

   @Override
   public void d_(cdz $$0) {
      if (this.c != null) {
         this.c.a($$0);
      }

      super.d_($$0);
   }

   @Override
   public void c(cdz $$0) {
      if (this.c != null) {
         this.c.b($$0);
      }

      super.c($$0);
      this.c = null;
   }
}
