import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.slf4j.Logger;

public class eds extends edo {
   public static final Codec<eds> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dvl.a.fieldOf("min_inclusive").forGetter($$0x -> $$0x.d),
               dvl.a.fieldOf("max_inclusive").forGetter($$0x -> $$0x.e),
               Codec.intRange(1, Integer.MAX_VALUE).optionalFieldOf("inner", 1).forGetter($$0x -> $$0x.f)
            )
            .apply($$0, eds::new)
   );
   private static final Logger b = LogUtils.getLogger();
   private final dvl d;
   private final dvl e;
   private final int f;

   private eds(dvl $$0, dvl $$1, int $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   public static eds a(dvl $$0, dvl $$1, int $$2) {
      return new eds($$0, $$1, $$2);
   }

   @Override
   public int a(axr $$0, dvo $$1) {
      int $$2 = this.d.a($$1);
      int $$3 = this.e.a($$1);
      if ($$3 - $$2 - this.f + 1 <= 0) {
         b.warn("Empty height range: {}", this);
         return $$2;
      } else {
         int $$4 = axk.a($$0, $$2 + this.f, $$3);
         int $$5 = axk.a($$0, $$2, $$4 - 1);
         return axk.a($$0, $$2, $$5 - 1 + this.f);
      }
   }

   @Override
   public edp<?> a() {
      return edp.d;
   }

   @Override
   public String toString() {
      return "biased[" + this.d + "-" + this.e + " inner: " + this.f + "]";
   }
}
