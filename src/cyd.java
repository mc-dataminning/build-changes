import javax.annotation.Nullable;

public class cyd extends cyf {
   private final jd b;
   protected boolean a = true;

   public cyd(cmx $$0, bqq $$1, cuq $$2, ewy $$3) {
      this($$0.dO(), $$0, $$1, $$2, $$3);
   }

   public cyd(cyf $$0) {
      this($$0.q(), $$0.o(), $$0.p(), $$0.n(), $$0.j());
   }

   protected cyd(dcw $$0, @Nullable cmx $$1, bqq $$2, cuq $$3, ewy $$4) {
      super($$0, $$1, $$2, $$3, $$4);
      this.b = $$4.a().a($$4.b());
      this.a = $$0.a_($$4.a()).a(this);
   }

   public static cyd a(cyd $$0, jd $$1, ji $$2) {
      return new cyd(
         $$0.q(),
         $$0.o(),
         $$0.p(),
         $$0.n(),
         new ewy(
            new exc((double)$$1.u() + 0.5 + (double)$$2.j() * 0.5, (double)$$1.v() + 0.5 + (double)$$2.k() * 0.5, (double)$$1.w() + 0.5 + (double)$$2.l() * 0.5),
            $$2,
            $$1,
            false
         )
      );
   }

   @Override
   public jd a() {
      return this.a ? super.a() : this.b;
   }

   public boolean b() {
      return this.a || this.q().a_(this.a()).a(this);
   }

   public boolean c() {
      return this.a;
   }

   public ji d() {
      return ji.a(this.o())[0];
   }

   public ji e() {
      return ji.a(this.o(), ji.a.b);
   }

   public ji[] f() {
      ji[] $$0 = ji.a(this.o());
      if (this.a) {
         return $$0;
      } else {
         ji $$1 = this.k();
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
