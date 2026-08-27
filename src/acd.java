import java.util.ArrayList;
import java.util.List;

public record acd(int b, List<agq.b<?>> c) implements xg<zb> {
   public static final int a = 255;

   public acd(uj $$0) {
      this($$0.n(), b($$0));
   }

   private static void a(List<agq.b<?>> $$0, uj $$1) {
      for (agq.b<?> $$2 : $$0) {
         $$2.a($$1);
      }

      $$1.k(255);
   }

   private static List<agq.b<?>> b(uj $$0) {
      List<agq.b<?>> $$1 = new ArrayList<>();

      int $$2;
      while (($$2 = $$0.readUnsignedByte()) != 255) {
         $$1.add(agq.b.a($$0, $$2));
      }

      return $$1;
   }

   @Override
   public void a(uj $$0) {
      $$0.c(this.b);
      a(this.c, $$0);
   }

   public void a(zb $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.b;
   }

   public List<agq.b<?>> d() {
      return this.c;
   }
}
