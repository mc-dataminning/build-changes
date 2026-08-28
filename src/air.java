public class air implements zq<agw> {
   public static final zh<wg, air> a = zq.a(air::a, air::new);
   private static final int b = 384;
   private final jh c;
   private final String[] d;
   private final boolean e;

   public air(jh $$0, boolean $$1, String $$2, String $$3, String $$4, String $$5) {
      this.c = $$0;
      this.e = $$1;
      this.d = new String[]{$$2, $$3, $$4, $$5};
   }

   private air(wg $$0) {
      this.c = $$0.e();
      this.e = $$0.readBoolean();
      this.d = new String[4];

      for (int $$1 = 0; $$1 < 4; $$1++) {
         this.d[$$1] = $$0.d(384);
      }
   }

   private void a(wg $$0) {
      $$0.a(this.c);
      $$0.a(this.e);

      for (int $$1 = 0; $$1 < 4; $$1++) {
         $$0.a(this.d[$$1]);
      }
   }

   @Override
   public zs<air> a() {
      return agu.cc;
   }

   public void a(agw $$0) {
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
