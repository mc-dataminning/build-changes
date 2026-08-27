import javax.annotation.Nullable;

public class fbk {
   public final int a;
   @Nullable
   public final String b;

   fbk(int $$0, String $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public static class a {
      private int a = -1;
      private String b;

      public fbk.a a(int $$0) {
         this.a = $$0;
         return this;
      }

      public fbk.a a(@Nullable String $$0) {
         this.b = $$0;
         return this;
      }

      public fbk a() {
         return new fbk(this.a, this.b);
      }
   }
}
