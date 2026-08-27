import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import org.slf4j.Logger;

public class dzo extends dzl {
   public static final Codec<dzo> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dri.a.fieldOf("min_inclusive").forGetter($$0x -> $$0x.d), dri.a.fieldOf("max_inclusive").forGetter($$0x -> $$0x.e)).apply($$0, dzo::new)
   );
   private static final Logger b = LogUtils.getLogger();
   private final dri d;
   private final dri e;
   private final LongSet f = new LongOpenHashSet();

   private dzo(dri $$0, dri $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   public static dzo a(dri $$0, dri $$1) {
      return new dzo($$0, $$1);
   }

   @Override
   public int a(awo $$0, drl $$1) {
      int $$2 = this.d.a($$1);
      int $$3 = this.e.a($$1);
      if ($$2 > $$3) {
         if (this.f.add((long)$$2 << 32 | (long)$$3)) {
            b.warn("Empty height range: {}", this);
         }

         return $$2;
      } else {
         return awh.b($$0, $$2, $$3);
      }
   }

   @Override
   public dzm<?> a() {
      return dzm.b;
   }

   @Override
   public String toString() {
      return "[" + this.d + "-" + this.e + "]";
   }
}
