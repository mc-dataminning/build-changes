import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import org.slf4j.Logger;

public class elu extends elr {
   public static final MapCodec<elu> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(edk.a.fieldOf("min_inclusive").forGetter($$0x -> $$0x.d), edk.a.fieldOf("max_inclusive").forGetter($$0x -> $$0x.e)).apply($$0, elu::new)
   );
   private static final Logger b = LogUtils.getLogger();
   private final edk d;
   private final edk e;
   private final LongSet f = new LongOpenHashSet();

   private elu(edk $$0, edk $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   public static elu a(edk $$0, edk $$1) {
      return new elu($$0, $$1);
   }

   @Override
   public int a(azg $$0, edn $$1) {
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
   public els<?> a() {
      return els.b;
   }

   @Override
   public String toString() {
      return "[" + this.d + "-" + this.e + "]";
   }
}
