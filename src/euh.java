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

public class euh extends euu {
   public static final MapCodec<euh> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  euh.b.b.fieldOf("source").forGetter($$0x -> $$0x.b),
                  kq.a.listOf().optionalFieldOf("include").forGetter($$0x -> $$0x.c),
                  kq.a.listOf().optionalFieldOf("exclude").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, euh::new)
   );
   private final euh.b b;
   private final Optional<List<kq<?>>> c;
   private final Optional<List<kq<?>>> d;
   private final Predicate<kq<?>> e;

   euh(List<ews> $$0, euh.b $$1, Optional<List<kq<?>>> $$2, Optional<List<kq<?>>> $$3) {
      super($$0);
      this.b = $$1;
      this.c = $$2.map(List::copyOf);
      this.d = $$3.map(List::copyOf);
      List<Predicate<kq<?>>> $$4 = new ArrayList<>(2);
      $$3.ifPresent($$1x -> $$4.add($$1xx -> !$$1x.contains($$1xx)));
      $$2.ifPresent($$1x -> $$4.add($$1x::contains));
      this.e = ad.a($$4);
   }

   @Override
   public euw<euh> b() {
      return eux.J;
   }

   @Override
   public Set<ewa<?>> a() {
      return this.b.a();
   }

   @Override
   public cvp a(cvp $$0, eth $$1) {
      kn $$2 = this.b.a($$1);
      $$0.b($$2.a(this.e));
      return $$0;
   }

   public static euh.a a(euh.b $$0) {
      return new euh.a($$0);
   }

   public static class a extends euu.a<euh.a> {
      private final euh.b a;
      private Optional<Builder<kq<?>>> b = Optional.empty();
      private Optional<Builder<kq<?>>> c = Optional.empty();

      a(euh.b $$0) {
         this.a = $$0;
      }

      public euh.a a(kq<?> $$0) {
         if (this.b.isEmpty()) {
            this.b = Optional.of(ImmutableList.builder());
         }

         this.b.get().add($$0);
         return this;
      }

      public euh.a b(kq<?> $$0) {
         if (this.c.isEmpty()) {
            this.c = Optional.of(ImmutableList.builder());
         }

         this.c.get().add($$0);
         return this;
      }

      protected euh.a a() {
         return this;
      }

      @Override
      public euv b() {
         return new euh(this.g(), this.a, this.b.map(Builder::build), this.c.map(Builder::build));
      }
   }

   public static enum b implements azz {
      a("block_entity");

      public static final Codec<euh.b> b = azz.b(euh.b::values);
      private final String c;

      private b(final String $$0) {
         this.c = $$0;
      }

      public kn a(eth $$0) {
         switch (this) {
            case a:
               drs $$1 = $$0.c(ewd.h);
               return $$1 != null ? $$1.r() : kn.a;
            default:
               throw new MatchException(null, null);
         }
      }

      public Set<ewa<?>> a() {
         switch (this) {
            case a:
               return Set.of(ewd.h);
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
