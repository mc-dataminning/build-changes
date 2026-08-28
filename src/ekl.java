import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import org.slf4j.Logger;

public class ekl extends eki {
   public static final MapCodec<ekl> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ecd.a.fieldOf("min_inclusive").forGetter($$0x -> $$0x.d), ecd.a.fieldOf("max_inclusive").forGetter($$0x -> $$0x.e)).apply($$0, ekl::new)
   );
   private static final Logger b = LogUtils.getLogger();
   private final ecd d;
   private final ecd e;
   private final LongSet f = new LongOpenHashSet();

   private ekl(ecd $$0, ecd $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   public static ekl a(ecd $$0, ecd $$1) {
      return new ekl($$0, $$1);
   }

   @Override
   public int a(azv $$0, ecg $$1) {
      int $$2 = this.d.a($$1);
      int $$3 = this.e.a($$1);
      if ($$2 > $$3) {
         if (this.f.add((long)$$2 << 32 | (long)$$3)) {
            b.warn("Empty height range: {}", this);
         }

         return $$2;
      } else {
         return azn.b($$0, $$2, $$3);
      }
   }

   @Override
   public ekj<?> a() {
      return ekj.b;
   }

   @Override
   public String toString() {
      return "[" + this.d + "-" + this.e + "]";
   }
}
