import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;

public class evt extends euy {
   public static final MapCodec<evt> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  xg.a.sizeLimitedListOf(256).fieldOf("lore").forGetter($$0x -> $$0x.b),
                  eux.a(256).forGetter($$0x -> $$0x.c),
                  etl.b.e.optionalFieldOf("entity").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, evt::new)
   );
   private final List<xe> b;
   private final eux c;
   private final Optional<etl.b> d;

   public evt(List<eww> $$0, List<xe> $$1, eux $$2, Optional<etl.b> $$3) {
      super($$0);
      this.b = List.copyOf($$1);
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public eva<evt> b() {
      return evb.A;
   }

   @Override
   public Set<ewe<?>> a() {
      return this.d.<Set<ewe<?>>>map($$0 -> Set.of($$0.a())).orElseGet(Set::of);
   }

   @Override
   public cvs a(cvs $$0, etl $$1) {
      $$0.a(ks.i, cyp.a, $$1x -> new cyp(this.a($$1x, $$1)));
      return $$0;
   }

   private List<xe> a(@Nullable cyp $$0, etl $$1) {
      if ($$0 == null && this.b.isEmpty()) {
         return List.of();
      } else {
         UnaryOperator<xe> $$2 = evu.a($$1, this.d.orElse(null));
         List<xe> $$3 = this.b.stream().map($$2).toList();
         return this.c.a($$0.a(), $$3, 256);
      }
   }

   public static evt.a c() {
      return new evt.a();
   }

   public static class a extends euy.a<evt.a> {
      private Optional<etl.b> a = Optional.empty();
      private final Builder<xe> b = ImmutableList.builder();
      private eux c = eux.a.b;

      public evt.a a(eux $$0) {
         this.c = $$0;
         return this;
      }

      public evt.a a(etl.b $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public evt.a a(xe $$0) {
         this.b.add($$0);
         return this;
      }

      protected evt.a a() {
         return this;
      }

      @Override
      public euz b() {
         return new evt(this.g(), this.b.build(), this.c, this.a);
      }
   }
}
