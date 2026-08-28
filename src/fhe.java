import javax.annotation.Nullable;

public class fhe {
   public final int a;
   @Nullable
   public final String b;

   fhe(int $$0, String $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public static class a {
      private int a = -1;
      private String b;

      public fhe.a a(int $$0) {
         this.a = $$0;
         return this;
      }

      public fhe.a a(@Nullable String $$0) {
         this.b = $$0;
         return this;
      }

      public fhe a() {
         return new fhe(this.a, this.b);
      }
   }
}
