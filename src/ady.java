public class ady implements xz<aai> {
   public static final xq<us, ady> a = xz.a(ady::a, ady::new);
   private final long b;
   private final long c;

   public ady(long $$0, long $$1, boolean $$2) {
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

   private ady(us $$0) {
      this.b = $$0.readLong();
      this.c = $$0.readLong();
   }

   private void a(us $$0) {
      $$0.b(this.b);
      $$0.b(this.c);
   }

   @Override
   public yb<ady> a() {
      return aet.aO;
   }

   public void a(aai $$0) {
      $$0.a(this);
   }

   public long b() {
      return this.b;
   }

   public long e() {
      return this.c;
   }
}
