public class dyl implements dxk {
   private static final int d = 48;
   private static final long e = 281474976710655L;
   private static final long f = 25214903917L;
   private static final long g = 11L;
   private long h;
   private final dxx i = new dxx(this);

   public dyl(long $$0) {
      this.b($$0);
   }

   @Override
   public azh d() {
      return new dyl(this.g());
   }

   @Override
   public dyi e() {
      return new dxw.a(this.g());
   }

   @Override
   public void b(long $$0) {
      this.h = ($$0 ^ 25214903917L) & 281474976710655L;
      this.i.a();
   }

   @Override
   public int c(int $$0) {
      long $$1 = this.h * 25214903917L + 11L & 281474976710655L;
      this.h = $$1;
      return (int)($$1 >> 48 - $$0);
   }

   @Override
   public double k() {
      return this.i.b();
   }
}
