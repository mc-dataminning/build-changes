import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import org.slf4j.Logger;

public class elw extends elt {
   public static final MapCodec<elw> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(edm.a.fieldOf("min_inclusive").forGetter($$0x -> $$0x.d), edm.a.fieldOf("max_inclusive").forGetter($$0x -> $$0x.e)).apply($$0, elw::new)
   );
   private static final Logger b = LogUtils.getLogger();
   private final edm d;
   private final edm e;
   private final LongSet f = new LongOpenHashSet();

   private elw(edm $$0, edm $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   public static elw a(edm $$0, edm $$1) {
      return new elw($$0, $$1);
   }

   @Override
   public int a(azh $$0, edp $$1) {
      int $$2 = this.d.a($$1);
      int $$3 = this.e.a($$1);
      if ($$2 > $$3) {
         if (this.f.add((long)$$2 << 32 | (long)$$3)) {
            b.warn("Empty height range: {}", this);
         }

         return $$2;
      } else {
         return ayz.b($$0, $$2, $$3);
      }
   }

   @Override
   public elu<?> a() {
      return elu.b;
   }

   @Override
   public String toString() {
      return "[" + this.d + "-" + this.e + "]";
   }
}
