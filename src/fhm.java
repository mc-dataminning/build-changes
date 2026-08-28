import javax.annotation.Nullable;

public class fhm {
   public final int a;
   @Nullable
   public final String b;

   fhm(int $$0, String $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public static class a {
      private int a = -1;
      private String b;

      public fhm.a a(int $$0) {
         this.a = $$0;
         return this;
      }

      public fhm.a a(@Nullable String $$0) {
         this.b = $$0;
         return this;
      }

      public fhm a() {
         return new fhm(this.a, this.b);
      }
   }
}
