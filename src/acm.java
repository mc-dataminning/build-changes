public class acm implements uw<aav> {
   private static final int a = 384;
   private final gv b;
   private final String[] c;
   private final boolean d;

   public acm(gv $$0, boolean $$1, String $$2, String $$3, String $$4, String $$5) {
      this.b = $$0;
      this.d = $$1;
      this.c = new String[]{$$2, $$3, $$4, $$5};
   }

   public acm(sh $$0) {
      this.b = $$0.e();
      this.d = $$0.readBoolean();
      this.c = new String[4];

      for (int $$1 = 0; $$1 < 4; $$1++) {
         this.c[$$1] = $$0.d(384);
      }
   }

   @Override
   public void a(sh $$0) {
      $$0.a(this.b);
      $$0.a(this.d);

      for (int $$1 = 0; $$1 < 4; $$1++) {
         $$0.a(this.c[$$1]);
      }
   }

   public void a(aav $$0) {
      $$0.a(this);
   }

   public gv a() {
      return this.b;
   }

   public boolean d() {
      return this.d;
   }

   public String[] e() {
      return this.c;
   }
}
