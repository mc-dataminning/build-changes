import java.util.List;

public class afw implements zo<acf> {
   public static final ze<vy, afw> a = zo.a(afw::a, afw::new);
   private final int b;
   private final int[] c;

   public afw(bxe $$0) {
      this.b = $$0.ao();
      List<bxe> $$1 = $$0.cY();
      this.c = new int[$$1.size()];

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         this.c[$$2] = $$1.get($$2).ao();
      }
   }

   private afw(vy $$0) {
      this.b = $$0.l();
      this.c = $$0.c();
   }

   private void a(vy $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
   }

   @Override
   public zq<afw> a() {
      return agy.aN;
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
