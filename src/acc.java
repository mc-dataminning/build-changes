import java.util.ArrayList;
import java.util.List;

public record acc(int b, List<agp.b<?>> c) implements xf<za> {
   public static final int a = 255;

   public acc(ui $$0) {
      this($$0.n(), b($$0));
   }

   private static void a(List<agp.b<?>> $$0, ui $$1) {
      for (agp.b<?> $$2 : $$0) {
         $$2.a($$1);
      }

      $$1.k(255);
   }

   private static List<agp.b<?>> b(ui $$0) {
      List<agp.b<?>> $$1 = new ArrayList<>();

      int $$2;
      while (($$2 = $$0.readUnsignedByte()) != 255) {
         $$1.add(agp.b.a($$0, $$2));
      }

      return $$1;
   }

   @Override
   public void a(ui $$0) {
      $$0.c(this.b);
      a(this.c, $$0);
   }

   public void a(za $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.b;
   }

   public List<agp.b<?>> d() {
      return this.c;
   }
}
