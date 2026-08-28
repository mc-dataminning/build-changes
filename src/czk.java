import javax.annotation.Nullable;

public class czk extends czm {
   private final je b;
   protected boolean a = true;

   public czk(cnu $$0, bro $$1, cvp $$2, eyo $$3) {
      this($$0.dS(), $$0, $$1, $$2, $$3);
   }

   public czk(czm $$0) {
      this($$0.q(), $$0.o(), $$0.p(), $$0.n(), $$0.j());
   }

   protected czk(deg $$0, @Nullable cnu $$1, bro $$2, cvp $$3, eyo $$4) {
      super($$0, $$1, $$2, $$3, $$4);
      this.b = $$4.b().a($$4.c());
      this.a = $$0.a_($$4.b()).a(this);
   }

   public static czk a(czk $$0, je $$1, jj $$2) {
      return new czk(
         $$0.q(),
         $$0.o(),
         $$0.p(),
         $$0.n(),
         new eyo(
            new eys((double)$$1.u() + 0.5 + (double)$$2.j() * 0.5, (double)$$1.v() + 0.5 + (double)$$2.k() * 0.5, (double)$$1.w() + 0.5 + (double)$$2.l() * 0.5),
            $$2,
            $$1,
            false
         )
      );
   }

   @Override
   public je a() {
      return this.a ? super.a() : this.b;
   }

   public boolean b() {
      return this.a || this.q().a_(this.a()).a(this);
   }

   public boolean c() {
      return this.a;
   }

   public jj d() {
      return jj.a(this.o())[0];
   }

   public jj e() {
      return jj.a(this.o(), jj.a.b);
   }

   public jj[] f() {
      jj[] $$0 = jj.a(this.o());
      if (this.a) {
         return $$0;
      } else {
         jj $$1 = this.k();
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
