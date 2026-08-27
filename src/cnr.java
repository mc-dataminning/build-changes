import javax.annotation.Nullable;

public class cnr extends cnt {
   private final ht b;
   protected boolean a = true;

   public cnr(cdu $$0, biw $$1, clj $$2, ejq $$3) {
      this($$0.dN(), $$0, $$1, $$2, $$3);
   }

   public cnr(cnt $$0) {
      this($$0.q(), $$0.o(), $$0.p(), $$0.n(), $$0.j());
   }

   protected cnr(csa $$0, @Nullable cdu $$1, biw $$2, clj $$3, ejq $$4) {
      super($$0, $$1, $$2, $$3, $$4);
      this.b = $$4.a().a($$4.b());
      this.a = $$0.a_($$4.a()).a(this);
   }

   public static cnr a(cnr $$0, ht $$1, hx $$2) {
      return new cnr(
         $$0.q(),
         $$0.o(),
         $$0.p(),
         $$0.n(),
         new ejq(
            new eju((double)$$1.u() + 0.5 + (double)$$2.j() * 0.5, (double)$$1.v() + 0.5 + (double)$$2.k() * 0.5, (double)$$1.w() + 0.5 + (double)$$2.l() * 0.5),
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
