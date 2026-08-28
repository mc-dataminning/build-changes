public class afu implements zl<aca> {
   public static final zc<wb, afu> a = zl.a(afu::a, afu::new);
   private final long b;
   private final long c;

   public afu(long $$0, long $$1, boolean $$2) {
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

   private afu(wb $$0) {
      this.b = $$0.readLong();
      this.c = $$0.readLong();
   }

   private void a(wb $$0) {
      $$0.b(this.b);
      $$0.b(this.c);
   }

   @Override
   public zn<afu> a() {
      return agp.aP;
   }

   public void a(aca $$0) {
      $$0.a(this);
   }

   public long b() {
      return this.b;
   }

   public long e() {
      return this.c;
   }
}
