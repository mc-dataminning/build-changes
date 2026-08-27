import javax.annotation.Nullable;

public class exm {
   public final int a;
   @Nullable
   public final String b;

   exm(int $$0, String $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public static class a {
      private int a = -1;
      private String b;

      public exm.a a(int $$0) {
         this.a = $$0;
         return this;
      }

      public exm.a a(@Nullable String $$0) {
         this.b = $$0;
         return this;
      }

      public exm a() {
         return new exm(this.a, this.b);
      }
   }
}
