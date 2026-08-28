import javax.annotation.Nullable;

public class ddt extends ddv {
   private final iw b;
   protected boolean a = true;

   public ddt(crz $$0, bus $$1, daa $$2, ffo $$3) {
      this($$0.dV(), $$0, $$1, $$2, $$3);
   }

   public ddt(ddv $$0) {
      this($$0.q(), $$0.o(), $$0.p(), $$0.n(), $$0.j());
   }

   protected ddt(djz $$0, @Nullable crz $$1, bus $$2, daa $$3, ffo $$4) {
      super($$0, $$1, $$2, $$3, $$4);
      this.b = $$4.b().a($$4.c());
      this.a = $$0.a_($$4.b()).a(this);
   }

   public static ddt a(ddt $$0, iw $$1, jc $$2) {
      return new ddt(
         $$0.q(),
         $$0.o(),
         $$0.p(),
         $$0.n(),
         new ffo(
            new ffs((double)$$1.u() + 0.5 + (double)$$2.j() * 0.5, (double)$$1.v() + 0.5 + (double)$$2.k() * 0.5, (double)$$1.w() + 0.5 + (double)$$2.l() * 0.5),
            $$2,
            $$1,
            false
         )
      );
   }

   @Override
   public iw a() {
      return this.a ? super.a() : this.b;
   }

   public boolean b() {
      return this.a || this.q().a_(this.a()).a(this);
   }

   public boolean c() {
      return this.a;
   }

   public jc d() {
      return jc.a(this.o())[0];
   }

   public jc e() {
      return jc.a(this.o(), jc.a.b);
   }

   public jc[] f() {
      jc[] $$0 = jc.a(this.o());
      if (this.a) {
         return $$0;
      } else {
         jc $$1 = this.k();
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
