import javax.annotation.Nullable;

public class fdm {
   public final int a;
   @Nullable
   public final String b;

   fdm(int $$0, String $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public static class a {
      private int a = -1;
      private String b;

      public fdm.a a(int $$0) {
         this.a = $$0;
         return this;
      }

      public fdm.a a(@Nullable String $$0) {
         this.b = $$0;
         return this;
      }

      public fdm a() {
         return new fdm(this.a, this.b);
      }
   }
}
