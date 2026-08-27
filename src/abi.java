import java.util.ArrayList;
import java.util.List;

public record abi(int b, List<afv.b<?>> c) implements wo<yh> {
   public static final int a = 255;

   public abi(ty $$0) {
      this($$0.n(), b($$0));
   }

   private static void a(List<afv.b<?>> $$0, ty $$1) {
      for (afv.b<?> $$2 : $$0) {
         $$2.a($$1);
      }

      $$1.k(255);
   }

   private static List<afv.b<?>> b(ty $$0) {
      List<afv.b<?>> $$1 = new ArrayList<>();

      int $$2;
      while (($$2 = $$0.readUnsignedByte()) != 255) {
         $$1.add(afv.b.a($$0, $$2));
      }

      return $$1;
   }

   @Override
   public void a(ty $$0) {
      $$0.c(this.b);
      a(this.c, $$0);
   }

   public void a(yh $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.b;
   }

   public List<afv.b<?>> d() {
      return this.c;
   }
}
