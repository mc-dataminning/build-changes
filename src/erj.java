import javax.annotation.Nullable;

public class erj {
   public final int a;
   @Nullable
   public final String b;

   erj(int $$0, String $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public static class a {
      private int a = -1;
      private String b;

      public erj.a a(int $$0) {
         this.a = $$0;
         return this;
      }

      public erj.a a(@Nullable String $$0) {
         this.b = $$0;
         return this;
      }

      public erj a() {
         return new erj(this.a, this.b);
      }
   }
}
