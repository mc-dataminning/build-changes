public class agb implements zs<ach> {
   public static final zj<wi, agb> a = zs.a(agb::a, agb::new);
   private final long b;
   private final long c;

   public agb(long $$0, long $$1, boolean $$2) {
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

   private agb(wi $$0) {
      this.b = $$0.readLong();
      this.c = $$0.readLong();
   }

   private void a(wi $$0) {
      $$0.b(this.b);
      $$0.b(this.c);
   }

   @Override
   public zu<agb> a() {
      return agw.aP;
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
