import java.util.List;

public class afq implements zs<ace> {
   public static final zj<wl, afq> a = zs.a(afq::a, afq::new);
   private final int b;
   private final int[] c;

   public afq(bsp $$0) {
      this.b = $$0.al();
      List<bsp> $$1 = $$0.cS();
      this.c = new int[$$1.size()];

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         this.c[$$2] = $$1.get($$2).al();
      }
   }

   private afq(wl $$0) {
      this.b = $$0.l();
      this.c = $$0.c();
   }

   private void a(wl $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
   }

   @Override
   public zu<afq> a() {
      return agq.aJ;
   }

   public void a(ace $$0) {
      $$0.a(this);
   }

   public int[] b() {
      return this.c;
   }

   public int e() {
      return this.b;
   }
}
