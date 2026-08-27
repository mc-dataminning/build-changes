import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import org.slf4j.Logger;

public class dzv extends dzs {
   public static final Codec<dzv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(drp.a.fieldOf("min_inclusive").forGetter($$0x -> $$0x.d), drp.a.fieldOf("max_inclusive").forGetter($$0x -> $$0x.e)).apply($$0, dzv::new)
   );
   private static final Logger b = LogUtils.getLogger();
   private final drp d;
   private final drp e;
   private final LongSet f = new LongOpenHashSet();

   private dzv(drp $$0, drp $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   public static dzv a(drp $$0, drp $$1) {
      return new dzv($$0, $$1);
   }

   @Override
   public int a(awp $$0, drs $$1) {
      int $$2 = this.d.a($$1);
      int $$3 = this.e.a($$1);
      if ($$2 > $$3) {
         if (this.f.add((long)$$2 << 32 | (long)$$3)) {
            b.warn("Empty height range: {}", this);
         }

         return $$2;
      } else {
         return awi.b($$0, $$2, $$3);
      }
   }

   @Override
   public dzt<?> a() {
      return dzt.b;
   }

   @Override
   public String toString() {
      return "[" + this.d + "-" + this.e + "]";
   }
}
