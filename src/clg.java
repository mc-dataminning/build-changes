import javax.annotation.Nullable;

public class clg extends cli {
   private final gu b;
   protected boolean a = true;

   public clg(cbn $$0, bgp $$1, ciy $$2, eha $$3) {
      this($$0.dK(), $$0, $$1, $$2, $$3);
   }

   public clg(cli $$0) {
      this($$0.q(), $$0.o(), $$0.p(), $$0.n(), $$0.j());
   }

   protected clg(cpm $$0, @Nullable cbn $$1, bgp $$2, ciy $$3, eha $$4) {
      super($$0, $$1, $$2, $$3, $$4);
      this.b = $$4.a().a($$4.b());
      this.a = $$0.a_($$4.a()).a(this);
   }

   public static clg a(clg $$0, gu $$1, ha $$2) {
      return new clg(
         $$0.q(),
         $$0.o(),
         $$0.p(),
         $$0.n(),
         new eha(
            new ehe((double)$$1.u() + 0.5 + (double)$$2.j() * 0.5, (double)$$1.v() + 0.5 + (double)$$2.k() * 0.5, (double)$$1.w() + 0.5 + (double)$$2.l() * 0.5),
            $$2,
            $$1,
            false
         )
      );
   }

   @Override
   public gu a() {
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
