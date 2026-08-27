import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import org.slf4j.Logger;

public class dxq extends dxn {
   public static final Codec<dxq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dpk.a.fieldOf("min_inclusive").forGetter($$0x -> $$0x.d), dpk.a.fieldOf("max_inclusive").forGetter($$0x -> $$0x.e)).apply($$0, dxq::new)
   );
   private static final Logger b = LogUtils.getLogger();
   private final dpk d;
   private final dpk e;
   private final LongSet f = new LongOpenHashSet();

   private dxq(dpk $$0, dpk $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   public static dxq a(dpk $$0, dpk $$1) {
      return new dxq($$0, $$1);
   }

   @Override
   public int a(auv $$0, dpn $$1) {
      int $$2 = this.d.a($$1);
      int $$3 = this.e.a($$1);
      if ($$2 > $$3) {
         if (this.f.add((long)$$2 << 32 | (long)$$3)) {
            b.warn("Empty height range: {}", this);
         }

         return $$2;
      } else {
         return auo.b($$0, $$2, $$3);
      }
   }

   @Override
   public dxo<?> a() {
      return dxo.b;
   }

   @Override
   public String toString() {
      return "[" + this.d + "-" + this.e + "]";
   }
}
