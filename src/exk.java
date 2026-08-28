import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public class exk extends exc {
   public static final MapCodec<exk> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  aru.a(Codec.string(0, 32)).optionalFieldOf("title").forGetter($$0x -> $$0x.c),
                  Codec.STRING.optionalFieldOf("author").forGetter($$0x -> $$0x.b),
                  ayh.a(0, 3).optionalFieldOf("generation").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, exk::new)
   );
   private final Optional<String> b;
   private final Optional<aru<String>> c;
   private final Optional<Integer> d;

   public exk(List<eyy> $$0, Optional<aru<String>> $$1, Optional<String> $$2, Optional<Integer> $$3) {
      super($$0);
      this.b = $$2;
      this.c = $$1;
      this.d = $$3;
   }

   @Override
   protected cwn a(cwn $$0, evp $$1) {
      $$0.a(kv.T, czv.a, this::a);
      return $$0;
   }

   private czv a(czv $$0) {
      return new czv(this.c.orElseGet($$0::d), this.b.orElseGet($$0::e), this.d.orElseGet($$0::f), $$0.a(), $$0.g());
   }

   @Override
   public exe<exk> b() {
      return exf.M;
   }
}
