import javax.annotation.Nullable;

public class bys extends byd {
   private final dch g;
   private final bqv h;
   private int i;
   private static final int j = 20;

   public bys(dch $$0, brb $$1, double $$2, int $$3) {
      super($$1, $$2, 24, $$3);
      this.g = $$0;
      this.h = $$1;
   }

   @Override
   public boolean a() {
      if (!this.h.dM().aa().b(czc.c)) {
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
      this.h.ab = 1.0F;
   }

   @Override
   public void c() {
      super.c();
      this.i = 0;
   }

   public void a(czh $$0, id $$1) {
   }

   public void a(czg $$0, id $$1) {
   }

   @Override
   public void e() {
      super.e();
      czg $$0 = this.h.dM();
      id $$1 = this.h.dm();
      id $$2 = this.a($$1, $$0);
      axt $$3 = this.h.ei();
      if (this.m() && $$2 != null) {
         if (this.i > 0) {
            esj $$4 = this.h.dp();
            this.h.o($$4.c, 0.3, $$4.e);
            if (!$$0.B) {
               double $$5 = 0.08;
               ((apu)$$0)
                  .a(
                     new kj(kn.R, new crs(crv.qQ)),
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
            esj $$6 = this.h.dp();
            this.h.o($$6.c, -0.3, $$6.e);
            if (this.i % 6 == 0) {
               this.a((czh)$$0, this.e);
            }
         }

         if (this.i > 60) {
            $$0.a($$2, false);
            if (!$$0.B) {
               for (int $$7 = 0; $$7 < 20; $$7++) {
                  double $$8 = $$3.k() * 0.02;
                  double $$9 = $$3.k() * 0.02;
                  double $$10 = $$3.k() * 0.02;
                  ((apu)$$0).a(kn.Z, (double)$$2.u() + 0.5, (double)$$2.v(), (double)$$2.w() + 0.5, 1, $$8, $$9, $$10, 0.15F);
               }

               this.a($$0, $$2);
            }
         }

         this.i++;
      }
   }

   @Nullable
   private id a(id $$0, cym $$1) {
      if ($$1.a_($$0).a(this.g)) {
         return $$0;
      } else {
         id[] $$2 = new id[]{$$0.d(), $$0.g(), $$0.h(), $$0.e(), $$0.f(), $$0.d().d()};

         for (id $$3 : $$2) {
            if ($$1.a_($$3).a(this.g)) {
               return $$3;
            }
         }

         return null;
      }
   }

   @Override
   protected boolean a(czj $$0, id $$1) {
      dre $$2 = $$0.a(jg.a($$1.u()), jg.a($$1.w()), dsd.n, false);
      return $$2 == null ? false : $$2.a_($$1).a(this.g) && $$2.a_($$1.c()).i() && $$2.a_($$1.b(2)).i();
   }
}
