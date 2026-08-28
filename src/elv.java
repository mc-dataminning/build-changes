import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import org.slf4j.Logger;

public class elv extends els {
   public static final MapCodec<elv> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(edl.a.fieldOf("min_inclusive").forGetter($$0x -> $$0x.d), edl.a.fieldOf("max_inclusive").forGetter($$0x -> $$0x.e)).apply($$0, elv::new)
   );
   private static final Logger b = LogUtils.getLogger();
   private final edl d;
   private final edl e;
   private final LongSet f = new LongOpenHashSet();

   private elv(edl $$0, edl $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   public static elv a(edl $$0, edl $$1) {
      return new elv($$0, $$1);
   }

   @Override
   public int a(azh $$0, edo $$1) {
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
   public elt<?> a() {
      return elt.b;
   }

   @Override
   public String toString() {
      return "[" + this.d + "-" + this.e + "]";
   }
}
