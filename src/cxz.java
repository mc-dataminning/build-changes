import javax.annotation.Nullable;

public class cxz extends cyb {
   private final iz b;
   protected boolean a = true;

   public cxz(cmw $$0, bqs $$1, cuo $$2, evm $$3) {
      this($$0.dP(), $$0, $$1, $$2, $$3);
   }

   public cxz(cyb $$0) {
      this($$0.q(), $$0.o(), $$0.p(), $$0.n(), $$0.j());
   }

   protected cxz(dbx $$0, @Nullable cmw $$1, bqs $$2, cuo $$3, evm $$4) {
      super($$0, $$1, $$2, $$3, $$4);
      this.b = $$4.a().a($$4.b());
      this.a = $$0.a_($$4.a()).a(this);
   }

   public static cxz a(cxz $$0, iz $$1, je $$2) {
      return new cxz(
         $$0.q(),
         $$0.o(),
         $$0.p(),
         $$0.n(),
         new evm(
            new evq((double)$$1.u() + 0.5 + (double)$$2.j() * 0.5, (double)$$1.v() + 0.5 + (double)$$2.k() * 0.5, (double)$$1.w() + 0.5 + (double)$$2.l() * 0.5),
            $$2,
            $$1,
            false
         )
      );
   }

   @Override
   public iz a() {
      return this.a ? super.a() : this.b;
   }

   public boolean b() {
      return this.a || this.q().a_(this.a()).a(this);
   }

   public boolean c() {
      return this.a;
   }

   public je d() {
      return je.a(this.o())[0];
   }

   public je e() {
      return je.a(this.o(), je.a.b);
   }

   public je[] f() {
      je[] $$0 = je.a(this.o());
      if (this.a) {
         return $$0;
      } else {
         je $$1 = this.k();
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
