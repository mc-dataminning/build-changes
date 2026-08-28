import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;

public class etz extends ete {
   public static final MapCodec<etz> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  xb.a.sizeLimitedListOf(256).fieldOf("lore").forGetter($$0x -> $$0x.b),
                  etd.a(256).forGetter($$0x -> $$0x.c),
                  err.b.e.optionalFieldOf("entity").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, etz::new)
   );
   private final List<wz> b;
   private final etd c;
   private final Optional<err.b> d;

   public etz(List<evc> $$0, List<wz> $$1, etd $$2, Optional<err.b> $$3) {
      super($$0);
      this.b = List.copyOf($$1);
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public etg<etz> b() {
      return eth.A;
   }

   @Override
   public Set<euk<?>> a() {
      return this.d.<Set<euk<?>>>map($$0 -> Set.of($$0.a())).orElseGet(Set::of);
   }

   @Override
   public cuq a(cuq $$0, err $$1) {
      $$0.a(kq.i, cxp.a, $$1x -> new cxp(this.a($$1x, $$1)));
      return $$0;
   }

   private List<wz> a(@Nullable cxp $$0, err $$1) {
      if ($$0 == null && this.b.isEmpty()) {
         return List.of();
      } else {
         UnaryOperator<wz> $$2 = eua.a($$1, this.d.orElse(null));
         List<wz> $$3 = this.b.stream().map($$2).toList();
         return this.c.a($$0.a(), $$3, 256);
      }
   }

   public static etz.a c() {
      return new etz.a();
   }

   public static class a extends ete.a<etz.a> {
      private Optional<err.b> a = Optional.empty();
      private final Builder<wz> b = ImmutableList.builder();
      private etd c = etd.a.b;

      public etz.a a(etd $$0) {
         this.c = $$0;
         return this;
      }

      public etz.a a(err.b $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public etz.a a(wz $$0) {
         this.b.add($$0);
         return this;
      }

      protected etz.a a() {
         return this;
      }

      @Override
      public etf b() {
         return new etz(this.g(), this.b.build(), this.c, this.a);
      }
   }
}
