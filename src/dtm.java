import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.slf4j.Logger;

public class dtm extends dtk {
   public static final Codec<dtm> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dlh.a.fieldOf("min_inclusive").forGetter($$0x -> $$0x.d),
               dlh.a.fieldOf("max_inclusive").forGetter($$0x -> $$0x.e),
               Codec.INT.optionalFieldOf("plateau", 0).forGetter($$0x -> $$0x.f)
            )
            .apply($$0, dtm::new)
   );
   private static final Logger b = LogUtils.getLogger();
   private final dlh d;
   private final dlh e;
   private final int f;

   private dtm(dlh $$0, dlh $$1, int $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   public static dtm a(dlh $$0, dlh $$1, int $$2) {
      return new dtm($$0, $$1, $$2);
   }

   public static dtm a(dlh $$0, dlh $$1) {
      return a($$0, $$1, 0);
   }

   @Override
   public int a(arx $$0, dlk $$1) {
      int $$2 = this.d.a($$1);
      int $$3 = this.e.a($$1);
      if ($$2 > $$3) {
         b.warn("Empty height range: {}", this);
         return $$2;
      } else {
         int $$4 = $$3 - $$2;
         if (this.f >= $$4) {
            return ars.b($$0, $$2, $$3);
         } else {
            int $$5 = ($$4 - this.f) / 2;
            int $$6 = $$4 - $$5;
            return $$2 + ars.b($$0, 0, $$6) + ars.b($$0, 0, $$5);
         }
      }
   }

   @Override
   public dtl<?> a() {
      return dtl.e;
   }

   @Override
   public String toString() {
      return this.f == 0 ? "triangle (" + this.d + "-" + this.e + ")" : "trapezoid(" + this.f + ") in [" + this.d + "-" + this.e + "]";
   }
}
