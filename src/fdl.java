import javax.annotation.Nullable;

public class fdl {
   public final int a;
   @Nullable
   public final String b;

   fdl(int $$0, String $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public static class a {
      private int a = -1;
      private String b;

      public fdl.a a(int $$0) {
         this.a = $$0;
         return this;
      }

      public fdl.a a(@Nullable String $$0) {
         this.b = $$0;
         return this;
      }

      public fdl a() {
         return new fdl(this.a, this.b);
      }
   }
}
