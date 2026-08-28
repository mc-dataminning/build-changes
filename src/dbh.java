import javax.annotation.Nullable;

public class dbh {
   @Nullable
   private final cpw a;
   private final bth b;
   private final fbt c;
   private final dhh d;
   private final cxo e;

   public dbh(cpw $$0, bth $$1, fbt $$2) {
      this($$0.dW(), $$0, $$1, $$0.b($$1), $$2);
   }

   protected dbh(dhh $$0, @Nullable cpw $$1, bth $$2, cxo $$3, fbt $$4) {
      this.a = $$1;
      this.b = $$2;
      this.c = $$4;
      this.e = $$3;
      this.d = $$0;
   }

   protected final fbt j() {
      return this.c;
   }

   public jh a() {
      return this.c.b();
   }

   public jm k() {
      return this.c.c();
   }

   public fbx l() {
      return this.c.g();
   }

   public boolean m() {
      return this.c.e();
   }

   public cxo n() {
      return this.e;
   }

   @Nullable
   public cpw o() {
      return this.a;
   }

   public bth p() {
      return this.b;
   }

   public dhh q() {
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
