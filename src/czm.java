import javax.annotation.Nullable;

public class czm extends czo {
   private final jg b;
   protected boolean a = true;

   public czm(coh $$0, brx $$1, cvx $$2, ezd $$3) {
      this($$0.dX(), $$0, $$1, $$2, $$3);
   }

   public czm(czo $$0) {
      this($$0.q(), $$0.o(), $$0.p(), $$0.n(), $$0.j());
   }

   protected czm(dev $$0, @Nullable coh $$1, brx $$2, cvx $$3, ezd $$4) {
      super($$0, $$1, $$2, $$3, $$4);
      this.b = $$4.b().a($$4.c());
      this.a = $$0.a_($$4.b()).a(this);
   }

   public static czm a(czm $$0, jg $$1, jl $$2) {
      return new czm(
         $$0.q(),
         $$0.o(),
         $$0.p(),
         $$0.n(),
         new ezd(
            new ezh((double)$$1.u() + 0.5 + (double)$$2.j() * 0.5, (double)$$1.v() + 0.5 + (double)$$2.k() * 0.5, (double)$$1.w() + 0.5 + (double)$$2.l() * 0.5),
            $$2,
            $$1,
            false
         )
      );
   }

   @Override
   public jg a() {
      return this.a ? super.a() : this.b;
   }

   public boolean b() {
      return this.a || this.q().a_(this.a()).a(this);
   }

   public boolean c() {
      return this.a;
   }

   public jl d() {
      return jl.a(this.o())[0];
   }

   public jl e() {
      return jl.a(this.o(), jl.a.b);
   }

   public jl[] f() {
      jl[] $$0 = jl.a(this.o());
      if (this.a) {
         return $$0;
      } else {
         jl $$1 = this.k();
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
