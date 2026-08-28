import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.slf4j.Logger;

public class ely extends elu {
   public static final MapCodec<ely> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               edn.a.fieldOf("min_inclusive").forGetter($$0x -> $$0x.d),
               edn.a.fieldOf("max_inclusive").forGetter($$0x -> $$0x.e),
               Codec.intRange(1, Integer.MAX_VALUE).optionalFieldOf("inner", 1).forGetter($$0x -> $$0x.f)
            )
            .apply($$0, ely::new)
   );
   private static final Logger b = LogUtils.getLogger();
   private final edn d;
   private final edn e;
   private final int f;

   private ely(edn $$0, edn $$1, int $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   public static ely a(edn $$0, edn $$1, int $$2) {
      return new ely($$0, $$1, $$2);
   }

   @Override
   public int a(azh $$0, edq $$1) {
      int $$2 = this.d.a($$1);
      int $$3 = this.e.a($$1);
      if ($$3 - $$2 - this.f + 1 <= 0) {
         b.warn("Empty height range: {}", this);
         return $$2;
      } else {
         int $$4 = ayz.a($$0, $$2 + this.f, $$3);
         int $$5 = ayz.a($$0, $$2, $$4 - 1);
         return ayz.a($$0, $$2, $$5 - 1 + this.f);
      }
   }

   @Override
   public elv<?> a() {
      return elv.d;
   }

   @Override
   public String toString() {
      return "biased[" + this.d + "-" + this.e + " inner: " + this.f + "]";
   }
}
