import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import org.slf4j.Logger;

public class egp extends egm {
   public static final MapCodec<egp> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dyj.a.fieldOf("min_inclusive").forGetter($$0x -> $$0x.d), dyj.a.fieldOf("max_inclusive").forGetter($$0x -> $$0x.e)).apply($$0, egp::new)
   );
   private static final Logger b = LogUtils.getLogger();
   private final dyj d;
   private final dyj e;
   private final LongSet f = new LongOpenHashSet();

   private egp(dyj $$0, dyj $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   public static egp a(dyj $$0, dyj $$1) {
      return new egp($$0, $$1);
   }

   @Override
   public int a(azc $$0, dym $$1) {
      int $$2 = this.d.a($$1);
      int $$3 = this.e.a($$1);
      if ($$2 > $$3) {
         if (this.f.add((long)$$2 << 32 | (long)$$3)) {
            b.warn("Empty height range: {}", this);
         }

         return $$2;
      } else {
         return ayu.b($$0, $$2, $$3);
      }
   }

   @Override
   public egn<?> a() {
      return egn.b;
   }

   @Override
   public String toString() {
      return "[" + this.d + "-" + this.e + "]";
   }
}
