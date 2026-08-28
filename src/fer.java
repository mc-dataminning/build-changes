import javax.annotation.Nullable;

public class fer {
   public final int a;
   @Nullable
   public final String b;

   fer(int $$0, String $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public static class a {
      private int a = -1;
      private String b;

      public fer.a a(int $$0) {
         this.a = $$0;
         return this;
      }

      public fer.a a(@Nullable String $$0) {
         this.b = $$0;
         return this;
      }

      public fer a() {
         return new fer(this.a, this.b);
      }
   }
}
