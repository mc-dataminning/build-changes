import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;

public class esr extends erv {
   public static final MapCodec<esr> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  xr.a.sizeLimitedListOf(256).fieldOf("lore").forGetter($$0x -> $$0x.b),
                  eru.a(256).forGetter($$0x -> $$0x.c),
                  eqj.b.e.optionalFieldOf("entity").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, esr::new)
   );
   private final List<xp> b;
   private final eru c;
   private final Optional<eqj.b> d;

   public esr(List<ett> $$0, List<xp> $$1, eru $$2, Optional<eqj.b> $$3) {
      super($$0);
      this.b = List.copyOf($$1);
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public erx<esr> b() {
      return ery.A;
   }

   @Override
   public Set<etc<?>> a() {
      return this.d.<Set<etc<?>>>map($$0 -> Set.of($$0.a())).orElseGet(Set::of);
   }

   @Override
   public cuq a(cuq $$0, eqj $$1) {
      $$0.a(km.i, cxn.a, $$1x -> new cxn(this.a($$1x, $$1)));
      return $$0;
   }

   private List<xp> a(@Nullable cxn $$0, eqj $$1) {
      if ($$0 == null && this.b.isEmpty()) {
         return List.of();
      } else {
         UnaryOperator<xp> $$2 = ess.a($$1, this.d.orElse(null));
         List<xp> $$3 = this.b.stream().map($$2).toList();
         return this.c.a($$0.a(), $$3, 256);
      }
   }

   public static esr.a c() {
      return new esr.a();
   }

   public static class a extends erv.a<esr.a> {
      private Optional<eqj.b> a = Optional.empty();
      private final Builder<xp> b = ImmutableList.builder();
      private eru c = eru.a.b;

      public esr.a a(eru $$0) {
         this.c = $$0;
         return this;
      }

      public esr.a a(eqj.b $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public esr.a a(xp $$0) {
         this.b.add($$0);
         return this;
      }

      protected esr.a a() {
         return this;
      }

      @Override
      public erw b() {
         return new esr(this.g(), this.b.build(), this.c, this.a);
      }
   }
}
