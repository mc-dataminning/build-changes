import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public class fck extends fbu {
   public static final MapCodec<fck> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  fbt.e.a(dcm.c, 256).optionalFieldOf("explosions").forGetter($$0x -> $$0x.c),
                  ayw.k.optionalFieldOf("flight_duration").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, fck::new)
   );
   public static final dcn b = new dcn(0, List.of());
   private final Optional<fbt.e<dcm>> c;
   private final Optional<Integer> d;

   protected fck(List<fdq> $$0, Optional<fbt.e<dcm>> $$1, Optional<Integer> $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   protected czy a(czy $$0, fah $$1) {
      $$0.a(kk.aj, b, this::a);
      return $$0;
   }

   private dcn a(dcn $$0) {
      return new dcn(this.d.orElseGet($$0::a), this.c.<List<dcm>>map($$1 -> $$1.a($$0.b())).orElse($$0.b()));
   }

   @Override
   public fbw<fck> b() {
      return fbx.K;
   }
}
