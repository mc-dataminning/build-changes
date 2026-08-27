public class afh implements ze<abq> {
   public static final yv<vx, afh> a = ze.a(afh::a, afh::new);
   private final long b;
   private final long c;

   public afh(long $$0, long $$1, boolean $$2) {
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

   private afh(vx $$0) {
      this.b = $$0.readLong();
      this.c = $$0.readLong();
   }

   private void a(vx $$0) {
      $$0.b(this.b);
      $$0.b(this.c);
   }

   @Override
   public zg<afh> a() {
      return agc.aO;
   }

   public void a(abq $$0) {
      $$0.a(this);
   }

   public long b() {
      return this.b;
   }

   public long e() {
      return this.c;
   }
}
