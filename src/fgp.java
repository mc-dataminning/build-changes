import javax.annotation.Nullable;

public class fgp {
   public final int a;
   @Nullable
   public final String b;

   fgp(int $$0, String $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public static class a {
      private int a = -1;
      private String b;

      public fgp.a a(int $$0) {
         this.a = $$0;
         return this;
      }

      public fgp.a a(@Nullable String $$0) {
         this.b = $$0;
         return this;
      }

      public fgp a() {
         return new fgp(this.a, this.b);
      }
   }
}
