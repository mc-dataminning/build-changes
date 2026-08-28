public class afr implements zd<abs> {
   public static final yu<vs, afr> a = zd.a(afr::a, afr::new);
   private final int b;
   private final int c;
   private final int d;

   public afr(int $$0, int $$1, int $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private afr(vs $$0) {
      this.b = $$0.readInt();
      this.c = $$0.readInt();
      this.d = $$0.readInt();
   }

   private void a(vs $$0) {
      $$0.q(this.b);
      $$0.q(this.c);
      $$0.q(this.d);
   }

   @Override
   public zf<afr> a() {
      return agl.aU;
   }

   public void a(abs $$0) {
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
