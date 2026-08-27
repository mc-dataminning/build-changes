import java.util.ArrayList;
import java.util.List;

public record abp(int b, List<agc.b<?>> c) implements wu<yo> {
   public static final int a = 255;

   public abp(ue $$0) {
      this($$0.n(), b($$0));
   }

   private static void a(List<agc.b<?>> $$0, ue $$1) {
      for (agc.b<?> $$2 : $$0) {
         $$2.a($$1);
      }

      $$1.k(255);
   }

   private static List<agc.b<?>> b(ue $$0) {
      List<agc.b<?>> $$1 = new ArrayList<>();

      int $$2;
      while (($$2 = $$0.readUnsignedByte()) != 255) {
         $$1.add(agc.b.a($$0, $$2));
      }

      return $$1;
   }

   @Override
   public void a(ue $$0) {
      $$0.c(this.b);
      a(this.c, $$0);
   }

   public void a(yo $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.b;
   }

   public List<agc.b<?>> d() {
      return this.c;
   }
}
