import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public class exm extends exe {
   public static final MapCodec<exm> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  aru.a(Codec.string(0, 32)).optionalFieldOf("title").forGetter($$0x -> $$0x.c),
                  Codec.STRING.optionalFieldOf("author").forGetter($$0x -> $$0x.b),
                  ayi.a(0, 3).optionalFieldOf("generation").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, exm::new)
   );
   private final Optional<String> b;
   private final Optional<aru<String>> c;
   private final Optional<Integer> d;

   public exm(List<eza> $$0, Optional<aru<String>> $$1, Optional<String> $$2, Optional<Integer> $$3) {
      super($$0);
      this.b = $$2;
      this.c = $$1;
      this.d = $$3;
   }

   @Override
   protected cwp a(cwp $$0, evr $$1) {
      $$0.a(kv.T, czx.a, this::a);
      return $$0;
   }

   private czx a(czx $$0) {
      return new czx(this.c.orElseGet($$0::d), this.b.orElseGet($$0::e), this.d.orElseGet($$0::f), $$0.a(), $$0.g());
   }

   @Override
   public exg<exm> b() {
      return exh.M;
   }
}
