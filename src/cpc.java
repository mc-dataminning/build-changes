import javax.annotation.Nullable;

public class cpc {
   @Nullable
   private final cfb a;
   private final bju b;
   private final eli c;
   private final cti d;
   private final cmr e;

   public cpc(cfb $$0, bju $$1, eli $$2) {
      this($$0.dM(), $$0, $$1, $$0.b($$1), $$2);
   }

   protected cpc(cti $$0, @Nullable cfb $$1, bju $$2, cmr $$3, eli $$4) {
      this.a = $$1;
      this.b = $$2;
      this.c = $$4;
      this.e = $$3;
      this.d = $$0;
   }

   protected final eli j() {
      return this.c;
   }

   public hx a() {
      return this.c.a();
   }

   public ic k() {
      return this.c.b();
   }

   public elm l() {
      return this.c.e();
   }

   public boolean m() {
      return this.c.d();
   }

   public cmr n() {
      return this.e;
   }

   @Nullable
   public cfb o() {
      return this.a;
   }

   public bju p() {
      return this.b;
   }

   public cti q() {
      return this.d;
   }

   public ic g() {
      return this.a == null ? ic.c : this.a.cE();
   }

   public boolean h() {
      return this.a != null && this.a.fI();
   }

   public float i() {
      return this.a == null ? 0.0F : this.a.dC();
   }
}
