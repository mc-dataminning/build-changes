import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import org.slf4j.Logger;

public class eha extends egx {
   public static final MapCodec<eha> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dyt.a.fieldOf("min_inclusive").forGetter($$0x -> $$0x.d), dyt.a.fieldOf("max_inclusive").forGetter($$0x -> $$0x.e)).apply($$0, eha::new)
   );
   private static final Logger b = LogUtils.getLogger();
   private final dyt d;
   private final dyt e;
   private final LongSet f = new LongOpenHashSet();

   private eha(dyt $$0, dyt $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   public static eha a(dyt $$0, dyt $$1) {
      return new eha($$0, $$1);
   }

   @Override
   public int a(aym $$0, dyw $$1) {
      int $$2 = this.d.a($$1);
      int $$3 = this.e.a($$1);
      if ($$2 > $$3) {
         if (this.f.add((long)$$2 << 32 | (long)$$3)) {
            b.warn("Empty height range: {}", this);
         }

         return $$2;
      } else {
         return aye.b($$0, $$2, $$3);
      }
   }

   @Override
   public egy<?> a() {
      return egy.b;
   }

   @Override
   public String toString() {
      return "[" + this.d + "-" + this.e + "]";
   }
}
