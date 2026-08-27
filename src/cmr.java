import javax.annotation.Nullable;

public class cmr extends cmt {
   private final ht b;
   protected boolean a = true;

   public cmr(ccx $$0, bia $$1, ckj $$2, eib $$3) {
      this($$0.dL(), $$0, $$1, $$2, $$3);
   }

   public cmr(cmt $$0) {
      this($$0.q(), $$0.o(), $$0.p(), $$0.n(), $$0.j());
   }

   protected cmr(cqz $$0, @Nullable ccx $$1, bia $$2, ckj $$3, eib $$4) {
      super($$0, $$1, $$2, $$3, $$4);
      this.b = $$4.a().a($$4.b());
      this.a = $$0.a_($$4.a()).a(this);
   }

   public static cmr a(cmr $$0, ht $$1, hx $$2) {
      return new cmr(
         $$0.q(),
         $$0.o(),
         $$0.p(),
         $$0.n(),
         new eib(
            new eif((double)$$1.u() + 0.5 + (double)$$2.j() * 0.5, (double)$$1.v() + 0.5 + (double)$$2.k() * 0.5, (double)$$1.w() + 0.5 + (double)$$2.l() * 0.5),
            $$2,
            $$1,
            false
         )
      );
   }

   @Override
   public ht a() {
      return this.a ? super.a() : this.b;
   }

   public boolean b() {
      return this.a || this.q().a_(this.a()).a(this);
   }

   public boolean c() {
      return this.a;
   }

   public hx d() {
      return hx.a(this.o())[0];
   }

   public hx e() {
      return hx.a(this.o(), hx.a.b);
   }

   public hx[] f() {
      hx[] $$0 = hx.a(this.o());
      if (this.a) {
         return $$0;
      } else {
         hx $$1 = this.k();
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
