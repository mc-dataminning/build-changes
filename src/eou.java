import javax.annotation.Nullable;

public class eou {
   private final dbn a;
   @Nullable
   private final eot b;
   private final ja c;
   private final ja.a d = new ja.a();

   public eou(dbn $$0, bta $$1) {
      this.a = $$0;
      if ($$1.dP() instanceof aqk $$2) {
         this.b = $$2.H();
      } else {
         this.b = null;
      }

      this.c = $$1.dp();
   }

   public eos a(int $$0, int $$1, int $$2) {
      ja $$3 = this.d.d($$0, $$1, $$2);
      return this.b == null ? eox.b(this.a, $$3) : this.b.a(this.a, $$3);
   }

   public dsh a(ja $$0) {
      return this.a.a_($$0);
   }

   public dbn a() {
      return this.a;
   }

   public ja b() {
      return this.c;
   }
}
