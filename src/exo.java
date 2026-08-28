import javax.annotation.Nullable;

public class exo {
   private final dir a;
   @Nullable
   private final exn b;
   private final iv c;
   private final iv.a d = new iv.a();

   public exo(dir $$0, bxl $$1) {
      this.a = $$0;
      if ($$1.dU() instanceof arq $$2) {
         this.b = $$2.I();
      } else {
         this.b = null;
      }

      this.c = $$1.du();
   }

   public exm a(int $$0, int $$1, int $$2) {
      iv $$3 = this.d.d($$0, $$1, $$2);
      return this.b == null ? exr.b(this.a, $$3) : this.b.a(this.a, $$3);
   }

   public eao a(iv $$0) {
      return this.a.a_($$0);
   }

   public dir a() {
      return this.a;
   }

   public iv b() {
      return this.c;
   }
}
