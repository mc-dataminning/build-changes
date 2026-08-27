import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import org.slf4j.Logger;

public class eez extends eew {
   public static final Codec<eez> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dwt.a.fieldOf("min_inclusive").forGetter($$0x -> $$0x.d), dwt.a.fieldOf("max_inclusive").forGetter($$0x -> $$0x.e)).apply($$0, eez::new)
   );
   private static final Logger b = LogUtils.getLogger();
   private final dwt d;
   private final dwt e;
   private final LongSet f = new LongOpenHashSet();

   private eez(dwt $$0, dwt $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   public static eez a(dwt $$0, dwt $$1) {
      return new eez($$0, $$1);
   }

   @Override
   public int a(ayg $$0, dww $$1) {
      int $$2 = this.d.a($$1);
      int $$3 = this.e.a($$1);
      if ($$2 > $$3) {
         if (this.f.add((long)$$2 << 32 | (long)$$3)) {
            b.warn("Empty height range: {}", this);
         }

         return $$2;
      } else {
         return axz.b($$0, $$2, $$3);
      }
   }

   @Override
   public eex<?> a() {
      return eex.b;
   }

   @Override
   public String toString() {
      return "[" + this.d + "-" + this.e + "]";
   }
}
