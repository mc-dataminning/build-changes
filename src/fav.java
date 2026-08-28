import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;

public class fav extends faa {
   public static final MapCodec<fav> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  wy.a.sizeLimitedListOf(256).fieldOf("lore").forGetter($$0x -> $$0x.b),
                  ezz.a(256).forGetter($$0x -> $$0x.c),
                  eyn.b.e.optionalFieldOf("entity").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, fav::new)
   );
   private final List<ww> b;
   private final ezz c;
   private final Optional<eyn.b> d;

   public fav(List<fbw> $$0, List<ww> $$1, ezz $$2, Optional<eyn.b> $$3) {
      super($$0);
      this.b = List.copyOf($$1);
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public fac<fav> b() {
      return fad.A;
   }

   @Override
   public Set<bav<?>> a() {
      return this.d.<Set<bav<?>>>map($$0 -> Set.of($$0.a())).orElseGet(Set::of);
   }

   @Override
   public cys a(cys $$0, eyn $$1) {
      $$0.a(kj.j, dbl.a, $$1x -> new dbl(this.a($$1x, $$1)));
      return $$0;
   }

   private List<ww> a(@Nullable dbl $$0, eyn $$1) {
      if ($$0 == null && this.b.isEmpty()) {
         return List.of();
      } else {
         UnaryOperator<ww> $$2 = faw.a($$1, this.d.orElse(null));
         List<ww> $$3 = this.b.stream().map($$2).toList();
         return this.c.a($$0.a(), $$3, 256);
      }
   }

   public static fav.a c() {
      return new fav.a();
   }

   public static class a extends faa.a<fav.a> {
      private Optional<eyn.b> a = Optional.empty();
      private final Builder<ww> b = ImmutableList.builder();
      private ezz c = ezz.a.b;

      public fav.a a(ezz $$0) {
         this.c = $$0;
         return this;
      }

      public fav.a a(eyn.b $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public fav.a a(ww $$0) {
         this.b.add($$0);
         return this;
      }

      protected fav.a a() {
         return this;
      }

      @Override
      public fab b() {
         return new fav(this.g(), this.b.build(), this.c, this.a);
      }
   }
}
