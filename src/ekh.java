import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import org.slf4j.Logger;

public class ekh extends eke {
   public static final MapCodec<ekh> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ebz.a.fieldOf("min_inclusive").forGetter($$0x -> $$0x.d), ebz.a.fieldOf("max_inclusive").forGetter($$0x -> $$0x.e)).apply($$0, ekh::new)
   );
   private static final Logger b = LogUtils.getLogger();
   private final ebz d;
   private final ebz e;
   private final LongSet f = new LongOpenHashSet();

   private ekh(ebz $$0, ebz $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   public static ekh a(ebz $$0, ebz $$1) {
      return new ekh($$0, $$1);
   }

   @Override
   public int a(azs $$0, ecc $$1) {
      int $$2 = this.d.a($$1);
      int $$3 = this.e.a($$1);
      if ($$2 > $$3) {
         if (this.f.add((long)$$2 << 32 | (long)$$3)) {
            b.warn("Empty height range: {}", this);
         }

         return $$2;
      } else {
         return azk.b($$0, $$2, $$3);
      }
   }

   @Override
   public ekf<?> a() {
      return ekf.b;
   }

   @Override
   public String toString() {
      return "[" + this.d + "-" + this.e + "]";
   }
}
