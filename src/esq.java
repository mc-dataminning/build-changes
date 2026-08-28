import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;

public class esq extends eru {
   public static final MapCodec<esq> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  xr.a.sizeLimitedListOf(256).fieldOf("lore").forGetter($$0x -> $$0x.b),
                  ert.a(256).forGetter($$0x -> $$0x.c),
                  eqi.b.e.optionalFieldOf("entity").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, esq::new)
   );
   private final List<xp> b;
   private final ert c;
   private final Optional<eqi.b> d;

   public esq(List<ets> $$0, List<xp> $$1, ert $$2, Optional<eqi.b> $$3) {
      super($$0);
      this.b = List.copyOf($$1);
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public erw<esq> b() {
      return erx.A;
   }

   @Override
   public Set<etb<?>> a() {
      return this.d.<Set<etb<?>>>map($$0 -> Set.of($$0.a())).orElseGet(Set::of);
   }

   @Override
   public cup a(cup $$0, eqi $$1) {
      $$0.a(km.i, cxm.a, $$1x -> new cxm(this.a($$1x, $$1)));
      return $$0;
   }

   private List<xp> a(@Nullable cxm $$0, eqi $$1) {
      if ($$0 == null && this.b.isEmpty()) {
         return List.of();
      } else {
         UnaryOperator<xp> $$2 = esr.a($$1, this.d.orElse(null));
         List<xp> $$3 = this.b.stream().map($$2).toList();
         return this.c.a($$0.a(), $$3, 256);
      }
   }

   public static esq.a c() {
      return new esq.a();
   }

   public static class a extends eru.a<esq.a> {
      private Optional<eqi.b> a = Optional.empty();
      private final Builder<xp> b = ImmutableList.builder();
      private ert c = ert.a.b;

      public esq.a a(ert $$0) {
         this.c = $$0;
         return this;
      }

      public esq.a a(eqi.b $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public esq.a a(xp $$0) {
         this.b.add($$0);
         return this;
      }

      protected esq.a a() {
         return this;
      }

      @Override
      public erv b() {
         return new esq(this.g(), this.b.build(), this.c, this.a);
      }
   }
}
