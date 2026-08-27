import javax.annotation.Nullable;

public class ero {
   public final int a;
   @Nullable
   public final String b;

   ero(int $$0, String $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public static class a {
      private int a = -1;
      private String b;

      public ero.a a(int $$0) {
         this.a = $$0;
         return this;
      }

      public ero.a a(@Nullable String $$0) {
         this.b = $$0;
         return this;
      }

      public ero a() {
         return new ero(this.a, this.b);
      }
   }
}
