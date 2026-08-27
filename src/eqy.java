import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public class eqy extends eqq {
   public static final MapCodec<eqy> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  ard.a(Codec.string(0, 32)).optionalFieldOf("title").forGetter($$0x -> $$0x.c),
                  Codec.STRING.optionalFieldOf("author").forGetter($$0x -> $$0x.b),
                  axm.a(0, 3).optionalFieldOf("generation").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, eqy::new)
   );
   private final Optional<String> b;
   private final Optional<ard<String>> c;
   private final Optional<Integer> d;

   public eqy(List<esl> $$0, Optional<ard<String>> $$1, Optional<String> $$2, Optional<Integer> $$3) {
      super($$0);
      this.b = $$2;
      this.c = $$1;
      this.d = $$3;
   }

   @Override
   protected cto a(cto $$0, epf $$1) {
      $$0.a(kb.I, cwx.a, this::a);
      return $$0;
   }

   private cwx a(cwx $$0) {
      return new cwx(this.c.orElseGet($$0::d), this.b.orElseGet($$0::e), this.d.orElseGet($$0::f), $$0.a(), $$0.g());
   }

   @Override
   public eqs b() {
      return eqt.J;
   }
}
