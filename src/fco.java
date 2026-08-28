import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public class fco extends fcg {
   public static final MapCodec<fco> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  ast.a(Codec.string(0, 32)).optionalFieldOf("title").forGetter($$0x -> $$0x.c),
                  Codec.STRING.optionalFieldOf("author").forGetter($$0x -> $$0x.b),
                  azg.a(0, 3).optionalFieldOf("generation").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, fco::new)
   );
   private final Optional<String> b;
   private final Optional<ast<String>> c;
   private final Optional<Integer> d;

   public fco(List<fec> $$0, Optional<ast<String>> $$1, Optional<String> $$2, Optional<Integer> $$3) {
      super($$0);
      this.b = $$2;
      this.c = $$1;
      this.d = $$3;
   }

   @Override
   protected dak a(dak $$0, fat $$1) {
      $$0.a(kl.V, ddu.a, this::a);
      return $$0;
   }

   private ddu a(ddu $$0) {
      return new ddu(this.c.orElseGet($$0::d), this.b.orElseGet($$0::e), this.d.orElseGet($$0::f), $$0.a(), $$0.g());
   }

   @Override
   public fci<fco> b() {
      return fcj.M;
   }
}
