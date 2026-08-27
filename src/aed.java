public class aed implements wk<acl> {
   private static final int a = 384;
   private final ht b;
   private final String[] c;
   private final boolean d;

   public aed(ht $$0, boolean $$1, String $$2, String $$3, String $$4, String $$5) {
      this.b = $$0;
      this.d = $$1;
      this.c = new String[]{$$2, $$3, $$4, $$5};
   }

   public aed(tu $$0) {
      this.b = $$0.e();
      this.d = $$0.readBoolean();
      this.c = new String[4];

      for (int $$1 = 0; $$1 < 4; $$1++) {
         this.c[$$1] = $$0.d(384);
      }
   }

   @Override
   public void a(tu $$0) {
      $$0.a(this.b);
      $$0.a(this.d);

      for (int $$1 = 0; $$1 < 4; $$1++) {
         $$0.a(this.c[$$1]);
      }
   }

   public void a(acl $$0) {
      $$0.a(this);
   }

   public ht a() {
      return this.b;
   }

   public boolean d() {
      return this.d;
   }

   public String[] e() {
      return this.c;
   }
}
