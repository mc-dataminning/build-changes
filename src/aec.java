public class aec implements yb<aam> {
   public static final xs<uu, aec> a = yb.a(aec::a, aec::new);
   private final long b;
   private final long c;

   public aec(long $$0, long $$1, boolean $$2) {
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

   private aec(uu $$0) {
      this.b = $$0.readLong();
      this.c = $$0.readLong();
   }

   private void a(uu $$0) {
      $$0.b(this.b);
      $$0.b(this.c);
   }

   @Override
   public yd<aec> a() {
      return aex.aO;
   }

   public void a(aam $$0) {
      $$0.a(this);
   }

   public long b() {
      return this.b;
   }

   public long e() {
      return this.c;
   }
}
