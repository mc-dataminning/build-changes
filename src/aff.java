import java.util.List;

public class aff implements zf<abt> {
   public static final yw<vv, aff> a = zf.a(aff::a, aff::new);
   private final int b;
   private final int[] c;

   public aff(bsq $$0) {
      this.b = $$0.an();
      List<bsq> $$1 = $$0.cT();
      this.c = new int[$$1.size()];

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         this.c[$$2] = $$1.get($$2).an();
      }
   }

   private aff(vv $$0) {
      this.b = $$0.l();
      this.c = $$0.c();
   }

   private void a(vv $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
   }

   @Override
   public zh<aff> a() {
      return agf.aJ;
   }

   public void a(abt $$0) {
      $$0.a(this);
   }

   public int[] b() {
      return this.c;
   }

   public int e() {
      return this.b;
   }
}
