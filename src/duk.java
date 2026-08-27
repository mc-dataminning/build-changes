import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import org.slf4j.Logger;

public class duk extends duh {
   public static final Codec<duk> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dme.a.fieldOf("min_inclusive").forGetter($$0x -> $$0x.d), dme.a.fieldOf("max_inclusive").forGetter($$0x -> $$0x.e)).apply($$0, duk::new)
   );
   private static final Logger b = LogUtils.getLogger();
   private final dme d;
   private final dme e;
   private final LongSet f = new LongOpenHashSet();

   private duk(dme $$0, dme $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   public static duk a(dme $$0, dme $$1) {
      return new duk($$0, $$1);
   }

   @Override
   public int a(ate $$0, dmh $$1) {
      int $$2 = this.d.a($$1);
      int $$3 = this.e.a($$1);
      if ($$2 > $$3) {
         if (this.f.add((long)$$2 << 32 | (long)$$3)) {
            b.warn("Empty height range: {}", this);
         }

         return $$2;
      } else {
         return asy.b($$0, $$2, $$3);
      }
   }

   @Override
   public dui<?> a() {
      return dui.b;
   }

   @Override
   public String toString() {
      return "[" + this.d + "-" + this.e + "]";
   }
}
