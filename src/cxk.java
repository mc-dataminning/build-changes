import javax.annotation.Nullable;

public class cxk extends cxm {
   private final ja b;
   protected boolean a = true;

   public cxk(cmh $$0, bqc $$1, cua $$2, evv $$3) {
      this($$0.dP(), $$0, $$1, $$2, $$3);
   }

   public cxk(cxm $$0) {
      this($$0.q(), $$0.o(), $$0.p(), $$0.n(), $$0.j());
   }

   protected cxk(dcd $$0, @Nullable cmh $$1, bqc $$2, cua $$3, evv $$4) {
      super($$0, $$1, $$2, $$3, $$4);
      this.b = $$4.a().a($$4.b());
      this.a = $$0.a_($$4.a()).a(this);
   }

   public static cxk a(cxk $$0, ja $$1, jf $$2) {
      return new cxk(
         $$0.q(),
         $$0.o(),
         $$0.p(),
         $$0.n(),
         new evv(
            new evz((double)$$1.u() + 0.5 + (double)$$2.j() * 0.5, (double)$$1.v() + 0.5 + (double)$$2.k() * 0.5, (double)$$1.w() + 0.5 + (double)$$2.l() * 0.5),
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
