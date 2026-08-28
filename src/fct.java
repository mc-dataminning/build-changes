import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class fct extends fcg {
   private static final Codec<fey> b = Codec.withAlternative(fez.a, azg.i, fev::new);
   public static final MapCodec<fct> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  fcf.e.a(fez.a, Integer.MAX_VALUE).optionalFieldOf("floats").forGetter($$0x -> $$0x.c),
                  fcf.e.a(Codec.BOOL, Integer.MAX_VALUE).optionalFieldOf("flags").forGetter($$0x -> $$0x.d),
                  fcf.e.a(Codec.STRING, Integer.MAX_VALUE).optionalFieldOf("strings").forGetter($$0x -> $$0x.e),
                  fcf.e.a(b, Integer.MAX_VALUE).optionalFieldOf("colors").forGetter($$0x -> $$0x.f)
               )
            )
            .apply($$0, fct::new)
   );
   private final Optional<fcf.e<fey>> c;
   private final Optional<fcf.e<Boolean>> d;
   private final Optional<fcf.e<String>> e;
   private final Optional<fcf.e<fey>> f;

   public fct(List<fec> $$0, Optional<fcf.e<fey>> $$1, Optional<fcf.e<Boolean>> $$2, Optional<fcf.e<String>> $$3, Optional<fcf.e<fey>> $$4) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
   }

   @Override
   public Set<bbk<?>> a() {
      return Stream.concat(this.c.stream(), this.f.stream()).flatMap($$0 -> $$0.a().stream()).flatMap($$0 -> $$0.a().stream()).collect(Collectors.toSet());
   }

   @Override
   public fci<fct> b() {
      return fcj.R;
   }

   private static <T> List<T> a(Optional<fcf.e<T>> $$0, List<T> $$1) {
      return $$0.<List<T>>map($$1x -> $$1x.a($$1)).orElse($$1);
   }

   private static <T, E> List<E> a(Optional<fcf.e<T>> $$0, List<E> $$1, Function<T, E> $$2) {
      return $$0.<List<E>>map($$2x -> {
         List<E> $$3 = $$2x.a().stream().map($$2).toList();
         return $$2x.b().a($$1, $$3);
      }).orElse($$1);
   }

   @Override
   public dak a(dak $$0, fat $$1) {
      dct $$2 = $$0.a(kl.p, dct.a);
      $$0.b(kl.p, new dct(a(this.c, $$2.a(), $$1x -> $$1x.b($$1)), a(this.d, $$2.b()), a(this.e, $$2.c()), a(this.f, $$2.d(), $$1x -> $$1x.a($$1))));
      return $$0;
   }
}
