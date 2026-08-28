import javax.annotation.Nullable;

public class cay extends caj {
   private final dff g;
   private final bta h;
   private int i;
   private static final int j = 20;

   public cay(dff $$0, bth $$1, double $$2, int $$3) {
      super($$1, $$2, 24, $$3);
      this.g = $$0;
      this.h = $$1;
   }

   @Override
   public boolean a() {
      if (!this.h.dP().ab().b(dbz.c)) {
         return false;
      } else if (this.c > 0) {
         this.c--;
         return false;
      } else if (this.n()) {
         this.c = b(20);
         return true;
      } else {
         this.c = this.a(this.a);
         return false;
      }
   }

   @Override
   public void d() {
      super.d();
      this.h.ac = 1.0F;
   }

   @Override
   public void c() {
      super.c();
      this.i = 0;
   }

   public void a(dce $$0, ja $$1) {
   }

   public void a(dcd $$0, ja $$1) {
   }

   @Override
   public void e() {
      super.e();
      dcd $$0 = this.h.dP();
      ja $$1 = this.h.dp();
      ja $$2 = this.a($$1, $$0);
      aym $$3 = this.h.dS();
      if (this.m() && $$2 != null) {
         if (this.i > 0) {
            evz $$4 = this.h.ds();
            this.h.o($$4.c, 0.3, $$4.e);
            if (!$$0.B) {
               double $$5 = 0.08;
               ((aqk)$$0)
                  .a(
                     new lf(lj.S, new cua(cud.qR)),
                     (double)$$2.u() + 0.5,
                     (double)$$2.v() + 0.7,
                     (double)$$2.w() + 0.5,
                     3,
                     ((double)$$3.i() - 0.5) * 0.08,
                     ((double)$$3.i() - 0.5) * 0.08,
                     ((double)$$3.i() - 0.5) * 0.08,
                     0.15F
                  );
            }
         }

         if (this.i % 2 == 0) {
            evz $$6 = this.h.ds();
            this.h.o($$6.c, -0.3, $$6.e);
            if (this.i % 6 == 0) {
               this.a((dce)$$0, this.e);
            }
         }

         if (this.i > 60) {
            $$0.a($$2, false);
            if (!$$0.B) {
               for (int $$7 = 0; $$7 < 20; $$7++) {
                  double $$8 = $$3.k() * 0.02;
                  double $$9 = $$3.k() * 0.02;
                  double $$10 = $$3.k() * 0.02;
                  ((aqk)$$0).a(lj.ab, (double)$$2.u() + 0.5, (double)$$2.v(), (double)$$2.w() + 0.5, 1, $$8, $$9, $$10, 0.15F);
               }

               this.a($$0, $$2);
            }
         }

         this.i++;
      }
   }

   @Nullable
   private ja a(ja $$0, dbj $$1) {
      if ($$1.a_($$0).a(this.g)) {
         return $$0;
      } else {
         ja[] $$2 = new ja[]{$$0.d(), $$0.g(), $$0.h(), $$0.e(), $$0.f(), $$0.d().d()};

         for (ja $$3 : $$2) {
            if ($$1.a_($$3).a(this.g)) {
               return $$3;
            }
         }

         return null;
      }
   }

   @Override
   protected boolean a(dcg $$0, ja $$1) {
      dud $$2 = $$0.a(kc.a($$1.u()), kc.a($$1.w()), dvc.n, false);
      return $$2 == null ? false : $$2.a_($$1).a(this.g) && $$2.a_($$1.c()).i() && $$2.a_($$1.b(2)).i();
   }
}
