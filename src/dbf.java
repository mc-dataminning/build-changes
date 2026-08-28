import javax.annotation.Nullable;

public class dbf extends dbh {
   private final jh b;
   protected boolean a = true;

   public dbf(cpw $$0, bth $$1, cxo $$2, fbt $$3) {
      this($$0.dV(), $$0, $$1, $$2, $$3);
   }

   public dbf(dbh $$0) {
      this($$0.q(), $$0.o(), $$0.p(), $$0.n(), $$0.j());
   }

   protected dbf(dhh $$0, @Nullable cpw $$1, bth $$2, cxo $$3, fbt $$4) {
      super($$0, $$1, $$2, $$3, $$4);
      this.b = $$4.b().a($$4.c());
      this.a = $$0.a_($$4.b()).a(this);
   }

   public static dbf a(dbf $$0, jh $$1, jm $$2) {
      return new dbf(
         $$0.q(),
         $$0.o(),
         $$0.p(),
         $$0.n(),
         new fbt(
            new fbx((double)$$1.u() + 0.5 + (double)$$2.j() * 0.5, (double)$$1.v() + 0.5 + (double)$$2.k() * 0.5, (double)$$1.w() + 0.5 + (double)$$2.l() * 0.5),
            $$2,
            $$1,
            false
         )
      );
   }

   @Override
   public jh a() {
      return this.a ? super.a() : this.b;
   }

   public boolean b() {
      return this.a || this.q().a_(this.a()).a(this);
   }

   public boolean c() {
      return this.a;
   }

   public jm d() {
      return jm.a(this.o())[0];
   }

   public jm e() {
      return jm.a(this.o(), jm.a.b);
   }

   public jm[] f() {
      jm[] $$0 = jm.a(this.o());
      if (this.a) {
         return $$0;
      } else {
         jm $$1 = this.k();
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
