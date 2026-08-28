public class ait implements zs<agy> {
   public static final zj<wi, ait> a = zs.a(ait::a, ait::new);
   private static final int b = 384;
   private final jh c;
   private final String[] d;
   private final boolean e;

   public ait(jh $$0, boolean $$1, String $$2, String $$3, String $$4, String $$5) {
      this.c = $$0;
      this.e = $$1;
      this.d = new String[]{$$2, $$3, $$4, $$5};
   }

   private ait(wi $$0) {
      this.c = $$0.e();
      this.e = $$0.readBoolean();
      this.d = new String[4];

      for (int $$1 = 0; $$1 < 4; $$1++) {
         this.d[$$1] = $$0.d(384);
      }
   }

   private void a(wi $$0) {
      $$0.a(this.c);
      $$0.a(this.e);

      for (int $$1 = 0; $$1 < 4; $$1++) {
         $$0.a(this.d[$$1]);
      }
   }

   @Override
   public zu<ait> a() {
      return agw.cc;
   }

   public void a(agy $$0) {
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
