import javax.annotation.Nullable;

public class eow {
   public final int a;
   @Nullable
   public final String b;

   eow(int $$0, String $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public static class a {
      private int a = -1;
      private String b;

      public eow.a a(int $$0) {
         this.a = $$0;
         return this;
      }

      public eow.a a(@Nullable String $$0) {
         this.b = $$0;
         return this;
      }

      public eow a() {
         return new eow(this.a, this.b);
      }
   }
}
