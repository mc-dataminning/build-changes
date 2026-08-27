import javax.annotation.Nullable;

public class coq extends cos {
   private final hv b;
   protected boolean a = true;

   public coq(cer $$0, bjk $$1, cmh $$2, ekx $$3) {
      this($$0.dM(), $$0, $$1, $$2, $$3);
   }

   public coq(cos $$0) {
      this($$0.q(), $$0.o(), $$0.p(), $$0.n(), $$0.j());
   }

   protected coq(csy $$0, @Nullable cer $$1, bjk $$2, cmh $$3, ekx $$4) {
      super($$0, $$1, $$2, $$3, $$4);
      this.b = $$4.a().a($$4.b());
      this.a = $$0.a_($$4.a()).a(this);
   }

   public static coq a(coq $$0, hv $$1, ia $$2) {
      return new coq(
         $$0.q(),
         $$0.o(),
         $$0.p(),
         $$0.n(),
         new ekx(
            new elb((double)$$1.u() + 0.5 + (double)$$2.j() * 0.5, (double)$$1.v() + 0.5 + (double)$$2.k() * 0.5, (double)$$1.w() + 0.5 + (double)$$2.l() * 0.5),
            $$2,
            $$1,
            false
         )
      );
   }

   @Override
   public hv a() {
      return this.a ? super.a() : this.b;
   }

   public boolean b() {
      return this.a || this.q().a_(this.a()).a(this);
   }

   public boolean c() {
      return this.a;
   }

   public ia d() {
      return ia.a(this.o())[0];
   }

   public ia e() {
      return ia.a(this.o(), ia.a.b);
   }

   public ia[] f() {
      ia[] $$0 = ia.a(this.o());
      if (this.a) {
         return $$0;
      } else {
         ia $$1 = this.k();
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
