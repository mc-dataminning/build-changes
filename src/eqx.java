import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import org.slf4j.Logger;

public class eqx extends equ {
   public static final MapCodec<eqx> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(eij.a.fieldOf("min_inclusive").forGetter($$0x -> $$0x.d), eij.a.fieldOf("max_inclusive").forGetter($$0x -> $$0x.e)).apply($$0, eqx::new)
   );
   private static final Logger b = LogUtils.getLogger();
   private final eij d;
   private final eij e;
   private final LongSet f = new LongOpenHashSet();

   private eqx(eij $$0, eij $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   public static eqx a(eij $$0, eij $$1) {
      return new eqx($$0, $$1);
   }

   @Override
   public int a(bai $$0, eim $$1) {
      int $$2 = this.d.a($$1);
      int $$3 = this.e.a($$1);
      if ($$2 > $$3) {
         if (this.f.add((long)$$2 << 32 | (long)$$3)) {
            b.warn("Empty height range: {}", this);
         }

         return $$2;
      } else {
         return azz.b($$0, $$2, $$3);
      }
   }

   @Override
   public eqv<?> a() {
      return eqv.b;
   }

   @Override
   public String toString() {
      return "[" + this.d + "-" + this.e + "]";
   }
}
