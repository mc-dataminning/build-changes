import javax.annotation.Nullable;

public class eto {
   public final int a;
   @Nullable
   public final String b;

   eto(int $$0, String $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public static class a {
      private int a = -1;
      private String b;

      public eto.a a(int $$0) {
         this.a = $$0;
         return this;
      }

      public eto.a a(@Nullable String $$0) {
         this.b = $$0;
         return this;
      }

      public eto a() {
         return new eto(this.a, this.b);
      }
   }
}
