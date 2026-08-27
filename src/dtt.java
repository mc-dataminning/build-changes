import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.slf4j.Logger;

public class dtt extends dtp {
   public static final Codec<dtt> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dlm.a.fieldOf("min_inclusive").forGetter($$0x -> $$0x.d),
               dlm.a.fieldOf("max_inclusive").forGetter($$0x -> $$0x.e),
               Codec.intRange(1, Integer.MAX_VALUE).optionalFieldOf("inner", 1).forGetter($$0x -> $$0x.f)
            )
            .apply($$0, dtt::new)
   );
   private static final Logger b = LogUtils.getLogger();
   private final dlm d;
   private final dlm e;
   private final int f;

   private dtt(dlm $$0, dlm $$1, int $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   public static dtt a(dlm $$0, dlm $$1, int $$2) {
      return new dtt($$0, $$1, $$2);
   }

   @Override
   public int a(asc $$0, dlp $$1) {
      int $$2 = this.d.a($$1);
      int $$3 = this.e.a($$1);
      if ($$3 - $$2 - this.f + 1 <= 0) {
         b.warn("Empty height range: {}", this);
         return $$2;
      } else {
         int $$4 = arw.a($$0, $$2 + this.f, $$3);
         int $$5 = arw.a($$0, $$2, $$4 - 1);
         return arw.a($$0, $$2, $$5 - 1 + this.f);
      }
   }

   @Override
   public dtq<?> a() {
      return dtq.d;
   }

   @Override
   public String toString() {
      return "biased[" + this.d + "-" + this.e + " inner: " + this.f + "]";
   }
}
