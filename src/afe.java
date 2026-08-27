public class afe implements zb<abm> {
   public static final ys<vu, afe> a = zb.a(afe::a, afe::new);
   private final int b;
   private final int c;
   private final int d;

   public afe(int $$0, int $$1, int $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private afe(vu $$0) {
      this.b = $$0.readInt();
      this.c = $$0.readInt();
      this.d = $$0.readInt();
   }

   private void a(vu $$0) {
      $$0.p(this.b);
      $$0.p(this.c);
      $$0.p(this.d);
   }

   @Override
   public zd<afe> a() {
      return afx.aQ;
   }

   public void a(abm $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public int e() {
      return this.c;
   }

   public int f() {
      return this.d;
   }
}
