public class abr implements uo<abq> {
   private final long a;

   public abr(long $$0) {
      this.a = $$0;
   }

   public abr(sf $$0) {
      this.a = $$0.readLong();
   }

   @Override
   public void a(sf $$0) {
      $$0.writeLong(this.a);
   }

   public void a(abq $$0) {
      $$0.a(this);
   }

   public long a() {
      return this.a;
   }
}
