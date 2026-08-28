import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public class exn extends exf {
   public static final MapCodec<exn> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  arv.a(Codec.string(0, 32)).optionalFieldOf("title").forGetter($$0x -> $$0x.c),
                  Codec.STRING.optionalFieldOf("author").forGetter($$0x -> $$0x.b),
                  ayi.a(0, 3).optionalFieldOf("generation").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, exn::new)
   );
   private final Optional<String> b;
   private final Optional<arv<String>> c;
   private final Optional<Integer> d;

   public exn(List<ezb> $$0, Optional<arv<String>> $$1, Optional<String> $$2, Optional<Integer> $$3) {
      super($$0);
      this.b = $$2;
      this.c = $$1;
      this.d = $$3;
   }

   @Override
   protected cwq a(cwq $$0, evs $$1) {
      $$0.a(kv.T, czy.a, this::a);
      return $$0;
   }

   private czy a(czy $$0) {
      return new czy(this.c.orElseGet($$0::d), this.b.orElseGet($$0::e), this.d.orElseGet($$0::f), $$0.a(), $$0.g());
   }

   @Override
   public exh<exn> b() {
      return exi.M;
   }
}
