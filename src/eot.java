import javax.annotation.Nullable;

public class eot {
   public final int a;
   @Nullable
   public final String b;

   eot(int $$0, String $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public static class a {
      private int a = -1;
      private String b;

      public eot.a a(int $$0) {
         this.a = $$0;
         return this;
      }

      public eot.a a(@Nullable String $$0) {
         this.b = $$0;
         return this;
      }

      public eot a() {
         return new eot(this.a, this.b);
      }
   }
}
