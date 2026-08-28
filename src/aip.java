public class aip implements zo<agu> {
   public static final zf<we, aip> a = zo.a(aip::a, aip::new);
   private static final int b = 384;
   private final jg c;
   private final String[] d;
   private final boolean e;

   public aip(jg $$0, boolean $$1, String $$2, String $$3, String $$4, String $$5) {
      this.c = $$0;
      this.e = $$1;
      this.d = new String[]{$$2, $$3, $$4, $$5};
   }

   private aip(we $$0) {
      this.c = $$0.e();
      this.e = $$0.readBoolean();
      this.d = new String[4];

      for (int $$1 = 0; $$1 < 4; $$1++) {
         this.d[$$1] = $$0.d(384);
      }
   }

   private void a(we $$0) {
      $$0.a(this.c);
      $$0.a(this.e);

      for (int $$1 = 0; $$1 < 4; $$1++) {
         $$0.a(this.d[$$1]);
      }
   }

   @Override
   public zq<aip> a() {
      return ags.cc;
   }

   public void a(agu $$0) {
      $$0.a(this);
   }

   public jg b() {
      return this.c;
   }

   public boolean e() {
      return this.e;
   }

   public String[] f() {
      return this.d;
   }
}
