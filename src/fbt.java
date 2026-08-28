import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class fbt extends fbg {
   private static final Codec<fdy> b = Codec.withAlternative(fdz.a, ayu.i, fdv::new);
   public static final MapCodec<fbt> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  fbf.e.a(fdz.a, Integer.MAX_VALUE).optionalFieldOf("floats").forGetter($$0x -> $$0x.c),
                  fbf.e.a(Codec.BOOL, Integer.MAX_VALUE).optionalFieldOf("flags").forGetter($$0x -> $$0x.d),
                  fbf.e.a(Codec.STRING, Integer.MAX_VALUE).optionalFieldOf("strings").forGetter($$0x -> $$0x.e),
                  fbf.e.a(b, Integer.MAX_VALUE).optionalFieldOf("colors").forGetter($$0x -> $$0x.f)
               )
            )
            .apply($$0, fbt::new)
   );
   private final Optional<fbf.e<fdy>> c;
   private final Optional<fbf.e<Boolean>> d;
   private final Optional<fbf.e<String>> e;
   private final Optional<fbf.e<fdy>> f;

   public fbt(List<fdc> $$0, Optional<fbf.e<fdy>> $$1, Optional<fbf.e<Boolean>> $$2, Optional<fbf.e<String>> $$3, Optional<fbf.e<fdy>> $$4) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
   }

   @Override
   public Set<bax<?>> a() {
      return Stream.concat(this.c.stream(), this.f.stream()).flatMap($$0 -> $$0.a().stream()).flatMap($$0 -> $$0.a().stream()).collect(Collectors.toSet());
   }

   @Override
   public fbi<fbt> b() {
      return fbj.R;
   }

   private static <T> List<T> a(Optional<fbf.e<T>> $$0, List<T> $$1) {
      return $$0.<List<T>>map($$1x -> $$1x.a($$1)).orElse($$1);
   }

   private static <T, E> List<E> a(Optional<fbf.e<T>> $$0, List<E> $$1, Function<T, E> $$2) {
      return $$0.<List<E>>map($$2x -> {
         List<E> $$3 = $$2x.a().stream().map($$2).toList();
         return $$2x.b().a($$1, $$3);
      }).orElse($$1);
   }

   @Override
   public czn a(czn $$0, ezt $$1) {
      dbw $$2 = $$0.a(kk.p, dbw.a);
      $$0.b(kk.p, new dbw(a(this.c, $$2.a(), $$1x -> $$1x.b($$1)), a(this.d, $$2.b()), a(this.e, $$2.c()), a(this.f, $$2.d(), $$1x -> $$1x.a($$1))));
      return $$0;
   }
}
