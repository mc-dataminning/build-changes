import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.slf4j.Logger;

public class dzj extends dzl {
   public static final Codec<dzj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dri.a.fieldOf("min_inclusive").forGetter($$0x -> $$0x.d),
               dri.a.fieldOf("max_inclusive").forGetter($$0x -> $$0x.e),
               Codec.intRange(1, Integer.MAX_VALUE).optionalFieldOf("inner", 1).forGetter($$0x -> $$0x.f)
            )
            .apply($$0, dzj::new)
   );
   private static final Logger b = LogUtils.getLogger();
   private final dri d;
   private final dri e;
   private final int f;

   private dzj(dri $$0, dri $$1, int $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   public static dzj a(dri $$0, dri $$1, int $$2) {
      return new dzj($$0, $$1, $$2);
   }

   @Override
   public int a(awo $$0, drl $$1) {
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
   public dzm<?> a() {
      return dzm.c;
   }

   @Override
   public String toString() {
      return "biased[" + this.d + "-" + this.e + " inner: " + this.f + "]";
   }
}
