import com.mojang.serialization.MapCodec;

public abstract class dna extends dmy implements djn {
   public static final dxu e = dxl.aA;
   public static final int f = 25;
   private final double c;

   protected dna(dwu.d $$0, jn $$1, fbs $$2, boolean $$3, double $$4) {
      super($$0, $$1, $$2, $$3);
      this.c = $$4;
      this.l(this.F.b().b(e, Integer.valueOf(0)));
   }

   @Override
   protected abstract MapCodec<? extends dna> a();

   @Override
   public dwv b(azg $$0) {
      return this.m().b(e, Integer.valueOf($$0.a(25)));
   }

   @Override
   protected boolean f(dwv $$0) {
      return $$0.c(e) < 25;
   }

   @Override
   protected void b(dwv $$0, arc $$1, ji $$2, azg $$3) {
      if ($$0.c(e) < 25 && $$3.j() < this.c) {
         ji $$4 = $$2.a(this.a);
         if (this.h($$1.a_($$4))) {
            $$1.b($$4, this.a($$0, $$1.A));
         }
      }
   }

   protected dwv a(dwv $$0, azg $$1) {
      return $$0.a(e);
   }

   public dwv p(dwv $$0) {
      return $$0.b(e, Integer.valueOf(25));
   }

   public boolean q(dwv $$0) {
      return $$0.c(e) == 25;
   }

   protected dwv a(dwv $$0, dwv $$1) {
      return $$1;
   }

   @Override
   protected dwv a(dwv $$0, dgj $$1, dgv $$2, ji $$3, jn $$4, ji $$5, dwv $$6, azg $$7) {
      if ($$4 == this.a.g() && !$$0.a($$1, $$3)) {
         $$2.a($$3, this, 1);
      }

      if ($$4 != this.a || !$$6.a(this) && !$$6.a(this.b())) {
         if (this.b) {
            $$2.a($$3, esy.c, esy.c.a($$1));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else {
         return this.a($$0, this.b().m());
      }
   }

   @Override
   protected void a(dww.a<djk, dwv> $$0) {
      $$0.a(e);
   }

   @Override
   public boolean a(dgj $$0, ji $$1, dwv $$2) {
      return this.h($$0.a_($$1.a(this.a)));
   }

   @Override
   public boolean a(dgg $$0, azg $$1, ji $$2, dwv $$3) {
      return true;
   }

   @Override
   public void a(arc $$0, azg $$1, ji $$2, dwv $$3) {
      ji $$4 = $$2.a(this.a);
      int $$5 = Math.min($$3.c(e) + 1, 25);
      int $$6 = this.a($$1);

      for (int $$7 = 0; $$7 < $$6 && this.h($$0.a_($$4)); $$7++) {
         $$0.b($$4, $$3.b(e, Integer.valueOf($$5)));
         $$4 = $$4.a(this.a);
         $$5 = Math.min($$5 + 1, 25);
      }
   }

   protected abstract int a(azg var1);

   protected abstract boolean h(dwv var1);

   @Override
   protected dna c() {
      return this;
   }
}
