import javax.annotation.Nullable;

public class cyd extends cyf {
   private final ir b;
   protected boolean a = true;

   public cyd(cly $$0, bpz $$1, cuh $$2, ewq $$3) {
      this($$0.dU(), $$0, $$1, $$2, $$3);
   }

   public cyd(cyf $$0) {
      this($$0.q(), $$0.o(), $$0.p(), $$0.n(), $$0.j());
   }

   protected cyd(dca $$0, @Nullable cly $$1, bpz $$2, cuh $$3, ewq $$4) {
      super($$0, $$1, $$2, $$3, $$4);
      this.b = $$4.a().a($$4.b());
      this.a = $$0.a_($$4.a()).a(this);
   }

   public static cyd a(cyd $$0, ir $$1, iw $$2) {
      return new cyd(
         $$0.q(),
         $$0.o(),
         $$0.p(),
         $$0.n(),
         new ewq(
            new ewu((double)$$1.u() + 0.5 + (double)$$2.j() * 0.5, (double)$$1.v() + 0.5 + (double)$$2.k() * 0.5, (double)$$1.w() + 0.5 + (double)$$2.l() * 0.5),
            $$2,
            $$1,
            false
         )
      );
   }

   @Override
   public ir a() {
      return this.a ? super.a() : this.b;
   }

   public boolean b() {
      return this.a || this.q().a_(this.a()).a(this);
   }

   public boolean c() {
      return this.a;
   }

   public iw d() {
      return iw.a(this.o())[0];
   }

   public iw e() {
      return iw.a(this.o(), iw.a.b);
   }

   public iw[] f() {
      iw[] $$0 = iw.a(this.o());
      if (this.a) {
         return $$0;
      } else {
         iw $$1 = this.k();
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
