import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public class etu extends ete {
   public static final MapCodec<etu> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  etd.e.a(cxl.c, 256).optionalFieldOf("explosions").forGetter($$0x -> $$0x.c),
                  axw.j.optionalFieldOf("flight_duration").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, etu::new)
   );
   public static final cxm b = new cxm(0, List.of());
   private final Optional<etd.e<cxl>> c;
   private final Optional<Integer> d;

   protected etu(List<evc> $$0, Optional<etd.e<cxl>> $$1, Optional<Integer> $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   protected cuq a(cuq $$0, err $$1) {
      $$0.a(kq.V, b, this::a);
      return $$0;
   }

   private cxm a(cxm $$0) {
      return new cxm(this.d.orElseGet($$0::a), this.c.<List<cxl>>map($$1 -> $$1.a($$0.b())).orElse($$0.b()));
   }

   @Override
   public etg<etu> b() {
      return eth.K;
   }
}
