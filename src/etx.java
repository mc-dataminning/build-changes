import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;

public class etx extends etc {
   public static final MapCodec<etx> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  xb.a.sizeLimitedListOf(256).fieldOf("lore").forGetter($$0x -> $$0x.b),
                  etb.a(256).forGetter($$0x -> $$0x.c),
                  erp.b.e.optionalFieldOf("entity").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, etx::new)
   );
   private final List<wz> b;
   private final etb c;
   private final Optional<erp.b> d;

   public etx(List<eva> $$0, List<wz> $$1, etb $$2, Optional<erp.b> $$3) {
      super($$0);
      this.b = List.copyOf($$1);
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public ete<etx> b() {
      return etf.A;
   }

   @Override
   public Set<eui<?>> a() {
      return this.d.<Set<eui<?>>>map($$0 -> Set.of($$0.a())).orElseGet(Set::of);
   }

   @Override
   public cuq a(cuq $$0, erp $$1) {
      $$0.a(kq.i, cxp.a, $$1x -> new cxp(this.a($$1x, $$1)));
      return $$0;
   }

   private List<wz> a(@Nullable cxp $$0, erp $$1) {
      if ($$0 == null && this.b.isEmpty()) {
         return List.of();
      } else {
         UnaryOperator<wz> $$2 = ety.a($$1, this.d.orElse(null));
         List<wz> $$3 = this.b.stream().map($$2).toList();
         return this.c.a($$0.a(), $$3, 256);
      }
   }

   public static etx.a c() {
      return new etx.a();
   }

   public static class a extends etc.a<etx.a> {
      private Optional<erp.b> a = Optional.empty();
      private final Builder<wz> b = ImmutableList.builder();
      private etb c = etb.a.b;

      public etx.a a(etb $$0) {
         this.c = $$0;
         return this;
      }

      public etx.a a(erp.b $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public etx.a a(wz $$0) {
         this.b.add($$0);
         return this;
      }

      protected etx.a a() {
         return this;
      }

      @Override
      public etd b() {
         return new etx(this.g(), this.b.build(), this.c, this.a);
      }
   }
}
