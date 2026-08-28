import java.util.List;

public class afp implements zj<aby> {
   public static final za<vy, afp> a = zj.a(afp::a, afp::new);
   private final int b;
   private final int[] c;

   public afp(bwv $$0) {
      this.b = $$0.ao();
      List<bwv> $$1 = $$0.cY();
      this.c = new int[$$1.size()];

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         this.c[$$2] = $$1.get($$2).ao();
      }
   }

   private afp(vy $$0) {
      this.b = $$0.l();
      this.c = $$0.c();
   }

   private void a(vy $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
   }

   @Override
   public zl<afp> a() {
      return agr.aN;
   }

   public void a(aby $$0) {
      $$0.a(this);
   }

   public int[] b() {
      return this.c;
   }

   public int e() {
      return this.b;
   }
}
