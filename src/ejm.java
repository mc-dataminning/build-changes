import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import org.slf4j.Logger;

public class ejm extends ejj {
   public static final MapCodec<ejm> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ebe.a.fieldOf("min_inclusive").forGetter($$0x -> $$0x.d), ebe.a.fieldOf("max_inclusive").forGetter($$0x -> $$0x.e)).apply($$0, ejm::new)
   );
   private static final Logger b = LogUtils.getLogger();
   private final ebe d;
   private final ebe e;
   private final LongSet f = new LongOpenHashSet();

   private ejm(ebe $$0, ebe $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   public static ejm a(ebe $$0, ebe $$1) {
      return new ejm($$0, $$1);
   }

   @Override
   public int a(azl $$0, ebh $$1) {
      int $$2 = this.d.a($$1);
      int $$3 = this.e.a($$1);
      if ($$2 > $$3) {
         if (this.f.add((long)$$2 << 32 | (long)$$3)) {
            b.warn("Empty height range: {}", this);
         }

         return $$2;
      } else {
         return azd.b($$0, $$2, $$3);
      }
   }

   @Override
   public ejk<?> a() {
      return ejk.b;
   }

   @Override
   public String toString() {
      return "[" + this.d + "-" + this.e + "]";
   }
}
