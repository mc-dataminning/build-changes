import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.slf4j.Logger;

public class elw extends els {
   public static final MapCodec<elw> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               edl.a.fieldOf("min_inclusive").forGetter($$0x -> $$0x.d),
               edl.a.fieldOf("max_inclusive").forGetter($$0x -> $$0x.e),
               Codec.intRange(1, Integer.MAX_VALUE).optionalFieldOf("inner", 1).forGetter($$0x -> $$0x.f)
            )
            .apply($$0, elw::new)
   );
   private static final Logger b = LogUtils.getLogger();
   private final edl d;
   private final edl e;
   private final int f;

   private elw(edl $$0, edl $$1, int $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   public static elw a(edl $$0, edl $$1, int $$2) {
      return new elw($$0, $$1, $$2);
   }

   @Override
   public int a(azh $$0, edo $$1) {
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
   public elt<?> a() {
      return elt.d;
   }

   @Override
   public String toString() {
      return "biased[" + this.d + "-" + this.e + " inner: " + this.f + "]";
   }
}
