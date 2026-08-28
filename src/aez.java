import java.util.List;

public class aez implements zb<abn> {
   public static final ys<vr, aez> a = zb.a(aez::a, aez::new);
   private final int b;
   private final int[] c;

   public aez(bsh $$0) {
      this.b = $$0.an();
      List<bsh> $$1 = $$0.cU();
      this.c = new int[$$1.size()];

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         this.c[$$2] = $$1.get($$2).an();
      }
   }

   private aez(vr $$0) {
      this.b = $$0.l();
      this.c = $$0.c();
   }

   private void a(vr $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
   }

   @Override
   public zd<aez> a() {
      return afz.aJ;
   }

   public void a(abn $$0) {
      $$0.a(this);
   }

   public int[] b() {
      return this.c;
   }

   public int e() {
      return this.b;
   }
}
