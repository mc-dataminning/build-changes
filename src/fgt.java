import javax.annotation.Nullable;

public class fgt {
   public final int a;
   @Nullable
   public final String b;

   fgt(int $$0, String $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public static class a {
      private int a = -1;
      private String b;

      public fgt.a a(int $$0) {
         this.a = $$0;
         return this;
      }

      public fgt.a a(@Nullable String $$0) {
         this.b = $$0;
         return this;
      }

      public fgt a() {
         return new fgt(this.a, this.b);
      }
   }
}
