import javax.annotation.Nullable;

public class aif implements zc<agm> {
   public static final yt<vr, aif> a = zc.a(aif::a, aif::new);
   private final int b;
   private final String c;
   private final boolean d;

   public aif(int $$0, String $$1, boolean $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private aif(vr $$0) {
      this.b = $$0.l();
      this.c = $$0.p();
      this.d = $$0.readBoolean();
   }

   private void a(vr $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
   }

   @Override
   public ze<aif> a() {
      return agk.ce;
   }

   public void a(agm $$0) {
      $$0.a(this);
   }

   @Nullable
   public dgq a(dhp $$0) {
      bvs $$1 = $$0.a(this.b);
      return $$1 instanceof csr ? ((csr)$$1).q() : null;
   }

   public String b() {
      return this.c;
   }

   public boolean e() {
      return this.d;
   }
}
