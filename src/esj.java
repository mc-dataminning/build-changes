import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public class esj extends esb {
   public static final MapCodec<esj> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  arb.a(Codec.string(0, 32)).optionalFieldOf("title").forGetter($$0x -> $$0x.c),
                  Codec.STRING.optionalFieldOf("author").forGetter($$0x -> $$0x.b),
                  axm.a(0, 3).optionalFieldOf("generation").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, esj::new)
   );
   private final Optional<String> b;
   private final Optional<arb<String>> c;
   private final Optional<Integer> d;

   public esj(List<etz> $$0, Optional<arb<String>> $$1, Optional<String> $$2, Optional<Integer> $$3) {
      super($$0);
      this.b = $$2;
      this.c = $$1;
      this.d = $$3;
   }

   @Override
   protected cua a(cua $$0, eqo $$1) {
      $$0.a(kn.J, cxi.a, this::a);
      return $$0;
   }

   private cxi a(cxi $$0) {
      return new cxi(this.c.orElseGet($$0::d), this.b.orElseGet($$0::e), this.d.orElseGet($$0::f), $$0.a(), $$0.g());
   }

   @Override
   public esd<esj> b() {
      return ese.M;
   }
}
