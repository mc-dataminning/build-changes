import javax.annotation.Nullable;

public class euj {
   private final dgi a;
   @Nullable
   private final eui b;
   private final jh c;
   private final jh.a d = new jh.a();

   public euj(dgi $$0, bvz $$1) {
      this.a = $$0;
      if ($$1.dW() instanceof arx $$2) {
         this.b = $$2.I();
      } else {
         this.b = null;
      }

      this.c = $$1.dw();
   }

   public euh a(int $$0, int $$1, int $$2) {
      jh $$3 = this.d.d($$0, $$1, $$2);
      return this.b == null ? eum.b(this.a, $$3) : this.b.a(this.a, $$3);
   }

   public dxo a(jh $$0) {
      return this.a.a_($$0);
   }

   public dgi a() {
      return this.a;
   }

   public jh b() {
      return this.c;
   }
}
