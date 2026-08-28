import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public class fbc extends fam {
   public static final MapCodec<fbc> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  fal.e.a(dbm.c, 256).optionalFieldOf("explosions").forGetter($$0x -> $$0x.c),
                  ayu.k.optionalFieldOf("flight_duration").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, fbc::new)
   );
   public static final dbn b = new dbn(0, List.of());
   private final Optional<fal.e<dbm>> c;
   private final Optional<Integer> d;

   protected fbc(List<fci> $$0, Optional<fal.e<dbm>> $$1, Optional<Integer> $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   protected cyy a(cyy $$0, eyz $$1) {
      $$0.a(kj.aj, b, this::a);
      return $$0;
   }

   private dbn a(dbn $$0) {
      return new dbn(this.d.orElseGet($$0::a), this.c.<List<dbm>>map($$1 -> $$1.a($$0.b())).orElse($$0.b()));
   }

   @Override
   public fao<fbc> b() {
      return fap.K;
   }
}
