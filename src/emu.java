import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import org.slf4j.Logger;

public class emu extends emr {
   public static final MapCodec<emu> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(eek.a.fieldOf("min_inclusive").forGetter($$0x -> $$0x.d), eek.a.fieldOf("max_inclusive").forGetter($$0x -> $$0x.e)).apply($$0, emu::new)
   );
   private static final Logger b = LogUtils.getLogger();
   private final eek d;
   private final eek e;
   private final LongSet f = new LongOpenHashSet();

   private emu(eek $$0, eek $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   public static emu a(eek $$0, eek $$1) {
      return new emu($$0, $$1);
   }

   @Override
   public int a(bam $$0, een $$1) {
      int $$2 = this.d.a($$1);
      int $$3 = this.e.a($$1);
      if ($$2 > $$3) {
         if (this.f.add((long)$$2 << 32 | (long)$$3)) {
            b.warn("Empty height range: {}", this);
         }

         return $$2;
      } else {
         return bae.b($$0, $$2, $$3);
      }
   }

   @Override
   public ems<?> a() {
      return ems.b;
   }

   @Override
   public String toString() {
      return "[" + this.d + "-" + this.e + "]";
   }
}
