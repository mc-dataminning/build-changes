public class ahn implements zl<agl> {
   public static final zc<we, ahn> a = zl.a(ahn::a, ahn::new);
   private static final int b = 2;
   private final boolean c;

   public ahn(clv $$0) {
      this.c = $$0.b;
   }

   private ahn(we $$0) {
      byte $$1 = $$0.readByte();
      this.c = ($$1 & 2) != 0;
   }

   private void a(we $$0) {
      byte $$1 = 0;
      if (this.c) {
         $$1 = (byte)($$1 | 2);
      }

      $$0.k($$1);
   }

   @Override
   public zn<ahn> a() {
      return agj.bJ;
   }

   public void a(agl $$0) {
      $$0.a(this);
   }

   public boolean b() {
      return this.c;
   }
}
