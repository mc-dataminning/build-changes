import java.util.ArrayList;
import java.util.List;

public record agb(int c, List<alg.c<?>> d) implements aac<acr> {
   public static final zt<xg, agb> a = aac.a(agb::b, agb::new);
   public static final int b = 255;

   private agb(xg $$0) {
      this($$0.l(), a($$0));
   }

   private static void a(List<alg.c<?>> $$0, xg $$1) {
      for (alg.c<?> $$2 : $$0) {
         $$2.a($$1);
      }

      $$1.l(255);
   }

   private static List<alg.c<?>> a(xg $$0) {
      List<alg.c<?>> $$1 = new ArrayList<>();

      int $$2;
      while (($$2 = $$0.readUnsignedByte()) != 255) {
         $$1.add(alg.c.a($$0, $$2));
      }

      return $$1;
   }

   private void b(xg $$0) {
      $$0.c(this.c);
      a(this.d, $$0);
   }

   @Override
   public aae<agb> a() {
      return ahk.aF;
   }

   public void a(acr $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.c;
   }

   public List<alg.c<?>> e() {
      return this.d;
   }
}
