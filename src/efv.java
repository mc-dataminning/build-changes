import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import org.slf4j.Logger;

public class efv extends efs {
   public static final MapCodec<efv> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dxp.a.fieldOf("min_inclusive").forGetter($$0x -> $$0x.d), dxp.a.fieldOf("max_inclusive").forGetter($$0x -> $$0x.e)).apply($$0, efv::new)
   );
   private static final Logger b = LogUtils.getLogger();
   private final dxp d;
   private final dxp e;
   private final LongSet f = new LongOpenHashSet();

   private efv(dxp $$0, dxp $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   public static efv a(dxp $$0, dxp $$1) {
      return new efv($$0, $$1);
   }

   @Override
   public int a(aym $$0, dxs $$1) {
      int $$2 = this.d.a($$1);
      int $$3 = this.e.a($$1);
      if ($$2 > $$3) {
         if (this.f.add((long)$$2 << 32 | (long)$$3)) {
            b.warn("Empty height range: {}", this);
         }

         return $$2;
      } else {
         return ayf.b($$0, $$2, $$3);
      }
   }

   @Override
   public eft<?> a() {
      return eft.b;
   }

   @Override
   public String toString() {
      return "[" + this.d + "-" + this.e + "]";
   }
}
