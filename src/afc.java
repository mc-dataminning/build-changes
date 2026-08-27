public class afc implements zb<abm> {
   public static final ys<vu, afc> a = zb.a(afc::a, afc::new);
   private final long b;
   private final long c;

   public afc(long $$0, long $$1, boolean $$2) {
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

   private afc(vu $$0) {
      this.b = $$0.readLong();
      this.c = $$0.readLong();
   }

   private void a(vu $$0) {
      $$0.b(this.b);
      $$0.b(this.c);
   }

   @Override
   public zd<afc> a() {
      return afx.aO;
   }

   public void a(abm $$0) {
      $$0.a(this);
   }

   public long b() {
      return this.b;
   }

   public long e() {
      return this.c;
   }
}
