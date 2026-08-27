import javax.annotation.Nullable;

public class etm {
   public final int a;
   @Nullable
   public final String b;

   etm(int $$0, String $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public static class a {
      private int a = -1;
      private String b;

      public etm.a a(int $$0) {
         this.a = $$0;
         return this;
      }

      public etm.a a(@Nullable String $$0) {
         this.b = $$0;
         return this;
      }

      public etm a() {
         return new etm(this.a, this.b);
      }
   }
}
