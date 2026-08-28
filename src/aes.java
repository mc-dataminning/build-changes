import java.util.ArrayList;
import java.util.List;

public record aes(int c, List<ajt.c<?>> d) implements zb<abn> {
   public static final ys<wf, aes> a = zb.a(aes::b, aes::new);
   public static final int b = 255;

   private aes(wf $$0) {
      this($$0.l(), a($$0));
   }

   private static void a(List<ajt.c<?>> $$0, wf $$1) {
      for (ajt.c<?> $$2 : $$0) {
         $$2.a($$1);
      }

      $$1.k(255);
   }

   private static List<ajt.c<?>> a(wf $$0) {
      List<ajt.c<?>> $$1 = new ArrayList<>();

      int $$2;
      while (($$2 = $$0.readUnsignedByte()) != 255) {
         $$1.add(ajt.c.a($$0, $$2));
      }

      return $$1;
   }

   private void b(wf $$0) {
      $$0.c(this.c);
      a(this.d, $$0);
   }

   @Override
   public zd<aes> a() {
      return afz.aC;
   }

   public void a(abn $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.c;
   }

   public List<ajt.c<?>> e() {
      return this.d;
   }
}
