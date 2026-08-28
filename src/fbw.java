import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public class fbw extends fbg {
   public static final MapCodec<fbw> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  fbf.e.a(dcb.c, 256).optionalFieldOf("explosions").forGetter($$0x -> $$0x.c),
                  ayu.k.optionalFieldOf("flight_duration").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, fbw::new)
   );
   public static final dcc b = new dcc(0, List.of());
   private final Optional<fbf.e<dcb>> c;
   private final Optional<Integer> d;

   protected fbw(List<fdc> $$0, Optional<fbf.e<dcb>> $$1, Optional<Integer> $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   protected czn a(czn $$0, ezt $$1) {
      $$0.a(kk.aj, b, this::a);
      return $$0;
   }

   private dcc a(dcc $$0) {
      return new dcc(this.d.orElseGet($$0::a), this.c.<List<dcb>>map($$1 -> $$1.a($$0.b())).orElse($$0.b()));
   }

   @Override
   public fbi<fbw> b() {
      return fbj.K;
   }
}
