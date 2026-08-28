import java.util.List;

public class agj implements aac<acr> {
   public static final zt<ws, agj> a = aac.a(agj::a, agj::new);
   private final int b;
   private final int[] c;

   public agj(bvf $$0) {
      this.b = $$0.ar();
      List<bvf> $$1 = $$0.cZ();
      this.c = new int[$$1.size()];

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         this.c[$$2] = $$1.get($$2).ar();
      }
   }

   private agj(ws $$0) {
      this.b = $$0.l();
      this.c = $$0.c();
   }

   private void a(ws $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
   }

   @Override
   public aae<agj> a() {
      return ahk.aN;
   }

   public void a(acr $$0) {
      $$0.a(this);
   }

   public int[] b() {
      return this.c;
   }

   public int e() {
      return this.b;
   }
}
