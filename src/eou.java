import javax.annotation.Nullable;

public class eou {
   public final int a;
   @Nullable
   public final String b;

   eou(int $$0, String $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public static class a {
      private int a = -1;
      private String b;

      public eou.a a(int $$0) {
         this.a = $$0;
         return this;
      }

      public eou.a a(@Nullable String $$0) {
         this.b = $$0;
         return this;
      }

      public eou a() {
         return new eou(this.a, this.b);
      }
   }
}
