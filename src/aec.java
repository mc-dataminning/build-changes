import java.util.ArrayList;
import java.util.List;

public record aec(int c, List<ajc.c<?>> d) implements yn<aay> {
   public static final ye<vr, aec> a = yn.a(aec::b, aec::new);
   public static final int b = 255;

   private aec(vr $$0) {
      this($$0.l(), a($$0));
   }

   private static void a(List<ajc.c<?>> $$0, vr $$1) {
      for (ajc.c<?> $$2 : $$0) {
         $$2.a($$1);
      }

      $$1.k(255);
   }

   private static List<ajc.c<?>> a(vr $$0) {
      List<ajc.c<?>> $$1 = new ArrayList<>();

      int $$2;
      while (($$2 = $$0.readUnsignedByte()) != 255) {
         $$1.add(ajc.c.a($$0, $$2));
      }

      return $$1;
   }

   private void b(vr $$0) {
      $$0.c(this.c);
      a(this.d, $$0);
   }

   @Override
   public yp<aec> a() {
      return afj.aC;
   }

   public void a(aay $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.c;
   }

   public List<ajc.c<?>> e() {
      return this.d;
   }
}
