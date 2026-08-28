import javax.annotation.Nullable;

public class etq {
   private final dfp a;
   @Nullable
   private final etp b;
   private final ji c;
   private final ji.a d = new ji.a();

   public etq(dfp $$0, bvh $$1) {
      this.a = $$0;
      if ($$1.dW() instanceof arc $$2) {
         this.b = $$2.I();
      } else {
         this.b = null;
      }

      this.c = $$1.dw();
   }

   public eto a(int $$0, int $$1, int $$2) {
      ji $$3 = this.d.d($$0, $$1, $$2);
      return this.b == null ? ett.b(this.a, $$3) : this.b.a(this.a, $$3);
   }

   public dwv a(ji $$0) {
      return this.a.a_($$0);
   }

   public dfp a() {
      return this.a;
   }

   public ji b() {
      return this.c;
   }
}
