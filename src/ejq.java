import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import org.slf4j.Logger;

public class ejq extends ejn {
   public static final MapCodec<ejq> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ebi.a.fieldOf("min_inclusive").forGetter($$0x -> $$0x.d), ebi.a.fieldOf("max_inclusive").forGetter($$0x -> $$0x.e)).apply($$0, ejq::new)
   );
   private static final Logger b = LogUtils.getLogger();
   private final ebi d;
   private final ebi e;
   private final LongSet f = new LongOpenHashSet();

   private ejq(ebi $$0, ebi $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   public static ejq a(ebi $$0, ebi $$1) {
      return new ejq($$0, $$1);
   }

   @Override
   public int a(azn $$0, ebl $$1) {
      int $$2 = this.d.a($$1);
      int $$3 = this.e.a($$1);
      if ($$2 > $$3) {
         if (this.f.add((long)$$2 << 32 | (long)$$3)) {
            b.warn("Empty height range: {}", this);
         }

         return $$2;
      } else {
         return azf.b($$0, $$2, $$3);
      }
   }

   @Override
   public ejo<?> a() {
      return ejo.b;
   }

   @Override
   public String toString() {
      return "[" + this.d + "-" + this.e + "]";
   }
}
