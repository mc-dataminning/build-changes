public class afa implements yz<abk> {
   public static final yq<vs, afa> a = yz.a(afa::a, afa::new);
   private final long b;
   private final long c;

   public afa(long $$0, long $$1, boolean $$2) {
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

   private afa(vs $$0) {
      this.b = $$0.readLong();
      this.c = $$0.readLong();
   }

   private void a(vs $$0) {
      $$0.b(this.b);
      $$0.b(this.c);
   }

   @Override
   public zb<afa> a() {
      return afv.aO;
   }

   public void a(abk $$0) {
      $$0.a(this);
   }

   public long b() {
      return this.b;
   }

   public long e() {
      return this.c;
   }
}
