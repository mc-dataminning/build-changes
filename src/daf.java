import com.mojang.serialization.MapCodec;

public abstract class daf extends dad implements cwt {
   public static final dkh e = djx.ax;
   public static final int f = 25;
   private final double c;

   protected daf(djg.d $$0, ic $$1, emm $$2, boolean $$3, double $$4) {
      super($$0, $$1, $$2, $$3);
      this.c = $$4;
      this.k(this.E.b().a(e, Integer.valueOf(0)));
   }

   @Override
   protected abstract MapCodec<? extends daf> a();

   @Override
   public djh a(ctq $$0) {
      return this.o().a(e, Integer.valueOf($$0.F_().a(25)));
   }

   @Override
   public boolean e_(djh $$0) {
      return $$0.c(e) < 25;
   }

   @Override
   public void b(djh $$0, and $$1, hx $$2, auv $$3) {
      if ($$0.c(e) < 25 && $$3.j() < this.c) {
         hx $$4 = $$2.a(this.a);
         if (this.g($$1.a_($$4))) {
            $$1.b($$4, this.a($$0, $$1.z));
         }
      }
   }

   protected djh a(djh $$0, auv $$1) {
      return $$0.a(e);
   }

   public djh n(djh $$0) {
      return $$0.a(e, Integer.valueOf(25));
   }

   public boolean o(djh $$0) {
      return $$0.c(e) == 25;
   }

   protected djh a(djh $$0, djh $$1) {
      return $$1;
   }

   @Override
   public djh a(djh $$0, ic $$1, djh $$2, ctq $$3, hx $$4, hx $$5) {
      if ($$1 == this.a.g() && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      if ($$1 != this.a || !$$2.a(this) && !$$2.a(this.b())) {
         if (this.b) {
            $$3.a($$4, ees.c, ees.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return this.a($$0, this.b().o());
      }
   }

   @Override
   protected void a(dji.a<cwq, djh> $$0) {
      $$0.a(e);
   }

   @Override
   public boolean b(cts $$0, hx $$1, djh $$2) {
      return this.g($$0.a_($$1.a(this.a)));
   }

   @Override
   public boolean a(ctp $$0, auv $$1, hx $$2, djh $$3) {
      return true;
   }

   @Override
   public void a(and $$0, auv $$1, hx $$2, djh $$3) {
      hx $$4 = $$2.a(this.a);
      int $$5 = Math.min($$3.c(e) + 1, 25);
      int $$6 = this.a($$1);

      for (int $$7 = 0; $$7 < $$6 && this.g($$0.a_($$4)); $$7++) {
         $$0.b($$4, $$3.a(e, Integer.valueOf($$5)));
         $$4 = $$4.a(this.a);
         $$5 = Math.min($$5 + 1, 25);
      }
   }

   protected abstract int a(auv var1);

   protected abstract boolean g(djh var1);

   @Override
   protected daf c() {
      return this;
   }
}
