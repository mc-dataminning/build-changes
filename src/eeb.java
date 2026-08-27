import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.slf4j.Logger;

public class eeb extends edx {
   public static final Codec<eeb> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dvu.a.fieldOf("min_inclusive").forGetter($$0x -> $$0x.d),
               dvu.a.fieldOf("max_inclusive").forGetter($$0x -> $$0x.e),
               Codec.intRange(1, Integer.MAX_VALUE).optionalFieldOf("inner", 1).forGetter($$0x -> $$0x.f)
            )
            .apply($$0, eeb::new)
   );
   private static final Logger b = LogUtils.getLogger();
   private final dvu d;
   private final dvu e;
   private final int f;

   private eeb(dvu $$0, dvu $$1, int $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   public static eeb a(dvu $$0, dvu $$1, int $$2) {
      return new eeb($$0, $$1, $$2);
   }

   @Override
   public int a(axt $$0, dvx $$1) {
      int $$2 = this.d.a($$1);
      int $$3 = this.e.a($$1);
      if ($$3 - $$2 - this.f + 1 <= 0) {
         b.warn("Empty height range: {}", this);
         return $$2;
      } else {
         int $$4 = axm.a($$0, $$2 + this.f, $$3);
         int $$5 = axm.a($$0, $$2, $$4 - 1);
         return axm.a($$0, $$2, $$5 - 1 + this.f);
      }
   }

   @Override
   public edy<?> a() {
      return edy.d;
   }

   @Override
   public String toString() {
      return "biased[" + this.d + "-" + this.e + " inner: " + this.f + "]";
   }
}
