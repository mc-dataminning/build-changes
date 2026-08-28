import javax.annotation.Nullable;

public class esd {
   private final dek a;
   @Nullable
   private final esc b;
   private final jh c;
   private final jh.a d = new jh.a();

   public esd(dek $$0, bvc $$1) {
      this.a = $$0;
      if ($$1.dX() instanceof arn $$2) {
         this.b = $$2.H();
      } else {
         this.b = null;
      }

      this.c = $$1.dx();
   }

   public esb a(int $$0, int $$1, int $$2) {
      jh $$3 = this.d.d($$0, $$1, $$2);
      return this.b == null ? esg.b(this.a, $$3) : this.b.a(this.a, $$3);
   }

   public dvj a(jh $$0) {
      return this.a.a_($$0);
   }

   public dek a() {
      return this.a;
   }

   public jh b() {
      return this.c;
   }
}
