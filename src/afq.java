import java.util.ArrayList;
import java.util.List;

public record afq(int c, List<akw.c<?>> d) implements zr<acg> {
   public static final zi<wv, afq> a = zr.a(afq::b, afq::new);
   public static final int b = 255;

   private afq(wv $$0) {
      this($$0.l(), a($$0));
   }

   private static void a(List<akw.c<?>> $$0, wv $$1) {
      for (akw.c<?> $$2 : $$0) {
         $$2.a($$1);
      }

      $$1.l(255);
   }

   private static List<akw.c<?>> a(wv $$0) {
      List<akw.c<?>> $$1 = new ArrayList<>();

      int $$2;
      while (($$2 = $$0.readUnsignedByte()) != 255) {
         $$1.add(akw.c.a($$0, $$2));
      }

      return $$1;
   }

   private void b(wv $$0) {
      $$0.c(this.c);
      a(this.d, $$0);
   }

   @Override
   public zt<afq> a() {
      return agz.aF;
   }

   public void a(acg $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.c;
   }

   public List<akw.c<?>> e() {
      return this.d;
   }
}
