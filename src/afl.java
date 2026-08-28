public class afl implements zg<abu> {
   public static final yx<vw, afl> a = zg.a(afl::a, afl::new);
   private final long b;
   private final long c;

   public afl(long $$0, long $$1, boolean $$2) {
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

   private afl(vw $$0) {
      this.b = $$0.readLong();
      this.c = $$0.readLong();
   }

   private void a(vw $$0) {
      $$0.b(this.b);
      $$0.b(this.c);
   }

   @Override
   public zi<afl> a() {
      return agg.aO;
   }

   public void a(abu $$0) {
      $$0.a(this);
   }

   public long b() {
      return this.b;
   }

   public long e() {
      return this.c;
   }
}
