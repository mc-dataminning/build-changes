import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Codec;

public class drw implements awp {
   private static final float c = 5.9604645E-8F;
   private static final double d = 1.110223E-16F;
   public static final Codec<drw> b = drv.a.xmap($$0 -> new drw($$0), $$0 -> $$0.e);
   private drv e;
   private final dqx f = new dqx(this);

   public drw(long $$0) {
      this.e = new drv(drk.c($$0));
   }

   public drw(drk.a $$0) {
      this.e = new drv($$0);
   }

   public drw(long $$0, long $$1) {
      this.e = new drv($$0, $$1);
   }

   private drw(drv $$0) {
      this.e = $$0;
   }

   @Override
   public awp d() {
      return new drw(this.e.a(), this.e.a());
   }

   @Override
   public dri e() {
      return new drw.a(this.e.a(), this.e.a());
   }

   @Override
   public void b(long $$0) {
      this.e = new drv(drk.c($$0));
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

   public static class a implements dri {
      private final long a;
      private final long b;

      public a(long $$0, long $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public awp a(int $$0, int $$1, int $$2) {
         long $$3 = awi.b($$0, $$1, $$2);
         long $$4 = $$3 ^ this.a;
         return new drw($$4, this.b);
      }

      @Override
      public awp a(String $$0) {
         drk.a $$1 = drk.a($$0);
         return new drw($$1.a(this.a, this.b));
      }

      @VisibleForTesting
      @Override
      public void a(StringBuilder $$0) {
         $$0.append("seedLo: ").append(this.a).append(", seedHi: ").append(this.b);
      }
   }
}
