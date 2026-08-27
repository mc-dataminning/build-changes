public class agf implements xf<uc> {
   private final long a;

   public agf(long $$0) {
      this.a = $$0;
   }

   public agf(ui $$0) {
      this.a = $$0.readLong();
   }

   @Override
   public void a(ui $$0) {
      $$0.b(this.a);
   }

   public void a(uc $$0) {
      $$0.a(this);
   }

   public long a() {
      return this.a;
   }
}
