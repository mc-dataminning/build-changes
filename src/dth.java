import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import org.slf4j.Logger;

public class dth extends dte {
   public static final Codec<dth> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dlb.a.fieldOf("min_inclusive").forGetter($$0x -> $$0x.d), dlb.a.fieldOf("max_inclusive").forGetter($$0x -> $$0x.e)).apply($$0, dth::new)
   );
   private static final Logger b = LogUtils.getLogger();
   private final dlb d;
   private final dlb e;
   private final LongSet f = new LongOpenHashSet();

   private dth(dlb $$0, dlb $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   public static dth a(dlb $$0, dlb $$1) {
      return new dth($$0, $$1);
   }

   @Override
   public int a(art $$0, dle $$1) {
      int $$2 = this.d.a($$1);
      int $$3 = this.e.a($$1);
      if ($$2 > $$3) {
         if (this.f.add((long)$$2 << 32 | (long)$$3)) {
            b.warn("Empty height range: {}", this);
         }

         return $$2;
      } else {
         return aro.b($$0, $$2, $$3);
      }
   }

   @Override
   public dtf<?> a() {
      return dtf.b;
   }

   @Override
   public String toString() {
      return "[" + this.d + "-" + this.e + "]";
   }
}
