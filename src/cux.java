import javax.annotation.Nullable;

public class cux extends cuz {
   private final id b;
   protected boolean a = true;

   public cux(cka $$0, boe $$1, crs $$2, esf $$3) {
      this($$0.dM(), $$0, $$1, $$2, $$3);
   }

   public cux(cuz $$0) {
      this($$0.q(), $$0.o(), $$0.p(), $$0.n(), $$0.j());
   }

   protected cux(czg $$0, @Nullable cka $$1, boe $$2, crs $$3, esf $$4) {
      super($$0, $$1, $$2, $$3, $$4);
      this.b = $$4.a().a($$4.b());
      this.a = $$0.a_($$4.a()).a(this);
   }

   public static cux a(cux $$0, id $$1, ij $$2) {
      return new cux(
         $$0.q(),
         $$0.o(),
         $$0.p(),
         $$0.n(),
         new esf(
            new esj((double)$$1.u() + 0.5 + (double)$$2.j() * 0.5, (double)$$1.v() + 0.5 + (double)$$2.k() * 0.5, (double)$$1.w() + 0.5 + (double)$$2.l() * 0.5),
            $$2,
            $$1,
            false
         )
      );
   }

   @Override
   public id a() {
      return this.a ? super.a() : this.b;
   }

   public boolean b() {
      return this.a || this.q().a_(this.a()).a(this);
   }

   public boolean c() {
      return this.a;
   }

   public ij d() {
      return ij.a(this.o())[0];
   }

   public ij e() {
      return ij.a(this.o(), ij.a.b);
   }

   public ij[] f() {
      ij[] $$0 = ij.a(this.o());
      if (this.a) {
         return $$0;
      } else {
         ij $$1 = this.k();
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
