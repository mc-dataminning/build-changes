import javax.annotation.Nullable;

public class eqx {
   public final int a;
   @Nullable
   public final String b;

   eqx(int $$0, String $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public static class a {
      private int a = -1;
      private String b;

      public eqx.a a(int $$0) {
         this.a = $$0;
         return this;
      }

      public eqx.a a(@Nullable String $$0) {
         this.b = $$0;
         return this;
      }

      public eqx a() {
         return new eqx(this.a, this.b);
      }
   }
}
