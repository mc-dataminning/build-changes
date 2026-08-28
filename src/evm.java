import javax.annotation.Nullable;

public class evm {
   private final dgz a;
   @Nullable
   private final evl b;
   private final jj c;
   private final jj.a d = new jj.a();

   public evm(dgz $$0, bwt $$1) {
      this.a = $$0;
      if ($$1.dV() instanceof arn $$2) {
         this.b = $$2.I();
      } else {
         this.b = null;
      }

      this.c = $$1.dv();
   }

   public evk a(int $$0, int $$1, int $$2) {
      jj $$3 = this.d.d($$0, $$1, $$2);
      return this.b == null ? evp.b(this.a, $$3) : this.b.a(this.a, $$3);
   }

   public dym a(jj $$0) {
      return this.a.a_($$0);
   }

   public dgz a() {
      return this.a;
   }

   public jj b() {
      return this.c;
   }
}
