import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Charsets;
import com.google.common.hash.HashFunction;
import com.google.common.hash.Hashing;
import com.google.common.primitives.Longs;
import java.util.concurrent.atomic.AtomicLong;

public final class dyj {
   public static final long a = -7046029254386353131L;
   public static final long b = 7640891576956012809L;
   private static final HashFunction c = Hashing.md5();
   private static final AtomicLong d = new AtomicLong(8682522807148012L);

   @VisibleForTesting
   public static long a(long $$0) {
      $$0 = ($$0 ^ $$0 >>> 30) * -4658895280553007687L;
      $$0 = ($$0 ^ $$0 >>> 27) * -7723592293110705685L;
      return $$0 ^ $$0 >>> 31;
   }

   public static dyj.a b(long $$0) {
      long $$1 = $$0 ^ 7640891576956012809L;
      long $$2 = $$1 + -7046029254386353131L;
      return new dyj.a($$1, $$2);
   }

   public static dyj.a c(long $$0) {
      return b($$0).a();
   }

   public static dyj.a a(String $$0) {
      byte[] $$1 = c.hashString($$0, Charsets.UTF_8).asBytes();
      long $$2 = Longs.fromBytes($$1[0], $$1[1], $$1[2], $$1[3], $$1[4], $$1[5], $$1[6], $$1[7]);
      long $$3 = Longs.fromBytes($$1[8], $$1[9], $$1[10], $$1[11], $$1[12], $$1[13], $$1[14], $$1[15]);
      return new dyj.a($$2, $$3);
   }

   public static long a() {
      return d.updateAndGet($$0 -> $$0 * 1181783497276652981L) ^ System.nanoTime();
   }

   public static record a(long a, long b) {
      public dyj.a a(long $$0, long $$1) {
         return new dyj.a(this.a ^ $$0, this.b ^ $$1);
      }

      public dyj.a a(dyj.a $$0) {
         return this.a($$0.a, $$0.b);
      }

      public dyj.a a() {
         return new dyj.a(dyj.a(this.a), dyj.a(this.b));
      }

      public long b() {
         return this.a;
      }

      public long c() {
         return this.b;
      }
   }
}
