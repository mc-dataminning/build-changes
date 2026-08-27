import javax.annotation.Nullable;

public class cxb extends cxd {
   private final io b;
   protected boolean a = true;

   public cxb(cly $$0, bpv $$1, ctq $$2, eui $$3) {
      this($$0.dP(), $$0, $$1, $$2, $$3);
   }

   public cxb(cxd $$0) {
      this($$0.q(), $$0.o(), $$0.p(), $$0.n(), $$0.j());
   }

   protected cxb(daz $$0, @Nullable cly $$1, bpv $$2, ctq $$3, eui $$4) {
      super($$0, $$1, $$2, $$3, $$4);
      this.b = $$4.a().a($$4.b());
      this.a = $$0.a_($$4.a()).a(this);
   }

   public static cxb a(cxb $$0, io $$1, it $$2) {
      return new cxb(
         $$0.q(),
         $$0.o(),
         $$0.p(),
         $$0.n(),
         new eui(
            new eum((double)$$1.u() + 0.5 + (double)$$2.j() * 0.5, (double)$$1.v() + 0.5 + (double)$$2.k() * 0.5, (double)$$1.w() + 0.5 + (double)$$2.l() * 0.5),
            $$2,
            $$1,
            false
         )
      );
   }

   @Override
   public io a() {
      return this.a ? super.a() : this.b;
   }

   public boolean b() {
      return this.a || this.q().a_(this.a()).a(this);
   }

   public boolean c() {
      return this.a;
   }

   public it d() {
      return it.a(this.o())[0];
   }

   public it e() {
      return it.a(this.o(), it.a.b);
   }

   public it[] f() {
      it[] $$0 = it.a(this.o());
      if (this.a) {
         return $$0;
      } else {
         it $$1 = this.k();
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
