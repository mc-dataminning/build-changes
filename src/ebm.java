import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import org.slf4j.Logger;

public class ebm extends ebj {
   public static final Codec<ebm> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dtg.a.fieldOf("min_inclusive").forGetter($$0x -> $$0x.d), dtg.a.fieldOf("max_inclusive").forGetter($$0x -> $$0x.e)).apply($$0, ebm::new)
   );
   private static final Logger b = LogUtils.getLogger();
   private final dtg d;
   private final dtg e;
   private final LongSet f = new LongOpenHashSet();

   private ebm(dtg $$0, dtg $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   public static ebm a(dtg $$0, dtg $$1) {
      return new ebm($$0, $$1);
   }

   @Override
   public int a(axd $$0, dtj $$1) {
      int $$2 = this.d.a($$1);
      int $$3 = this.e.a($$1);
      if ($$2 > $$3) {
         if (this.f.add((long)$$2 << 32 | (long)$$3)) {
            b.warn("Empty height range: {}", this);
         }

         return $$2;
      } else {
         return aww.b($$0, $$2, $$3);
      }
   }

   @Override
   public ebk<?> a() {
      return ebk.b;
   }

   @Override
   public String toString() {
      return "[" + this.d + "-" + this.e + "]";
   }
}
