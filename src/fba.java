import javax.annotation.Nullable;

public class fba {
   public final int a;
   @Nullable
   public final String b;

   fba(int $$0, String $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public static class a {
      private int a = -1;
      private String b;

      public fba.a a(int $$0) {
         this.a = $$0;
         return this;
      }

      public fba.a a(@Nullable String $$0) {
         this.b = $$0;
         return this;
      }

      public fba a() {
         return new fba(this.a, this.b);
      }
   }
}
