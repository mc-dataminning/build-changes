import com.mojang.blaze3d.vertex.VertexFormat;
import javax.annotation.Nullable;

public class flf {
   private static final int a = 786432;
   private final fla b;
   @Nullable
   private static flf c;

   public static void a() {
      if (c != null) {
         throw new IllegalStateException("Tesselator has already been initialized");
      } else {
         c = new flf();
      }
   }

   public static flf b() {
      if (c == null) {
         throw new IllegalStateException("Tesselator has not been initialized");
      } else {
         return c;
      }
   }

   public flf(int $$0) {
      this.b = new fla($$0);
   }

   public flf() {
      this(786432);
   }

   public fkz a(VertexFormat.b $$0, VertexFormat $$1) {
      return new fkz(this.b, $$0, $$1);
   }

   public void c() {
      this.b.b();
   }
}
