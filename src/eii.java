import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eii implements ehu {
   public static final MapCodec<eii> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ka.v(16).optionalFieldOf("offset", ka.i).forGetter($$0x -> $$0x.e), eao.a.fieldOf("state").forGetter($$0x -> $$0x.f))
            .apply($$0, eii::new)
   );
   private final ka e;
   private final eao f;

   protected eii(ka $$0, eao $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   public boolean a(dkg $$0, iv $$1) {
      return this.f.a($$0, $$1.a(this.e));
   }

   @Override
   public ehv<?> a() {
      return ehv.g;
   }
}
