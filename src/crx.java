import javax.annotation.Nullable;

public class crx extends crz {
   private final ib b;
   protected boolean a = true;

   public crx(cia $$0, bmk $$1, cpq $$2, eor $$3) {
      this($$0.dJ(), $$0, $$1, $$2, $$3);
   }

   public crx(crz $$0) {
      this($$0.q(), $$0.o(), $$0.p(), $$0.n(), $$0.j());
   }

   protected crx(cwe $$0, @Nullable cia $$1, bmk $$2, cpq $$3, eor $$4) {
      super($$0, $$1, $$2, $$3, $$4);
      this.b = $$4.a().a($$4.b());
      this.a = $$0.a_($$4.a()).a(this);
   }

   public static crx a(crx $$0, ib $$1, ih $$2) {
      return new crx(
         $$0.q(),
         $$0.o(),
         $$0.p(),
         $$0.n(),
         new eor(
            new eov((double)$$1.u() + 0.5 + (double)$$2.j() * 0.5, (double)$$1.v() + 0.5 + (double)$$2.k() * 0.5, (double)$$1.w() + 0.5 + (double)$$2.l() * 0.5),
            $$2,
            $$1,
            false
         )
      );
   }

   @Override
   public ib a() {
      return this.a ? super.a() : this.b;
   }

   public boolean b() {
      return this.a || this.q().a_(this.a()).a(this);
   }

   public boolean c() {
      return this.a;
   }

   public ih d() {
      return ih.a(this.o())[0];
   }

   public ih e() {
      return ih.a(this.o(), ih.a.b);
   }

   public ih[] f() {
      ih[] $$0 = ih.a(this.o());
      if (this.a) {
         return $$0;
      } else {
         ih $$1 = this.k();
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
