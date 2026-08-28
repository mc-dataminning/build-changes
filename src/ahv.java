public class ahv implements zl<agr> {
   public static final zc<wb, ahv> a = zl.a(ahv::a, ahv::new);
   private static final int b = 2;
   private final boolean c;

   public ahv(cnu $$0) {
      this.c = $$0.b;
   }

   private ahv(wb $$0) {
      byte $$1 = $$0.readByte();
      this.c = ($$1 & 2) != 0;
   }

   private void a(wb $$0) {
      byte $$1 = 0;
      if (this.c) {
         $$1 = (byte)($$1 | 2);
      }

      $$0.l($$1);
   }

   @Override
   public zn<ahv> a() {
      return agp.bM;
   }

   public void a(agr $$0) {
      $$0.a(this);
   }

   public boolean b() {
      return this.c;
   }
}
