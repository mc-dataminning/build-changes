import javax.annotation.Nullable;

public class czn extends czp {
   private final jf b;
   protected boolean a = true;

   public czn(cnx $$0, brr $$1, cvs $$2, eys $$3) {
      this($$0.dS(), $$0, $$1, $$2, $$3);
   }

   public czn(czp $$0) {
      this($$0.q(), $$0.o(), $$0.p(), $$0.n(), $$0.j());
   }

   protected czn(dej $$0, @Nullable cnx $$1, brr $$2, cvs $$3, eys $$4) {
      super($$0, $$1, $$2, $$3, $$4);
      this.b = $$4.b().a($$4.c());
      this.a = $$0.a_($$4.b()).a(this);
   }

   public static czn a(czn $$0, jf $$1, jk $$2) {
      return new czn(
         $$0.q(),
         $$0.o(),
         $$0.p(),
         $$0.n(),
         new eys(
            new eyw((double)$$1.u() + 0.5 + (double)$$2.j() * 0.5, (double)$$1.v() + 0.5 + (double)$$2.k() * 0.5, (double)$$1.w() + 0.5 + (double)$$2.l() * 0.5),
            $$2,
            $$1,
            false
         )
      );
   }

   @Override
   public jf a() {
      return this.a ? super.a() : this.b;
   }

   public boolean b() {
      return this.a || this.q().a_(this.a()).a(this);
   }

   public boolean c() {
      return this.a;
   }

   public jk d() {
      return jk.a(this.o())[0];
   }

   public jk e() {
      return jk.a(this.o(), jk.a.b);
   }

   public jk[] f() {
      jk[] $$0 = jk.a(this.o());
      if (this.a) {
         return $$0;
      } else {
         jk $$1 = this.k();
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
