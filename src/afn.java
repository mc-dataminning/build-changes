import java.util.List;

public class afn implements zh<abw> {
   public static final yy<vw, afn> a = zh.a(afn::a, afn::new);
   private final int b;
   private final int[] c;

   public afn(bwt $$0) {
      this.b = $$0.ao();
      List<bwt> $$1 = $$0.cY();
      this.c = new int[$$1.size()];

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         this.c[$$2] = $$1.get($$2).ao();
      }
   }

   private afn(vw $$0) {
      this.b = $$0.l();
      this.c = $$0.c();
   }

   private void a(vw $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
   }

   @Override
   public zj<afn> a() {
      return agp.aN;
   }

   public void a(abw $$0) {
      $$0.a(this);
   }

   public int[] b() {
      return this.c;
   }

   public int e() {
      return this.b;
   }
}
