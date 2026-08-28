import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import org.slf4j.Logger;

public class egv extends egs {
   public static final MapCodec<egv> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dyp.a.fieldOf("min_inclusive").forGetter($$0x -> $$0x.d), dyp.a.fieldOf("max_inclusive").forGetter($$0x -> $$0x.e)).apply($$0, egv::new)
   );
   private static final Logger b = LogUtils.getLogger();
   private final dyp d;
   private final dyp e;
   private final LongSet f = new LongOpenHashSet();

   private egv(dyp $$0, dyp $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   public static egv a(dyp $$0, dyp $$1) {
      return new egv($$0, $$1);
   }

   @Override
   public int a(azh $$0, dys $$1) {
      int $$2 = this.d.a($$1);
      int $$3 = this.e.a($$1);
      if ($$2 > $$3) {
         if (this.f.add((long)$$2 << 32 | (long)$$3)) {
            b.warn("Empty height range: {}", this);
         }

         return $$2;
      } else {
         return ayz.b($$0, $$2, $$3);
      }
   }

   @Override
   public egt<?> a() {
      return egt.b;
   }

   @Override
   public String toString() {
      return "[" + this.d + "-" + this.e + "]";
   }
}
