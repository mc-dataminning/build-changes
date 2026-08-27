import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import org.slf4j.Logger;

public class eaq extends ean {
   public static final Codec<eaq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dsk.a.fieldOf("min_inclusive").forGetter($$0x -> $$0x.d), dsk.a.fieldOf("max_inclusive").forGetter($$0x -> $$0x.e)).apply($$0, eaq::new)
   );
   private static final Logger b = LogUtils.getLogger();
   private final dsk d;
   private final dsk e;
   private final LongSet f = new LongOpenHashSet();

   private eaq(dsk $$0, dsk $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   public static eaq a(dsk $$0, dsk $$1) {
      return new eaq($$0, $$1);
   }

   @Override
   public int a(awt $$0, dsn $$1) {
      int $$2 = this.d.a($$1);
      int $$3 = this.e.a($$1);
      if ($$2 > $$3) {
         if (this.f.add((long)$$2 << 32 | (long)$$3)) {
            b.warn("Empty height range: {}", this);
         }

         return $$2;
      } else {
         return awm.b($$0, $$2, $$3);
      }
   }

   @Override
   public eao<?> a() {
      return eao.b;
   }

   @Override
   public String toString() {
      return "[" + this.d + "-" + this.e + "]";
   }
}
