import com.mojang.serialization.MapCodec;

public abstract class dnc extends dna implements djp {
   public static final dxw e = dxn.aA;
   public static final int f = 25;
   private final double c;

   protected dnc(dww.d $$0, jn $$1, fbu $$2, boolean $$3, double $$4) {
      super($$0, $$1, $$2, $$3);
      this.c = $$4;
      this.l(this.F.b().b(e, Integer.valueOf(0)));
   }

   @Override
   protected abstract MapCodec<? extends dnc> a();

   @Override
   public dwx b(azh $$0) {
      return this.m().b(e, Integer.valueOf($$0.a(25)));
   }

   @Override
   protected boolean f(dwx $$0) {
      return $$0.c(e) < 25;
   }

   @Override
   protected void b(dwx $$0, arc $$1, ji $$2, azh $$3) {
      if ($$0.c(e) < 25 && $$3.j() < this.c) {
         ji $$4 = $$2.a(this.a);
         if (this.h($$1.a_($$4))) {
            $$1.b($$4, this.a($$0, $$1.A));
         }
      }
   }

   protected dwx a(dwx $$0, azh $$1) {
      return $$0.a(e);
   }

   public dwx p(dwx $$0) {
      return $$0.b(e, Integer.valueOf(25));
   }

   public boolean q(dwx $$0) {
      return $$0.c(e) == 25;
   }

   protected dwx a(dwx $$0, dwx $$1) {
      return $$1;
   }

   @Override
   protected dwx a(dwx $$0, dgl $$1, dgx $$2, ji $$3, jn $$4, ji $$5, dwx $$6, azh $$7) {
      if ($$4 == this.a.g() && !$$0.a($$1, $$3)) {
         $$2.a($$3, this, 1);
      }

      if ($$4 != this.a || !$$6.a(this) && !$$6.a(this.b())) {
         if (this.b) {
            $$2.a($$3, eta.c, eta.c.a($$1));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else {
         return this.a($$0, this.b().m());
      }
   }

   @Override
   protected void a(dwy.a<djm, dwx> $$0) {
      $$0.a(e);
   }

   @Override
   public boolean a(dgl $$0, ji $$1, dwx $$2) {
      return this.h($$0.a_($$1.a(this.a)));
   }

   @Override
   public boolean a(dgi $$0, azh $$1, ji $$2, dwx $$3) {
      return true;
   }

   @Override
   public void a(arc $$0, azh $$1, ji $$2, dwx $$3) {
      ji $$4 = $$2.a(this.a);
      int $$5 = Math.min($$3.c(e) + 1, 25);
      int $$6 = this.a($$1);

      for (int $$7 = 0; $$7 < $$6 && this.h($$0.a_($$4)); $$7++) {
         $$0.b($$4, $$3.b(e, Integer.valueOf($$5)));
         $$4 = $$4.a(this.a);
         $$5 = Math.min($$5 + 1, 25);
      }
   }

   protected abstract int a(azh var1);

   protected abstract boolean h(dwx var1);

   @Override
   protected dnc c() {
      return this;
   }
}
