import javax.annotation.Nullable;

public class eoj {
   private final dbd a;
   @Nullable
   private final eoi b;
   private final iz c;
   private final iz.a d = new iz.a();

   public eoj(dbd $$0, btm $$1) {
      this.a = $$0;
      if ($$1.dP() instanceof arb $$2) {
         this.b = $$2.H();
      } else {
         this.b = null;
      }

      this.c = $$1.dp();
   }

   public eoh a(int $$0, int $$1, int $$2) {
      iz $$3 = this.d.d($$0, $$1, $$2);
      return this.b == null ? eom.b(this.a, $$3) : this.b.a(this.a, $$3);
   }

   public drx a(iz $$0) {
      return this.a.a_($$0);
   }

   public dbd a() {
      return this.a;
   }

   public iz b() {
      return this.c;
   }
}
