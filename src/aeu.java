import java.util.ArrayList;
import java.util.List;

public record aeu(int c, List<akb.c<?>> d) implements yw<abl> {
   public static final yn<wa, aeu> a = yw.a(aeu::b, aeu::new);
   public static final int b = 255;

   private aeu(wa $$0) {
      this($$0.l(), a($$0));
   }

   private static void a(List<akb.c<?>> $$0, wa $$1) {
      for (akb.c<?> $$2 : $$0) {
         $$2.a($$1);
      }

      $$1.l(255);
   }

   private static List<akb.c<?>> a(wa $$0) {
      List<akb.c<?>> $$1 = new ArrayList<>();

      int $$2;
      while (($$2 = $$0.readUnsignedByte()) != 255) {
         $$1.add(akb.c.a($$0, $$2));
      }

      return $$1;
   }

   private void b(wa $$0) {
      $$0.c(this.c);
      a(this.d, $$0);
   }

   @Override
   public yy<aeu> a() {
      return agd.aE;
   }

   public void a(abl $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.c;
   }

   public List<akb.c<?>> e() {
      return this.d;
   }
}
