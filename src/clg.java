import javax.annotation.Nullable;

public class clg {
   @Nullable
   private final cbl a;
   private final bgn b;
   private final ehb c;
   private final cpk d;
   private final ciw e;

   public clg(cbl $$0, bgn $$1, ehb $$2) {
      this($$0.dK(), $$0, $$1, $$0.b($$1), $$2);
   }

   protected clg(cpk $$0, @Nullable cbl $$1, bgn $$2, ciw $$3, ehb $$4) {
      this.a = $$1;
      this.b = $$2;
      this.c = $$4;
      this.e = $$3;
      this.d = $$0;
   }

   protected final ehb j() {
      return this.c;
   }

   public gv a() {
      return this.c.a();
   }

   public hb k() {
      return this.c.b();
   }

   public ehf l() {
      return this.c.e();
   }

   public boolean m() {
      return this.c.d();
   }

   public ciw n() {
      return this.e;
   }

   @Nullable
   public cbl o() {
      return this.a;
   }

   public bgn p() {
      return this.b;
   }

   public cpk q() {
      return this.d;
   }

   public hb g() {
      return this.a == null ? hb.c : this.a.cD();
   }

   public boolean h() {
      return this.a != null && this.a.fG();
   }

   public float i() {
      return this.a == null ? 0.0F : this.a.dA();
   }
}
