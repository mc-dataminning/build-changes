import java.util.List;

public class aft implements zq<acf> {
   public static final zh<wg, aft> a = zq.a(aft::a, aft::new);
   private final int b;
   private final int[] c;

   public aft(bul $$0) {
      this.b = $$0.ar();
      List<bul> $$1 = $$0.cZ();
      this.c = new int[$$1.size()];

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         this.c[$$2] = $$1.get($$2).ar();
      }
   }

   private aft(wg $$0) {
      this.b = $$0.l();
      this.c = $$0.c();
   }

   private void a(wg $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
   }

   @Override
   public zs<aft> a() {
      return agu.aK;
   }

   public void a(acf $$0) {
      $$0.a(this);
   }

   public int[] b() {
      return this.c;
   }

   public int e() {
      return this.b;
   }
}
