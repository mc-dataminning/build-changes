import javax.annotation.Nullable;

public class fdt {
   public final int a;
   @Nullable
   public final String b;

   fdt(int $$0, String $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public static class a {
      private int a = -1;
      private String b;

      public fdt.a a(int $$0) {
         this.a = $$0;
         return this;
      }

      public fdt.a a(@Nullable String $$0) {
         this.b = $$0;
         return this;
      }

      public fdt a() {
         return new fdt(this.a, this.b);
      }
   }
}
