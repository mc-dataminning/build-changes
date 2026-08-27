import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import org.slf4j.Logger;

public class eea extends edx {
   public static final Codec<eea> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dvu.a.fieldOf("min_inclusive").forGetter($$0x -> $$0x.d), dvu.a.fieldOf("max_inclusive").forGetter($$0x -> $$0x.e)).apply($$0, eea::new)
   );
   private static final Logger b = LogUtils.getLogger();
   private final dvu d;
   private final dvu e;
   private final LongSet f = new LongOpenHashSet();

   private eea(dvu $$0, dvu $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   public static eea a(dvu $$0, dvu $$1) {
      return new eea($$0, $$1);
   }

   @Override
   public int a(axt $$0, dvx $$1) {
      int $$2 = this.d.a($$1);
      int $$3 = this.e.a($$1);
      if ($$2 > $$3) {
         if (this.f.add((long)$$2 << 32 | (long)$$3)) {
            b.warn("Empty height range: {}", this);
         }

         return $$2;
      } else {
         return axm.b($$0, $$2, $$3);
      }
   }

   @Override
   public edy<?> a() {
      return edy.b;
   }

   @Override
   public String toString() {
      return "[" + this.d + "-" + this.e + "]";
   }
}
