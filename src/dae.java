import com.mojang.serialization.MapCodec;

public abstract class dae extends dac implements cws {
   public static final dkg e = djw.ax;
   public static final int f = 25;
   private final double c;

   protected dae(djf.d $$0, ic $$1, eml $$2, boolean $$3, double $$4) {
      super($$0, $$1, $$2, $$3);
      this.c = $$4;
      this.k(this.E.b().a(e, Integer.valueOf(0)));
   }

   @Override
   protected abstract MapCodec<? extends dae> a();

   @Override
   public djg a(ctp $$0) {
      return this.o().a(e, Integer.valueOf($$0.F_().a(25)));
   }

   @Override
   public boolean e_(djg $$0) {
      return $$0.c(e) < 25;
   }

   @Override
   public void b(djg $$0, and $$1, hx $$2, auu $$3) {
      if ($$0.c(e) < 25 && $$3.j() < this.c) {
         hx $$4 = $$2.a(this.a);
         if (this.g($$1.a_($$4))) {
            $$1.b($$4, this.a($$0, $$1.z));
         }
      }
   }

   protected djg a(djg $$0, auu $$1) {
      return $$0.a(e);
   }

   public djg n(djg $$0) {
      return $$0.a(e, Integer.valueOf(25));
   }

   public boolean o(djg $$0) {
      return $$0.c(e) == 25;
   }

   protected djg a(djg $$0, djg $$1) {
      return $$1;
   }

   @Override
   public djg a(djg $$0, ic $$1, djg $$2, ctp $$3, hx $$4, hx $$5) {
      if ($$1 == this.a.g() && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      if ($$1 != this.a || !$$2.a(this) && !$$2.a(this.b())) {
         if (this.b) {
            $$3.a($$4, eer.c, eer.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return this.a($$0, this.b().o());
      }
   }

   @Override
   protected void a(djh.a<cwp, djg> $$0) {
      $$0.a(e);
   }

   @Override
   public boolean b(ctr $$0, hx $$1, djg $$2) {
      return this.g($$0.a_($$1.a(this.a)));
   }

   @Override
   public boolean a(cto $$0, auu $$1, hx $$2, djg $$3) {
      return true;
   }

   @Override
   public void a(and $$0, auu $$1, hx $$2, djg $$3) {
      hx $$4 = $$2.a(this.a);
      int $$5 = Math.min($$3.c(e) + 1, 25);
      int $$6 = this.a($$1);

      for (int $$7 = 0; $$7 < $$6 && this.g($$0.a_($$4)); $$7++) {
         $$0.b($$4, $$3.a(e, Integer.valueOf($$5)));
         $$4 = $$4.a(this.a);
         $$5 = Math.min($$5 + 1, 25);
      }
   }

   protected abstract int a(auu var1);

   protected abstract boolean g(djg var1);

   @Override
   protected dae c() {
      return this;
   }
}
