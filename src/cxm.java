import javax.annotation.Nullable;

public class cxm extends cxo {
   private final ja b;
   protected boolean a = true;

   public cxm(cmk $$0, bqf $$1, cuc $$2, ewb $$3) {
      this($$0.dQ(), $$0, $$1, $$2, $$3);
   }

   public cxm(cxo $$0) {
      this($$0.q(), $$0.o(), $$0.p(), $$0.n(), $$0.j());
   }

   protected cxm(dcf $$0, @Nullable cmk $$1, bqf $$2, cuc $$3, ewb $$4) {
      super($$0, $$1, $$2, $$3, $$4);
      this.b = $$4.a().a($$4.b());
      this.a = $$0.a_($$4.a()).a(this);
   }

   public static cxm a(cxm $$0, ja $$1, jf $$2) {
      return new cxm(
         $$0.q(),
         $$0.o(),
         $$0.p(),
         $$0.n(),
         new ewb(
            new ewf((double)$$1.u() + 0.5 + (double)$$2.j() * 0.5, (double)$$1.v() + 0.5 + (double)$$2.k() * 0.5, (double)$$1.w() + 0.5 + (double)$$2.l() * 0.5),
            $$2,
            $$1,
            false
         )
      );
   }

   @Override
   public ja a() {
      return this.a ? super.a() : this.b;
   }

   public boolean b() {
      return this.a || this.q().a_(this.a()).a(this);
   }

   public boolean c() {
      return this.a;
   }

   public jf d() {
      return jf.a(this.o())[0];
   }

   public jf e() {
      return jf.a(this.o(), jf.a.b);
   }

   public jf[] f() {
      jf[] $$0 = jf.a(this.o());
      if (this.a) {
         return $$0;
      } else {
         jf $$1 = this.k();
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
