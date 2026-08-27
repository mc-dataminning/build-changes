import javax.annotation.Nullable;

public class epe {
   public final int a;
   @Nullable
   public final String b;

   epe(int $$0, String $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public static class a {
      private int a = -1;
      private String b;

      public epe.a a(int $$0) {
         this.a = $$0;
         return this;
      }

      public epe.a a(@Nullable String $$0) {
         this.b = $$0;
         return this;
      }

      public epe a() {
         return new epe(this.a, this.b);
      }
   }
}
