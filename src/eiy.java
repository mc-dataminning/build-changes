import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import org.slf4j.Logger;

public class eiy extends eiv {
   public static final MapCodec<eiy> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(eaq.a.fieldOf("min_inclusive").forGetter($$0x -> $$0x.d), eaq.a.fieldOf("max_inclusive").forGetter($$0x -> $$0x.e)).apply($$0, eiy::new)
   );
   private static final Logger b = LogUtils.getLogger();
   private final eaq d;
   private final eaq e;
   private final LongSet f = new LongOpenHashSet();

   private eiy(eaq $$0, eaq $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   public static eiy a(eaq $$0, eaq $$1) {
      return new eiy($$0, $$1);
   }

   @Override
   public int a(azk $$0, eat $$1) {
      int $$2 = this.d.a($$1);
      int $$3 = this.e.a($$1);
      if ($$2 > $$3) {
         if (this.f.add((long)$$2 << 32 | (long)$$3)) {
            b.warn("Empty height range: {}", this);
         }

         return $$2;
      } else {
         return azc.b($$0, $$2, $$3);
      }
   }

   @Override
   public eiw<?> a() {
      return eiw.b;
   }

   @Override
   public String toString() {
      return "[" + this.d + "-" + this.e + "]";
   }
}
