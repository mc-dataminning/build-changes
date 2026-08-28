import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;

public class ewv extends ewa {
   public static final MapCodec<ewv> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  xl.a.sizeLimitedListOf(256).fieldOf("lore").forGetter($$0x -> $$0x.b),
                  evz.a(256).forGetter($$0x -> $$0x.c),
                  eun.b.e.optionalFieldOf("entity").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, ewv::new)
   );
   private final List<xj> b;
   private final evz c;
   private final Optional<eun.b> d;

   public ewv(List<exy> $$0, List<xj> $$1, evz $$2, Optional<eun.b> $$3) {
      super($$0);
      this.b = List.copyOf($$1);
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public ewc<ewv> b() {
      return ewd.A;
   }

   @Override
   public Set<exg<?>> a() {
      return this.d.<Set<exg<?>>>map($$0 -> Set.of($$0.a())).orElseGet(Set::of);
   }

   @Override
   public cwm a(cwm $$0, eun $$1) {
      $$0.a(ku.j, czf.a, $$1x -> new czf(this.a($$1x, $$1)));
      return $$0;
   }

   private List<xj> a(@Nullable czf $$0, eun $$1) {
      if ($$0 == null && this.b.isEmpty()) {
         return List.of();
      } else {
         UnaryOperator<xj> $$2 = eww.a($$1, this.d.orElse(null));
         List<xj> $$3 = this.b.stream().map($$2).toList();
         return this.c.a($$0.a(), $$3, 256);
      }
   }

   public static ewv.a c() {
      return new ewv.a();
   }

   public static class a extends ewa.a<ewv.a> {
      private Optional<eun.b> a = Optional.empty();
      private final Builder<xj> b = ImmutableList.builder();
      private evz c = evz.a.b;

      public ewv.a a(evz $$0) {
         this.c = $$0;
         return this;
      }

      public ewv.a a(eun.b $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public ewv.a a(xj $$0) {
         this.b.add($$0);
         return this;
      }

      protected ewv.a a() {
         return this;
      }

      @Override
      public ewb b() {
         return new ewv(this.g(), this.b.build(), this.c, this.a);
      }
   }
}
