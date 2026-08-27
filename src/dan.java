import com.mojang.serialization.MapCodec;

public abstract class dan extends dal implements cxb {
   public static final dkp e = dkf.ax;
   public static final int f = 25;
   private final double c;

   protected dan(djo.d $$0, ic $$1, emv $$2, boolean $$3, double $$4) {
      super($$0, $$1, $$2, $$3);
      this.c = $$4;
      this.k(this.E.b().a(e, Integer.valueOf(0)));
   }

   @Override
   protected abstract MapCodec<? extends dan> a();

   @Override
   public djp a(cty $$0) {
      return this.o().a(e, Integer.valueOf($$0.F_().a(25)));
   }

   @Override
   public boolean e_(djp $$0) {
      return $$0.c(e) < 25;
   }

   @Override
   public void b(djp $$0, ane $$1, hx $$2, auw $$3) {
      if ($$0.c(e) < 25 && $$3.j() < this.c) {
         hx $$4 = $$2.a(this.a);
         if (this.g($$1.a_($$4))) {
            $$1.b($$4, this.a($$0, $$1.z));
         }
      }
   }

   protected djp a(djp $$0, auw $$1) {
      return $$0.a(e);
   }

   public djp n(djp $$0) {
      return $$0.a(e, Integer.valueOf(25));
   }

   public boolean o(djp $$0) {
      return $$0.c(e) == 25;
   }

   protected djp a(djp $$0, djp $$1) {
      return $$1;
   }

   @Override
   public djp a(djp $$0, ic $$1, djp $$2, cty $$3, hx $$4, hx $$5) {
      if ($$1 == this.a.g() && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      if ($$1 != this.a || !$$2.a(this) && !$$2.a(this.b())) {
         if (this.b) {
            $$3.a($$4, efa.c, efa.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return this.a($$0, this.b().o());
      }
   }

   @Override
   protected void a(djq.a<cwy, djp> $$0) {
      $$0.a(e);
   }

   @Override
   public boolean b(cua $$0, hx $$1, djp $$2) {
      return this.g($$0.a_($$1.a(this.a)));
   }

   @Override
   public boolean a(ctx $$0, auw $$1, hx $$2, djp $$3) {
      return true;
   }

   @Override
   public void a(ane $$0, auw $$1, hx $$2, djp $$3) {
      hx $$4 = $$2.a(this.a);
      int $$5 = Math.min($$3.c(e) + 1, 25);
      int $$6 = this.a($$1);

      for (int $$7 = 0; $$7 < $$6 && this.g($$0.a_($$4)); $$7++) {
         $$0.b($$4, $$3.a(e, Integer.valueOf($$5)));
         $$4 = $$4.a(this.a);
         $$5 = Math.min($$5 + 1, 25);
      }
   }

   protected abstract int a(auw var1);

   protected abstract boolean g(djp var1);

   @Override
   protected dan c() {
      return this;
   }
}
