public class aeq implements yp<aba> {
   public static final yg<vi, aeq> a = yp.a(aeq::a, aeq::new);
   private final long b;
   private final long c;

   public aeq(long $$0, long $$1, boolean $$2) {
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

   private aeq(vi $$0) {
      this.b = $$0.readLong();
      this.c = $$0.readLong();
   }

   private void a(vi $$0) {
      $$0.b(this.b);
      $$0.b(this.c);
   }

   @Override
   public yr<aeq> a() {
      return afl.aO;
   }

   public void a(aba $$0) {
      $$0.a(this);
   }

   public long b() {
      return this.b;
   }

   public long e() {
      return this.c;
   }
}
