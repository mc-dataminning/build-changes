import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import org.slf4j.Logger;

public class edr extends edo {
   public static final Codec<edr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dvl.a.fieldOf("min_inclusive").forGetter($$0x -> $$0x.d), dvl.a.fieldOf("max_inclusive").forGetter($$0x -> $$0x.e)).apply($$0, edr::new)
   );
   private static final Logger b = LogUtils.getLogger();
   private final dvl d;
   private final dvl e;
   private final LongSet f = new LongOpenHashSet();

   private edr(dvl $$0, dvl $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   public static edr a(dvl $$0, dvl $$1) {
      return new edr($$0, $$1);
   }

   @Override
   public int a(axr $$0, dvo $$1) {
      int $$2 = this.d.a($$1);
      int $$3 = this.e.a($$1);
      if ($$2 > $$3) {
         if (this.f.add((long)$$2 << 32 | (long)$$3)) {
            b.warn("Empty height range: {}", this);
         }

         return $$2;
      } else {
         return axk.b($$0, $$2, $$3);
      }
   }

   @Override
   public edp<?> a() {
      return edp.b;
   }

   @Override
   public String toString() {
      return "[" + this.d + "-" + this.e + "]";
   }
}
