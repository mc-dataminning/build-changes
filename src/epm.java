import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.slf4j.Logger;

public class epm extends epi {
   public static final MapCodec<epm> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               eha.a.fieldOf("min_inclusive").forGetter($$0x -> $$0x.d),
               eha.a.fieldOf("max_inclusive").forGetter($$0x -> $$0x.e),
               Codec.intRange(1, Integer.MAX_VALUE).optionalFieldOf("inner", 1).forGetter($$0x -> $$0x.f)
            )
            .apply($$0, epm::new)
   );
   private static final Logger b = LogUtils.getLogger();
   private final eha d;
   private final eha e;
   private final int f;

   private epm(eha $$0, eha $$1, int $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   public static epm a(eha $$0, eha $$1, int $$2) {
      return new epm($$0, $$1, $$2);
   }

   @Override
   public int a(azv $$0, ehd $$1) {
      int $$2 = this.d.a($$1);
      int $$3 = this.e.a($$1);
      if ($$3 - $$2 - this.f + 1 <= 0) {
         b.warn("Empty height range: {}", this);
         return $$2;
      } else {
         int $$4 = azm.a($$0, $$2 + this.f, $$3);
         int $$5 = azm.a($$0, $$2, $$4 - 1);
         return azm.a($$0, $$2, $$5 - 1 + this.f);
      }
   }

   @Override
   public epj<?> a() {
      return epj.d;
   }

   @Override
   public String toString() {
      return "biased[" + this.d + "-" + this.e + " inner: " + this.f + "]";
   }
}
