import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public class era extends eqs {
   public static final MapCodec<era> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  are.a(Codec.string(0, 32)).optionalFieldOf("title").forGetter($$0x -> $$0x.c),
                  Codec.STRING.optionalFieldOf("author").forGetter($$0x -> $$0x.b),
                  axn.a(0, 3).optionalFieldOf("generation").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, era::new)
   );
   private final Optional<String> b;
   private final Optional<are<String>> c;
   private final Optional<Integer> d;

   public era(List<esn> $$0, Optional<are<String>> $$1, Optional<String> $$2, Optional<Integer> $$3) {
      super($$0);
      this.b = $$2;
      this.c = $$1;
      this.d = $$3;
   }

   @Override
   protected ctq a(ctq $$0, eph $$1) {
      $$0.a(kb.I, cwz.a, this::a);
      return $$0;
   }

   private cwz a(cwz $$0) {
      return new cwz(this.c.orElseGet($$0::d), this.b.orElseGet($$0::e), this.d.orElseGet($$0::f), $$0.a(), $$0.g());
   }

   @Override
   public equ b() {
      return eqv.J;
   }
}
