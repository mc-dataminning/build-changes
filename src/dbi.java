import javax.annotation.Nullable;

public class dbi {
   @Nullable
   private final cpx a;
   private final bti b;
   private final fbu c;
   private final dhi d;
   private final cxp e;

   public dbi(cpx $$0, bti $$1, fbu $$2) {
      this($$0.dW(), $$0, $$1, $$0.b($$1), $$2);
   }

   protected dbi(dhi $$0, @Nullable cpx $$1, bti $$2, cxp $$3, fbu $$4) {
      this.a = $$1;
      this.b = $$2;
      this.c = $$4;
      this.e = $$3;
      this.d = $$0;
   }

   protected final fbu j() {
      return this.c;
   }

   public jh a() {
      return this.c.b();
   }

   public jm k() {
      return this.c.c();
   }

   public fby l() {
      return this.c.g();
   }

   public boolean m() {
      return this.c.e();
   }

   public cxp n() {
      return this.e;
   }

   @Nullable
   public cpx o() {
      return this.a;
   }

   public bti p() {
      return this.b;
   }

   public dhi q() {
      return this.d;
   }

   public jm g() {
      return this.a == null ? jm.c : this.a.cO();
   }

   public boolean h() {
      return this.a != null && this.a.fY();
   }

   public float i() {
      return this.a == null ? 0.0F : this.a.dM();
   }
}
