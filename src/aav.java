import java.util.ArrayList;
import java.util.List;

public record aav(int b, List<aff.b<?>> c) implements wb<xu> {
   public static final int a = 255;

   public aav(tl $$0) {
      this($$0.n(), b($$0));
   }

   private static void a(List<aff.b<?>> $$0, tl $$1) {
      for (aff.b<?> $$2 : $$0) {
         $$2.a($$1);
      }

      $$1.k(255);
   }

   private static List<aff.b<?>> b(tl $$0) {
      List<aff.b<?>> $$1 = new ArrayList<>();

      int $$2;
      while (($$2 = $$0.readUnsignedByte()) != 255) {
         $$1.add(aff.b.a($$0, $$2));
      }

      return $$1;
   }

   @Override
   public void a(tl $$0) {
      $$0.c(this.b);
      a(this.c, $$0);
   }

   public void a(xu $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.b;
   }

   public List<aff.b<?>> d() {
      return this.c;
   }
}
