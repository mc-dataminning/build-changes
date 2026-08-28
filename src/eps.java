import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import org.slf4j.Logger;

public class eps extends epp {
   public static final MapCodec<eps> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ehh.a.fieldOf("min_inclusive").forGetter($$0x -> $$0x.d), ehh.a.fieldOf("max_inclusive").forGetter($$0x -> $$0x.e)).apply($$0, eps::new)
   );
   private static final Logger b = LogUtils.getLogger();
   private final ehh d;
   private final ehh e;
   private final LongSet f = new LongOpenHashSet();

   private eps(ehh $$0, ehh $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   public static eps a(ehh $$0, ehh $$1) {
      return new eps($$0, $$1);
   }

   @Override
   public int a(azv $$0, ehk $$1) {
      int $$2 = this.d.a($$1);
      int $$3 = this.e.a($$1);
      if ($$2 > $$3) {
         if (this.f.add((long)$$2 << 32 | (long)$$3)) {
            b.warn("Empty height range: {}", this);
         }

         return $$2;
      } else {
         return azm.b($$0, $$2, $$3);
      }
   }

   @Override
   public epq<?> a() {
      return epq.b;
   }

   @Override
   public String toString() {
      return "[" + this.d + "-" + this.e + "]";
   }
}
