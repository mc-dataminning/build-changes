public class aiy implements zo<aha> {
   public static final ze<vy, aiy> a = zo.a(aiy::a, aiy::new);
   private static final int b = 384;
   private final iw c;
   private final String[] d;
   private final boolean e;

   public aiy(iw $$0, boolean $$1, String $$2, String $$3, String $$4, String $$5) {
      this.c = $$0;
      this.e = $$1;
      this.d = new String[]{$$2, $$3, $$4, $$5};
   }

   private aiy(vy $$0) {
      this.c = $$0.e();
      this.e = $$0.readBoolean();
      this.d = new String[4];

      for (int $$1 = 0; $$1 < 4; $$1++) {
         this.d[$$1] = $$0.d(384);
      }
   }

   private void a(vy $$0) {
      $$0.a(this.c);
      $$0.a(this.e);

      for (int $$1 = 0; $$1 < 4; $$1++) {
         $$0.a(this.d[$$1]);
      }
   }

   @Override
   public zq<aiy> a() {
      return agy.ck;
   }

   public void a(aha $$0) {
      $$0.a(this);
   }

   public iw b() {
      return this.c;
   }

   public boolean e() {
      return this.e;
   }

   public String[] f() {
      return this.d;
   }
}
