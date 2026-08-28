public class aft implements zk<abz> {
   public static final zb<wa, aft> a = zk.a(aft::a, aft::new);
   private final long b;
   private final long c;

   public aft(long $$0, long $$1, boolean $$2) {
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

   private aft(wa $$0) {
      this.b = $$0.readLong();
      this.c = $$0.readLong();
   }

   private void a(wa $$0) {
      $$0.b(this.b);
      $$0.b(this.c);
   }

   @Override
   public zm<aft> a() {
      return ago.aP;
   }

   public void a(abz $$0) {
      $$0.a(this);
   }

   public long b() {
      return this.b;
   }

   public long e() {
      return this.c;
   }
}
