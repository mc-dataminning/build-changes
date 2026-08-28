import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public class esg extends erp {
   public static final MapCodec<esg> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  cxd.c.sizeLimitedListOf(256).optionalFieldOf("explosions", List.of()).forGetter($$0x -> $$0x.c),
                  ero.a(256).forGetter($$0x -> $$0x.d),
                  ayc.j.optionalFieldOf("flight_duration").forGetter($$0x -> $$0x.e)
               )
            )
            .apply($$0, esg::new)
   );
   public static final cxe b = new cxe(0, List.of());
   private final List<cxd> c;
   private final ero d;
   private final Optional<Integer> e;

   protected esg(List<etn> $$0, List<cxd> $$1, ero $$2, Optional<Integer> $$3) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   @Override
   protected cuk a(cuk $$0, eqd $$1) {
      $$0.a(km.T, b, this::a);
      return $$0;
   }

   private cxe a(cxe $$0) {
      List<cxd> $$1 = this.d.a($$0.b(), this.c, 256);
      return new cxe(this.e.orElseGet($$0::a), $$1);
   }

   @Override
   public err<esg> b() {
      return ers.K;
   }
}
