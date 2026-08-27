import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import org.slf4j.Logger;

public class dtm extends dtj {
   public static final Codec<dtm> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dlg.a.fieldOf("min_inclusive").forGetter($$0x -> $$0x.d), dlg.a.fieldOf("max_inclusive").forGetter($$0x -> $$0x.e)).apply($$0, dtm::new)
   );
   private static final Logger b = LogUtils.getLogger();
   private final dlg d;
   private final dlg e;
   private final LongSet f = new LongOpenHashSet();

   private dtm(dlg $$0, dlg $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   public static dtm a(dlg $$0, dlg $$1) {
      return new dtm($$0, $$1);
   }

   @Override
   public int a(ash $$0, dlj $$1) {
      int $$2 = this.d.a($$1);
      int $$3 = this.e.a($$1);
      if ($$2 > $$3) {
         if (this.f.add((long)$$2 << 32 | (long)$$3)) {
            b.warn("Empty height range: {}", this);
         }

         return $$2;
      } else {
         return asb.b($$0, $$2, $$3);
      }
   }

   @Override
   public dtk<?> a() {
      return dtk.b;
   }

   @Override
   public String toString() {
      return "[" + this.d + "-" + this.e + "]";
   }
}
