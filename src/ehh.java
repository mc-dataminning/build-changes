import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.slf4j.Logger;

public class ehh extends ehd {
   public static final MapCodec<ehh> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               dyz.a.fieldOf("min_inclusive").forGetter($$0x -> $$0x.d),
               dyz.a.fieldOf("max_inclusive").forGetter($$0x -> $$0x.e),
               Codec.intRange(1, Integer.MAX_VALUE).optionalFieldOf("inner", 1).forGetter($$0x -> $$0x.f)
            )
            .apply($$0, ehh::new)
   );
   private static final Logger b = LogUtils.getLogger();
   private final dyz d;
   private final dyz e;
   private final int f;

   private ehh(dyz $$0, dyz $$1, int $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   public static ehh a(dyz $$0, dyz $$1, int $$2) {
      return new ehh($$0, $$1, $$2);
   }

   @Override
   public int a(ayo $$0, dzc $$1) {
      int $$2 = this.d.a($$1);
      int $$3 = this.e.a($$1);
      if ($$3 - $$2 - this.f + 1 <= 0) {
         b.warn("Empty height range: {}", this);
         return $$2;
      } else {
         int $$4 = ayg.a($$0, $$2 + this.f, $$3);
         int $$5 = ayg.a($$0, $$2, $$4 - 1);
         return ayg.a($$0, $$2, $$5 - 1 + this.f);
      }
   }

   @Override
   public ehe<?> a() {
      return ehe.d;
   }

   @Override
   public String toString() {
      return "biased[" + this.d + "-" + this.e + " inner: " + this.f + "]";
   }
}
