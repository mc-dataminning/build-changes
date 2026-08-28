import javax.annotation.Nullable;

public class ddd extends ddf {
   private final iv b;
   protected boolean a = true;

   public ddd(crj $$0, buf $$1, czk $$2, fet $$3) {
      this($$0.dU(), $$0, $$1, $$2, $$3);
   }

   public ddd(ddf $$0) {
      this($$0.q(), $$0.o(), $$0.p(), $$0.n(), $$0.j());
   }

   protected ddd(djh $$0, @Nullable crj $$1, buf $$2, czk $$3, fet $$4) {
      super($$0, $$1, $$2, $$3, $$4);
      this.b = $$4.b().a($$4.c());
      this.a = $$0.a_($$4.b()).a(this);
   }

   public static ddd a(ddd $$0, iv $$1, jb $$2) {
      return new ddd(
         $$0.q(),
         $$0.o(),
         $$0.p(),
         $$0.n(),
         new fet(
            new fex((double)$$1.u() + 0.5 + (double)$$2.j() * 0.5, (double)$$1.v() + 0.5 + (double)$$2.k() * 0.5, (double)$$1.w() + 0.5 + (double)$$2.l() * 0.5),
            $$2,
            $$1,
            false
         )
      );
   }

   @Override
   public iv a() {
      return this.a ? super.a() : this.b;
   }

   public boolean b() {
      return this.a || this.q().a_(this.a()).a(this);
   }

   public boolean c() {
      return this.a;
   }

   public jb d() {
      return jb.a(this.o())[0];
   }

   public jb e() {
      return jb.a(this.o(), jb.a.b);
   }

   public jb[] f() {
      jb[] $$0 = jb.a(this.o());
      if (this.a) {
         return $$0;
      } else {
         jb $$1 = this.k();
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
