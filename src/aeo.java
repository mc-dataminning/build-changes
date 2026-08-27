public class aeo implements yn<aay> {
   public static final ye<vg, aeo> a = yn.a(aeo::a, aeo::new);
   private final long b;
   private final long c;

   public aeo(long $$0, long $$1, boolean $$2) {
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

   private aeo(vg $$0) {
      this.b = $$0.readLong();
      this.c = $$0.readLong();
   }

   private void a(vg $$0) {
      $$0.b(this.b);
      $$0.b(this.c);
   }

   @Override
   public yp<aeo> a() {
      return afj.aO;
   }

   public void a(aay $$0) {
      $$0.a(this);
   }

   public long b() {
      return this.b;
   }

   public long e() {
      return this.c;
   }
}
