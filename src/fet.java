import javax.annotation.Nullable;

public class fet {
   public final int a;
   @Nullable
   public final String b;

   fet(int $$0, String $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public static class a {
      private int a = -1;
      private String b;

      public fet.a a(int $$0) {
         this.a = $$0;
         return this;
      }

      public fet.a a(@Nullable String $$0) {
         this.b = $$0;
         return this;
      }

      public fet a() {
         return new fet(this.a, this.b);
      }
   }
}
