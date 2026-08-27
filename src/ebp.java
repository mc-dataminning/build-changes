import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.slf4j.Logger;

public class ebp extends ebl {
   public static final Codec<ebp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dti.a.fieldOf("min_inclusive").forGetter($$0x -> $$0x.d),
               dti.a.fieldOf("max_inclusive").forGetter($$0x -> $$0x.e),
               Codec.intRange(1, Integer.MAX_VALUE).optionalFieldOf("inner", 1).forGetter($$0x -> $$0x.f)
            )
            .apply($$0, ebp::new)
   );
   private static final Logger b = LogUtils.getLogger();
   private final dti d;
   private final dti e;
   private final int f;

   private ebp(dti $$0, dti $$1, int $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   public static ebp a(dti $$0, dti $$1, int $$2) {
      return new ebp($$0, $$1, $$2);
   }

   @Override
   public int a(axd $$0, dtl $$1) {
      int $$2 = this.d.a($$1);
      int $$3 = this.e.a($$1);
      if ($$3 - $$2 - this.f + 1 <= 0) {
         b.warn("Empty height range: {}", this);
         return $$2;
      } else {
         int $$4 = aww.a($$0, $$2 + this.f, $$3);
         int $$5 = aww.a($$0, $$2, $$4 - 1);
         return aww.a($$0, $$2, $$5 - 1 + this.f);
      }
   }

   @Override
   public ebm<?> a() {
      return ebm.d;
   }

   @Override
   public String toString() {
      return "biased[" + this.d + "-" + this.e + " inner: " + this.f + "]";
   }
}
