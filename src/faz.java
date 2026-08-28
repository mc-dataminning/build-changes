import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class faz extends fam {
   private static final Codec<fde> b = Codec.withAlternative(fdf.a, ayu.i, fdb::new);
   public static final MapCodec<faz> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  fal.e.a(fdf.a, Integer.MAX_VALUE).optionalFieldOf("floats").forGetter($$0x -> $$0x.c),
                  fal.e.a(Codec.BOOL, Integer.MAX_VALUE).optionalFieldOf("flags").forGetter($$0x -> $$0x.d),
                  fal.e.a(Codec.STRING, Integer.MAX_VALUE).optionalFieldOf("strings").forGetter($$0x -> $$0x.e),
                  fal.e.a(b, Integer.MAX_VALUE).optionalFieldOf("colors").forGetter($$0x -> $$0x.f)
               )
            )
            .apply($$0, faz::new)
   );
   private final Optional<fal.e<fde>> c;
   private final Optional<fal.e<Boolean>> d;
   private final Optional<fal.e<String>> e;
   private final Optional<fal.e<fde>> f;

   public faz(List<fci> $$0, Optional<fal.e<fde>> $$1, Optional<fal.e<Boolean>> $$2, Optional<fal.e<String>> $$3, Optional<fal.e<fde>> $$4) {
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
   public fao<faz> b() {
      return fap.R;
   }

   private static <T> List<T> a(Optional<fal.e<T>> $$0, List<T> $$1) {
      return $$0.<List<T>>map($$1x -> $$1x.a($$1)).orElse($$1);
   }

   private static <T, E> List<E> a(Optional<fal.e<T>> $$0, List<E> $$1, Function<T, E> $$2) {
      return $$0.<List<E>>map($$2x -> {
         List<E> $$3 = $$2x.a().stream().map($$2).toList();
         return $$2x.b().a($$1, $$3);
      }).orElse($$1);
   }

   @Override
   public cyy a(cyy $$0, eyz $$1) {
      dbh $$2 = $$0.a(kj.p, dbh.a);
      $$0.b(kj.p, new dbh(a(this.c, $$2.a(), $$1x -> $$1x.b($$1)), a(this.d, $$2.b()), a(this.e, $$2.c()), a(this.f, $$2.d(), $$1x -> $$1x.a($$1))));
      return $$0;
   }
}
