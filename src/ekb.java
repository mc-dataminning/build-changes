import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import org.slf4j.Logger;

public class ekb extends ejy {
   public static final MapCodec<ekb> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ebt.a.fieldOf("min_inclusive").forGetter($$0x -> $$0x.d), ebt.a.fieldOf("max_inclusive").forGetter($$0x -> $$0x.e)).apply($$0, ekb::new)
   );
   private static final Logger b = LogUtils.getLogger();
   private final ebt d;
   private final ebt e;
   private final LongSet f = new LongOpenHashSet();

   private ekb(ebt $$0, ebt $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   public static ekb a(ebt $$0, ebt $$1) {
      return new ekb($$0, $$1);
   }

   @Override
   public int a(azr $$0, ebw $$1) {
      int $$2 = this.d.a($$1);
      int $$3 = this.e.a($$1);
      if ($$2 > $$3) {
         if (this.f.add((long)$$2 << 32 | (long)$$3)) {
            b.warn("Empty height range: {}", this);
         }

         return $$2;
      } else {
         return azj.b($$0, $$2, $$3);
      }
   }

   @Override
   public ejz<?> a() {
      return ejz.b;
   }

   @Override
   public String toString() {
      return "[" + this.d + "-" + this.e + "]";
   }
}
