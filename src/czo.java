import com.mojang.serialization.MapCodec;

public abstract class czo extends czm implements cwc {
   public static final djp e = djf.ax;
   public static final int f = 25;
   private final double c;

   protected czo(dio.d $$0, ia $$1, elu $$2, boolean $$3, double $$4) {
      super($$0, $$1, $$2, $$3);
      this.c = $$4;
      this.k(this.E.b().a(e, Integer.valueOf(0)));
   }

   @Override
   protected abstract MapCodec<? extends czo> a();

   @Override
   public dip a(csz $$0) {
      return this.o().a(e, Integer.valueOf($$0.F_().a(25)));
   }

   @Override
   public boolean e_(dip $$0) {
      return $$0.c(e) < 25;
   }

   @Override
   public void b(dip $$0, amp $$1, hv $$2, auf $$3) {
      if ($$0.c(e) < 25 && $$3.j() < this.c) {
         hv $$4 = $$2.a(this.a);
         if (this.g($$1.a_($$4))) {
            $$1.b($$4, this.a($$0, $$1.z));
         }
      }
   }

   protected dip a(dip $$0, auf $$1) {
      return $$0.a(e);
   }

   public dip n(dip $$0) {
      return $$0.a(e, Integer.valueOf(25));
   }

   public boolean o(dip $$0) {
      return $$0.c(e) == 25;
   }

   protected dip a(dip $$0, dip $$1) {
      return $$1;
   }

   @Override
   public dip a(dip $$0, ia $$1, dip $$2, csz $$3, hv $$4, hv $$5) {
      if ($$1 == this.a.g() && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      if ($$1 != this.a || !$$2.a(this) && !$$2.a(this.b())) {
         if (this.b) {
            $$3.a($$4, eea.c, eea.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return this.a($$0, this.b().o());
      }
   }

   @Override
   protected void a(diq.a<cvz, dip> $$0) {
      $$0.a(e);
   }

   @Override
   public boolean b(ctb $$0, hv $$1, dip $$2) {
      return this.g($$0.a_($$1.a(this.a)));
   }

   @Override
   public boolean a(csy $$0, auf $$1, hv $$2, dip $$3) {
      return true;
   }

   @Override
   public void a(amp $$0, auf $$1, hv $$2, dip $$3) {
      hv $$4 = $$2.a(this.a);
      int $$5 = Math.min($$3.c(e) + 1, 25);
      int $$6 = this.a($$1);

      for (int $$7 = 0; $$7 < $$6 && this.g($$0.a_($$4)); $$7++) {
         $$0.b($$4, $$3.a(e, Integer.valueOf($$5)));
         $$4 = $$4.a(this.a);
         $$5 = Math.min($$5 + 1, 25);
      }
   }

   protected abstract int a(auf var1);

   protected abstract boolean g(dip var1);

   @Override
   protected czo c() {
      return this;
   }
}
