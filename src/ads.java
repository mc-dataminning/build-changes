public class ads implements zf<abt> {
   public static final yw<vv, ads> a = zf.a(ads::a, ads::new);
   private final int b;
   private final akq c;

   public ads(int $$0, cyz<?> $$1) {
      this.b = $$0;
      this.c = $$1.a();
   }

   private ads(vv $$0) {
      this.b = $$0.readByte();
      this.c = $$0.q();
   }

   private void a(vv $$0) {
      $$0.k(this.b);
      $$0.a(this.c);
   }

   @Override
   public zh<ads> a() {
      return agf.Y;
   }

   public void a(abt $$0) {
      $$0.a(this);
   }

   public akq b() {
      return this.c;
   }

   public int e() {
      return this.b;
   }
}
