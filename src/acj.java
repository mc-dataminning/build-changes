import java.util.List;

public class acj implements xf<za> {
   private final int a;
   private final int[] b;

   public acj(blv $$0) {
      this.a = $$0.aj();
      List<blv> $$1 = $$0.cP();
      this.b = new int[$$1.size()];

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         this.b[$$2] = $$1.get($$2).aj();
      }
   }

   public acj(ui $$0) {
      this.a = $$0.n();
      this.b = $$0.c();
   }

   @Override
   public void a(ui $$0) {
      $$0.c(this.a);
      $$0.a(this.b);
   }

   public void a(za $$0) {
      $$0.a(this);
   }

   public int[] a() {
      return this.b;
   }

   public int d() {
      return this.a;
   }
}
