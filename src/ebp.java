import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Codec;

public class ebp implements azn {
   private static final float c = 5.9604645E-8F;
   private static final double d = 1.110223E-16F;
   public static final Codec<ebp> b = ebo.a.xmap($$0 -> new ebp($$0), $$0 -> $$0.e);
   private ebo e;
   private final eaq f = new eaq(this);

   public ebp(long $$0) {
      this.e = new ebo(ebd.c($$0));
   }

   public ebp(ebd.a $$0) {
      this.e = new ebo($$0);
   }

   public ebp(long $$0, long $$1) {
      this.e = new ebo($$0, $$1);
   }

   private ebp(ebo $$0) {
      this.e = $$0;
   }

   @Override
   public azn d() {
      return new ebp(this.e.a(), this.e.a());
   }

   @Override
   public ebb e() {
      return new ebp.a(this.e.a(), this.e.a());
   }

   @Override
   public void b(long $$0) {
      this.e = new ebo(ebd.c($$0));
      this.f.a();
   }

   @Override
   public int f() {
      return (int)this.e.a();
   }

   @Override
   public int a(int $$0) {
      if ($$0 <= 0) {
         throw new IllegalArgumentException("Bound must be positive");
      } else {
         long $$1 = Integer.toUnsignedLong(this.f());
         long $$2 = $$1 * (long)$$0;
         long $$3 = $$2 & 4294967295L;
         if ($$3 < (long)$$0) {
            for (int $$4 = Integer.remainderUnsigned(~$$0 + 1, $$0); $$3 < (long)$$4; $$3 = $$2 & 4294967295L) {
               $$1 = Integer.toUnsignedLong(this.f());
               $$2 = $$1 * (long)$$0;
            }
         }

         long $$5 = $$2 >> 32;
         return (int)$$5;
      }
   }

   @Override
   public long g() {
      return this.e.a();
   }

   @Override
   public boolean h() {
      return (this.e.a() & 1L) != 0L;
   }

   @Override
   public float i() {
      return (float)this.c(24) * 5.9604645E-8F;
   }

   @Override
   public double j() {
      return (double)this.c(53) * 1.110223E-16F;
   }

   @Override
   public double k() {
      return this.f.b();
   }

   @Override
   public void b(int $$0) {
      for (int $$1 = 0; $$1 < $$0; $$1++) {
         this.e.a();
      }
   }

   private long c(int $$0) {
      return this.e.a() >>> 64 - $$0;
   }

   public static class a implements ebb {
      private final long a;
      private final long b;

      public a(long $$0, long $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public azn a(int $$0, int $$1, int $$2) {
         long $$3 = azf.b($$0, $$1, $$2);
         long $$4 = $$3 ^ this.a;
         return new ebp($$4, this.b);
      }

      @Override
      public azn a(String $$0) {
         ebd.a $$1 = ebd.a($$0);
         return new ebp($$1.a(this.a, this.b));
      }

      @Override
      public azn a(long $$0) {
         return new ebp($$0 ^ this.a, $$0 ^ this.b);
      }

      @VisibleForTesting
      @Override
      public void a(StringBuilder $$0) {
         $$0.append("seedLo: ").append(this.a).append(", seedHi: ").append(this.b);
      }
   }
}
