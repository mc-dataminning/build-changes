import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;

public class erd extends erp {
   public static final MapCodec<erd> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  erd.b.b.fieldOf("source").forGetter($$0x -> $$0x.b),
                  kl.a.listOf().optionalFieldOf("include").forGetter($$0x -> $$0x.c),
                  kl.a.listOf().optionalFieldOf("exclude").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, erd::new)
   );
   private final erd.b b;
   private final Optional<List<kl<?>>> c;
   private final Optional<List<kl<?>>> d;
   private final Predicate<kl<?>> e;

   erd(List<etn> $$0, erd.b $$1, Optional<List<kl<?>>> $$2, Optional<List<kl<?>>> $$3) {
      super($$0);
      this.b = $$1;
      this.c = $$2.map(List::copyOf);
      this.d = $$3.map(List::copyOf);
      List<Predicate<kl<?>>> $$4 = new ArrayList<>(2);
      $$3.ifPresent($$1x -> $$4.add($$1xx -> !$$1x.contains($$1xx)));
      $$2.ifPresent($$1x -> $$4.add($$1x::contains));
      this.e = ac.a($$4);
   }

   @Override
   public err<erd> b() {
      return ers.J;
   }

   @Override
   public Set<esw<?>> a() {
      return this.b.a();
   }

   @Override
   public cuk a(cuk $$0, eqd $$1) {
      ki $$2 = this.b.a($$1);
      $$0.b($$2.a(this.e));
      return $$0;
   }

   public static erd.a a(erd.b $$0) {
      return new erd.a($$0);
   }

   public static class a extends erp.a<erd.a> {
      private final erd.b a;
      private Optional<Builder<kl<?>>> b = Optional.empty();
      private Optional<Builder<kl<?>>> c = Optional.empty();

      a(erd.b $$0) {
         this.a = $$0;
      }

      public erd.a a(kl<?> $$0) {
         if (this.b.isEmpty()) {
            this.b = Optional.of(ImmutableList.builder());
         }

         this.b.get().add($$0);
         return this;
      }

      public erd.a b(kl<?> $$0) {
         if (this.c.isEmpty()) {
            this.c = Optional.of(ImmutableList.builder());
         }

         this.c.get().add($$0);
         return this;
      }

      protected erd.a a() {
         return this;
      }

      @Override
      public erq b() {
         return new erd(this.g(), this.a, this.b.map(Builder::build), this.c.map(Builder::build));
      }
   }

   public static enum b implements azp {
      a("block_entity");

      public static final Codec<erd.b> b = azp.b(erd.b::values);
      private final String c;

      private b(final String $$0) {
         this.c = $$0;
      }

      public ki a(eqd $$0) {
         switch (this) {
            case a:
               dpc $$1 = $$0.c(esz.h);
               return $$1 != null ? $$1.s() : ki.a;
            default:
               throw new MatchException(null, null);
         }
      }

      public Set<esw<?>> a() {
         switch (this) {
            case a:
               return Set.of(esz.h);
            default:
               throw new MatchException(null, null);
         }
      }

      @Override
      public String c() {
         return this.c;
      }
   }
}
