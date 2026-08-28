import javax.annotation.Nullable;

public class eoq {
   private final dbk a;
   @Nullable
   private final eop b;
   private final iz c;
   private final iz.a d = new iz.a();

   public eoq(dbk $$0, btt $$1) {
      this.a = $$0;
      if ($$1.dP() instanceof arf $$2) {
         this.b = $$2.H();
      } else {
         this.b = null;
      }

      this.c = $$1.dp();
   }

   public eoo a(int $$0, int $$1, int $$2) {
      iz $$3 = this.d.d($$0, $$1, $$2);
      return this.b == null ? eot.b(this.a, $$3) : this.b.a(this.a, $$3);
   }

   public dse a(iz $$0) {
      return this.a.a_($$0);
   }

   public dbk a() {
      return this.a;
   }

   public iz b() {
      return this.c;
   }
}
