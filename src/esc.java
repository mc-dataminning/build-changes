import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public class esc extends ert {
   public static final MapCodec<esc> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  arv.a(Codec.string(0, 32)).optionalFieldOf("title").forGetter($$0x -> $$0x.c),
                  Codec.STRING.optionalFieldOf("author").forGetter($$0x -> $$0x.b),
                  ayg.a(0, 3).optionalFieldOf("generation").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, esc::new)
   );
   private final Optional<String> b;
   private final Optional<arv<String>> c;
   private final Optional<Integer> d;

   public esc(List<etr> $$0, Optional<arv<String>> $$1, Optional<String> $$2, Optional<Integer> $$3) {
      super($$0);
      this.b = $$2;
      this.c = $$1;
      this.d = $$3;
   }

   @Override
   protected cuo a(cuo $$0, eqh $$1) {
      $$0.a(km.J, cxx.a, this::a);
      return $$0;
   }

   private cxx a(cxx $$0) {
      return new cxx(this.c.orElseGet($$0::d), this.b.orElseGet($$0::e), this.d.orElseGet($$0::f), $$0.a(), $$0.g());
   }

   @Override
   public erv<esc> b() {
      return erw.M;
   }
}
