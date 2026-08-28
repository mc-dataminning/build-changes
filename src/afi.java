import java.util.List;

public class afi implements zc<abr> {
   public static final yt<vr, afi> a = zc.a(afi::a, afi::new);
   private final int b;
   private final int[] c;

   public afi(bvs $$0) {
      this.b = $$0.ar();
      List<bvs> $$1 = $$0.cY();
      this.c = new int[$$1.size()];

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         this.c[$$2] = $$1.get($$2).ar();
      }
   }

   private afi(vr $$0) {
      this.b = $$0.l();
      this.c = $$0.c();
   }

   private void a(vr $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
   }

   @Override
   public ze<afi> a() {
      return agk.aN;
   }

   public void a(abr $$0) {
      $$0.a(this);
   }

   public int[] b() {
      return this.c;
   }

   public int e() {
      return this.b;
   }
}
