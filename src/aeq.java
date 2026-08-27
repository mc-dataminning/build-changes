import java.util.ArrayList;
import java.util.List;

public record aeq(int c, List<ajq.c<?>> d) implements zb<abm> {
   public static final ys<wf, aeq> a = zb.a(aeq::b, aeq::new);
   public static final int b = 255;

   private aeq(wf $$0) {
      this($$0.l(), a($$0));
   }

   private static void a(List<ajq.c<?>> $$0, wf $$1) {
      for (ajq.c<?> $$2 : $$0) {
         $$2.a($$1);
      }

      $$1.k(255);
   }

   private static List<ajq.c<?>> a(wf $$0) {
      List<ajq.c<?>> $$1 = new ArrayList<>();

      int $$2;
      while (($$2 = $$0.readUnsignedByte()) != 255) {
         $$1.add(ajq.c.a($$0, $$2));
      }

      return $$1;
   }

   private void b(wf $$0) {
      $$0.c(this.c);
      a(this.d, $$0);
   }

   @Override
   public zd<aeq> a() {
      return afx.aC;
   }

   public void a(abm $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.c;
   }

   public List<ajq.c<?>> e() {
      return this.d;
   }
}
