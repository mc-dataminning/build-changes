import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import org.slf4j.Logger;

public class dtj extends dtg {
   public static final Codec<dtj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dld.a.fieldOf("min_inclusive").forGetter($$0x -> $$0x.d), dld.a.fieldOf("max_inclusive").forGetter($$0x -> $$0x.e)).apply($$0, dtj::new)
   );
   private static final Logger b = LogUtils.getLogger();
   private final dld d;
   private final dld e;
   private final LongSet f = new LongOpenHashSet();

   private dtj(dld $$0, dld $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   public static dtj a(dld $$0, dld $$1) {
      return new dtj($$0, $$1);
   }

   @Override
   public int a(aru $$0, dlg $$1) {
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
   public dth<?> a() {
      return dth.b;
   }

   @Override
   public String toString() {
      return "[" + this.d + "-" + this.e + "]";
   }
}
