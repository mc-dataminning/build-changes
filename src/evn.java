import javax.annotation.Nullable;

public class evn {
   public final int a;
   @Nullable
   public final String b;

   evn(int $$0, String $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public static class a {
      private int a = -1;
      private String b;

      public evn.a a(int $$0) {
         this.a = $$0;
         return this;
      }

      public evn.a a(@Nullable String $$0) {
         this.b = $$0;
         return this;
      }

      public evn a() {
         return new evn(this.a, this.b);
      }
   }
}
