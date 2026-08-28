import com.mojang.serialization.MapCodec;

public abstract class dky extends dkw implements dhm {
   public static final dvo e = dve.ax;
   public static final int f = 25;
   private final double c;

   protected dky(dun.d $$0, jj $$1, ezm $$2, boolean $$3, double $$4) {
      super($$0, $$1, $$2, $$3);
      this.c = $$4;
      this.l(this.F.b().b(e, Integer.valueOf(0)));
   }

   @Override
   protected abstract MapCodec<? extends dky> a();

   @Override
   public duo a(deh $$0) {
      return this.o().b(e, Integer.valueOf($$0.C_().a(25)));
   }

   @Override
   protected boolean f(duo $$0) {
      return $$0.c(e) < 25;
   }

   @Override
   protected void b(duo $$0, arh $$1, je $$2, azl $$3) {
      if ($$0.c(e) < 25 && $$3.j() < this.c) {
         je $$4 = $$2.a(this.a);
         if (this.h($$1.a_($$4))) {
            $$1.b($$4, this.a($$0, $$1.z));
         }
      }
   }

   protected duo a(duo $$0, azl $$1) {
      return $$0.a(e);
   }

   public duo p(duo $$0) {
      return $$0.b(e, Integer.valueOf(25));
   }

   public boolean q(duo $$0) {
      return $$0.c(e) == 25;
   }

   protected duo a(duo $$0, duo $$1) {
      return $$1;
   }

   @Override
   protected duo a(duo $$0, jj $$1, duo $$2, deh $$3, je $$4, je $$5) {
      if ($$1 == this.a.g() && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      if ($$1 != this.a || !$$2.a(this) && !$$2.a(this.b())) {
         if (this.b) {
            $$3.a($$4, eqq.c, eqq.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return this.a($$0, this.b().o());
      }
   }

   @Override
   protected void a(dup.a<dhj, duo> $$0) {
      $$0.a(e);
   }

   @Override
   public boolean b(dej $$0, je $$1, duo $$2) {
      return this.h($$0.a_($$1.a(this.a)));
   }

   @Override
   public boolean a(deg $$0, azl $$1, je $$2, duo $$3) {
      return true;
   }

   @Override
   public void a(arh $$0, azl $$1, je $$2, duo $$3) {
      je $$4 = $$2.a(this.a);
      int $$5 = Math.min($$3.c(e) + 1, 25);
      int $$6 = this.a($$1);

      for (int $$7 = 0; $$7 < $$6 && this.h($$0.a_($$4)); $$7++) {
         $$0.b($$4, $$3.b(e, Integer.valueOf($$5)));
         $$4 = $$4.a(this.a);
         $$5 = Math.min($$5 + 1, 25);
      }
   }

   protected abstract int a(azl var1);

   protected abstract boolean h(duo var1);

   @Override
   protected dky c() {
      return this;
   }
}
