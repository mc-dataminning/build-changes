import javax.annotation.Nullable;

public class fcf {
   public final int a;
   @Nullable
   public final String b;

   fcf(int $$0, String $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public static class a {
      private int a = -1;
      private String b;

      public fcf.a a(int $$0) {
         this.a = $$0;
         return this;
      }

      public fcf.a a(@Nullable String $$0) {
         this.b = $$0;
         return this;
      }

      public fcf a() {
         return new fcf(this.a, this.b);
      }
   }
}
