import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dly implements dlu {
   public static final Codec<dly> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ib.v(16).optionalFieldOf("offset", gw.b).forGetter($$0x -> $$0x.e)).apply($$0, dly::new)
   );
   private final ib e;

   public dly(ib $$0) {
      this.e = $$0;
   }

   public boolean a(cqk $$0, gw $$1) {
      return !$$0.r($$1.a(this.e));
   }

   @Override
   public dlv<?> a() {
      return dlv.h;
   }
}
