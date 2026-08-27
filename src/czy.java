import com.mojang.serialization.MapCodec;

public abstract class czy extends czw implements cwm {
   public static final dka e = djq.ax;
   public static final int f = 25;
   private final double c;

   protected czy(diz.d $$0, ic $$1, emf $$2, boolean $$3, double $$4) {
      super($$0, $$1, $$2, $$3);
      this.c = $$4;
      this.k(this.E.b().a(e, Integer.valueOf(0)));
   }

   @Override
   protected abstract MapCodec<? extends czy> a();

   @Override
   public dja a(ctj $$0) {
      return this.o().a(e, Integer.valueOf($$0.F_().a(25)));
   }

   @Override
   public boolean e_(dja $$0) {
      return $$0.c(e) < 25;
   }

   @Override
   public void b(dja $$0, amz $$1, hx $$2, aup $$3) {
      if ($$0.c(e) < 25 && $$3.j() < this.c) {
         hx $$4 = $$2.a(this.a);
         if (this.g($$1.a_($$4))) {
            $$1.b($$4, this.a($$0, $$1.z));
         }
      }
   }

   protected dja a(dja $$0, aup $$1) {
      return $$0.a(e);
   }

   public dja n(dja $$0) {
      return $$0.a(e, Integer.valueOf(25));
   }

   public boolean o(dja $$0) {
      return $$0.c(e) == 25;
   }

   protected dja a(dja $$0, dja $$1) {
      return $$1;
   }

   @Override
   public dja a(dja $$0, ic $$1, dja $$2, ctj $$3, hx $$4, hx $$5) {
      if ($$1 == this.a.g() && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      if ($$1 != this.a || !$$2.a(this) && !$$2.a(this.b())) {
         if (this.b) {
            $$3.a($$4, eel.c, eel.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return this.a($$0, this.b().o());
      }
   }

   @Override
   protected void a(djb.a<cwj, dja> $$0) {
      $$0.a(e);
   }

   @Override
   public boolean b(ctl $$0, hx $$1, dja $$2) {
      return this.g($$0.a_($$1.a(this.a)));
   }

   @Override
   public boolean a(cti $$0, aup $$1, hx $$2, dja $$3) {
      return true;
   }

   @Override
   public void a(amz $$0, aup $$1, hx $$2, dja $$3) {
      hx $$4 = $$2.a(this.a);
      int $$5 = Math.min($$3.c(e) + 1, 25);
      int $$6 = this.a($$1);

      for (int $$7 = 0; $$7 < $$6 && this.g($$0.a_($$4)); $$7++) {
         $$0.b($$4, $$3.a(e, Integer.valueOf($$5)));
         $$4 = $$4.a(this.a);
         $$5 = Math.min($$5 + 1, 25);
      }
   }

   protected abstract int a(aup var1);

   protected abstract boolean g(dja var1);

   @Override
   protected czy c() {
      return this;
   }
}
