import javax.annotation.Nullable;

public class fdz {
   public final int a;
   @Nullable
   public final String b;

   fdz(int $$0, String $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public static class a {
      private int a = -1;
      private String b;

      public fdz.a a(int $$0) {
         this.a = $$0;
         return this;
      }

      public fdz.a a(@Nullable String $$0) {
         this.b = $$0;
         return this;
      }

      public fdz a() {
         return new fdz(this.a, this.b);
      }
   }
}
