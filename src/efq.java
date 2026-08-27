import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.slf4j.Logger;

public class efq extends efs {
   public static final MapCodec<efq> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               dxp.a.fieldOf("min_inclusive").forGetter($$0x -> $$0x.d),
               dxp.a.fieldOf("max_inclusive").forGetter($$0x -> $$0x.e),
               Codec.intRange(1, Integer.MAX_VALUE).optionalFieldOf("inner", 1).forGetter($$0x -> $$0x.f)
            )
            .apply($$0, efq::new)
   );
   private static final Logger b = LogUtils.getLogger();
   private final dxp d;
   private final dxp e;
   private final int f;

   private efq(dxp $$0, dxp $$1, int $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   public static efq a(dxp $$0, dxp $$1, int $$2) {
      return new efq($$0, $$1, $$2);
   }

   @Override
   public int a(aym $$0, dxs $$1) {
      int $$2 = this.d.a($$1);
      int $$3 = this.e.a($$1);
      if ($$3 - $$2 - this.f + 1 <= 0) {
         b.warn("Empty height range: {}", this);
         return $$2;
      } else {
         int $$4 = $$0.a($$3 - $$2 - this.f + 1);
         return $$0.a($$4 + this.f) + $$2;
      }
   }

   @Override
   public eft<?> a() {
      return eft.c;
   }

   @Override
   public String toString() {
      return "biased[" + this.d + "-" + this.e + " inner: " + this.f + "]";
   }
}
