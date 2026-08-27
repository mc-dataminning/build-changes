import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.slf4j.Logger;

public class dvs extends dvo {
   public static final Codec<dvs> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dnl.a.fieldOf("min_inclusive").forGetter($$0x -> $$0x.d),
               dnl.a.fieldOf("max_inclusive").forGetter($$0x -> $$0x.e),
               Codec.intRange(1, Integer.MAX_VALUE).optionalFieldOf("inner", 1).forGetter($$0x -> $$0x.f)
            )
            .apply($$0, dvs::new)
   );
   private static final Logger b = LogUtils.getLogger();
   private final dnl d;
   private final dnl e;
   private final int f;

   private dvs(dnl $$0, dnl $$1, int $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   public static dvs a(dnl $$0, dnl $$1, int $$2) {
      return new dvs($$0, $$1, $$2);
   }

   @Override
   public int a(ats $$0, dno $$1) {
      int $$2 = this.d.a($$1);
      int $$3 = this.e.a($$1);
      if ($$3 - $$2 - this.f + 1 <= 0) {
         b.warn("Empty height range: {}", this);
         return $$2;
      } else {
         int $$4 = atm.a($$0, $$2 + this.f, $$3);
         int $$5 = atm.a($$0, $$2, $$4 - 1);
         return atm.a($$0, $$2, $$5 - 1 + this.f);
      }
   }

   @Override
   public dvp<?> a() {
      return dvp.d;
   }

   @Override
   public String toString() {
      return "biased[" + this.d + "-" + this.e + " inner: " + this.f + "]";
   }
}
