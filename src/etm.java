import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public class etm extends ete {
   public static final MapCodec<etm> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  arl.a(Codec.string(0, 32)).optionalFieldOf("title").forGetter($$0x -> $$0x.c),
                  Codec.STRING.optionalFieldOf("author").forGetter($$0x -> $$0x.b),
                  axw.a(0, 3).optionalFieldOf("generation").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, etm::new)
   );
   private final Optional<String> b;
   private final Optional<arl<String>> c;
   private final Optional<Integer> d;

   public etm(List<evc> $$0, Optional<arl<String>> $$1, Optional<String> $$2, Optional<Integer> $$3) {
      super($$0);
      this.b = $$2;
      this.c = $$1;
      this.d = $$3;
   }

   @Override
   protected cuq a(cuq $$0, err $$1) {
      $$0.a(kq.J, cyb.a, this::a);
      return $$0;
   }

   private cyb a(cyb $$0) {
      return new cyb(this.c.orElseGet($$0::d), this.b.orElseGet($$0::e), this.d.orElseGet($$0::f), $$0.a(), $$0.g());
   }

   @Override
   public etg<etm> b() {
      return eth.M;
   }
}
