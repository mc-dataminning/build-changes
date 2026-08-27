import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import org.slf4j.Logger;

public class ebo extends ebl {
   public static final Codec<ebo> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dti.a.fieldOf("min_inclusive").forGetter($$0x -> $$0x.d), dti.a.fieldOf("max_inclusive").forGetter($$0x -> $$0x.e)).apply($$0, ebo::new)
   );
   private static final Logger b = LogUtils.getLogger();
   private final dti d;
   private final dti e;
   private final LongSet f = new LongOpenHashSet();

   private ebo(dti $$0, dti $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   public static ebo a(dti $$0, dti $$1) {
      return new ebo($$0, $$1);
   }

   @Override
   public int a(axd $$0, dtl $$1) {
      int $$2 = this.d.a($$1);
      int $$3 = this.e.a($$1);
      if ($$2 > $$3) {
         if (this.f.add((long)$$2 << 32 | (long)$$3)) {
            b.warn("Empty height range: {}", this);
         }

         return $$2;
      } else {
         return aww.b($$0, $$2, $$3);
      }
   }

   @Override
   public ebm<?> a() {
      return ebm.b;
   }

   @Override
   public String toString() {
      return "[" + this.d + "-" + this.e + "]";
   }
}
