import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import org.slf4j.Logger;

public class eft extends efq {
   public static final MapCodec<eft> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dxn.a.fieldOf("min_inclusive").forGetter($$0x -> $$0x.d), dxn.a.fieldOf("max_inclusive").forGetter($$0x -> $$0x.e)).apply($$0, eft::new)
   );
   private static final Logger b = LogUtils.getLogger();
   private final dxn d;
   private final dxn e;
   private final LongSet f = new LongOpenHashSet();

   private eft(dxn $$0, dxn $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   public static eft a(dxn $$0, dxn $$1) {
      return new eft($$0, $$1);
   }

   @Override
   public int a(ayk $$0, dxq $$1) {
      int $$2 = this.d.a($$1);
      int $$3 = this.e.a($$1);
      if ($$2 > $$3) {
         if (this.f.add((long)$$2 << 32 | (long)$$3)) {
            b.warn("Empty height range: {}", this);
         }

         return $$2;
      } else {
         return ayd.b($$0, $$2, $$3);
      }
   }

   @Override
   public efr<?> a() {
      return efr.b;
   }

   @Override
   public String toString() {
      return "[" + this.d + "-" + this.e + "]";
   }
}
