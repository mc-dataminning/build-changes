import java.util.List;

public class afu implements zw<aci> {
   public static final zn<wm, afu> a = zw.a(afu::a, afu::new);
   private final int b;
   private final int[] c;

   public afu(bsu $$0) {
      this.b = $$0.al();
      List<bsu> $$1 = $$0.cS();
      this.c = new int[$$1.size()];

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         this.c[$$2] = $$1.get($$2).al();
      }
   }

   private afu(wm $$0) {
      this.b = $$0.l();
      this.c = $$0.c();
   }

   private void a(wm $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
   }

   @Override
   public zy<afu> a() {
      return agu.aJ;
   }

   public void a(aci $$0) {
      $$0.a(this);
   }

   public int[] b() {
      return this.c;
   }

   public int e() {
      return this.b;
   }
}
