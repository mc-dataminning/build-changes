import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.slf4j.Logger;

public class dxk extends dxg {
   public static final Codec<dxk> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dpd.a.fieldOf("min_inclusive").forGetter($$0x -> $$0x.d),
               dpd.a.fieldOf("max_inclusive").forGetter($$0x -> $$0x.e),
               Codec.intRange(1, Integer.MAX_VALUE).optionalFieldOf("inner", 1).forGetter($$0x -> $$0x.f)
            )
            .apply($$0, dxk::new)
   );
   private static final Logger b = LogUtils.getLogger();
   private final dpd d;
   private final dpd e;
   private final int f;

   private dxk(dpd $$0, dpd $$1, int $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   public static dxk a(dpd $$0, dpd $$1, int $$2) {
      return new dxk($$0, $$1, $$2);
   }

   @Override
   public int a(aup $$0, dpg $$1) {
      int $$2 = this.d.a($$1);
      int $$3 = this.e.a($$1);
      if ($$3 - $$2 - this.f + 1 <= 0) {
         b.warn("Empty height range: {}", this);
         return $$2;
      } else {
         int $$4 = aui.a($$0, $$2 + this.f, $$3);
         int $$5 = aui.a($$0, $$2, $$4 - 1);
         return aui.a($$0, $$2, $$5 - 1 + this.f);
      }
   }

   @Override
   public dxh<?> a() {
      return dxh.d;
   }

   @Override
   public String toString() {
      return "biased[" + this.d + "-" + this.e + " inner: " + this.f + "]";
   }
}
