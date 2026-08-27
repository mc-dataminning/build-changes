import com.mojang.serialization.MapCodec;

public abstract class ddr extends ddp implements daf {
   public static final dob e = dnr.ax;
   public static final int f = 25;
   private final double c;

   protected ddr(dna.d $$0, ih $$1, eqm $$2, boolean $$3, double $$4) {
      super($$0, $$1, $$2, $$3);
      this.c = $$4;
      this.k(this.E.b().a(e, Integer.valueOf(0)));
   }

   @Override
   protected abstract MapCodec<? extends ddr> a();

   @Override
   public dnb a(cxc $$0) {
      return this.o().a(e, Integer.valueOf($$0.E_().a(25)));
   }

   @Override
   protected boolean e_(dnb $$0) {
      return $$0.c(e) < 25;
   }

   @Override
   protected void b(dnb $$0, apf $$1, ib $$2, axd $$3) {
      if ($$0.c(e) < 25 && $$3.j() < this.c) {
         ib $$4 = $$2.a(this.a);
         if (this.g($$1.a_($$4))) {
            $$1.b($$4, this.a($$0, $$1.z));
         }
      }
   }

   protected dnb a(dnb $$0, axd $$1) {
      return $$0.a(e);
   }

   public dnb n(dnb $$0) {
      return $$0.a(e, Integer.valueOf(25));
   }

   public boolean o(dnb $$0) {
      return $$0.c(e) == 25;
   }

   protected dnb a(dnb $$0, dnb $$1) {
      return $$1;
   }

   @Override
   protected dnb a(dnb $$0, ih $$1, dnb $$2, cxc $$3, ib $$4, ib $$5) {
      if ($$1 == this.a.g() && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      if ($$1 != this.a || !$$2.a(this) && !$$2.a(this.b())) {
         if (this.b) {
            $$3.a($$4, eiq.c, eiq.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return this.a($$0, this.b().o());
      }
   }

   @Override
   protected void a(dnc.a<dac, dnb> $$0) {
      $$0.a(e);
   }

   @Override
   public boolean b(cxe $$0, ib $$1, dnb $$2) {
      return this.g($$0.a_($$1.a(this.a)));
   }

   @Override
   public boolean a(cxb $$0, axd $$1, ib $$2, dnb $$3) {
      return true;
   }

   @Override
   public void a(apf $$0, axd $$1, ib $$2, dnb $$3) {
      ib $$4 = $$2.a(this.a);
      int $$5 = Math.min($$3.c(e) + 1, 25);
      int $$6 = this.a($$1);

      for (int $$7 = 0; $$7 < $$6 && this.g($$0.a_($$4)); $$7++) {
         $$0.b($$4, $$3.a(e, Integer.valueOf($$5)));
         $$4 = $$4.a(this.a);
         $$5 = Math.min($$5 + 1, 25);
      }
   }

   protected abstract int a(axd var1);

   protected abstract boolean g(dnb var1);

   @Override
   protected ddr c() {
      return this;
   }
}
