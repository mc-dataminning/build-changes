import javax.annotation.Nullable;

public class evu {
   public final int a;
   @Nullable
   public final String b;

   evu(int $$0, String $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public static class a {
      private int a = -1;
      private String b;

      public evu.a a(int $$0) {
         this.a = $$0;
         return this;
      }

      public evu.a a(@Nullable String $$0) {
         this.b = $$0;
         return this;
      }

      public evu a() {
         return new evu(this.a, this.b);
      }
   }
}
