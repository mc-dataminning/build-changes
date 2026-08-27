import java.util.List;

public class afi implements zl<abw> {
   public static final zc<we, afi> a = zl.a(afi::a, afi::new);
   private final int b;
   private final int[] c;

   public afi(brv $$0) {
      this.b = $$0.al();
      List<brv> $$1 = $$0.cX();
      this.c = new int[$$1.size()];

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         this.c[$$2] = $$1.get($$2).al();
      }
   }

   private afi(we $$0) {
      this.b = $$0.l();
      this.c = $$0.c();
   }

   private void a(we $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
   }

   @Override
   public zn<afi> a() {
      return agj.aK;
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
