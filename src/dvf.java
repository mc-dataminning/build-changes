import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import org.slf4j.Logger;

public class dvf extends dvc {
   public static final Codec<dvf> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dmz.a.fieldOf("min_inclusive").forGetter($$0x -> $$0x.d), dmz.a.fieldOf("max_inclusive").forGetter($$0x -> $$0x.e)).apply($$0, dvf::new)
   );
   private static final Logger b = LogUtils.getLogger();
   private final dmz d;
   private final dmz e;
   private final LongSet f = new LongOpenHashSet();

   private dvf(dmz $$0, dmz $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   public static dvf a(dmz $$0, dmz $$1) {
      return new dvf($$0, $$1);
   }

   @Override
   public int a(ato $$0, dnc $$1) {
      int $$2 = this.d.a($$1);
      int $$3 = this.e.a($$1);
      if ($$2 > $$3) {
         if (this.f.add((long)$$2 << 32 | (long)$$3)) {
            b.warn("Empty height range: {}", this);
         }

         return $$2;
      } else {
         return ati.b($$0, $$2, $$3);
      }
   }

   @Override
   public dvd<?> a() {
      return dvd.b;
   }

   @Override
   public String toString() {
      return "[" + this.d + "-" + this.e + "]";
   }
}
