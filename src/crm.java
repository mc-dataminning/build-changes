import javax.annotation.Nullable;

public class crm {
   @Nullable
   private final chl a;
   private final blv b;
   private final env c;
   private final cvr d;
   private final cpd e;

   public crm(chl $$0, blv $$1, env $$2) {
      this($$0.dM(), $$0, $$1, $$0.b($$1), $$2);
   }

   protected crm(cvr $$0, @Nullable chl $$1, blv $$2, cpd $$3, env $$4) {
      this.a = $$1;
      this.b = $$2;
      this.c = $$4;
      this.e = $$3;
      this.d = $$0;
   }

   protected final env j() {
      return this.c;
   }

   public hz a() {
      return this.c.a();
   }

   public ie k() {
      return this.c.b();
   }

   public enz l() {
      return this.c.e();
   }

   public boolean m() {
      return this.c.d();
   }

   public cpd n() {
      return this.e;
   }

   @Nullable
   public chl o() {
      return this.a;
   }

   public blv p() {
      return this.b;
   }

   public cvr q() {
      return this.d;
   }

   public ie g() {
      return this.a == null ? ie.c : this.a.cE();
   }

   public boolean h() {
      return this.a != null && this.a.fI();
   }

   public float i() {
      return this.a == null ? 0.0F : this.a.dC();
   }
}
