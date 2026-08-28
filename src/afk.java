public class afk implements zf<abt> {
   public static final yw<vv, afk> a = zf.a(afk::a, afk::new);
   private final long b;
   private final long c;

   public afk(long $$0, long $$1, boolean $$2) {
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

   private afk(vv $$0) {
      this.b = $$0.readLong();
      this.c = $$0.readLong();
   }

   private void a(vv $$0) {
      $$0.b(this.b);
      $$0.b(this.c);
   }

   @Override
   public zh<afk> a() {
      return agf.aO;
   }

   public void a(abt $$0) {
      $$0.a(this);
   }

   public long b() {
      return this.b;
   }

   public long e() {
      return this.c;
   }
}
