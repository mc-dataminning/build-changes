import java.util.List;

public class afo implements zl<aca> {
   public static final zc<wb, afo> a = zl.a(afo::a, afo::new);
   private final int b;
   private final int[] c;

   public afo(btr $$0) {
      this.b = $$0.ap();
      List<btr> $$1 = $$0.cW();
      this.c = new int[$$1.size()];

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         this.c[$$2] = $$1.get($$2).ap();
      }
   }

   private afo(wb $$0) {
      this.b = $$0.l();
      this.c = $$0.c();
   }

   private void a(wb $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
   }

   @Override
   public zn<afo> a() {
      return agp.aK;
   }

   public void a(aca $$0) {
      $$0.a(this);
   }

   public int[] b() {
      return this.c;
   }

   public int e() {
      return this.b;
   }
}
