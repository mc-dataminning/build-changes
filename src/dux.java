public abstract class dux extends dvd {
   protected final int a;
   protected final int b;
   protected final int c;
   protected int d = -1;

   protected dux(dvq $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, ha $$7) {
      super($$0, 0, dvd.a($$1, $$2, $$3, $$7, $$4, $$5, $$6));
      this.a = $$4;
      this.b = $$5;
      this.c = $$6;
      this.a($$7);
   }

   protected dux(dvq $$0, qr $$1) {
      super($$0, $$1);
      this.a = $$1.h("Width");
      this.b = $$1.h("Height");
      this.c = $$1.h("Depth");
      this.d = $$1.h("HPos");
   }

   @Override
   protected void a(dvp $$0, qr $$1) {
      $$1.a("Width", this.a);
      $$1.a("Height", this.b);
      $$1.a("Depth", this.c);
      $$1.a("HPos", this.d);
   }

   protected boolean a(cpn $$0, dur $$1, int $$2) {
      if (this.d >= 0) {
         return true;
      } else {
         int $$3 = 0;
         int $$4 = 0;
         gu.a $$5 = new gu.a();

         for (int $$6 = this.f.i(); $$6 <= this.f.l(); $$6++) {
            for (int $$7 = this.f.g(); $$7 <= this.f.j(); $$7++) {
               $$5.d($$7, 64, $$6);
               if ($$1.b($$5)) {
                  $$3 += $$0.a(dkj.a.f, $$5).v();
                  $$4++;
               }
            }
         }

         if ($$4 == 0) {
            return false;
         } else {
            this.d = $$3 / $$4;
            this.f.a(0, this.d - this.f.h() + $$2, 0);
            return true;
         }
      }
   }

   protected boolean a(cpn $$0, int $$1) {
      if (this.d >= 0) {
         return true;
      } else {
         int $$2 = $$0.aj();
         boolean $$3 = false;
         gu.a $$4 = new gu.a();

         for (int $$5 = this.f.i(); $$5 <= this.f.l(); $$5++) {
            for (int $$6 = this.f.g(); $$6 <= this.f.j(); $$6++) {
               $$4.d($$6, 0, $$5);
               $$2 = Math.min($$2, $$0.a(dkj.a.f, $$4).v());
               $$3 = true;
            }
         }

         if (!$$3) {
            return false;
         } else {
            this.d = $$2;
            this.f.a(0, this.d - this.f.h() + $$1, 0);
            return true;
         }
      }
   }
}
