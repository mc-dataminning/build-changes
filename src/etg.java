import javax.annotation.Nullable;

public class etg {
   public final int a;
   @Nullable
   public final String b;

   etg(int $$0, String $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public static class a {
      private int a = -1;
      private String b;

      public etg.a a(int $$0) {
         this.a = $$0;
         return this;
      }

      public etg.a a(@Nullable String $$0) {
         this.b = $$0;
         return this;
      }

      public etg a() {
         return new etg(this.a, this.b);
      }
   }
}
