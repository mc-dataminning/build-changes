import javax.annotation.Nullable;

public class cuo extends cuq {
   private final ib b;
   protected boolean a = true;

   public cuo(cjt $$0, bnz $$1, crj $$2, erw $$3) {
      this($$0.dM(), $$0, $$1, $$2, $$3);
   }

   public cuo(cuq $$0) {
      this($$0.q(), $$0.o(), $$0.p(), $$0.n(), $$0.j());
   }

   protected cuo(cyx $$0, @Nullable cjt $$1, bnz $$2, crj $$3, erw $$4) {
      super($$0, $$1, $$2, $$3, $$4);
      this.b = $$4.a().a($$4.b());
      this.a = $$0.a_($$4.a()).a(this);
   }

   public static cuo a(cuo $$0, ib $$1, ih $$2) {
      return new cuo(
         $$0.q(),
         $$0.o(),
         $$0.p(),
         $$0.n(),
         new erw(
            new esa((double)$$1.u() + 0.5 + (double)$$2.j() * 0.5, (double)$$1.v() + 0.5 + (double)$$2.k() * 0.5, (double)$$1.w() + 0.5 + (double)$$2.l() * 0.5),
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
