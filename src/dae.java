import javax.annotation.Nullable;

public class dae extends dag {
   private final ji b;
   protected boolean a = true;

   public dae(cov $$0, bsh $$1, cwn $$2, fau $$3) {
      this($$0.dW(), $$0, $$1, $$2, $$3);
   }

   public dae(dag $$0) {
      this($$0.q(), $$0.o(), $$0.p(), $$0.n(), $$0.j());
   }

   protected dae(dgg $$0, @Nullable cov $$1, bsh $$2, cwn $$3, fau $$4) {
      super($$0, $$1, $$2, $$3, $$4);
      this.b = $$4.b().a($$4.c());
      this.a = $$0.a_($$4.b()).a(this);
   }

   public static dae a(dae $$0, ji $$1, jn $$2) {
      return new dae(
         $$0.q(),
         $$0.o(),
         $$0.p(),
         $$0.n(),
         new fau(
            new fay((double)$$1.u() + 0.5 + (double)$$2.j() * 0.5, (double)$$1.v() + 0.5 + (double)$$2.k() * 0.5, (double)$$1.w() + 0.5 + (double)$$2.l() * 0.5),
            $$2,
            $$1,
            false
         )
      );
   }

   @Override
   public ji a() {
      return this.a ? super.a() : this.b;
   }

   public boolean b() {
      return this.a || this.q().a_(this.a()).a(this);
   }

   public boolean c() {
      return this.a;
   }

   public jn d() {
      return jn.a(this.o())[0];
   }

   public jn e() {
      return jn.a(this.o(), jn.a.b);
   }

   public jn[] f() {
      jn[] $$0 = jn.a(this.o());
      if (this.a) {
         return $$0;
      } else {
         jn $$1 = this.k();
         int $$2 = 0;

         while ($$2 < $$0.length && $$0[$$2] != $$1.g()) {
            $$2++;
         }

         if ($$2 > 0) {
            System.arraycopy($$0, 0, $$0, 1, $$2);
            $$0[0] = $$1.g();
         }

         return $$0;
      }
   }
}
