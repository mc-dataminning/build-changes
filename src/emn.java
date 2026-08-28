import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import org.slf4j.Logger;

public class emn extends emk {
   public static final MapCodec<emn> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(eed.a.fieldOf("min_inclusive").forGetter($$0x -> $$0x.d), eed.a.fieldOf("max_inclusive").forGetter($$0x -> $$0x.e)).apply($$0, emn::new)
   );
   private static final Logger b = LogUtils.getLogger();
   private final eed d;
   private final eed e;
   private final LongSet f = new LongOpenHashSet();

   private emn(eed $$0, eed $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   public static emn a(eed $$0, eed $$1) {
      return new emn($$0, $$1);
   }

   @Override
   public int a(bac $$0, eeg $$1) {
      int $$2 = this.d.a($$1);
      int $$3 = this.e.a($$1);
      if ($$2 > $$3) {
         if (this.f.add((long)$$2 << 32 | (long)$$3)) {
            b.warn("Empty height range: {}", this);
         }

         return $$2;
      } else {
         return azu.b($$0, $$2, $$3);
      }
   }

   @Override
   public eml<?> a() {
      return eml.b;
   }

   @Override
   public String toString() {
      return "[" + this.d + "-" + this.e + "]";
   }
}
