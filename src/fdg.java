import javax.annotation.Nullable;

public class fdg {
   public final int a;
   @Nullable
   public final String b;

   fdg(int $$0, String $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public static class a {
      private int a = -1;
      private String b;

      public fdg.a a(int $$0) {
         this.a = $$0;
         return this;
      }

      public fdg.a a(@Nullable String $$0) {
         this.b = $$0;
         return this;
      }

      public fdg a() {
         return new fdg(this.a, this.b);
      }
   }
}
