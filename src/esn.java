import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public class esn extends erw {
   public static final MapCodec<esn> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  erv.e.a(cxk.c, 256).optionalFieldOf("explosions").forGetter($$0x -> $$0x.c),
                  ayh.j.optionalFieldOf("flight_duration").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, esn::new)
   );
   public static final cxl b = new cxl(0, List.of());
   private final Optional<erv.e<cxk>> c;
   private final Optional<Integer> d;

   protected esn(List<etu> $$0, Optional<erv.e<cxk>> $$1, Optional<Integer> $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   protected cur a(cur $$0, eqk $$1) {
      $$0.a(km.U, b, this::a);
      return $$0;
   }

   private cxl a(cxl $$0) {
      return new cxl(this.d.orElseGet($$0::a), this.c.<List<cxk>>map($$1 -> $$1.a($$0.b())).orElse($$0.b()));
   }

   @Override
   public ery<esn> b() {
      return erz.K;
   }
}
