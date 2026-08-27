import javax.annotation.Nullable;

public class ezv {
   public final int a;
   @Nullable
   public final String b;

   ezv(int $$0, String $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public static class a {
      private int a = -1;
      private String b;

      public ezv.a a(int $$0) {
         this.a = $$0;
         return this;
      }

      public ezv.a a(@Nullable String $$0) {
         this.b = $$0;
         return this;
      }

      public ezv a() {
         return new ezv(this.a, this.b);
      }
   }
}
