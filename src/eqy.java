import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.slf4j.Logger;

public class eqy extends equ {
   public static final MapCodec<eqy> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               eij.a.fieldOf("min_inclusive").forGetter($$0x -> $$0x.d),
               eij.a.fieldOf("max_inclusive").forGetter($$0x -> $$0x.e),
               Codec.intRange(1, Integer.MAX_VALUE).optionalFieldOf("inner", 1).forGetter($$0x -> $$0x.f)
            )
            .apply($$0, eqy::new)
   );
   private static final Logger b = LogUtils.getLogger();
   private final eij d;
   private final eij e;
   private final int f;

   private eqy(eij $$0, eij $$1, int $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   public static eqy a(eij $$0, eij $$1, int $$2) {
      return new eqy($$0, $$1, $$2);
   }

   @Override
   public int a(bai $$0, eim $$1) {
      int $$2 = this.d.a($$1);
      int $$3 = this.e.a($$1);
      if ($$3 - $$2 - this.f + 1 <= 0) {
         b.warn("Empty height range: {}", this);
         return $$2;
      } else {
         int $$4 = azz.a($$0, $$2 + this.f, $$3);
         int $$5 = azz.a($$0, $$2, $$4 - 1);
         return azz.a($$0, $$2, $$5 - 1 + this.f);
      }
   }

   @Override
   public eqv<?> a() {
      return eqv.d;
   }

   @Override
   public String toString() {
      return "biased[" + this.d + "-" + this.e + " inner: " + this.f + "]";
   }
}
