import java.util.List;

public class adt implements xz<aai> {
   public static final xq<us, adt> a = xz.a(adt::a, adt::new);
   private final int b;
   private final int[] c;

   public adt(bof $$0) {
      this.b = $$0.aj();
      List<bof> $$1 = $$0.cM();
      this.c = new int[$$1.size()];

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         this.c[$$2] = $$1.get($$2).aj();
      }
   }

   private adt(us $$0) {
      this.b = $$0.l();
      this.c = $$0.c();
   }

   private void a(us $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
   }

   @Override
   public yb<adt> a() {
      return aet.aJ;
   }

   public void a(aai $$0) {
      $$0.a(this);
   }

   public int[] b() {
      return this.c;
   }

   public int e() {
      return this.b;
   }
}
