import javax.annotation.Nullable;

public class cnt {
   @Nullable
   private final cdu a;
   private final biw b;
   private final ejq c;
   private final csa d;
   private final clj e;

   public cnt(cdu $$0, biw $$1, ejq $$2) {
      this($$0.dN(), $$0, $$1, $$0.b($$1), $$2);
   }

   protected cnt(csa $$0, @Nullable cdu $$1, biw $$2, clj $$3, ejq $$4) {
      this.a = $$1;
      this.b = $$2;
      this.c = $$4;
      this.e = $$3;
      this.d = $$0;
   }

   protected final ejq j() {
      return this.c;
   }

   public ht a() {
      return this.c.a();
   }

   public hx k() {
      return this.c.b();
   }

   public eju l() {
      return this.c.e();
   }

   public boolean m() {
      return this.c.d();
   }

   public clj n() {
      return this.e;
   }

   @Nullable
   public cdu o() {
      return this.a;
   }

   public biw p() {
      return this.b;
   }

   public csa q() {
      return this.d;
   }

   public hx g() {
      return this.a == null ? hx.c : this.a.cE();
   }

   public boolean h() {
      return this.a != null && this.a.fJ();
   }

   public float i() {
      return this.a == null ? 0.0F : this.a.dD();
   }
}
