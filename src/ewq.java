import javax.annotation.Nullable;

public class ewq {
   public final int a;
   @Nullable
   public final String b;

   ewq(int $$0, String $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public static class a {
      private int a = -1;
      private String b;

      public ewq.a a(int $$0) {
         this.a = $$0;
         return this;
      }

      public ewq.a a(@Nullable String $$0) {
         this.b = $$0;
         return this;
      }

      public ewq a() {
         return new ewq(this.a, this.b);
      }
   }
}
