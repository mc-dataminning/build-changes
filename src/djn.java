import com.mojang.serialization.MapCodec;

public abstract class djn extends djl implements dgb {
   public static final duc e = dts.ax;
   public static final int f = 25;
   private final double c;

   protected djn(dtb.d $$0, ji $$1, exv $$2, boolean $$3, double $$4) {
      super($$0, $$1, $$2, $$3);
      this.c = $$4;
      this.k(this.E.b().a(e, Integer.valueOf(0)));
   }

   @Override
   protected abstract MapCodec<? extends djn> a();

   @Override
   public dtc a(dcx $$0) {
      return this.o().a(e, Integer.valueOf($$0.E_().a(25)));
   }

   @Override
   protected boolean d_(dtc $$0) {
      return $$0.c(e) < 25;
   }

   @Override
   protected void b(dtc $$0, aqu $$1, jd $$2, ayw $$3) {
      if ($$0.c(e) < 25 && $$3.j() < this.c) {
         jd $$4 = $$2.a(this.a);
         if (this.g($$1.a_($$4))) {
            $$1.b($$4, this.a($$0, $$1.z));
         }
      }
   }

   protected dtc a(dtc $$0, ayw $$1) {
      return $$0.a(e);
   }

   public dtc n(dtc $$0) {
      return $$0.a(e, Integer.valueOf(25));
   }

   public boolean o(dtc $$0) {
      return $$0.c(e) == 25;
   }

   protected dtc a(dtc $$0, dtc $$1) {
      return $$1;
   }

   @Override
   protected dtc a(dtc $$0, ji $$1, dtc $$2, dcx $$3, jd $$4, jd $$5) {
      if ($$1 == this.a.g() && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      if ($$1 != this.a || !$$2.a(this) && !$$2.a(this.b())) {
         if (this.b) {
            $$3.a($$4, epf.c, epf.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return this.a($$0, this.b().o());
      }
   }

   @Override
   protected void a(dtd.a<dfy, dtc> $$0) {
      $$0.a(e);
   }

   @Override
   public boolean b(dcz $$0, jd $$1, dtc $$2) {
      return this.g($$0.a_($$1.a(this.a)));
   }

   @Override
   public boolean a(dcw $$0, ayw $$1, jd $$2, dtc $$3) {
      return true;
   }

   @Override
   public void a(aqu $$0, ayw $$1, jd $$2, dtc $$3) {
      jd $$4 = $$2.a(this.a);
      int $$5 = Math.min($$3.c(e) + 1, 25);
      int $$6 = this.a($$1);

      for (int $$7 = 0; $$7 < $$6 && this.g($$0.a_($$4)); $$7++) {
         $$0.b($$4, $$3.a(e, Integer.valueOf($$5)));
         $$4 = $$4.a(this.a);
         $$5 = Math.min($$5 + 1, 25);
      }
   }

   protected abstract int a(ayw var1);

   protected abstract boolean g(dtc var1);

   @Override
   protected djn c() {
      return this;
   }
}
