import javax.annotation.Nullable;

public class crg extends cri {
   private final hz b;
   protected boolean a = true;

   public crg(chh $$0, blt $$1, coz $$2, eno $$3) {
      this($$0.dM(), $$0, $$1, $$2, $$3);
   }

   public crg(cri $$0) {
      this($$0.q(), $$0.o(), $$0.p(), $$0.n(), $$0.j());
   }

   protected crg(cvn $$0, @Nullable chh $$1, blt $$2, coz $$3, eno $$4) {
      super($$0, $$1, $$2, $$3, $$4);
      this.b = $$4.a().a($$4.b());
      this.a = $$0.a_($$4.a()).a(this);
   }

   public static crg a(crg $$0, hz $$1, ie $$2) {
      return new crg(
         $$0.q(),
         $$0.o(),
         $$0.p(),
         $$0.n(),
         new eno(
            new ens((double)$$1.u() + 0.5 + (double)$$2.j() * 0.5, (double)$$1.v() + 0.5 + (double)$$2.k() * 0.5, (double)$$1.w() + 0.5 + (double)$$2.l() * 0.5),
            $$2,
            $$1,
            false
         )
      );
   }

   @Override
   public hz a() {
      return this.a ? super.a() : this.b;
   }

   public boolean b() {
      return this.a || this.q().a_(this.a()).a(this);
   }

   public boolean c() {
      return this.a;
   }

   public ie d() {
      return ie.a(this.o())[0];
   }

   public ie e() {
      return ie.a(this.o(), ie.a.b);
   }

   public ie[] f() {
      ie[] $$0 = ie.a(this.o());
      if (this.a) {
         return $$0;
      } else {
         ie $$1 = this.k();
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
