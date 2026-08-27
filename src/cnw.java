import javax.annotation.Nullable;

public class cnw extends cny {
   private final hx b;
   protected boolean a = true;

   public cnw(cdz $$0, bja $$1, clo $$2, ejv $$3) {
      this($$0.dN(), $$0, $$1, $$2, $$3);
   }

   public cnw(cny $$0) {
      this($$0.q(), $$0.o(), $$0.p(), $$0.n(), $$0.j());
   }

   protected cnw(csf $$0, @Nullable cdz $$1, bja $$2, clo $$3, ejv $$4) {
      super($$0, $$1, $$2, $$3, $$4);
      this.b = $$4.a().a($$4.b());
      this.a = $$0.a_($$4.a()).a(this);
   }

   public static cnw a(cnw $$0, hx $$1, ib $$2) {
      return new cnw(
         $$0.q(),
         $$0.o(),
         $$0.p(),
         $$0.n(),
         new ejv(
            new ejz((double)$$1.u() + 0.5 + (double)$$2.j() * 0.5, (double)$$1.v() + 0.5 + (double)$$2.k() * 0.5, (double)$$1.w() + 0.5 + (double)$$2.l() * 0.5),
            $$2,
            $$1,
            false
         )
      );
   }

   @Override
   public hx a() {
      return this.a ? super.a() : this.b;
   }

   public boolean b() {
      return this.a || this.q().a_(this.a()).a(this);
   }

   public boolean c() {
      return this.a;
   }

   public ib d() {
      return ib.a(this.o())[0];
   }

   public ib e() {
      return ib.a(this.o(), ib.a.b);
   }

   public ib[] f() {
      ib[] $$0 = ib.a(this.o());
      if (this.a) {
         return $$0;
      } else {
         ib $$1 = this.k();
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
