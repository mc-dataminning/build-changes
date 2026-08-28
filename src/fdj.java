import javax.annotation.Nullable;

public class fdj {
   public final int a;
   @Nullable
   public final String b;

   fdj(int $$0, String $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public static class a {
      private int a = -1;
      private String b;

      public fdj.a a(int $$0) {
         this.a = $$0;
         return this;
      }

      public fdj.a a(@Nullable String $$0) {
         this.b = $$0;
         return this;
      }

      public fdj a() {
         return new fdj(this.a, this.b);
      }
   }
}
