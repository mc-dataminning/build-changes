import javax.annotation.Nullable;

public class fep {
   public final int a;
   @Nullable
   public final String b;

   fep(int $$0, String $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public static class a {
      private int a = -1;
      private String b;

      public fep.a a(int $$0) {
         this.a = $$0;
         return this;
      }

      public fep.a a(@Nullable String $$0) {
         this.b = $$0;
         return this;
      }

      public fep a() {
         return new fep(this.a, this.b);
      }
   }
}
