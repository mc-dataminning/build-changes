import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class efl implements eex {
   public static final MapCodec<efl> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(kl.v(16).optionalFieldOf("offset", kl.h).forGetter($$0x -> $$0x.e), dxv.a.fieldOf("state").forGetter($$0x -> $$0x.f))
            .apply($$0, efl::new)
   );
   private final kl e;
   private final dxv f;

   protected efl(kl $$0, dxv $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   public boolean a(dig $$0, jh $$1) {
      return this.f.a($$0, $$1.a(this.e));
   }

   @Override
   public eey<?> a() {
      return eey.g;
   }
}
