import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public class evg extends euy {
   public static final MapCodec<evg> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  asa.a(Codec.string(0, 32)).optionalFieldOf("title").forGetter($$0x -> $$0x.c),
                  Codec.STRING.optionalFieldOf("author").forGetter($$0x -> $$0x.b),
                  ayo.a(0, 3).optionalFieldOf("generation").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, evg::new)
   );
   private final Optional<String> b;
   private final Optional<asa<String>> c;
   private final Optional<Integer> d;

   public evg(List<eww> $$0, Optional<asa<String>> $$1, Optional<String> $$2, Optional<Integer> $$3) {
      super($$0);
      this.b = $$2;
      this.c = $$1;
      this.d = $$3;
   }

   @Override
   protected cvs a(cvs $$0, etl $$1) {
      $$0.a(ks.O, cze.a, this::a);
      return $$0;
   }

   private cze a(cze $$0) {
      return new cze(this.c.orElseGet($$0::d), this.b.orElseGet($$0::e), this.d.orElseGet($$0::f), $$0.a(), $$0.g());
   }

   @Override
   public eva<evg> b() {
      return evb.M;
   }
}
