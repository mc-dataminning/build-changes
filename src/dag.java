import javax.annotation.Nullable;

public class dag {
   @Nullable
   private final cov a;
   private final bsh b;
   private final fau c;
   private final dgg d;
   private final cwn e;

   public dag(cov $$0, bsh $$1, fau $$2) {
      this($$0.dW(), $$0, $$1, $$0.b($$1), $$2);
   }

   protected dag(dgg $$0, @Nullable cov $$1, bsh $$2, cwn $$3, fau $$4) {
      this.a = $$1;
      this.b = $$2;
      this.c = $$4;
      this.e = $$3;
      this.d = $$0;
   }

   protected final fau j() {
      return this.c;
   }

   public ji a() {
      return this.c.b();
   }

   public jn k() {
      return this.c.c();
   }

   public fay l() {
      return this.c.g();
   }

   public boolean m() {
      return this.c.e();
   }

   public cwn n() {
      return this.e;
   }

   @Nullable
   public cov o() {
      return this.a;
   }

   public bsh p() {
      return this.b;
   }

   public dgg q() {
      return this.d;
   }

   public jn g() {
      return this.a == null ? jn.c : this.a.cO();
   }

   public boolean h() {
      return this.a != null && this.a.fY();
   }

   public float i() {
      return this.a == null ? 0.0F : this.a.dM();
   }
}
