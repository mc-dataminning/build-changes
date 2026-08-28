import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public class fai extends faa {
   public static final MapCodec<fai> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  asg.a(Codec.string(0, 32)).optionalFieldOf("title").forGetter($$0x -> $$0x.c),
                  Codec.STRING.optionalFieldOf("author").forGetter($$0x -> $$0x.b),
                  ays.a(0, 3).optionalFieldOf("generation").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, fai::new)
   );
   private final Optional<String> b;
   private final Optional<asg<String>> c;
   private final Optional<Integer> d;

   public fai(List<fbw> $$0, Optional<asg<String>> $$1, Optional<String> $$2, Optional<Integer> $$3) {
      super($$0);
      this.b = $$2;
      this.c = $$1;
      this.d = $$3;
   }

   @Override
   protected cys a(cys $$0, eyn $$1) {
      $$0.a(kj.V, dcc.a, this::a);
      return $$0;
   }

   private dcc a(dcc $$0) {
      return new dcc(this.c.orElseGet($$0::d), this.b.orElseGet($$0::e), this.d.orElseGet($$0::f), $$0.a(), $$0.g());
   }

   @Override
   public fac<fai> b() {
      return fad.M;
   }
}
