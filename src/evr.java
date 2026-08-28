import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public class evr extends evj {
   public static final MapCodec<evr> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  ase.a(Codec.string(0, 32)).optionalFieldOf("title").forGetter($$0x -> $$0x.c),
                  Codec.STRING.optionalFieldOf("author").forGetter($$0x -> $$0x.b),
                  ays.a(0, 3).optionalFieldOf("generation").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, evr::new)
   );
   private final Optional<String> b;
   private final Optional<ase<String>> c;
   private final Optional<Integer> d;

   public evr(List<exh> $$0, Optional<ase<String>> $$1, Optional<String> $$2, Optional<Integer> $$3) {
      super($$0);
      this.b = $$2;
      this.c = $$1;
      this.d = $$3;
   }

   @Override
   protected cvx a(cvx $$0, etw $$1) {
      $$0.a(kt.S, czd.a, this::a);
      return $$0;
   }

   private czd a(czd $$0) {
      return new czd(this.c.orElseGet($$0::d), this.b.orElseGet($$0::e), this.d.orElseGet($$0::f), $$0.a(), $$0.g());
   }

   @Override
   public evl<evr> b() {
      return evm.M;
   }
}
