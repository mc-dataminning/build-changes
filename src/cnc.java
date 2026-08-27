import javax.annotation.Nullable;

public class cnc extends bnm {
   @Nullable
   private dld c;

   public cnc() {
      super(27);
   }

   public void a(dld $$0) {
      this.c = $$0;
   }

   public boolean b(dld $$0) {
      return this.c == $$0;
   }

   @Override
   public void a(tg $$0) {
      for (int $$1 = 0; $$1 < this.b(); $$1++) {
         this.a($$1, cqm.h);
      }

      for (int $$2 = 0; $$2 < $$0.size(); $$2++) {
         ta $$3 = $$0.a($$2);
         int $$4 = $$3.f("Slot") & 255;
         if ($$4 >= 0 && $$4 < this.b()) {
            this.a($$4, cqm.a($$3));
         }
      }
   }

   @Override
   public tg g() {
      tg $$0 = new tg();

      for (int $$1 = 0; $$1 < this.b(); $$1++) {
         cqm $$2 = this.a($$1);
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
   public boolean a(ciu $$0) {
      return this.c != null && !this.c.c($$0) ? false : super.a($$0);
   }

   @Override
   public void d_(ciu $$0) {
      if (this.c != null) {
         this.c.a($$0);
      }

      super.d_($$0);
   }

   @Override
   public void c(ciu $$0) {
      if (this.c != null) {
         this.c.b($$0);
      }

      super.c($$0);
      this.c = null;
   }
}
