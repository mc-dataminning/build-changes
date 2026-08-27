import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import org.slf4j.Logger;

public class dvw extends dvt {
   public static final Codec<dvw> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dnq.a.fieldOf("min_inclusive").forGetter($$0x -> $$0x.d), dnq.a.fieldOf("max_inclusive").forGetter($$0x -> $$0x.e)).apply($$0, dvw::new)
   );
   private static final Logger b = LogUtils.getLogger();
   private final dnq d;
   private final dnq e;
   private final LongSet f = new LongOpenHashSet();

   private dvw(dnq $$0, dnq $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   public static dvw a(dnq $$0, dnq $$1) {
      return new dvw($$0, $$1);
   }

   @Override
   public int a(atw $$0, dnt $$1) {
      int $$2 = this.d.a($$1);
      int $$3 = this.e.a($$1);
      if ($$2 > $$3) {
         if (this.f.add((long)$$2 << 32 | (long)$$3)) {
            b.warn("Empty height range: {}", this);
         }

         return $$2;
      } else {
         return atq.b($$0, $$2, $$3);
      }
   }

   @Override
   public dvu<?> a() {
      return dvu.b;
   }

   @Override
   public String toString() {
      return "[" + this.d + "-" + this.e + "]";
   }
}
