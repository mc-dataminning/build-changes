import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eib implements ehn {
   public static final MapCodec<eib> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(jz.v(16).optionalFieldOf("offset", jz.i).forGetter($$0x -> $$0x.e), eah.a.fieldOf("state").forGetter($$0x -> $$0x.f))
            .apply($$0, eib::new)
   );
   private final jz e;
   private final eah f;

   protected eib(jz $$0, eah $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   public boolean a(djz $$0, iu $$1) {
      return this.f.a($$0, $$1.a(this.e));
   }

   @Override
   public eho<?> a() {
      return eho.g;
   }
}
