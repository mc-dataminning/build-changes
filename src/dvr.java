import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import org.slf4j.Logger;

public class dvr extends dvo {
   public static final Codec<dvr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dnl.a.fieldOf("min_inclusive").forGetter($$0x -> $$0x.d), dnl.a.fieldOf("max_inclusive").forGetter($$0x -> $$0x.e)).apply($$0, dvr::new)
   );
   private static final Logger b = LogUtils.getLogger();
   private final dnl d;
   private final dnl e;
   private final LongSet f = new LongOpenHashSet();

   private dvr(dnl $$0, dnl $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   public static dvr a(dnl $$0, dnl $$1) {
      return new dvr($$0, $$1);
   }

   @Override
   public int a(ats $$0, dno $$1) {
      int $$2 = this.d.a($$1);
      int $$3 = this.e.a($$1);
      if ($$2 > $$3) {
         if (this.f.add((long)$$2 << 32 | (long)$$3)) {
            b.warn("Empty height range: {}", this);
         }

         return $$2;
      } else {
         return atm.b($$0, $$2, $$3);
      }
   }

   @Override
   public dvp<?> a() {
      return dvp.b;
   }

   @Override
   public String toString() {
      return "[" + this.d + "-" + this.e + "]";
   }
}
