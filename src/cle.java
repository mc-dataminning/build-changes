import javax.annotation.Nullable;

public class cle extends clg {
   private final gv b;
   protected boolean a = true;

   public cle(cbl $$0, bgn $$1, ciw $$2, ehb $$3) {
      this($$0.dK(), $$0, $$1, $$2, $$3);
   }

   public cle(clg $$0) {
      this($$0.q(), $$0.o(), $$0.p(), $$0.n(), $$0.j());
   }

   protected cle(cpk $$0, @Nullable cbl $$1, bgn $$2, ciw $$3, ehb $$4) {
      super($$0, $$1, $$2, $$3, $$4);
      this.b = $$4.a().a($$4.b());
      this.a = $$0.a_($$4.a()).a(this);
   }

   public static cle a(cle $$0, gv $$1, hb $$2) {
      return new cle(
         $$0.q(),
         $$0.o(),
         $$0.p(),
         $$0.n(),
         new ehb(
            new ehf((double)$$1.u() + 0.5 + (double)$$2.j() * 0.5, (double)$$1.v() + 0.5 + (double)$$2.k() * 0.5, (double)$$1.w() + 0.5 + (double)$$2.l() * 0.5),
            $$2,
            $$1,
            false
         )
      );
   }

   @Override
   public gv a() {
      return this.a ? super.a() : this.b;
   }

   public boolean b() {
      return this.a || this.q().a_(this.a()).a(this);
   }

   public boolean c() {
      return this.a;
   }

   public hb d() {
      return hb.a(this.o())[0];
   }

   public hb e() {
      return hb.a(this.o(), hb.a.b);
   }

   public hb[] f() {
      hb[] $$0 = hb.a(this.o());
      if (this.a) {
         return $$0;
      } else {
         hb $$1 = this.k();
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
