import javax.annotation.Nullable;

public class exh {
   private final dik a;
   @Nullable
   private final exg b;
   private final iu c;
   private final iu.a d = new iu.a();

   public exh(dik $$0, bxg $$1) {
      this.a = $$0;
      if ($$1.dV() instanceof arq $$2) {
         this.b = $$2.I();
      } else {
         this.b = null;
      }

      this.c = $$1.dv();
   }

   public exf a(int $$0, int $$1, int $$2) {
      iu $$3 = this.d.d($$0, $$1, $$2);
      return this.b == null ? exk.b(this.a, $$3) : this.b.a(this.a, $$3);
   }

   public eah a(iu $$0) {
      return this.a.a_($$0);
   }

   public dik a() {
      return this.a;
   }

   public iu b() {
      return this.c;
   }
}
