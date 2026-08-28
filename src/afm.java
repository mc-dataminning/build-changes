public class afm implements zf<abt> {
   public static final yw<vv, afm> a = zf.a(afm::a, afm::new);
   private final int b;
   private final int c;
   private final int d;

   public afm(int $$0, int $$1, int $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private afm(vv $$0) {
      this.b = $$0.readInt();
      this.c = $$0.readInt();
      this.d = $$0.readInt();
   }

   private void a(vv $$0) {
      $$0.p(this.b);
      $$0.p(this.c);
      $$0.p(this.d);
   }

   @Override
   public zh<afm> a() {
      return agf.aQ;
   }

   public void a(abt $$0) {
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
