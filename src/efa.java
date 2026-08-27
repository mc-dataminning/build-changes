import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.slf4j.Logger;

public class efa extends eew {
   public static final Codec<efa> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dwt.a.fieldOf("min_inclusive").forGetter($$0x -> $$0x.d),
               dwt.a.fieldOf("max_inclusive").forGetter($$0x -> $$0x.e),
               Codec.intRange(1, Integer.MAX_VALUE).optionalFieldOf("inner", 1).forGetter($$0x -> $$0x.f)
            )
            .apply($$0, efa::new)
   );
   private static final Logger b = LogUtils.getLogger();
   private final dwt d;
   private final dwt e;
   private final int f;

   private efa(dwt $$0, dwt $$1, int $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   public static efa a(dwt $$0, dwt $$1, int $$2) {
      return new efa($$0, $$1, $$2);
   }

   @Override
   public int a(ayg $$0, dww $$1) {
      int $$2 = this.d.a($$1);
      int $$3 = this.e.a($$1);
      if ($$3 - $$2 - this.f + 1 <= 0) {
         b.warn("Empty height range: {}", this);
         return $$2;
      } else {
         int $$4 = axz.a($$0, $$2 + this.f, $$3);
         int $$5 = axz.a($$0, $$2, $$4 - 1);
         return axz.a($$0, $$2, $$5 - 1 + this.f);
      }
   }

   @Override
   public eex<?> a() {
      return eex.d;
   }

   @Override
   public String toString() {
      return "biased[" + this.d + "-" + this.e + " inner: " + this.f + "]";
   }
}
