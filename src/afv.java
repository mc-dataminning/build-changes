public class afv implements zs<ace> {
   public static final zj<wl, afv> a = zs.a(afv::a, afv::new);
   private final long b;
   private final long c;

   public afv(long $$0, long $$1, boolean $$2) {
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

   private afv(wl $$0) {
      this.b = $$0.readLong();
      this.c = $$0.readLong();
   }

   private void a(wl $$0) {
      $$0.b(this.b);
      $$0.b(this.c);
   }

   @Override
   public zu<afv> a() {
      return agq.aO;
   }

   public void a(ace $$0) {
      $$0.a(this);
   }

   public long b() {
      return this.b;
   }

   public long e() {
      return this.c;
   }
}
