import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import org.slf4j.Logger;

public class ehw extends eht {
   public static final MapCodec<ehw> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dzp.a.fieldOf("min_inclusive").forGetter($$0x -> $$0x.d), dzp.a.fieldOf("max_inclusive").forGetter($$0x -> $$0x.e)).apply($$0, ehw::new)
   );
   private static final Logger b = LogUtils.getLogger();
   private final dzp d;
   private final dzp e;
   private final LongSet f = new LongOpenHashSet();

   private ehw(dzp $$0, dzp $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   public static ehw a(dzp $$0, dzp $$1) {
      return new ehw($$0, $$1);
   }

   @Override
   public int a(ayv $$0, dzs $$1) {
      int $$2 = this.d.a($$1);
      int $$3 = this.e.a($$1);
      if ($$2 > $$3) {
         if (this.f.add((long)$$2 << 32 | (long)$$3)) {
            b.warn("Empty height range: {}", this);
         }

         return $$2;
      } else {
         return ayn.b($$0, $$2, $$3);
      }
   }

   @Override
   public ehu<?> a() {
      return ehu.b;
   }

   @Override
   public String toString() {
      return "[" + this.d + "-" + this.e + "]";
   }
}
