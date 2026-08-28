import java.util.ArrayList;
import java.util.List;

public record afj(int c, List<ako.c<?>> d) implements zo<acd> {
   public static final zf<ws, afj> a = zo.a(afj::b, afj::new);
   public static final int b = 255;

   private afj(ws $$0) {
      this($$0.l(), a($$0));
   }

   private static void a(List<ako.c<?>> $$0, ws $$1) {
      for (ako.c<?> $$2 : $$0) {
         $$2.a($$1);
      }

      $$1.l(255);
   }

   private static List<ako.c<?>> a(ws $$0) {
      List<ako.c<?>> $$1 = new ArrayList<>();

      int $$2;
      while (($$2 = $$0.readUnsignedByte()) != 255) {
         $$1.add(ako.c.a($$0, $$2));
      }

      return $$1;
   }

   private void b(ws $$0) {
      $$0.c(this.c);
      a(this.d, $$0);
   }

   @Override
   public zq<afj> a() {
      return ags.aC;
   }

   public void a(acd $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.c;
   }

   public List<ako.c<?>> e() {
      return this.d;
   }
}
