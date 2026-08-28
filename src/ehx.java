import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.slf4j.Logger;

public class ehx extends eht {
   public static final MapCodec<ehx> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               dzp.a.fieldOf("min_inclusive").forGetter($$0x -> $$0x.d),
               dzp.a.fieldOf("max_inclusive").forGetter($$0x -> $$0x.e),
               Codec.intRange(1, Integer.MAX_VALUE).optionalFieldOf("inner", 1).forGetter($$0x -> $$0x.f)
            )
            .apply($$0, ehx::new)
   );
   private static final Logger b = LogUtils.getLogger();
   private final dzp d;
   private final dzp e;
   private final int f;

   private ehx(dzp $$0, dzp $$1, int $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   public static ehx a(dzp $$0, dzp $$1, int $$2) {
      return new ehx($$0, $$1, $$2);
   }

   @Override
   public int a(ayv $$0, dzs $$1) {
      int $$2 = this.d.a($$1);
      int $$3 = this.e.a($$1);
      if ($$3 - $$2 - this.f + 1 <= 0) {
         b.warn("Empty height range: {}", this);
         return $$2;
      } else {
         int $$4 = ayn.a($$0, $$2 + this.f, $$3);
         int $$5 = ayn.a($$0, $$2, $$4 - 1);
         return ayn.a($$0, $$2, $$5 - 1 + this.f);
      }
   }

   @Override
   public ehu<?> a() {
      return ehu.d;
   }

   @Override
   public String toString() {
      return "biased[" + this.d + "-" + this.e + " inner: " + this.f + "]";
   }
}
