import java.util.ArrayList;
import java.util.List;

public record aeu(int c, List<ajv.c<?>> d) implements ze<abq> {
   public static final yv<wi, aeu> a = ze.a(aeu::b, aeu::new);
   public static final int b = 255;

   private aeu(wi $$0) {
      this($$0.l(), a($$0));
   }

   private static void a(List<ajv.c<?>> $$0, wi $$1) {
      for (ajv.c<?> $$2 : $$0) {
         $$2.a($$1);
      }

      $$1.k(255);
   }

   private static List<ajv.c<?>> a(wi $$0) {
      List<ajv.c<?>> $$1 = new ArrayList<>();

      int $$2;
      while (($$2 = $$0.readUnsignedByte()) != 255) {
         $$1.add(ajv.c.a($$0, $$2));
      }

      return $$1;
   }

   private void b(wi $$0) {
      $$0.c(this.c);
      a(this.d, $$0);
   }

   @Override
   public zg<aeu> a() {
      return agb.aC;
   }

   public void a(abq $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.c;
   }

   public List<ajv.c<?>> e() {
      return this.d;
   }
}
