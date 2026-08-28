import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import org.slf4j.Logger;

public class emt extends emq {
   public static final MapCodec<emt> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(eej.a.fieldOf("min_inclusive").forGetter($$0x -> $$0x.d), eej.a.fieldOf("max_inclusive").forGetter($$0x -> $$0x.e)).apply($$0, emt::new)
   );
   private static final Logger b = LogUtils.getLogger();
   private final eej d;
   private final eej e;
   private final LongSet f = new LongOpenHashSet();

   private emt(eej $$0, eej $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   public static emt a(eej $$0, eej $$1) {
      return new emt($$0, $$1);
   }

   @Override
   public int a(bam $$0, eem $$1) {
      int $$2 = this.d.a($$1);
      int $$3 = this.e.a($$1);
      if ($$2 > $$3) {
         if (this.f.add((long)$$2 << 32 | (long)$$3)) {
            b.warn("Empty height range: {}", this);
         }

         return $$2;
      } else {
         return bae.b($$0, $$2, $$3);
      }
   }

   @Override
   public emr<?> a() {
      return emr.b;
   }

   @Override
   public String toString() {
      return "[" + this.d + "-" + this.e + "]";
   }
}
