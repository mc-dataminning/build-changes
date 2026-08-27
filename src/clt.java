import javax.annotation.Nullable;

public class clt extends clv {
   private final gw b;
   protected boolean a = true;

   public clt(cca $$0, bhd $$1, cjl $$2, ehd $$3) {
      this($$0.dL(), $$0, $$1, $$2, $$3);
   }

   public clt(clv $$0) {
      this($$0.q(), $$0.o(), $$0.p(), $$0.n(), $$0.j());
   }

   protected clt(cqb $$0, @Nullable cca $$1, bhd $$2, cjl $$3, ehd $$4) {
      super($$0, $$1, $$2, $$3, $$4);
      this.b = $$4.a().a($$4.b());
      this.a = $$0.a_($$4.a()).a(this);
   }

   public static clt a(clt $$0, gw $$1, ha $$2) {
      return new clt(
         $$0.q(),
         $$0.o(),
         $$0.p(),
         $$0.n(),
         new ehd(
            new ehh((double)$$1.u() + 0.5 + (double)$$2.j() * 0.5, (double)$$1.v() + 0.5 + (double)$$2.k() * 0.5, (double)$$1.w() + 0.5 + (double)$$2.l() * 0.5),
            $$2,
            $$1,
            false
         )
      );
   }

   @Override
   public gw a() {
      return this.a ? super.a() : this.b;
   }

   public boolean b() {
      return this.a || this.q().a_(this.a()).a(this);
   }

   public boolean c() {
      return this.a;
   }

   public ha d() {
      return ha.a(this.o())[0];
   }

   public ha e() {
      return ha.a(this.o(), ha.a.b);
   }

   public ha[] f() {
      ha[] $$0 = ha.a(this.o());
      if (this.a) {
         return $$0;
      } else {
         ha $$1 = this.k();
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
