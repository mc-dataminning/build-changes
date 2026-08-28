import javax.annotation.Nullable;

public class fdn {
   public final int a;
   @Nullable
   public final String b;

   fdn(int $$0, String $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public static class a {
      private int a = -1;
      private String b;

      public fdn.a a(int $$0) {
         this.a = $$0;
         return this;
      }

      public fdn.a a(@Nullable String $$0) {
         this.b = $$0;
         return this;
      }

      public fdn a() {
         return new fdn(this.a, this.b);
      }
   }
}
