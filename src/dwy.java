import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import org.slf4j.Logger;

public class dwy extends dwv {
   public static final Codec<dwy> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dos.a.fieldOf("min_inclusive").forGetter($$0x -> $$0x.d), dos.a.fieldOf("max_inclusive").forGetter($$0x -> $$0x.e)).apply($$0, dwy::new)
   );
   private static final Logger b = LogUtils.getLogger();
   private final dos d;
   private final dos e;
   private final LongSet f = new LongOpenHashSet();

   private dwy(dos $$0, dos $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   public static dwy a(dos $$0, dos $$1) {
      return new dwy($$0, $$1);
   }

   @Override
   public int a(auf $$0, dov $$1) {
      int $$2 = this.d.a($$1);
      int $$3 = this.e.a($$1);
      if ($$2 > $$3) {
         if (this.f.add((long)$$2 << 32 | (long)$$3)) {
            b.warn("Empty height range: {}", this);
         }

         return $$2;
      } else {
         return aty.b($$0, $$2, $$3);
      }
   }

   @Override
   public dww<?> a() {
      return dww.b;
   }

   @Override
   public String toString() {
      return "[" + this.d + "-" + this.e + "]";
   }
}
