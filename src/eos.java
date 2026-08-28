import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import org.slf4j.Logger;

public class eos extends eop {
   public static final MapCodec<eos> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(egh.a.fieldOf("min_inclusive").forGetter($$0x -> $$0x.d), egh.a.fieldOf("max_inclusive").forGetter($$0x -> $$0x.e)).apply($$0, eos::new)
   );
   private static final Logger b = LogUtils.getLogger();
   private final egh d;
   private final egh e;
   private final LongSet f = new LongOpenHashSet();

   private eos(egh $$0, egh $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   public static eos a(egh $$0, egh $$1) {
      return new eos($$0, $$1);
   }

   @Override
   public int a(azt $$0, egk $$1) {
      int $$2 = this.d.a($$1);
      int $$3 = this.e.a($$1);
      if ($$2 > $$3) {
         if (this.f.add((long)$$2 << 32 | (long)$$3)) {
            b.warn("Empty height range: {}", this);
         }

         return $$2;
      } else {
         return azk.b($$0, $$2, $$3);
      }
   }

   @Override
   public eoq<?> a() {
      return eoq.b;
   }

   @Override
   public String toString() {
      return "[" + this.d + "-" + this.e + "]";
   }
}
