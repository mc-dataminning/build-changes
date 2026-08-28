import com.mojang.serialization.Codec;
import java.util.stream.LongStream;

public class ehs {
   private long b;
   private long c;
   public static final Codec<ehs> a = Codec.LONG_STREAM
      .comapFlatMap($$0 -> ag.a($$0, 2).map($$0x -> new ehs($$0x[0], $$0x[1])), $$0 -> LongStream.of($$0.b, $$0.c));

   public ehs(ehh.a $$0) {
      this($$0.b(), $$0.c());
   }

   public ehs(long $$0, long $$1) {
      this.b = $$0;
      this.c = $$1;
      if ((this.b | this.c) == 0L) {
         this.b = -7046029254386353131L;
         this.c = 7640891576956012809L;
      }
   }

   public long a() {
      long $$0 = this.b;
      long $$1 = this.c;
      long $$2 = Long.rotateLeft($$0 + $$1, 17) + $$0;
      $$1 ^= $$0;
      this.b = Long.rotateLeft($$0, 49) ^ $$1 ^ $$1 << 21;
      this.c = Long.rotateLeft($$1, 28);
      return $$2;
   }
}
