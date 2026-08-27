import javax.annotation.Nullable;

public class epu {
   public final int a;
   @Nullable
   public final String b;

   epu(int $$0, String $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public static class a {
      private int a = -1;
      private String b;

      public epu.a a(int $$0) {
         this.a = $$0;
         return this;
      }

      public epu.a a(@Nullable String $$0) {
         this.b = $$0;
         return this;
      }

      public epu a() {
         return new epu(this.a, this.b);
      }
   }
}
