import com.mojang.serialization.MapCodec;

public abstract class ddp extends ddn implements dad {
   public static final dnz e = dnp.ax;
   public static final int f = 25;
   private final double c;

   protected ddp(dmy.d $$0, ih $$1, eqk $$2, boolean $$3, double $$4) {
      super($$0, $$1, $$2, $$3);
      this.c = $$4;
      this.k(this.E.b().a(e, Integer.valueOf(0)));
   }

   @Override
   protected abstract MapCodec<? extends ddp> a();

   @Override
   public dmz a(cxa $$0) {
      return this.o().a(e, Integer.valueOf($$0.E_().a(25)));
   }

   @Override
   protected boolean e_(dmz $$0) {
      return $$0.c(e) < 25;
   }

   @Override
   protected void b(dmz $$0, apf $$1, ib $$2, axd $$3) {
      if ($$0.c(e) < 25 && $$3.j() < this.c) {
         ib $$4 = $$2.a(this.a);
         if (this.g($$1.a_($$4))) {
            $$1.b($$4, this.a($$0, $$1.z));
         }
      }
   }

   protected dmz a(dmz $$0, axd $$1) {
      return $$0.a(e);
   }

   public dmz n(dmz $$0) {
      return $$0.a(e, Integer.valueOf(25));
   }

   public boolean o(dmz $$0) {
      return $$0.c(e) == 25;
   }

   protected dmz a(dmz $$0, dmz $$1) {
      return $$1;
   }

   @Override
   protected dmz a(dmz $$0, ih $$1, dmz $$2, cxa $$3, ib $$4, ib $$5) {
      if ($$1 == this.a.g() && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      if ($$1 != this.a || !$$2.a(this) && !$$2.a(this.b())) {
         if (this.b) {
            $$3.a($$4, eio.c, eio.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return this.a($$0, this.b().o());
      }
   }

   @Override
   protected void a(dna.a<daa, dmz> $$0) {
      $$0.a(e);
   }

   @Override
   public boolean b(cxc $$0, ib $$1, dmz $$2) {
      return this.g($$0.a_($$1.a(this.a)));
   }

   @Override
   public boolean a(cwz $$0, axd $$1, ib $$2, dmz $$3) {
      return true;
   }

   @Override
   public void a(apf $$0, axd $$1, ib $$2, dmz $$3) {
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

   protected abstract boolean g(dmz var1);

   @Override
   protected ddp c() {
      return this;
   }
}
