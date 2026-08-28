import javax.annotation.Nullable;

public class eup {
   private final dgq a;
   @Nullable
   private final euo b;
   private final jh c;
   private final jh.a d = new jh.a();

   public eup(dgq $$0, bwh $$1) {
      this.a = $$0;
      if ($$1.dW() instanceof ash $$2) {
         this.b = $$2.H();
      } else {
         this.b = null;
      }

      this.c = $$1.dw();
   }

   public eun a(int $$0, int $$1, int $$2) {
      jh $$3 = this.d.d($$0, $$1, $$2);
      return this.b == null ? eus.b(this.a, $$3) : this.b.a(this.a, $$3);
   }

   public dxu a(jh $$0) {
      return this.a.a_($$0);
   }

   public dgq a() {
      return this.a;
   }

   public jh b() {
      return this.c;
   }
}
