import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import org.slf4j.Logger;

public class egs extends egp {
   public static final MapCodec<egs> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dym.a.fieldOf("min_inclusive").forGetter($$0x -> $$0x.d), dym.a.fieldOf("max_inclusive").forGetter($$0x -> $$0x.e)).apply($$0, egs::new)
   );
   private static final Logger b = LogUtils.getLogger();
   private final dym d;
   private final dym e;
   private final LongSet f = new LongOpenHashSet();

   private egs(dym $$0, dym $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   public static egs a(dym $$0, dym $$1) {
      return new egs($$0, $$1);
   }

   @Override
   public int a(azf $$0, dyp $$1) {
      int $$2 = this.d.a($$1);
      int $$3 = this.e.a($$1);
      if ($$2 > $$3) {
         if (this.f.add((long)$$2 << 32 | (long)$$3)) {
            b.warn("Empty height range: {}", this);
         }

         return $$2;
      } else {
         return ayx.b($$0, $$2, $$3);
      }
   }

   @Override
   public egq<?> a() {
      return egq.b;
   }

   @Override
   public String toString() {
      return "[" + this.d + "-" + this.e + "]";
   }
}
