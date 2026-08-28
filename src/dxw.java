import java.util.List;

public interface dxw {
   List<dxw.a> a();

   public static class a {
      private final int a;
      private int b;

      public a(int $$0) {
         this.a = $$0;
         this.b = 1;
      }

      public void a() {
         this.b++;
      }

      public int b() {
         return this.a;
      }

      public int c() {
         return this.b;
      }
   }
}
