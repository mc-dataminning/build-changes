public class afe implements zb<abn> {
   public static final ys<vr, afe> a = zb.a(afe::a, afe::new);
   private final long b;
   private final long c;

   public afe(long $$0, long $$1, boolean $$2) {
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

   private afe(vr $$0) {
      this.b = $$0.readLong();
      this.c = $$0.readLong();
   }

   private void a(vr $$0) {
      $$0.b(this.b);
      $$0.b(this.c);
   }

   @Override
   public zd<afe> a() {
      return afz.aO;
   }

   public void a(abn $$0) {
      $$0.a(this);
   }

   public long b() {
      return this.b;
   }

   public long e() {
      return this.c;
   }
}
