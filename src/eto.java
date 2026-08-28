import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public class eto extends esy {
   public static final MapCodec<eto> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  esx.e.a(cxj.c, 256).optionalFieldOf("explosions").forGetter($$0x -> $$0x.c),
                  axv.j.optionalFieldOf("flight_duration").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, eto::new)
   );
   public static final cxk b = new cxk(0, List.of());
   private final Optional<esx.e<cxj>> c;
   private final Optional<Integer> d;

   protected eto(List<euw> $$0, Optional<esx.e<cxj>> $$1, Optional<Integer> $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   protected cuo a(cuo $$0, erl $$1) {
      $$0.a(kq.V, b, this::a);
      return $$0;
   }

   private cxk a(cxk $$0) {
      return new cxk(this.d.orElseGet($$0::a), this.c.<List<cxj>>map($$1 -> $$1.a($$0.b())).orElse($$0.b()));
   }

   @Override
   public eta<eto> b() {
      return etb.K;
   }
}
