import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public class esm extends erv {
   public static final MapCodec<esm> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  eru.e.a(cxj.c, 256).optionalFieldOf("explosions").forGetter($$0x -> $$0x.c),
                  ayh.j.optionalFieldOf("flight_duration").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, esm::new)
   );
   public static final cxk b = new cxk(0, List.of());
   private final Optional<eru.e<cxj>> c;
   private final Optional<Integer> d;

   protected esm(List<ett> $$0, Optional<eru.e<cxj>> $$1, Optional<Integer> $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   protected cuq a(cuq $$0, eqj $$1) {
      $$0.a(km.U, b, this::a);
      return $$0;
   }

   private cxk a(cxk $$0) {
      return new cxk(this.d.orElseGet($$0::a), this.c.<List<cxj>>map($$1 -> $$1.a($$0.b())).orElse($$0.b()));
   }

   @Override
   public erx<esm> b() {
      return ery.K;
   }
}
