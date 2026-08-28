import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import org.slf4j.Logger;

public class egw extends egt {
   public static final MapCodec<egw> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dyq.a.fieldOf("min_inclusive").forGetter($$0x -> $$0x.d), dyq.a.fieldOf("max_inclusive").forGetter($$0x -> $$0x.e)).apply($$0, egw::new)
   );
   private static final Logger b = LogUtils.getLogger();
   private final dyq d;
   private final dyq e;
   private final LongSet f = new LongOpenHashSet();

   private egw(dyq $$0, dyq $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   public static egw a(dyq $$0, dyq $$1) {
      return new egw($$0, $$1);
   }

   @Override
   public int a(azh $$0, dyt $$1) {
      int $$2 = this.d.a($$1);
      int $$3 = this.e.a($$1);
      if ($$2 > $$3) {
         if (this.f.add((long)$$2 << 32 | (long)$$3)) {
            b.warn("Empty height range: {}", this);
         }

         return $$2;
      } else {
         return ayz.b($$0, $$2, $$3);
      }
   }

   @Override
   public egu<?> a() {
      return egu.b;
   }

   @Override
   public String toString() {
      return "[" + this.d + "-" + this.e + "]";
   }
}
