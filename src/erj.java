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

public class erj extends erv {
   public static final MapCodec<erj> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  erj.b.b.fieldOf("source").forGetter($$0x -> $$0x.b),
                  kl.a.listOf().optionalFieldOf("include").forGetter($$0x -> $$0x.c),
                  kl.a.listOf().optionalFieldOf("exclude").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, erj::new)
   );
   private final erj.b b;
   private final Optional<List<kl<?>>> c;
   private final Optional<List<kl<?>>> d;
   private final Predicate<kl<?>> e;

   erj(List<ett> $$0, erj.b $$1, Optional<List<kl<?>>> $$2, Optional<List<kl<?>>> $$3) {
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
   public erx<erj> b() {
      return ery.J;
   }

   @Override
   public Set<etc<?>> a() {
      return this.b.a();
   }

   @Override
   public cuq a(cuq $$0, eqj $$1) {
      ki $$2 = this.b.a($$1);
      $$0.b($$2.a(this.e));
      return $$0;
   }

   public static erj.a a(erj.b $$0) {
      return new erj.a($$0);
   }

   public static class a extends erv.a<erj.a> {
      private final erj.b a;
      private Optional<Builder<kl<?>>> b = Optional.empty();
      private Optional<Builder<kl<?>>> c = Optional.empty();

      a(erj.b $$0) {
         this.a = $$0;
      }

      public erj.a a(kl<?> $$0) {
         if (this.b.isEmpty()) {
            this.b = Optional.of(ImmutableList.builder());
         }

         this.b.get().add($$0);
         return this;
      }

      public erj.a b(kl<?> $$0) {
         if (this.c.isEmpty()) {
            this.c = Optional.of(ImmutableList.builder());
         }

         this.c.get().add($$0);
         return this;
      }

      protected erj.a a() {
         return this;
      }

      @Override
      public erw b() {
         return new erj(this.g(), this.a, this.b.map(Builder::build), this.c.map(Builder::build));
      }
   }

   public static enum b implements azu {
      a("block_entity");

      public static final Codec<erj.b> b = azu.b(erj.b::values);
      private final String c;

      private b(final String $$0) {
         this.c = $$0;
      }

      public ki a(eqj $$0) {
         switch (this) {
            case a:
               dpi $$1 = $$0.c(etf.h);
               return $$1 != null ? $$1.s() : ki.a;
            default:
               throw new MatchException(null, null);
         }
      }

      public Set<etc<?>> a() {
         switch (this) {
            case a:
               return Set.of(etf.h);
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
