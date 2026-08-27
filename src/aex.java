import java.util.List;

public class aex implements zb<abm> {
   public static final ys<vu, aex> a = zb.a(aex::a, aex::new);
   private final int b;
   private final int[] c;

   public aex(brh $$0) {
      this.b = $$0.aj();
      List<brh> $$1 = $$0.cQ();
      this.c = new int[$$1.size()];

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         this.c[$$2] = $$1.get($$2).aj();
      }
   }

   private aex(vu $$0) {
      this.b = $$0.l();
      this.c = $$0.c();
   }

   private void a(vu $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
   }

   @Override
   public zd<aex> a() {
      return afx.aJ;
   }

   public void a(abm $$0) {
      $$0.a(this);
   }

   public int[] b() {
      return this.c;
   }

   public int e() {
      return this.b;
   }
}
