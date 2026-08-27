public class aco implements xf<za> {
   private final long a;
   private final long b;

   public aco(long $$0, long $$1, boolean $$2) {
      this.a = $$0;
      long $$3 = $$1;
      if (!$$2) {
         $$3 = -$$1;
         if ($$3 == 0L) {
            $$3 = -1L;
         }
      }

      this.b = $$3;
   }

   public aco(ui $$0) {
      this.a = $$0.readLong();
      this.b = $$0.readLong();
   }

   @Override
   public void a(ui $$0) {
      $$0.b(this.a);
      $$0.b(this.b);
   }

   public void a(za $$0) {
      $$0.a(this);
   }

   public long a() {
      return this.a;
   }

   public long d() {
      return this.b;
   }
}
