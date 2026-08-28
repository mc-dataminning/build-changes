import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import org.slf4j.Logger;

public class eia extends ehx {
   public static final MapCodec<eia> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dzs.a.fieldOf("min_inclusive").forGetter($$0x -> $$0x.d), dzs.a.fieldOf("max_inclusive").forGetter($$0x -> $$0x.e)).apply($$0, eia::new)
   );
   private static final Logger b = LogUtils.getLogger();
   private final dzs d;
   private final dzs e;
   private final LongSet f = new LongOpenHashSet();

   private eia(dzs $$0, dzs $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   public static eia a(dzs $$0, dzs $$1) {
      return new eia($$0, $$1);
   }

   @Override
   public int a(ayw $$0, dzv $$1) {
      int $$2 = this.d.a($$1);
      int $$3 = this.e.a($$1);
      if ($$2 > $$3) {
         if (this.f.add((long)$$2 << 32 | (long)$$3)) {
            b.warn("Empty height range: {}", this);
         }

         return $$2;
      } else {
         return ayo.b($$0, $$2, $$3);
      }
   }

   @Override
   public ehy<?> a() {
      return ehy.b;
   }

   @Override
   public String toString() {
      return "[" + this.d + "-" + this.e + "]";
   }
}
