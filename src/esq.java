import javax.annotation.Nullable;

public class esq {
   public final int a;
   @Nullable
   public final String b;

   esq(int $$0, String $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public static class a {
      private int a = -1;
      private String b;

      public esq.a a(int $$0) {
         this.a = $$0;
         return this;
      }

      public esq.a a(@Nullable String $$0) {
         this.b = $$0;
         return this;
      }

      public esq a() {
         return new esq(this.a, this.b);
      }
   }
}
