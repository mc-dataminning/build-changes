import javax.annotation.Nullable;

public class dbn extends dbp {
   private final jj b;
   protected boolean a = true;

   public dbn(cqi $$0, btp $$1, cxy $$2, fcq $$3) {
      this($$0.dV(), $$0, $$1, $$2, $$3);
   }

   public dbn(dbp $$0) {
      this($$0.q(), $$0.o(), $$0.p(), $$0.n(), $$0.j());
   }

   protected dbn(dhp $$0, @Nullable cqi $$1, btp $$2, cxy $$3, fcq $$4) {
      super($$0, $$1, $$2, $$3, $$4);
      this.b = $$4.b().a($$4.c());
      this.a = $$0.a_($$4.b()).a(this);
   }

   public static dbn a(dbn $$0, jj $$1, jo $$2) {
      return new dbn(
         $$0.q(),
         $$0.o(),
         $$0.p(),
         $$0.n(),
         new fcq(
            new fcu((double)$$1.u() + 0.5 + (double)$$2.j() * 0.5, (double)$$1.v() + 0.5 + (double)$$2.k() * 0.5, (double)$$1.w() + 0.5 + (double)$$2.l() * 0.5),
            $$2,
            $$1,
            false
         )
      );
   }

   @Override
   public jj a() {
      return this.a ? super.a() : this.b;
   }

   public boolean b() {
      return this.a || this.q().a_(this.a()).a(this);
   }

   public boolean c() {
      return this.a;
   }

   public jo d() {
      return jo.a(this.o())[0];
   }

   public jo e() {
      return jo.a(this.o(), jo.a.b);
   }

   public jo[] f() {
      jo[] $$0 = jo.a(this.o());
      if (this.a) {
         return $$0;
      } else {
         jo $$1 = this.k();
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
