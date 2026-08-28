import java.util.ArrayList;
import java.util.List;

public record afh(int c, List<akr.c<?>> d) implements zj<aby> {
   public static final za<wn, afh> a = zj.a(afh::b, afh::new);
   public static final int b = 255;

   private afh(wn $$0) {
      this($$0.l(), a($$0));
   }

   private static void a(List<akr.c<?>> $$0, wn $$1) {
      for (akr.c<?> $$2 : $$0) {
         $$2.a($$1);
      }

      $$1.l(255);
   }

   private static List<akr.c<?>> a(wn $$0) {
      List<akr.c<?>> $$1 = new ArrayList<>();

      int $$2;
      while (($$2 = $$0.readUnsignedByte()) != 255) {
         $$1.add(akr.c.a($$0, $$2));
      }

      return $$1;
   }

   private void b(wn $$0) {
      $$0.c(this.c);
      a(this.d, $$0);
   }

   @Override
   public zl<afh> a() {
      return agr.aF;
   }

   public void a(aby $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.c;
   }

   public List<akr.c<?>> e() {
      return this.d;
   }
}
