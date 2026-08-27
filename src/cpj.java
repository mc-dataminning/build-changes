import javax.annotation.Nullable;

public class cpj {
   @Nullable
   private final cfi a;
   private final bka b;
   private final elp c;
   private final ctp d;
   private final cmy e;

   public cpj(cfi $$0, bka $$1, elp $$2) {
      this($$0.dM(), $$0, $$1, $$0.b($$1), $$2);
   }

   protected cpj(ctp $$0, @Nullable cfi $$1, bka $$2, cmy $$3, elp $$4) {
      this.a = $$1;
      this.b = $$2;
      this.c = $$4;
      this.e = $$3;
      this.d = $$0;
   }

   protected final elp j() {
      return this.c;
   }

   public hx a() {
      return this.c.a();
   }

   public ic k() {
      return this.c.b();
   }

   public elt l() {
      return this.c.e();
   }

   public boolean m() {
      return this.c.d();
   }

   public cmy n() {
      return this.e;
   }

   @Nullable
   public cfi o() {
      return this.a;
   }

   public bka p() {
      return this.b;
   }

   public ctp q() {
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
