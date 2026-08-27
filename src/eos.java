import javax.annotation.Nullable;

public class eos {
   public final int a;
   @Nullable
   public final String b;

   eos(int $$0, String $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public static class a {
      private int a = -1;
      private String b;

      public eos.a a(int $$0) {
         this.a = $$0;
         return this;
      }

      public eos.a a(@Nullable String $$0) {
         this.b = $$0;
         return this;
      }

      public eos a() {
         return new eos(this.a, this.b);
      }
   }
}
