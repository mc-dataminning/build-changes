import java.util.List;

public class afj implements zd<abs> {
   public static final yu<vs, afj> a = zd.a(afj::a, afj::new);
   private final int b;
   private final int[] c;

   public afj(bwa $$0) {
      this.b = $$0.ar();
      List<bwa> $$1 = $$0.cY();
      this.c = new int[$$1.size()];

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         this.c[$$2] = $$1.get($$2).ar();
      }
   }

   private afj(vs $$0) {
      this.b = $$0.l();
      this.c = $$0.c();
   }

   private void a(vs $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
   }

   @Override
   public zf<afj> a() {
      return agl.aN;
   }

   public void a(abs $$0) {
      $$0.a(this);
   }

   public int[] b() {
      return this.c;
   }

   public int e() {
      return this.b;
   }
}
