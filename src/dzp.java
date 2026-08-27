import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.slf4j.Logger;

public class dzp extends dzl {
   public static final Codec<dzp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dri.a.fieldOf("min_inclusive").forGetter($$0x -> $$0x.d),
               dri.a.fieldOf("max_inclusive").forGetter($$0x -> $$0x.e),
               Codec.intRange(1, Integer.MAX_VALUE).optionalFieldOf("inner", 1).forGetter($$0x -> $$0x.f)
            )
            .apply($$0, dzp::new)
   );
   private static final Logger b = LogUtils.getLogger();
   private final dri d;
   private final dri e;
   private final int f;

   private dzp(dri $$0, dri $$1, int $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   public static dzp a(dri $$0, dri $$1, int $$2) {
      return new dzp($$0, $$1, $$2);
   }

   @Override
   public int a(awo $$0, drl $$1) {
      int $$2 = this.d.a($$1);
      int $$3 = this.e.a($$1);
      if ($$3 - $$2 - this.f + 1 <= 0) {
         b.warn("Empty height range: {}", this);
         return $$2;
      } else {
         int $$4 = awh.a($$0, $$2 + this.f, $$3);
         int $$5 = awh.a($$0, $$2, $$4 - 1);
         return awh.a($$0, $$2, $$5 - 1 + this.f);
      }
   }

   @Override
   public dzm<?> a() {
      return dzm.d;
   }

   @Override
   public String toString() {
      return "biased[" + this.d + "-" + this.e + " inner: " + this.f + "]";
   }
}
