public class aix implements zr<ahb> {
   public static final zi<wh, aix> a = zr.a(aix::a, aix::new);
   private static final int b = 384;
   private final jh c;
   private final String[] d;
   private final boolean e;

   public aix(jh $$0, boolean $$1, String $$2, String $$3, String $$4, String $$5) {
      this.c = $$0;
      this.e = $$1;
      this.d = new String[]{$$2, $$3, $$4, $$5};
   }

   private aix(wh $$0) {
      this.c = $$0.e();
      this.e = $$0.readBoolean();
      this.d = new String[4];

      for (int $$1 = 0; $$1 < 4; $$1++) {
         this.d[$$1] = $$0.d(384);
      }
   }

   private void a(wh $$0) {
      $$0.a(this.c);
      $$0.a(this.e);

      for (int $$1 = 0; $$1 < 4; $$1++) {
         $$0.a(this.d[$$1]);
      }
   }

   @Override
   public zt<aix> a() {
      return agz.ch;
   }

   public void a(ahb $$0) {
      $$0.a(this);
   }

   public jh b() {
      return this.c;
   }

   public boolean e() {
      return this.e;
   }

   public String[] f() {
      return this.d;
   }
}
