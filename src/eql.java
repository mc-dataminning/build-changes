import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import org.slf4j.Logger;

public class eql extends eqi {
   public static final MapCodec<eql> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ehx.a.fieldOf("min_inclusive").forGetter($$0x -> $$0x.d), ehx.a.fieldOf("max_inclusive").forGetter($$0x -> $$0x.e)).apply($$0, eql::new)
   );
   private static final Logger b = LogUtils.getLogger();
   private final ehx d;
   private final ehx e;
   private final LongSet f = new LongOpenHashSet();

   private eql(ehx $$0, ehx $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   public static eql a(ehx $$0, ehx $$1) {
      return new eql($$0, $$1);
   }

   @Override
   public int a(azx $$0, eia $$1) {
      int $$2 = this.d.a($$1);
      int $$3 = this.e.a($$1);
      if ($$2 > $$3) {
         if (this.f.add((long)$$2 << 32 | (long)$$3)) {
            b.warn("Empty height range: {}", this);
         }

         return $$2;
      } else {
         return azo.b($$0, $$2, $$3);
      }
   }

   @Override
   public eqj<?> a() {
      return eqj.b;
   }

   @Override
   public String toString() {
      return "[" + this.d + "-" + this.e + "]";
   }
}
