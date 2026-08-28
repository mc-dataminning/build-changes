import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public class esf extends erw {
   public static final MapCodec<esf> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  arw.a(Codec.string(0, 32)).optionalFieldOf("title").forGetter($$0x -> $$0x.c),
                  Codec.STRING.optionalFieldOf("author").forGetter($$0x -> $$0x.b),
                  ayh.a(0, 3).optionalFieldOf("generation").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, esf::new)
   );
   private final Optional<String> b;
   private final Optional<arw<String>> c;
   private final Optional<Integer> d;

   public esf(List<etu> $$0, Optional<arw<String>> $$1, Optional<String> $$2, Optional<Integer> $$3) {
      super($$0);
      this.b = $$2;
      this.c = $$1;
      this.d = $$3;
   }

   @Override
   protected cur a(cur $$0, eqk $$1) {
      $$0.a(km.J, cya.a, this::a);
      return $$0;
   }

   private cya a(cya $$0) {
      return new cya(this.c.orElseGet($$0::d), this.b.orElseGet($$0::e), this.d.orElseGet($$0::f), $$0.a(), $$0.g());
   }

   @Override
   public ery<esf> b() {
      return erz.M;
   }
}
