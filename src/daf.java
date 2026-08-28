import javax.annotation.Nullable;

public class daf extends dah {
   private final ji b;
   protected boolean a = true;

   public daf(cow $$0, bsi $$1, cwo $$2, fav $$3) {
      this($$0.dV(), $$0, $$1, $$2, $$3);
   }

   public daf(dah $$0) {
      this($$0.q(), $$0.o(), $$0.p(), $$0.n(), $$0.j());
   }

   protected daf(dgh $$0, @Nullable cow $$1, bsi $$2, cwo $$3, fav $$4) {
      super($$0, $$1, $$2, $$3, $$4);
      this.b = $$4.b().a($$4.c());
      this.a = $$0.a_($$4.b()).a(this);
   }

   public static daf a(daf $$0, ji $$1, jn $$2) {
      return new daf(
         $$0.q(),
         $$0.o(),
         $$0.p(),
         $$0.n(),
         new fav(
            new faz((double)$$1.u() + 0.5 + (double)$$2.j() * 0.5, (double)$$1.v() + 0.5 + (double)$$2.k() * 0.5, (double)$$1.w() + 0.5 + (double)$$2.l() * 0.5),
            $$2,
            $$1,
            false
         )
      );
   }

   @Override
   public ji a() {
      return this.a ? super.a() : this.b;
   }

   public boolean b() {
      return this.a || this.q().a_(this.a()).a(this);
   }

   public boolean c() {
      return this.a;
   }

   public jn d() {
      return jn.a(this.o())[0];
   }

   public jn e() {
      return jn.a(this.o(), jn.a.b);
   }

   public jn[] f() {
      jn[] $$0 = jn.a(this.o());
      if (this.a) {
         return $$0;
      } else {
         jn $$1 = this.k();
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
