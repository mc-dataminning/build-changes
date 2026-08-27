import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.slf4j.Logger;

public class eel extends een {
   public static final Codec<eel> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dwk.a.fieldOf("min_inclusive").forGetter($$0x -> $$0x.d),
               dwk.a.fieldOf("max_inclusive").forGetter($$0x -> $$0x.e),
               Codec.intRange(1, Integer.MAX_VALUE).optionalFieldOf("inner", 1).forGetter($$0x -> $$0x.f)
            )
            .apply($$0, eel::new)
   );
   private static final Logger b = LogUtils.getLogger();
   private final dwk d;
   private final dwk e;
   private final int f;

   private eel(dwk $$0, dwk $$1, int $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   public static eel a(dwk $$0, dwk $$1, int $$2) {
      return new eel($$0, $$1, $$2);
   }

   @Override
   public int a(ayd $$0, dwn $$1) {
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
   public eeo<?> a() {
      return eeo.c;
   }

   @Override
   public String toString() {
      return "biased[" + this.d + "-" + this.e + " inner: " + this.f + "]";
   }
}
