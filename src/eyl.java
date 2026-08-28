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

public class eyl extends eyy {
   public static final MapCodec<eyl> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  eyl.b.b.fieldOf("source").forGetter($$0x -> $$0x.b),
                  kw.a.listOf().optionalFieldOf("include").forGetter($$0x -> $$0x.c),
                  kw.a.listOf().optionalFieldOf("exclude").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, eyl::new)
   );
   private final eyl.b b;
   private final Optional<List<kw<?>>> c;
   private final Optional<List<kw<?>>> d;
   private final Predicate<kw<?>> e;

   eyl(List<fau> $$0, eyl.b $$1, Optional<List<kw<?>>> $$2, Optional<List<kw<?>>> $$3) {
      super($$0);
      this.b = $$1;
      this.c = $$2.map(List::copyOf);
      this.d = $$3.map(List::copyOf);
      List<Predicate<kw<?>>> $$4 = new ArrayList<>(2);
      $$3.ifPresent($$1x -> $$4.add($$1xx -> !$$1x.contains($$1xx)));
      $$2.ifPresent($$1x -> $$4.add($$1x::contains));
      this.e = af.a($$4);
   }

   @Override
   public eza<eyl> b() {
      return ezb.J;
   }

   @Override
   public Set<bat<?>> a() {
      return this.b.a();
   }

   @Override
   public cxy a(cxy $$0, exl $$1) {
      kt $$2 = this.b.a($$1);
      $$0.b($$2.a(this.e));
      return $$0;
   }

   public static eyl.a a(eyl.b $$0) {
      return new eyl.a($$0);
   }

   public static class a extends eyy.a<eyl.a> {
      private final eyl.b a;
      private Optional<Builder<kw<?>>> b = Optional.empty();
      private Optional<Builder<kw<?>>> c = Optional.empty();

      a(eyl.b $$0) {
         this.a = $$0;
      }

      public eyl.a a(kw<?> $$0) {
         if (this.b.isEmpty()) {
            this.b = Optional.of(ImmutableList.builder());
         }

         this.b.get().add($$0);
         return this;
      }

      public eyl.a b(kw<?> $$0) {
         if (this.c.isEmpty()) {
            this.c = Optional.of(ImmutableList.builder());
         }

         this.c.get().add($$0);
         return this;
      }

      protected eyl.a a() {
         return this;
      }

      @Override
      public eyz b() {
         return new eyl(this.g(), this.a, this.b.map(Builder::build), this.c.map(Builder::build));
      }
   }

   public static enum b implements bag {
      a("block_entity");

      public static final Codec<eyl.b> b = bag.b(eyl.b::values);
      private final String c;

      private b(final String $$0) {
         this.c = $$0;
      }

      public kt a(exl $$0) {
         switch (this) {
            case a:
               dvl $$1 = $$0.c(faf.h);
               return $$1 != null ? $$1.q() : kt.a;
            default:
               throw new MatchException(null, null);
         }
      }

      public Set<bat<?>> a() {
         switch (this) {
            case a:
               return Set.of(faf.h);
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
