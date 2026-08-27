import javax.annotation.Nullable;

public class cln extends clp {
   private final gw b;
   protected boolean a = true;

   public cln(cbu $$0, bgx $$1, cjf $$2, ehj $$3) {
      this($$0.dL(), $$0, $$1, $$2, $$3);
   }

   public cln(clp $$0) {
      this($$0.q(), $$0.o(), $$0.p(), $$0.n(), $$0.j());
   }

   protected cln(cpv $$0, @Nullable cbu $$1, bgx $$2, cjf $$3, ehj $$4) {
      super($$0, $$1, $$2, $$3, $$4);
      this.b = $$4.a().a($$4.b());
      this.a = $$0.a_($$4.a()).a(this);
   }

   public static cln a(cln $$0, gw $$1, ha $$2) {
      return new cln(
         $$0.q(),
         $$0.o(),
         $$0.p(),
         $$0.n(),
         new ehj(
            new ehn((double)$$1.u() + 0.5 + (double)$$2.j() * 0.5, (double)$$1.v() + 0.5 + (double)$$2.k() * 0.5, (double)$$1.w() + 0.5 + (double)$$2.l() * 0.5),
            $$2,
            $$1,
            false
         )
      );
   }

   @Override
   public gw a() {
      return this.a ? super.a() : this.b;
   }

   public boolean b() {
      return this.a || this.q().a_(this.a()).a(this);
   }

   public boolean c() {
      return this.a;
   }

   public ha d() {
      return ha.a(this.o())[0];
   }

   public ha e() {
      return ha.a(this.o(), ha.a.b);
   }

   public ha[] f() {
      ha[] $$0 = ha.a(this.o());
      if (this.a) {
         return $$0;
      } else {
         ha $$1 = this.k();
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
