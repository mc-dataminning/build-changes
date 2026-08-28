public record adb(int b, float c) implements zd<abs> {
   public static final yu<vs, adb> a = zd.a(adb::a, adb::new);

   public adb(bwz $$0) {
      this($$0.ar(), $$0.eL());
   }

   private adb(vs $$0) {
      this($$0.l(), $$0.readFloat());
   }

   private void a(vs $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
   }

   @Override
   public zf<adb> a() {
      return agl.I;
   }

   public void a(abs $$0) {
      $$0.a(this);
   }

   public float e() {
      return this.c;
   }
}
