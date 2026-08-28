public class aik implements zc<agm> {
   public static final yt<vr, aik> a = zc.a(aik::a, aik::new);
   private static final int b = 384;
   private final jj c;
   private final String[] d;
   private final boolean e;

   public aik(jj $$0, boolean $$1, String $$2, String $$3, String $$4, String $$5) {
      this.c = $$0;
      this.e = $$1;
      this.d = new String[]{$$2, $$3, $$4, $$5};
   }

   private aik(vr $$0) {
      this.c = $$0.e();
      this.e = $$0.readBoolean();
      this.d = new String[4];

      for (int $$1 = 0; $$1 < 4; $$1++) {
         this.d[$$1] = $$0.d(384);
      }
   }

   private void a(vr $$0) {
      $$0.a(this.c);
      $$0.a(this.e);

      for (int $$1 = 0; $$1 < 4; $$1++) {
         $$0.a(this.d[$$1]);
      }
   }

   @Override
   public ze<aik> a() {
      return agk.ck;
   }

   public void a(agm $$0) {
      $$0.a(this);
   }

   public jj b() {
      return this.c;
   }

   public boolean e() {
      return this.e;
   }

   public String[] f() {
      return this.d;
   }
}
