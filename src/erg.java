public abstract class erg extends erm {
   protected final int a;
   protected final int b;
   protected final int c;
   protected int d = -1;

   protected erg(erz $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, jb $$7) {
      super($$0, 0, erm.a($$1, $$2, $$3, $$7, $$4, $$5, $$6));
      this.a = $$4;
      this.b = $$5;
      this.c = $$6;
      this.a($$7);
   }

   protected erg(erz $$0, tz $$1) {
      super($$0, $$1);
      this.a = $$1.f("Width");
      this.b = $$1.f("Height");
      this.c = $$1.f("Depth");
      this.d = $$1.f("HPos");
   }

   @Override
   protected void a(ery $$0, tz $$1) {
      $$1.a("Width", this.a);
      $$1.a("Height", this.b);
      $$1.a("Depth", this.c);
      $$1.a("HPos", this.d);
   }

   protected boolean a(dji $$0, era $$1, int $$2) {
      if (this.d >= 0) {
         return true;
      } else {
         int $$3 = 0;
         int $$4 = 0;
         iv.a $$5 = new iv.a();

         for (int $$6 = this.f.j(); $$6 <= this.f.m(); $$6++) {
            for (int $$7 = this.f.h(); $$7 <= this.f.k(); $$7++) {
               $$5.d($$7, 64, $$6);
               if ($$1.b($$5)) {
                  $$3 += $$0.a(egn.a.f, $$5).v();
                  $$4++;
               }
            }
         }

         if ($$4 == 0) {
            return false;
         } else {
            this.d = $$3 / $$4;
            this.f.a(0, this.d - this.f.i() + $$2, 0);
            return true;
         }
      }
   }

   protected boolean a(dji $$0, int $$1) {
      if (this.d >= 0) {
         return true;
      } else {
         int $$2 = $$0.ao() + 1;
         boolean $$3 = false;
         iv.a $$4 = new iv.a();

         for (int $$5 = this.f.j(); $$5 <= this.f.m(); $$5++) {
            for (int $$6 = this.f.h(); $$6 <= this.f.k(); $$6++) {
               $$4.d($$6, 0, $$5);
               $$2 = Math.min($$2, $$0.a(egn.a.f, $$4).v());
               $$3 = true;
            }
         }

         if (!$$3) {
            return false;
         } else {
            this.d = $$2;
            this.f.a(0, this.d - this.f.i() + $$1, 0);
            return true;
         }
      }
   }
}
