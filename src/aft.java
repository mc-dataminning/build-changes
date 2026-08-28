import java.util.List;

public class aft implements zv<ach> {
   public static final zm<wl, aft> a = zv.a(aft::a, aft::new);
   private final int b;
   private final int[] c;

   public aft(bst $$0) {
      this.b = $$0.al();
      List<bst> $$1 = $$0.cS();
      this.c = new int[$$1.size()];

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         this.c[$$2] = $$1.get($$2).al();
      }
   }

   private aft(wl $$0) {
      this.b = $$0.l();
      this.c = $$0.c();
   }

   private void a(wl $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
   }

   @Override
   public zx<aft> a() {
      return agt.aJ;
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
