public class ail implements zk<agq> {
   public static final zb<wa, ail> a = zk.a(ail::a, ail::new);
   private static final int b = 384;
   private final je c;
   private final String[] d;
   private final boolean e;

   public ail(je $$0, boolean $$1, String $$2, String $$3, String $$4, String $$5) {
      this.c = $$0;
      this.e = $$1;
      this.d = new String[]{$$2, $$3, $$4, $$5};
   }

   private ail(wa $$0) {
      this.c = $$0.e();
      this.e = $$0.readBoolean();
      this.d = new String[4];

      for (int $$1 = 0; $$1 < 4; $$1++) {
         this.d[$$1] = $$0.d(384);
      }
   }

   private void a(wa $$0) {
      $$0.a(this.c);
      $$0.a(this.e);

      for (int $$1 = 0; $$1 < 4; $$1++) {
         $$0.a(this.d[$$1]);
      }
   }

   @Override
   public zm<ail> a() {
      return ago.cc;
   }

   public void a(agq $$0) {
      $$0.a(this);
   }

   public je b() {
      return this.c;
   }

   public boolean e() {
      return this.e;
   }

   public String[] f() {
      return this.d;
   }
}
