import javax.annotation.Nullable;

public class etn {
   public final int a;
   @Nullable
   public final String b;

   etn(int $$0, String $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public static class a {
      private int a = -1;
      private String b;

      public etn.a a(int $$0) {
         this.a = $$0;
         return this;
      }

      public etn.a a(@Nullable String $$0) {
         this.b = $$0;
         return this;
      }

      public etn a() {
         return new etn(this.a, this.b);
      }
   }
}
