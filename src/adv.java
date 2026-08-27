public class adv implements xx<aag> {
   public static final xo<uq, adv> a = xx.a(adv::a, adv::new);
   private final long b;
   private final long c;

   public adv(long $$0, long $$1, boolean $$2) {
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

   private adv(uq $$0) {
      this.b = $$0.readLong();
      this.c = $$0.readLong();
   }

   private void a(uq $$0) {
      $$0.b(this.b);
      $$0.b(this.c);
   }

   @Override
   public xz<adv> a() {
      return aeq.aN;
   }

   public void a(aag $$0) {
      $$0.a(this);
   }

   public long b() {
      return this.b;
   }

   public long e() {
      return this.c;
   }
}
