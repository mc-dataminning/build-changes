import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import org.slf4j.Logger;

public class dxj extends dxg {
   public static final Codec<dxj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dpd.a.fieldOf("min_inclusive").forGetter($$0x -> $$0x.d), dpd.a.fieldOf("max_inclusive").forGetter($$0x -> $$0x.e)).apply($$0, dxj::new)
   );
   private static final Logger b = LogUtils.getLogger();
   private final dpd d;
   private final dpd e;
   private final LongSet f = new LongOpenHashSet();

   private dxj(dpd $$0, dpd $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   public static dxj a(dpd $$0, dpd $$1) {
      return new dxj($$0, $$1);
   }

   @Override
   public int a(aup $$0, dpg $$1) {
      int $$2 = this.d.a($$1);
      int $$3 = this.e.a($$1);
      if ($$2 > $$3) {
         if (this.f.add((long)$$2 << 32 | (long)$$3)) {
            b.warn("Empty height range: {}", this);
         }

         return $$2;
      } else {
         return aui.b($$0, $$2, $$3);
      }
   }

   @Override
   public dxh<?> a() {
      return dxh.b;
   }

   @Override
   public String toString() {
      return "[" + this.d + "-" + this.e + "]";
   }
}
