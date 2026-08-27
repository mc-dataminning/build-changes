import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import org.slf4j.Logger;

public class dxp extends dxm {
   public static final Codec<dxp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dpj.a.fieldOf("min_inclusive").forGetter($$0x -> $$0x.d), dpj.a.fieldOf("max_inclusive").forGetter($$0x -> $$0x.e)).apply($$0, dxp::new)
   );
   private static final Logger b = LogUtils.getLogger();
   private final dpj d;
   private final dpj e;
   private final LongSet f = new LongOpenHashSet();

   private dxp(dpj $$0, dpj $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   public static dxp a(dpj $$0, dpj $$1) {
      return new dxp($$0, $$1);
   }

   @Override
   public int a(auu $$0, dpm $$1) {
      int $$2 = this.d.a($$1);
      int $$3 = this.e.a($$1);
      if ($$2 > $$3) {
         if (this.f.add((long)$$2 << 32 | (long)$$3)) {
            b.warn("Empty height range: {}", this);
         }

         return $$2;
      } else {
         return aun.b($$0, $$2, $$3);
      }
   }

   @Override
   public dxn<?> a() {
      return dxn.b;
   }

   @Override
   public String toString() {
      return "[" + this.d + "-" + this.e + "]";
   }
}
