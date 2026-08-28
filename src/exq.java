import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class exq extends exd {
   private static final Codec<ezv> b = Codec.withAlternative(ezw.a, ayi.i, ezs::new);
   public static final MapCodec<exq> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  exc.e.a(ezw.a, Integer.MAX_VALUE).optionalFieldOf("floats").forGetter($$0x -> $$0x.c),
                  exc.e.a(Codec.BOOL, Integer.MAX_VALUE).optionalFieldOf("flags").forGetter($$0x -> $$0x.d),
                  exc.e.a(Codec.STRING, Integer.MAX_VALUE).optionalFieldOf("strings").forGetter($$0x -> $$0x.e),
                  exc.e.a(b, Integer.MAX_VALUE).optionalFieldOf("colors").forGetter($$0x -> $$0x.f)
               )
            )
            .apply($$0, exq::new)
   );
   private final Optional<exc.e<ezv>> c;
   private final Optional<exc.e<Boolean>> d;
   private final Optional<exc.e<String>> e;
   private final Optional<exc.e<ezv>> f;

   public exq(List<eyz> $$0, Optional<exc.e<ezv>> $$1, Optional<exc.e<Boolean>> $$2, Optional<exc.e<String>> $$3, Optional<exc.e<ezv>> $$4) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
   }

   @Override
   public Set<bai<?>> a() {
      return Stream.concat(this.c.stream(), this.f.stream()).flatMap($$0 -> $$0.a().stream()).flatMap($$0 -> $$0.a().stream()).collect(Collectors.toSet());
   }

   @Override
   public exf<exq> b() {
      return exg.R;
   }

   private static <T> List<T> a(Optional<exc.e<T>> $$0, List<T> $$1) {
      return $$0.<List<T>>map($$1x -> $$1x.a($$1)).orElse($$1);
   }

   private static <T, E> List<E> a(Optional<exc.e<T>> $$0, List<E> $$1, Function<T, E> $$2) {
      return $$0.<List<E>>map($$2x -> {
         List<E> $$3 = $$2x.a().stream().map($$2).toList();
         return $$2x.b().a($$1, $$3);
      }).orElse($$1);
   }

   @Override
   public cwo a(cwo $$0, evq $$1) {
      cyy $$2 = $$0.a(kv.p, cyy.a);
      $$0.b(kv.p, new cyy(a(this.c, $$2.a(), $$1x -> $$1x.b($$1)), a(this.d, $$2.b()), a(this.e, $$2.c()), a(this.f, $$2.d(), $$1x -> $$1x.a($$1))));
      return $$0;
   }
}
