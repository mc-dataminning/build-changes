import javax.annotation.Nullable;

public class eyh {
   private final djf a;
   @Nullable
   private final eyg b;
   private final iv c;
   private final iv.a d = new iv.a();

   public eyh(djf $$0, bxw $$1) {
      this.a = $$0;
      if ($$1.dV() instanceof ars $$2) {
         this.b = $$2.I();
      } else {
         this.b = null;
      }

      this.c = $$1.dv();
   }

   public eyf a(int $$0, int $$1, int $$2) {
      iv $$3 = this.d.d($$0, $$1, $$2);
      return this.b == null ? eyk.b(this.a, $$3) : this.b.a(this.a, $$3);
   }

   public ebe a(iv $$0) {
      return this.a.a_($$0);
   }

   public djf a() {
      return this.a;
   }

   public iv b() {
      return this.c;
   }
}
