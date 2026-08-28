import javax.annotation.Nullable;

public class dbp {
   @Nullable
   private final cqi a;
   private final btp b;
   private final fcq c;
   private final dhp d;
   private final cxy e;

   public dbp(cqi $$0, btp $$1, fcq $$2) {
      this($$0.dV(), $$0, $$1, $$0.b($$1), $$2);
   }

   protected dbp(dhp $$0, @Nullable cqi $$1, btp $$2, cxy $$3, fcq $$4) {
      this.a = $$1;
      this.b = $$2;
      this.c = $$4;
      this.e = $$3;
      this.d = $$0;
   }

   protected final fcq j() {
      return this.c;
   }

   public jj a() {
      return this.c.b();
   }

   public jo k() {
      return this.c.c();
   }

   public fcu l() {
      return this.c.g();
   }

   public boolean m() {
      return this.c.e();
   }

   public cxy n() {
      return this.e;
   }

   @Nullable
   public cqi o() {
      return this.a;
   }

   public btp p() {
      return this.b;
   }

   public dhp q() {
      return this.d;
   }

   public jo g() {
      return this.a == null ? jo.c : this.a.cO();
   }

   public boolean h() {
      return this.a != null && this.a.fX();
   }

   public float i() {
      return this.a == null ? 0.0F : this.a.dL();
   }
}
