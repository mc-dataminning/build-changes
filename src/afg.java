public class afg implements ze<abq> {
   public static final yv<vx, afg> a = ze.a(afg::a, afg::new);
   private final long b;
   private final long c;

   public afg(long $$0, long $$1, boolean $$2) {
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

   private afg(vx $$0) {
      this.b = $$0.readLong();
      this.c = $$0.readLong();
   }

   private void a(vx $$0) {
      $$0.b(this.b);
      $$0.b(this.c);
   }

   @Override
   public zg<afg> a() {
      return agb.aO;
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
