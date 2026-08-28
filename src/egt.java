import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import org.slf4j.Logger;

public class egt extends egq {
   public static final MapCodec<egt> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dyn.a.fieldOf("min_inclusive").forGetter($$0x -> $$0x.d), dyn.a.fieldOf("max_inclusive").forGetter($$0x -> $$0x.e)).apply($$0, egt::new)
   );
   private static final Logger b = LogUtils.getLogger();
   private final dyn d;
   private final dyn e;
   private final LongSet f = new LongOpenHashSet();

   private egt(dyn $$0, dyn $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   public static egt a(dyn $$0, dyn $$1) {
      return new egt($$0, $$1);
   }

   @Override
   public int a(azg $$0, dyq $$1) {
      int $$2 = this.d.a($$1);
      int $$3 = this.e.a($$1);
      if ($$2 > $$3) {
         if (this.f.add((long)$$2 << 32 | (long)$$3)) {
            b.warn("Empty height range: {}", this);
         }

         return $$2;
      } else {
         return ayy.b($$0, $$2, $$3);
      }
   }

   @Override
   public egr<?> a() {
      return egr.b;
   }

   @Override
   public String toString() {
      return "[" + this.d + "-" + this.e + "]";
   }
}
