import javax.annotation.Nullable;

public class fgf {
   public final int a;
   @Nullable
   public final String b;

   fgf(int $$0, String $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public static class a {
      private int a = -1;
      private String b;

      public fgf.a a(int $$0) {
         this.a = $$0;
         return this;
      }

      public fgf.a a(@Nullable String $$0) {
         this.b = $$0;
         return this;
      }

      public fgf a() {
         return new fgf(this.a, this.b);
      }
   }
}
