import javax.annotation.Nullable;

public class fml {
   public final int a;
   @Nullable
   public final String b;

   fml(int $$0, String $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Nullable
   public String a() {
      if (this.a >= 200 && this.a < 300) {
         return null;
      } else {
         return this.a == 400 && this.b != null ? this.b : String.valueOf(this.a);
      }
   }

   public static class a {
      private int a = -1;
      private String b;

      public fml.a a(int $$0) {
         this.a = $$0;
         return this;
      }

      public fml.a a(@Nullable String $$0) {
         this.b = $$0;
         return this;
      }

      public fml a() {
         return new fml(this.a, this.b);
      }
   }
}
