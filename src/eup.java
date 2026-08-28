import javax.annotation.Nullable;

public class eup {
   private final dgj a;
   @Nullable
   private final euo b;
   private final ji c;
   private final ji.a d = new ji.a();

   public eup(dgj $$0, bwa $$1) {
      this.a = $$0;
      if ($$1.dU() instanceof ard $$2) {
         this.b = $$2.I();
      } else {
         this.b = null;
      }

      this.c = $$1.du();
   }

   public eun a(int $$0, int $$1, int $$2) {
      ji $$3 = this.d.d($$0, $$1, $$2);
      return this.b == null ? eus.b(this.a, $$3) : this.b.a(this.a, $$3);
   }

   public dxq a(ji $$0) {
      return this.a.a_($$0);
   }

   public dgj a() {
      return this.a;
   }

   public ji b() {
      return this.c;
   }
}
