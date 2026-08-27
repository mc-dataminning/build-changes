import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.slf4j.Logger;

public class dve extends dvc {
   public static final Codec<dve> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dmz.a.fieldOf("min_inclusive").forGetter($$0x -> $$0x.d),
               dmz.a.fieldOf("max_inclusive").forGetter($$0x -> $$0x.e),
               Codec.INT.optionalFieldOf("plateau", 0).forGetter($$0x -> $$0x.f)
            )
            .apply($$0, dve::new)
   );
   private static final Logger b = LogUtils.getLogger();
   private final dmz d;
   private final dmz e;
   private final int f;

   private dve(dmz $$0, dmz $$1, int $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   public static dve a(dmz $$0, dmz $$1, int $$2) {
      return new dve($$0, $$1, $$2);
   }

   public static dve a(dmz $$0, dmz $$1) {
      return a($$0, $$1, 0);
   }

   @Override
   public int a(ato $$0, dnc $$1) {
      int $$2 = this.d.a($$1);
      int $$3 = this.e.a($$1);
      if ($$2 > $$3) {
         b.warn("Empty height range: {}", this);
         return $$2;
      } else {
         int $$4 = $$3 - $$2;
         if (this.f >= $$4) {
            return ati.b($$0, $$2, $$3);
         } else {
            int $$5 = ($$4 - this.f) / 2;
            int $$6 = $$4 - $$5;
            return $$2 + ati.b($$0, 0, $$6) + ati.b($$0, 0, $$5);
         }
      }
   }

   @Override
   public dvd<?> a() {
      return dvd.e;
   }

   @Override
   public String toString() {
      return this.f == 0 ? "triangle (" + this.d + "-" + this.e + ")" : "trapezoid(" + this.f + ") in [" + this.d + "-" + this.e + "]";
   }
}
