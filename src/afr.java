import java.util.List;

public class afr implements zo<acd> {
   public static final zf<we, afr> a = zo.a(afr::a, afr::new);
   private final int b;
   private final int[] c;

   public afr(btz $$0) {
      this.b = $$0.ar();
      List<btz> $$1 = $$0.da();
      this.c = new int[$$1.size()];

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         this.c[$$2] = $$1.get($$2).ar();
      }
   }

   private afr(we $$0) {
      this.b = $$0.l();
      this.c = $$0.c();
   }

   private void a(we $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
   }

   @Override
   public zq<afr> a() {
      return ags.aK;
   }

   public void a(acd $$0) {
      $$0.a(this);
   }

   public int[] b() {
      return this.c;
   }

   public int e() {
      return this.b;
   }
}
