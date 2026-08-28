import javax.annotation.Nullable;

public class epc {
   private final dbq a;
   @Nullable
   private final epb b;
   private final ja c;
   private final ja.a d = new ja.a();

   public epc(dbq $$0, bte $$1) {
      this.a = $$0;
      if ($$1.dR() instanceof aqm $$2) {
         this.b = $$2.H();
      } else {
         this.b = null;
      }

      this.c = $$1.dr();
   }

   public epa a(int $$0, int $$1, int $$2) {
      ja $$3 = this.d.d($$0, $$1, $$2);
      return this.b == null ? epf.b(this.a, $$3) : this.b.a(this.a, $$3);
   }

   public dsl a(ja $$0) {
      return this.a.a_($$0);
   }

   public dbq a() {
      return this.a;
   }

   public ja b() {
      return this.c;
   }
}
