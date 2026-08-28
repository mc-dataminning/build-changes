import java.util.ArrayList;
import java.util.List;

public record aez(int c, List<aka.c<?>> d) implements zg<abu> {
   public static final yx<wk, aez> a = zg.a(aez::b, aez::new);
   public static final int b = 255;

   private aez(wk $$0) {
      this($$0.l(), a($$0));
   }

   private static void a(List<aka.c<?>> $$0, wk $$1) {
      for (aka.c<?> $$2 : $$0) {
         $$2.a($$1);
      }

      $$1.k(255);
   }

   private static List<aka.c<?>> a(wk $$0) {
      List<aka.c<?>> $$1 = new ArrayList<>();

      int $$2;
      while (($$2 = $$0.readUnsignedByte()) != 255) {
         $$1.add(aka.c.a($$0, $$2));
      }

      return $$1;
   }

   private void b(wk $$0) {
      $$0.c(this.c);
      a(this.d, $$0);
   }

   @Override
   public zi<aez> a() {
      return agg.aC;
   }

   public void a(abu $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.c;
   }

   public List<aka.c<?>> e() {
      return this.d;
   }
}
