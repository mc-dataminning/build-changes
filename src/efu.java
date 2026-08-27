import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.slf4j.Logger;

public class efu extends efq {
   public static final MapCodec<efu> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               dxn.a.fieldOf("min_inclusive").forGetter($$0x -> $$0x.d),
               dxn.a.fieldOf("max_inclusive").forGetter($$0x -> $$0x.e),
               Codec.intRange(1, Integer.MAX_VALUE).optionalFieldOf("inner", 1).forGetter($$0x -> $$0x.f)
            )
            .apply($$0, efu::new)
   );
   private static final Logger b = LogUtils.getLogger();
   private final dxn d;
   private final dxn e;
   private final int f;

   private efu(dxn $$0, dxn $$1, int $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   public static efu a(dxn $$0, dxn $$1, int $$2) {
      return new efu($$0, $$1, $$2);
   }

   @Override
   public int a(ayk $$0, dxq $$1) {
      int $$2 = this.d.a($$1);
      int $$3 = this.e.a($$1);
      if ($$3 - $$2 - this.f + 1 <= 0) {
         b.warn("Empty height range: {}", this);
         return $$2;
      } else {
         int $$4 = ayd.a($$0, $$2 + this.f, $$3);
         int $$5 = ayd.a($$0, $$2, $$4 - 1);
         return ayd.a($$0, $$2, $$5 - 1 + this.f);
      }
   }

   @Override
   public efr<?> a() {
      return efr.d;
   }

   @Override
   public String toString() {
      return "biased[" + this.d + "-" + this.e + " inner: " + this.f + "]";
   }
}
