public class ahw implements ze<agd> {
   public static final yv<vx, ahw> a = ze.a(ahw::a, ahw::new);
   private static final int b = 384;
   private final io c;
   private final String[] d;
   private final boolean e;

   public ahw(io $$0, boolean $$1, String $$2, String $$3, String $$4, String $$5) {
      this.c = $$0;
      this.e = $$1;
      this.d = new String[]{$$2, $$3, $$4, $$5};
   }

   private ahw(vx $$0) {
      this.c = $$0.e();
      this.e = $$0.readBoolean();
      this.d = new String[4];

      for (int $$1 = 0; $$1 < 4; $$1++) {
         this.d[$$1] = $$0.d(384);
      }
   }

   private void a(vx $$0) {
      $$0.a(this.c);
      $$0.a(this.e);

      for (int $$1 = 0; $$1 < 4; $$1++) {
         $$0.a(this.d[$$1]);
      }
   }

   @Override
   public zg<ahw> a() {
      return agb.bY;
   }

   public void a(agd $$0) {
      $$0.a(this);
   }

   public io b() {
      return this.c;
   }

   public boolean e() {
      return this.e;
   }

   public String[] f() {
      return this.d;
   }
}
