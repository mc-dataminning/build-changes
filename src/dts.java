import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import org.slf4j.Logger;

public class dts extends dtp {
   public static final Codec<dts> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dlm.a.fieldOf("min_inclusive").forGetter($$0x -> $$0x.d), dlm.a.fieldOf("max_inclusive").forGetter($$0x -> $$0x.e)).apply($$0, dts::new)
   );
   private static final Logger b = LogUtils.getLogger();
   private final dlm d;
   private final dlm e;
   private final LongSet f = new LongOpenHashSet();

   private dts(dlm $$0, dlm $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   public static dts a(dlm $$0, dlm $$1) {
      return new dts($$0, $$1);
   }

   @Override
   public int a(asc $$0, dlp $$1) {
      int $$2 = this.d.a($$1);
      int $$3 = this.e.a($$1);
      if ($$2 > $$3) {
         if (this.f.add((long)$$2 << 32 | (long)$$3)) {
            b.warn("Empty height range: {}", this);
         }

         return $$2;
      } else {
         return arw.b($$0, $$2, $$3);
      }
   }

   @Override
   public dtq<?> a() {
      return dtq.b;
   }

   @Override
   public String toString() {
      return "[" + this.d + "-" + this.e + "]";
   }
}
