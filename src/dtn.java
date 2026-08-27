import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import org.slf4j.Logger;

public class dtn extends dtk {
   public static final Codec<dtn> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dlh.a.fieldOf("min_inclusive").forGetter($$0x -> $$0x.d), dlh.a.fieldOf("max_inclusive").forGetter($$0x -> $$0x.e)).apply($$0, dtn::new)
   );
   private static final Logger b = LogUtils.getLogger();
   private final dlh d;
   private final dlh e;
   private final LongSet f = new LongOpenHashSet();

   private dtn(dlh $$0, dlh $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   public static dtn a(dlh $$0, dlh $$1) {
      return new dtn($$0, $$1);
   }

   @Override
   public int a(arx $$0, dlk $$1) {
      int $$2 = this.d.a($$1);
      int $$3 = this.e.a($$1);
      if ($$2 > $$3) {
         if (this.f.add((long)$$2 << 32 | (long)$$3)) {
            b.warn("Empty height range: {}", this);
         }

         return $$2;
      } else {
         return ars.b($$0, $$2, $$3);
      }
   }

   @Override
   public dtl<?> a() {
      return dtl.b;
   }

   @Override
   public String toString() {
      return "[" + this.d + "-" + this.e + "]";
   }
}
