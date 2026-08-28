public class afy implements zp<ace> {
   public static final zg<wf, afy> a = zp.a(afy::a, afy::new);
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

   private afy(wf $$0) {
      this.b = $$0.readLong();
      this.c = $$0.readLong();
   }

   private void a(wf $$0) {
      $$0.b(this.b);
      $$0.b(this.c);
   }

   @Override
   public zr<afy> a() {
      return agt.aP;
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
