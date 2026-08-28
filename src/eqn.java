import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import org.slf4j.Logger;

public class eqn extends eqk {
   public static final MapCodec<eqn> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ehz.a.fieldOf("min_inclusive").forGetter($$0x -> $$0x.d), ehz.a.fieldOf("max_inclusive").forGetter($$0x -> $$0x.e)).apply($$0, eqn::new)
   );
   private static final Logger b = LogUtils.getLogger();
   private final ehz d;
   private final ehz e;
   private final LongSet f = new LongOpenHashSet();

   private eqn(ehz $$0, ehz $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   public static eqn a(ehz $$0, ehz $$1) {
      return new eqn($$0, $$1);
   }

   @Override
   public int a(azz $$0, eic $$1) {
      int $$2 = this.d.a($$1);
      int $$3 = this.e.a($$1);
      if ($$2 > $$3) {
         if (this.f.add((long)$$2 << 32 | (long)$$3)) {
            b.warn("Empty height range: {}", this);
         }

         return $$2;
      } else {
         return azq.b($$0, $$2, $$3);
      }
   }

   @Override
   public eql<?> a() {
      return eql.b;
   }

   @Override
   public String toString() {
      return "[" + this.d + "-" + this.e + "]";
   }
}
