import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public class ery extends erp {
   public static final MapCodec<ery> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  ars.a(Codec.string(0, 32)).optionalFieldOf("title").forGetter($$0x -> $$0x.c),
                  Codec.STRING.optionalFieldOf("author").forGetter($$0x -> $$0x.b),
                  ayc.a(0, 3).optionalFieldOf("generation").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, ery::new)
   );
   private final Optional<String> b;
   private final Optional<ars<String>> c;
   private final Optional<Integer> d;

   public ery(List<etn> $$0, Optional<ars<String>> $$1, Optional<String> $$2, Optional<Integer> $$3) {
      super($$0);
      this.b = $$2;
      this.c = $$1;
      this.d = $$3;
   }

   @Override
   protected cuk a(cuk $$0, eqd $$1) {
      $$0.a(km.I, cxt.a, this::a);
      return $$0;
   }

   private cxt a(cxt $$0) {
      return new cxt(this.c.orElseGet($$0::d), this.b.orElseGet($$0::e), this.d.orElseGet($$0::f), $$0.a(), $$0.g());
   }

   @Override
   public err<ery> b() {
      return ers.M;
   }
}
