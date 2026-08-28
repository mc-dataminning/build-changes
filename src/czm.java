import javax.annotation.Nullable;

public class czm {
   @Nullable
   private final cnu a;
   private final bro b;
   private final eyo c;
   private final deg d;
   private final cvp e;

   public czm(cnu $$0, bro $$1, eyo $$2) {
      this($$0.dS(), $$0, $$1, $$0.b($$1), $$2);
   }

   protected czm(deg $$0, @Nullable cnu $$1, bro $$2, cvp $$3, eyo $$4) {
      this.a = $$1;
      this.b = $$2;
      this.c = $$4;
      this.e = $$3;
      this.d = $$0;
   }

   protected final eyo j() {
      return this.c;
   }

   public je a() {
      return this.c.b();
   }

   public jj k() {
      return this.c.c();
   }

   public eys l() {
      return this.c.g();
   }

   public boolean m() {
      return this.c.e();
   }

   public cvp n() {
      return this.e;
   }

   @Nullable
   public cnu o() {
      return this.a;
   }

   public bro p() {
      return this.b;
   }

   public deg q() {
      return this.d;
   }

   public jj g() {
      return this.a == null ? jj.c : this.a.cL();
   }

   public boolean h() {
      return this.a != null && this.a.fS();
   }

   public float i() {
      return this.a == null ? 0.0F : this.a.dI();
   }
}
