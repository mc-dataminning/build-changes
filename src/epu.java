import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class epu extends eqh {
   public static final MapCodec<epu> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ehn.b.fieldOf("predicate").forGetter($$0x -> $$0x.c)).apply($$0, epu::new)
   );
   private final ehn c;

   private epu(ehn $$0) {
      this.c = $$0;
   }

   public static epu a(ehn $$0) {
      return new epu($$0);
   }

   @Override
   protected boolean a(eqg $$0, azv $$1, iu $$2) {
      return this.c.test($$0.d(), $$2);
   }

   @Override
   public eqj<?> b() {
      return eqj.a;
   }
}
