import com.mojang.serialization.MapCodec;

public abstract class cxo extends cxm implements cud {
   public static final dhb e = dgr.ax;
   public static final int f = 25;
   private final double c;

   protected cxo(dga.d $$0, hx $$1, eiy $$2, boolean $$3, double $$4) {
      super($$0, $$1, $$2, $$3);
      this.c = $$4;
      this.k(this.E.b().a(e, Integer.valueOf(0)));
   }

   @Override
   protected abstract MapCodec<? extends cxo> a();

   @Override
   public dgb a(cra $$0) {
      return this.o().a(e, Integer.valueOf($$0.E_().a(25)));
   }

   @Override
   public boolean e_(dgb $$0) {
      return $$0.c(e) < 25;
   }

   @Override
   public void b(dgb $$0, alq $$1, ht $$2, ate $$3) {
      if ($$0.c(e) < 25 && $$3.j() < this.c) {
         ht $$4 = $$2.a(this.a);
         if (this.g($$1.a_($$4))) {
            $$1.b($$4, this.a($$0, $$1.z));
         }
      }
   }

   protected dgb a(dgb $$0, ate $$1) {
      return $$0.a(e);
   }

   public dgb n(dgb $$0) {
      return $$0.a(e, Integer.valueOf(25));
   }

   public boolean o(dgb $$0) {
      return $$0.c(e) == 25;
   }

   protected dgb a(dgb $$0, dgb $$1) {
      return $$1;
   }

   @Override
   public dgb a(dgb $$0, hx $$1, dgb $$2, cra $$3, ht $$4, ht $$5) {
      if ($$1 == this.a.g() && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      if ($$1 != this.a || !$$2.a(this) && !$$2.a(this.b())) {
         if (this.b) {
            $$3.a($$4, ebf.c, ebf.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return this.a($$0, this.b().o());
      }
   }

   @Override
   protected void a(dgc.a<cua, dgb> $$0) {
      $$0.a(e);
   }

   @Override
   public boolean b(crc $$0, ht $$1, dgb $$2) {
      return this.g($$0.a_($$1.a(this.a)));
   }

   @Override
   public boolean a(cqz $$0, ate $$1, ht $$2, dgb $$3) {
      return true;
   }

   @Override
   public void a(alq $$0, ate $$1, ht $$2, dgb $$3) {
      ht $$4 = $$2.a(this.a);
      int $$5 = Math.min($$3.c(e) + 1, 25);
      int $$6 = this.a($$1);

      for (int $$7 = 0; $$7 < $$6 && this.g($$0.a_($$4)); $$7++) {
         $$0.b($$4, $$3.a(e, Integer.valueOf($$5)));
         $$4 = $$4.a(this.a);
         $$5 = Math.min($$5 + 1, 25);
      }
   }

   protected abstract int a(ate var1);

   protected abstract boolean g(dgb var1);

   @Override
   protected cxo c() {
      return this;
   }
}
