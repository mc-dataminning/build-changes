import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import org.slf4j.Logger;

public class eic extends ehz {
   public static final Codec<eic> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dzo.a.fieldOf("min_inclusive").forGetter($$0x -> $$0x.d), dzo.a.fieldOf("max_inclusive").forGetter($$0x -> $$0x.e)).apply($$0, eic::new)
   );
   private static final Logger b = LogUtils.getLogger();
   private final dzo d;
   private final dzo e;
   private final LongSet f = new LongOpenHashSet();

   private eic(dzo $$0, dzo $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   public static eic a(dzo $$0, dzo $$1) {
      return new eic($$0, $$1);
   }

   @Override
   public int a(ayt $$0, dzr $$1) {
      int $$2 = this.d.a($$1);
      int $$3 = this.e.a($$1);
      if ($$2 > $$3) {
         if (this.f.add((long)$$2 << 32 | (long)$$3)) {
            b.warn("Empty height range: {}", this);
         }

         return $$2;
      } else {
         return aym.b($$0, $$2, $$3);
      }
   }

   @Override
   public eia<?> a() {
      return eia.b;
   }

   @Override
   public String toString() {
      return "[" + this.d + "-" + this.e + "]";
   }
}
