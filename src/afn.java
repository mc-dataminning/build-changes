import java.util.ArrayList;
import java.util.List;

public record afn(int c, List<ako.c<?>> d) implements zw<aci> {
   public static final zn<xa, afn> a = zw.a(afn::b, afn::new);
   public static final int b = 255;

   private afn(xa $$0) {
      this($$0.l(), a($$0));
   }

   private static void a(List<ako.c<?>> $$0, xa $$1) {
      for (ako.c<?> $$2 : $$0) {
         $$2.a($$1);
      }

      $$1.k(255);
   }

   private static List<ako.c<?>> a(xa $$0) {
      List<ako.c<?>> $$1 = new ArrayList<>();

      int $$2;
      while (($$2 = $$0.readUnsignedByte()) != 255) {
         $$1.add(ako.c.a($$0, $$2));
      }

      return $$1;
   }

   private void b(xa $$0) {
      $$0.c(this.c);
      a(this.d, $$0);
   }

   @Override
   public zy<afn> a() {
      return agu.aC;
   }

   public void a(aci $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.c;
   }

   public List<ako.c<?>> e() {
      return this.d;
   }
}
