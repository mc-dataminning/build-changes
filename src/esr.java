import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public class esr extends esj {
   public static final MapCodec<esr> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  ard.a(Codec.string(0, 32)).optionalFieldOf("title").forGetter($$0x -> $$0x.c),
                  Codec.STRING.optionalFieldOf("author").forGetter($$0x -> $$0x.b),
                  axo.a(0, 3).optionalFieldOf("generation").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, esr::new)
   );
   private final Optional<String> b;
   private final Optional<ard<String>> c;
   private final Optional<Integer> d;

   public esr(List<euh> $$0, Optional<ard<String>> $$1, Optional<String> $$2, Optional<Integer> $$3) {
      super($$0);
      this.b = $$2;
      this.c = $$1;
      this.d = $$3;
   }

   @Override
   protected cud a(cud $$0, eqw $$1) {
      $$0.a(kn.J, cxl.a, this::a);
      return $$0;
   }

   private cxl a(cxl $$0) {
      return new cxl(this.c.orElseGet($$0::d), this.b.orElseGet($$0::e), this.d.orElseGet($$0::f), $$0.a(), $$0.g());
   }

   @Override
   public esl<esr> b() {
      return esm.M;
   }
}
