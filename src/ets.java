import javax.annotation.Nullable;

public class ets {
   private final dfr a;
   @Nullable
   private final etr b;
   private final ji c;
   private final ji.a d = new ji.a();

   public ets(dfr $$0, bvj $$1) {
      this.a = $$0;
      if ($$1.dV() instanceof ard $$2) {
         this.b = $$2.I();
      } else {
         this.b = null;
      }

      this.c = $$1.dv();
   }

   public etq a(int $$0, int $$1, int $$2) {
      ji $$3 = this.d.d($$0, $$1, $$2);
      return this.b == null ? etv.b(this.a, $$3) : this.b.a(this.a, $$3);
   }

   public dwx a(ji $$0) {
      return this.a.a_($$0);
   }

   public dfr a() {
      return this.a;
   }

   public ji b() {
      return this.c;
   }
}
