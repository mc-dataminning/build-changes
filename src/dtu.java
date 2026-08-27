import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import org.slf4j.Logger;

public class dtu extends dtr {
   public static final Codec<dtu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dlo.a.fieldOf("min_inclusive").forGetter($$0x -> $$0x.d), dlo.a.fieldOf("max_inclusive").forGetter($$0x -> $$0x.e)).apply($$0, dtu::new)
   );
   private static final Logger b = LogUtils.getLogger();
   private final dlo d;
   private final dlo e;
   private final LongSet f = new LongOpenHashSet();

   private dtu(dlo $$0, dlo $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   public static dtu a(dlo $$0, dlo $$1) {
      return new dtu($$0, $$1);
   }

   @Override
   public int a(ase $$0, dlr $$1) {
      int $$2 = this.d.a($$1);
      int $$3 = this.e.a($$1);
      if ($$2 > $$3) {
         if (this.f.add((long)$$2 << 32 | (long)$$3)) {
            b.warn("Empty height range: {}", this);
         }

         return $$2;
      } else {
         return ary.b($$0, $$2, $$3);
      }
   }

   @Override
   public dts<?> a() {
      return dts.b;
   }

   @Override
   public String toString() {
      return "[" + this.d + "-" + this.e + "]";
   }
}
