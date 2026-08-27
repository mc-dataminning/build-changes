import javax.annotation.Nullable;

public class fae {
   public final int a;
   @Nullable
   public final String b;

   fae(int $$0, String $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public static class a {
      private int a = -1;
      private String b;

      public fae.a a(int $$0) {
         this.a = $$0;
         return this;
      }

      public fae.a a(@Nullable String $$0) {
         this.b = $$0;
         return this;
      }

      public fae a() {
         return new fae(this.a, this.b);
      }
   }
}
