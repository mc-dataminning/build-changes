import java.util.List;

public class afv implements zs<ach> {
   public static final zj<wi, afv> a = zs.a(afv::a, afv::new);
   private final int b;
   private final int[] c;

   public afv(bui $$0) {
      this.b = $$0.as();
      List<bui> $$1 = $$0.db();
      this.c = new int[$$1.size()];

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         this.c[$$2] = $$1.get($$2).as();
      }
   }

   private afv(wi $$0) {
      this.b = $$0.l();
      this.c = $$0.c();
   }

   private void a(wi $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
   }

   @Override
   public zu<afv> a() {
      return agw.aK;
   }

   public void a(ach $$0) {
      $$0.a(this);
   }

   public int[] b() {
      return this.c;
   }

   public int e() {
      return this.b;
   }
}
