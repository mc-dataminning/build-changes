import javax.annotation.Nullable;

public class ext {
   private final diu a;
   @Nullable
   private final exs b;
   private final iv c;
   private final iv.a d = new iv.a();

   public ext(diu $$0, bxl $$1) {
      this.a = $$0;
      if ($$1.dU() instanceof arq $$2) {
         this.b = $$2.I();
      } else {
         this.b = null;
      }

      this.c = $$1.du();
   }

   public exr a(int $$0, int $$1, int $$2) {
      iv $$3 = this.d.d($$0, $$1, $$2);
      return this.b == null ? exw.b(this.a, $$3) : this.b.a(this.a, $$3);
   }

   public eat a(iv $$0) {
      return this.a.a_($$0);
   }

   public diu a() {
      return this.a;
   }

   public iv b() {
      return this.c;
   }
}
