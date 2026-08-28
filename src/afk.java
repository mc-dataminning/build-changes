import java.util.ArrayList;
import java.util.List;

public record afk(int c, List<akp.c<?>> d) implements zp<ace> {
   public static final zg<wt, afk> a = zp.a(afk::b, afk::new);
   public static final int b = 255;

   private afk(wt $$0) {
      this($$0.l(), a($$0));
   }

   private static void a(List<akp.c<?>> $$0, wt $$1) {
      for (akp.c<?> $$2 : $$0) {
         $$2.a($$1);
      }

      $$1.l(255);
   }

   private static List<akp.c<?>> a(wt $$0) {
      List<akp.c<?>> $$1 = new ArrayList<>();

      int $$2;
      while (($$2 = $$0.readUnsignedByte()) != 255) {
         $$1.add(akp.c.a($$0, $$2));
      }

      return $$1;
   }

   private void b(wt $$0) {
      $$0.c(this.c);
      a(this.d, $$0);
   }

   @Override
   public zr<afk> a() {
      return agt.aC;
   }

   public void a(ace $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.c;
   }

   public List<akp.c<?>> e() {
      return this.d;
   }
}
