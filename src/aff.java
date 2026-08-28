import java.util.ArrayList;
import java.util.List;

public record aff(int c, List<akp.c<?>> d) implements zh<abw> {
   public static final yy<wl, aff> a = zh.a(aff::b, aff::new);
   public static final int b = 255;

   private aff(wl $$0) {
      this($$0.l(), a($$0));
   }

   private static void a(List<akp.c<?>> $$0, wl $$1) {
      for (akp.c<?> $$2 : $$0) {
         $$2.a($$1);
      }

      $$1.l(255);
   }

   private static List<akp.c<?>> a(wl $$0) {
      List<akp.c<?>> $$1 = new ArrayList<>();

      int $$2;
      while (($$2 = $$0.readUnsignedByte()) != 255) {
         $$1.add(akp.c.a($$0, $$2));
      }

      return $$1;
   }

   private void b(wl $$0) {
      $$0.c(this.c);
      a(this.d, $$0);
   }

   @Override
   public zj<aff> a() {
      return agp.aF;
   }

   public void a(abw $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.c;
   }

   public List<akp.c<?>> e() {
      return this.d;
   }
}
