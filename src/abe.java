import java.util.ArrayList;
import java.util.List;

public record abe(int b, List<afp.b<?>> c) implements wk<yd> {
   public static final int a = 255;

   public abe(tu $$0) {
      this($$0.n(), b($$0));
   }

   private static void a(List<afp.b<?>> $$0, tu $$1) {
      for (afp.b<?> $$2 : $$0) {
         $$2.a($$1);
      }

      $$1.k(255);
   }

   private static List<afp.b<?>> b(tu $$0) {
      List<afp.b<?>> $$1 = new ArrayList<>();

      int $$2;
      while (($$2 = $$0.readUnsignedByte()) != 255) {
         $$1.add(afp.b.a($$0, $$2));
      }

      return $$1;
   }

   @Override
   public void a(tu $$0) {
      $$0.c(this.b);
      a(this.c, $$0);
   }

   public void a(yd $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.b;
   }

   public List<afp.b<?>> d() {
      return this.c;
   }
}
