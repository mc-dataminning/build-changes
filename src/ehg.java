import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import org.slf4j.Logger;

public class ehg extends ehd {
   public static final MapCodec<ehg> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dyz.a.fieldOf("min_inclusive").forGetter($$0x -> $$0x.d), dyz.a.fieldOf("max_inclusive").forGetter($$0x -> $$0x.e)).apply($$0, ehg::new)
   );
   private static final Logger b = LogUtils.getLogger();
   private final dyz d;
   private final dyz e;
   private final LongSet f = new LongOpenHashSet();

   private ehg(dyz $$0, dyz $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   public static ehg a(dyz $$0, dyz $$1) {
      return new ehg($$0, $$1);
   }

   @Override
   public int a(ayo $$0, dzc $$1) {
      int $$2 = this.d.a($$1);
      int $$3 = this.e.a($$1);
      if ($$2 > $$3) {
         if (this.f.add((long)$$2 << 32 | (long)$$3)) {
            b.warn("Empty height range: {}", this);
         }

         return $$2;
      } else {
         return ayg.b($$0, $$2, $$3);
      }
   }

   @Override
   public ehe<?> a() {
      return ehe.b;
   }

   @Override
   public String toString() {
      return "[" + this.d + "-" + this.e + "]";
   }
}
