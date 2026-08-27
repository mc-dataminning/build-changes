import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import org.slf4j.Logger;

public class dti extends dtf {
   public static final Codec<dti> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dlc.a.fieldOf("min_inclusive").forGetter($$0x -> $$0x.d), dlc.a.fieldOf("max_inclusive").forGetter($$0x -> $$0x.e)).apply($$0, dti::new)
   );
   private static final Logger b = LogUtils.getLogger();
   private final dlc d;
   private final dlc e;
   private final LongSet f = new LongOpenHashSet();

   private dti(dlc $$0, dlc $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   public static dti a(dlc $$0, dlc $$1) {
      return new dti($$0, $$1);
   }

   @Override
   public int a(aru $$0, dlf $$1) {
      int $$2 = this.d.a($$1);
      int $$3 = this.e.a($$1);
      if ($$2 > $$3) {
         if (this.f.add((long)$$2 << 32 | (long)$$3)) {
            b.warn("Empty height range: {}", this);
         }

         return $$2;
      } else {
         return arp.b($$0, $$2, $$3);
      }
   }

   @Override
   public dtg<?> a() {
      return dtg.b;
   }

   @Override
   public String toString() {
      return "[" + this.d + "-" + this.e + "]";
   }
}
