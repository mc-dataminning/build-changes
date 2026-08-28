import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.slf4j.Logger;

public class emt extends emr {
   public static final MapCodec<emt> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               eek.a.fieldOf("min_inclusive").forGetter($$0x -> $$0x.d),
               eek.a.fieldOf("max_inclusive").forGetter($$0x -> $$0x.e),
               Codec.INT.optionalFieldOf("plateau", 0).forGetter($$0x -> $$0x.f)
            )
            .apply($$0, emt::new)
   );
   private static final Logger b = LogUtils.getLogger();
   private final eek d;
   private final eek e;
   private final int f;

   private emt(eek $$0, eek $$1, int $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   public static emt a(eek $$0, eek $$1, int $$2) {
      return new emt($$0, $$1, $$2);
   }

   public static emt a(eek $$0, eek $$1) {
      return a($$0, $$1, 0);
   }

   @Override
   public int a(bam $$0, een $$1) {
      int $$2 = this.d.a($$1);
      int $$3 = this.e.a($$1);
      if ($$2 > $$3) {
         b.warn("Empty height range: {}", this);
         return $$2;
      } else {
         int $$4 = $$3 - $$2;
         if (this.f >= $$4) {
            return bae.b($$0, $$2, $$3);
         } else {
            int $$5 = ($$4 - this.f) / 2;
            int $$6 = $$4 - $$5;
            return $$2 + bae.b($$0, 0, $$6) + bae.b($$0, 0, $$5);
         }
      }
   }

   @Override
   public ems<?> a() {
      return ems.e;
   }

   @Override
   public String toString() {
      return this.f == 0 ? "triangle (" + this.d + "-" + this.e + ")" : "trapezoid(" + this.f + ") in [" + this.d + "-" + this.e + "]";
   }
}
