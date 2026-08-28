import java.util.List;

public class afd implements yw<abl> {
   public static final yn<vl, afd> a = yw.a(afd::a, afd::new);
   private final int b;
   private final int[] c;

   public afd(bul $$0) {
      this.b = $$0.ar();
      List<bul> $$1 = $$0.cY();
      this.c = new int[$$1.size()];

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         this.c[$$2] = $$1.get($$2).ar();
      }
   }

   private afd(vl $$0) {
      this.b = $$0.l();
      this.c = $$0.c();
   }

   private void a(vl $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
   }

   @Override
   public yy<afd> a() {
      return age.aN;
   }

   public void a(abl $$0) {
      $$0.a(this);
   }

   public int[] b() {
      return this.c;
   }

   public int e() {
      return this.b;
   }
}
