import javax.annotation.Nullable;

public class eop {
   private final dbj a;
   @Nullable
   private final eoo b;
   private final iz c;
   private final iz.a d = new iz.a();

   public eop(dbj $$0, bts $$1) {
      this.a = $$0;
      if ($$1.dP() instanceof arf $$2) {
         this.b = $$2.H();
      } else {
         this.b = null;
      }

      this.c = $$1.dp();
   }

   public eon a(int $$0, int $$1, int $$2) {
      iz $$3 = this.d.d($$0, $$1, $$2);
      return this.b == null ? eos.b(this.a, $$3) : this.b.a(this.a, $$3);
   }

   public dsd a(iz $$0) {
      return this.a.a_($$0);
   }

   public dbj a() {
      return this.a;
   }

   public iz b() {
      return this.c;
   }
}
