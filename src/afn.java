public class afn implements zl<abw> {
   public static final zc<we, afn> a = zl.a(afn::a, afn::new);
   private final long b;
   private final long c;

   public afn(long $$0, long $$1, boolean $$2) {
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

   private afn(we $$0) {
      this.b = $$0.readLong();
      this.c = $$0.readLong();
   }

   private void a(we $$0) {
      $$0.b(this.b);
      $$0.b(this.c);
   }

   @Override
   public zn<afn> a() {
      return agj.aP;
   }

   public void a(abw $$0) {
      $$0.a(this);
   }

   public long b() {
      return this.b;
   }

   public long e() {
      return this.c;
   }
}
