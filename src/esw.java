import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;

public class esw extends esb {
   public static final MapCodec<esw> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  ww.a.sizeLimitedListOf(256).fieldOf("lore").forGetter($$0x -> $$0x.b),
                  esa.a(256).forGetter($$0x -> $$0x.c),
                  eqo.b.e.optionalFieldOf("entity").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, esw::new)
   );
   private final List<wu> b;
   private final esa c;
   private final Optional<eqo.b> d;

   public esw(List<etz> $$0, List<wu> $$1, esa $$2, Optional<eqo.b> $$3) {
      super($$0);
      this.b = List.copyOf($$1);
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public esd<esw> b() {
      return ese.A;
   }

   @Override
   public Set<eth<?>> a() {
      return this.d.<Set<eth<?>>>map($$0 -> Set.of($$0.a())).orElseGet(Set::of);
   }

   @Override
   public cua a(cua $$0, eqo $$1) {
      $$0.a(kn.i, cww.a, $$1x -> new cww(this.a($$1x, $$1)));
      return $$0;
   }

   private List<wu> a(@Nullable cww $$0, eqo $$1) {
      if ($$0 == null && this.b.isEmpty()) {
         return List.of();
      } else {
         UnaryOperator<wu> $$2 = esx.a($$1, this.d.orElse(null));
         List<wu> $$3 = this.b.stream().map($$2).toList();
         return this.c.a($$0.a(), $$3, 256);
      }
   }

   public static esw.a c() {
      return new esw.a();
   }

   public static class a extends esb.a<esw.a> {
      private Optional<eqo.b> a = Optional.empty();
      private final Builder<wu> b = ImmutableList.builder();
      private esa c = esa.a.b;

      public esw.a a(esa $$0) {
         this.c = $$0;
         return this;
      }

      public esw.a a(eqo.b $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public esw.a a(wu $$0) {
         this.b.add($$0);
         return this;
      }

      protected esw.a a() {
         return this;
      }

      @Override
      public esc b() {
         return new esw(this.g(), this.b.build(), this.c, this.a);
      }
   }
}
