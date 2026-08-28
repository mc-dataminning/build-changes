import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ewu extends ewa {
   public static final MapCodec<ewu> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(alg.a(ma.K).fieldOf("item").forGetter($$0x -> $$0x.b)).apply($$0, ewu::new)
   );
   private final jq<cwi> b;

   private ewu(List<exy> $$0, jq<cwi> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public ewc<ewu> b() {
      return ewd.f;
   }

   @Override
   public cwm a(cwm $$0, eun $$1) {
      return $$0.a(this.b.a());
   }
}
