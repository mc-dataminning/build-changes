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

public class euw extends evj {
   public static final MapCodec<euw> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  euw.b.b.fieldOf("source").forGetter($$0x -> $$0x.b),
                  ks.a.listOf().optionalFieldOf("include").forGetter($$0x -> $$0x.c),
                  ks.a.listOf().optionalFieldOf("exclude").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, euw::new)
   );
   private final euw.b b;
   private final Optional<List<ks<?>>> c;
   private final Optional<List<ks<?>>> d;
   private final Predicate<ks<?>> e;

   euw(List<exh> $$0, euw.b $$1, Optional<List<ks<?>>> $$2, Optional<List<ks<?>>> $$3) {
      super($$0);
      this.b = $$1;
      this.c = $$2.map(List::copyOf);
      this.d = $$3.map(List::copyOf);
      List<Predicate<ks<?>>> $$4 = new ArrayList<>(2);
      $$3.ifPresent($$1x -> $$4.add($$1xx -> !$$1x.contains($$1xx)));
      $$2.ifPresent($$1x -> $$4.add($$1x::contains));
      this.e = ad.a($$4);
   }

   @Override
   public evl<euw> b() {
      return evm.J;
   }

   @Override
   public Set<ewp<?>> a() {
      return this.b.a();
   }

   @Override
   public cvx a(cvx $$0, etw $$1) {
      kp $$2 = this.b.a($$1);
      $$0.b($$2.a(this.e));
      return $$0;
   }

   public static euw.a a(euw.b $$0) {
      return new euw.a($$0);
   }

   public static class a extends evj.a<euw.a> {
      private final euw.b a;
      private Optional<Builder<ks<?>>> b = Optional.empty();
      private Optional<Builder<ks<?>>> c = Optional.empty();

      a(euw.b $$0) {
         this.a = $$0;
      }

      public euw.a a(ks<?> $$0) {
         if (this.b.isEmpty()) {
            this.b = Optional.of(ImmutableList.builder());
         }

         this.b.get().add($$0);
         return this;
      }

      public euw.a b(ks<?> $$0) {
         if (this.c.isEmpty()) {
            this.c = Optional.of(ImmutableList.builder());
         }

         this.c.get().add($$0);
         return this;
      }

      protected euw.a a() {
         return this;
      }

      @Override
      public evk b() {
         return new euw(this.g(), this.a, this.b.map(Builder::build), this.c.map(Builder::build));
      }
   }

   public static enum b implements baf {
      a("block_entity");

      public static final Codec<euw.b> b = baf.b(euw.b::values);
      private final String c;

      private b(final String $$0) {
         this.c = $$0;
      }

      public kp a(etw $$0) {
         switch (this) {
            case a:
               dsg $$1 = $$0.c(ews.h);
               return $$1 != null ? $$1.r() : kp.a;
            default:
               throw new MatchException(null, null);
         }
      }

      public Set<ewp<?>> a() {
         switch (this) {
            case a:
               return Set.of(ews.h);
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
