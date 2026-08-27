import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import org.slf4j.Logger;

public class eeq extends een {
   public static final Codec<eeq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dwk.a.fieldOf("min_inclusive").forGetter($$0x -> $$0x.d), dwk.a.fieldOf("max_inclusive").forGetter($$0x -> $$0x.e)).apply($$0, eeq::new)
   );
   private static final Logger b = LogUtils.getLogger();
   private final dwk d;
   private final dwk e;
   private final LongSet f = new LongOpenHashSet();

   private eeq(dwk $$0, dwk $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   public static eeq a(dwk $$0, dwk $$1) {
      return new eeq($$0, $$1);
   }

   @Override
   public int a(ayd $$0, dwn $$1) {
      int $$2 = this.d.a($$1);
      int $$3 = this.e.a($$1);
      if ($$2 > $$3) {
         if (this.f.add((long)$$2 << 32 | (long)$$3)) {
            b.warn("Empty height range: {}", this);
         }

         return $$2;
      } else {
         return axw.b($$0, $$2, $$3);
      }
   }

   @Override
   public eeo<?> a() {
      return eeo.b;
   }

   @Override
   public String toString() {
      return "[" + this.d + "-" + this.e + "]";
   }
}
