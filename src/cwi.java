import javax.annotation.Nullable;

public class cwi extends cwk {
   private final in b;
   protected boolean a = true;

   public cwi(clh $$0, bpl $$1, csz $$2, etl $$3) {
      this($$0.dN(), $$0, $$1, $$2, $$3);
   }

   public cwi(cwk $$0) {
      this($$0.q(), $$0.o(), $$0.p(), $$0.n(), $$0.j());
   }

   protected cwi(dad $$0, @Nullable clh $$1, bpl $$2, csz $$3, etl $$4) {
      super($$0, $$1, $$2, $$3, $$4);
      this.b = $$4.a().a($$4.b());
      this.a = $$0.a_($$4.a()).a(this);
   }

   public static cwi a(cwi $$0, in $$1, is $$2) {
      return new cwi(
         $$0.q(),
         $$0.o(),
         $$0.p(),
         $$0.n(),
         new etl(
            new etp((double)$$1.u() + 0.5 + (double)$$2.j() * 0.5, (double)$$1.v() + 0.5 + (double)$$2.k() * 0.5, (double)$$1.w() + 0.5 + (double)$$2.l() * 0.5),
            $$2,
            $$1,
            false
         )
      );
   }

   @Override
   public in a() {
      return this.a ? super.a() : this.b;
   }

   public boolean b() {
      return this.a || this.q().a_(this.a()).a(this);
   }

   public boolean c() {
      return this.a;
   }

   public is d() {
      return is.a(this.o())[0];
   }

   public is e() {
      return is.a(this.o(), is.a.b);
   }

   public is[] f() {
      is[] $$0 = is.a(this.o());
      if (this.a) {
         return $$0;
      } else {
         is $$1 = this.k();
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
