import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;

public class ewk extends evp {
   public static final MapCodec<ewk> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  xk.a.sizeLimitedListOf(256).fieldOf("lore").forGetter($$0x -> $$0x.b),
                  evo.a(256).forGetter($$0x -> $$0x.c),
                  euc.b.e.optionalFieldOf("entity").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, ewk::new)
   );
   private final List<xi> b;
   private final evo c;
   private final Optional<euc.b> d;

   public ewk(List<exn> $$0, List<xi> $$1, evo $$2, Optional<euc.b> $$3) {
      super($$0);
      this.b = List.copyOf($$1);
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public evr<ewk> b() {
      return evs.A;
   }

   @Override
   public Set<ewv<?>> a() {
      return this.d.<Set<ewv<?>>>map($$0 -> Set.of($$0.a())).orElseGet(Set::of);
   }

   @Override
   public cwb a(cwb $$0, euc $$1) {
      $$0.a(ku.j, cyu.a, $$1x -> new cyu(this.a($$1x, $$1)));
      return $$0;
   }

   private List<xi> a(@Nullable cyu $$0, euc $$1) {
      if ($$0 == null && this.b.isEmpty()) {
         return List.of();
      } else {
         UnaryOperator<xi> $$2 = ewl.a($$1, this.d.orElse(null));
         List<xi> $$3 = this.b.stream().map($$2).toList();
         return this.c.a($$0.a(), $$3, 256);
      }
   }

   public static ewk.a c() {
      return new ewk.a();
   }

   public static class a extends evp.a<ewk.a> {
      private Optional<euc.b> a = Optional.empty();
      private final Builder<xi> b = ImmutableList.builder();
      private evo c = evo.a.b;

      public ewk.a a(evo $$0) {
         this.c = $$0;
         return this;
      }

      public ewk.a a(euc.b $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public ewk.a a(xi $$0) {
         this.b.add($$0);
         return this;
      }

      protected ewk.a a() {
         return this;
      }

      @Override
      public evq b() {
         return new ewk(this.g(), this.b.build(), this.c, this.a);
      }
   }
}
