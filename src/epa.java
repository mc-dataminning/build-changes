import javax.annotation.Nullable;

public class epa {
   private final dbp a;
   @Nullable
   private final eoz b;
   private final ja c;
   private final ja.a d = new ja.a();

   public epa(dbp $$0, btd $$1) {
      this.a = $$0;
      if ($$1.dQ() instanceof aqm $$2) {
         this.b = $$2.H();
      } else {
         this.b = null;
      }

      this.c = $$1.dq();
   }

   public eoy a(int $$0, int $$1, int $$2) {
      ja $$3 = this.d.d($$0, $$1, $$2);
      return this.b == null ? epd.b(this.a, $$3) : this.b.a(this.a, $$3);
   }

   public dsk a(ja $$0) {
      return this.a.a_($$0);
   }

   public dbp a() {
      return this.a;
   }

   public ja b() {
      return this.c;
   }
}
