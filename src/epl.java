import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import org.slf4j.Logger;

public class epl extends epi {
   public static final MapCodec<epl> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(eha.a.fieldOf("min_inclusive").forGetter($$0x -> $$0x.d), eha.a.fieldOf("max_inclusive").forGetter($$0x -> $$0x.e)).apply($$0, epl::new)
   );
   private static final Logger b = LogUtils.getLogger();
   private final eha d;
   private final eha e;
   private final LongSet f = new LongOpenHashSet();

   private epl(eha $$0, eha $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   public static epl a(eha $$0, eha $$1) {
      return new epl($$0, $$1);
   }

   @Override
   public int a(azv $$0, ehd $$1) {
      int $$2 = this.d.a($$1);
      int $$3 = this.e.a($$1);
      if ($$2 > $$3) {
         if (this.f.add((long)$$2 << 32 | (long)$$3)) {
            b.warn("Empty height range: {}", this);
         }

         return $$2;
      } else {
         return azm.b($$0, $$2, $$3);
      }
   }

   @Override
   public epj<?> a() {
      return epj.b;
   }

   @Override
   public String toString() {
      return "[" + this.d + "-" + this.e + "]";
   }
}
