import javax.annotation.Nullable;

public class fdk {
   public final int a;
   @Nullable
   public final String b;

   fdk(int $$0, String $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public static class a {
      private int a = -1;
      private String b;

      public fdk.a a(int $$0) {
         this.a = $$0;
         return this;
      }

      public fdk.a a(@Nullable String $$0) {
         this.b = $$0;
         return this;
      }

      public fdk a() {
         return new fdk(this.a, this.b);
      }
   }
}
