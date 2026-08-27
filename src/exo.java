import javax.annotation.Nullable;

public class exo {
   public final int a;
   @Nullable
   public final String b;

   exo(int $$0, String $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public static class a {
      private int a = -1;
      private String b;

      public exo.a a(int $$0) {
         this.a = $$0;
         return this;
      }

      public exo.a a(@Nullable String $$0) {
         this.b = $$0;
         return this;
      }

      public exo a() {
         return new exo(this.a, this.b);
      }
   }
}
