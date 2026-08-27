import javax.annotation.Nullable;

public class etx {
   public final int a;
   @Nullable
   public final String b;

   etx(int $$0, String $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public static class a {
      private int a = -1;
      private String b;

      public etx.a a(int $$0) {
         this.a = $$0;
         return this;
      }

      public etx.a a(@Nullable String $$0) {
         this.b = $$0;
         return this;
      }

      public etx a() {
         return new etx(this.a, this.b);
      }
   }
}
