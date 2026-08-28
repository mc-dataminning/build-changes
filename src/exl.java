import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public class exl extends exd {
   public static final MapCodec<exl> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  arv.a(Codec.string(0, 32)).optionalFieldOf("title").forGetter($$0x -> $$0x.c),
                  Codec.STRING.optionalFieldOf("author").forGetter($$0x -> $$0x.b),
                  ayi.a(0, 3).optionalFieldOf("generation").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, exl::new)
   );
   private final Optional<String> b;
   private final Optional<arv<String>> c;
   private final Optional<Integer> d;

   public exl(List<eyz> $$0, Optional<arv<String>> $$1, Optional<String> $$2, Optional<Integer> $$3) {
      super($$0);
      this.b = $$2;
      this.c = $$1;
      this.d = $$3;
   }

   @Override
   protected cwo a(cwo $$0, evq $$1) {
      $$0.a(kv.T, czw.a, this::a);
      return $$0;
   }

   private czw a(czw $$0) {
      return new czw(this.c.orElseGet($$0::d), this.b.orElseGet($$0::e), this.d.orElseGet($$0::f), $$0.a(), $$0.g());
   }

   @Override
   public exf<exl> b() {
      return exg.M;
   }
}
