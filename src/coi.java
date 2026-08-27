import javax.annotation.Nullable;

public class coi extends boo {
   @Nullable
   private dnj c;

   public coi() {
      super(27);
   }

   public void a(dnj $$0) {
      this.c = $$0;
   }

   public boolean b(dnj $$0) {
      return this.c == $$0;
   }

   @Override
   public void a(tu $$0, ip.a $$1) {
      for (int $$2 = 0; $$2 < this.b(); $$2++) {
         this.a($$2, crs.i);
      }

      for (int $$3 = 0; $$3 < $$0.size(); $$3++) {
         to $$4 = $$0.a($$3);
         int $$5 = $$4.f("Slot") & 255;
         if ($$5 >= 0 && $$5 < this.b()) {
            this.a($$5, crs.a($$1, (ul)$$4).orElse(crs.i));
         }
      }
   }

   @Override
   public tu a(ip.a $$0) {
      tu $$1 = new tu();

      for (int $$2 = 0; $$2 < this.b(); $$2++) {
         crs $$3 = this.a($$2);
         if (!$$3.d()) {
            to $$4 = new to();
            $$4.a("Slot", (byte)$$2);
            $$1.add($$3.b($$0, $$4));
         }
      }

      return $$1;
   }

   @Override
   public boolean a(cka $$0) {
      return this.c != null && !this.c.c($$0) ? false : super.a($$0);
   }

   @Override
   public void d_(cka $$0) {
      if (this.c != null) {
         this.c.a($$0);
      }

      super.d_($$0);
   }

   @Override
   public void c(cka $$0) {
      if (this.c != null) {
         this.c.b($$0);
      }

      super.c($$0);
      this.c = null;
   }
}
