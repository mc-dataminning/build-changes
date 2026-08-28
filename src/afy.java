public class afy implements zv<ach> {
   public static final zm<wl, afy> a = zv.a(afy::a, afy::new);
   private final long b;
   private final long c;

   public afy(long $$0, long $$1, boolean $$2) {
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

   private afy(wl $$0) {
      this.b = $$0.readLong();
      this.c = $$0.readLong();
   }

   private void a(wl $$0) {
      $$0.b(this.b);
      $$0.b(this.c);
   }

   @Override
   public zx<afy> a() {
      return agt.aO;
   }

   public void a(ach $$0) {
      $$0.a(this);
   }

   public long b() {
      return this.b;
   }

   public long e() {
      return this.c;
   }
}
