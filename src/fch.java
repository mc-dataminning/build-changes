import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class fch extends fbu {
   private static final Codec<fem> b = Codec.withAlternative(fen.a, ayw.i, fej::new);
   public static final MapCodec<fch> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  fbt.e.a(fen.a, Integer.MAX_VALUE).optionalFieldOf("floats").forGetter($$0x -> $$0x.c),
                  fbt.e.a(Codec.BOOL, Integer.MAX_VALUE).optionalFieldOf("flags").forGetter($$0x -> $$0x.d),
                  fbt.e.a(Codec.STRING, Integer.MAX_VALUE).optionalFieldOf("strings").forGetter($$0x -> $$0x.e),
                  fbt.e.a(b, Integer.MAX_VALUE).optionalFieldOf("colors").forGetter($$0x -> $$0x.f)
               )
            )
            .apply($$0, fch::new)
   );
   private final Optional<fbt.e<fem>> c;
   private final Optional<fbt.e<Boolean>> d;
   private final Optional<fbt.e<String>> e;
   private final Optional<fbt.e<fem>> f;

   public fch(List<fdq> $$0, Optional<fbt.e<fem>> $$1, Optional<fbt.e<Boolean>> $$2, Optional<fbt.e<String>> $$3, Optional<fbt.e<fem>> $$4) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
   }

   @Override
   public Set<baz<?>> a() {
      return Stream.concat(this.c.stream(), this.f.stream()).flatMap($$0 -> $$0.a().stream()).flatMap($$0 -> $$0.a().stream()).collect(Collectors.toSet());
   }

   @Override
   public fbw<fch> b() {
      return fbx.R;
   }

   private static <T> List<T> a(Optional<fbt.e<T>> $$0, List<T> $$1) {
      return $$0.<List<T>>map($$1x -> $$1x.a($$1)).orElse($$1);
   }

   private static <T, E> List<E> a(Optional<fbt.e<T>> $$0, List<E> $$1, Function<T, E> $$2) {
      return $$0.<List<E>>map($$2x -> {
         List<E> $$3 = $$2x.a().stream().map($$2).toList();
         return $$2x.b().a($$1, $$3);
      }).orElse($$1);
   }

   @Override
   public czy a(czy $$0, fah $$1) {
      dch $$2 = $$0.a(kk.p, dch.a);
      $$0.b(kk.p, new dch(a(this.c, $$2.a(), $$1x -> $$1x.b($$1)), a(this.d, $$2.b()), a(this.e, $$2.c()), a(this.f, $$2.d(), $$1x -> $$1x.a($$1))));
      return $$0;
   }
}
