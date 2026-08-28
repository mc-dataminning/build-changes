public class afz implements zw<aci> {
   public static final zn<wm, afz> a = zw.a(afz::a, afz::new);
   private final long b;
   private final long c;

   public afz(long $$0, long $$1, boolean $$2) {
      this.b = $$0;
      long $$3 = $$1;
      if (!$$2) {
         $$3 = -$$1;
         if ($$3 == 0L) {
            $$3 = -1L;
         }
      }

      this.c = $$3;
   }

   private afz(wm $$0) {
      this.b = $$0.readLong();
      this.c = $$0.readLong();
   }

   private void a(wm $$0) {
      $$0.b(this.b);
      $$0.b(this.c);
   }

   @Override
   public zy<afz> a() {
      return agu.aO;
   }

   public void a(aci $$0) {
      $$0.a(this);
   }

   public long b() {
      return this.b;
   }

   public long e() {
      return this.c;
   }
}
