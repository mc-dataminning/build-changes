import javax.annotation.Nullable;

public class cna extends bnl {
   @Nullable
   private dlb c;

   public cna() {
      super(27);
   }

   public void a(dlb $$0) {
      this.c = $$0;
   }

   public boolean b(dlb $$0) {
      return this.c == $$0;
   }

   @Override
   public void a(tg $$0) {
      for (int $$1 = 0; $$1 < this.b(); $$1++) {
         this.a($$1, cqk.h);
      }

      for (int $$2 = 0; $$2 < $$0.size(); $$2++) {
         ta $$3 = $$0.a($$2);
         int $$4 = $$3.f("Slot") & 255;
         if ($$4 >= 0 && $$4 < this.b()) {
            this.a($$4, cqk.a($$3));
         }
      }
   }

   @Override
   public tg g() {
      tg $$0 = new tg();

      for (int $$1 = 0; $$1 < this.b(); $$1++) {
         cqk $$2 = this.a($$1);
         if (!$$2.b()) {
            ta $$3 = new ta();
            $$3.a("Slot", (byte)$$1);
            $$2.b($$3);
            $$0.add($$3);
         }
      }

      return $$0;
   }

   @Override
   public boolean a(cis $$0) {
      return this.c != null && !this.c.c($$0) ? false : super.a($$0);
   }

   @Override
   public void d_(cis $$0) {
      if (this.c != null) {
         this.c.a($$0);
      }

      super.d_($$0);
   }

   @Override
   public void c(cis $$0) {
      if (this.c != null) {
         this.c.b($$0);
      }

      super.c($$0);
      this.c = null;
   }
}
