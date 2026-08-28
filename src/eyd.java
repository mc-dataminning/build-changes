import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public class eyd extends exv {
   public static final MapCodec<eyd> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  asp.a(Codec.string(0, 32)).optionalFieldOf("title").forGetter($$0x -> $$0x.c),
                  Codec.STRING.optionalFieldOf("author").forGetter($$0x -> $$0x.b),
                  azd.a(0, 3).optionalFieldOf("generation").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, eyd::new)
   );
   private final Optional<String> b;
   private final Optional<asp<String>> c;
   private final Optional<Integer> d;

   public eyd(List<ezr> $$0, Optional<asp<String>> $$1, Optional<String> $$2, Optional<Integer> $$3) {
      super($$0);
      this.b = $$2;
      this.c = $$1;
      this.d = $$3;
   }

   @Override
   protected cxg a(cxg $$0, ewi $$1) {
      $$0.a(ku.T, dao.a, this::a);
      return $$0;
   }

   private dao a(dao $$0) {
      return new dao(this.c.orElseGet($$0::d), this.b.orElseGet($$0::e), this.d.orElseGet($$0::f), $$0.a(), $$0.g());
   }

   @Override
   public exx<eyd> b() {
      return exy.M;
   }
}
