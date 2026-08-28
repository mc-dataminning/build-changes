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

public class fbt extends fcg {
   public static final MapCodec<fbt> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  fbt.b.b.fieldOf("source").forGetter($$0x -> $$0x.b),
                  kk.a.listOf().optionalFieldOf("include").forGetter($$0x -> $$0x.c),
                  kk.a.listOf().optionalFieldOf("exclude").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, fbt::new)
   );
   private final fbt.b b;
   private final Optional<List<kk<?>>> c;
   private final Optional<List<kk<?>>> d;
   private final Predicate<kk<?>> e;

   fbt(List<fec> $$0, fbt.b $$1, Optional<List<kk<?>>> $$2, Optional<List<kk<?>>> $$3) {
      super($$0);
      this.b = $$1;
      this.c = $$2.map(List::copyOf);
      this.d = $$3.map(List::copyOf);
      List<Predicate<kk<?>>> $$4 = new ArrayList<>(2);
      $$3.ifPresent($$1x -> $$4.add($$1xx -> !$$1x.contains($$1xx)));
      $$2.ifPresent($$1x -> $$4.add($$1x::contains));
      this.e = ag.a($$4);
   }

   @Override
   public fci<fbt> b() {
      return fcj.J;
   }

   @Override
   public Set<bbk<?>> a() {
      return this.b.a();
   }

   @Override
   public dak a(dak $$0, fat $$1) {
      ki $$2 = this.b.a($$1);
      $$0.b($$2.a(this.e));
      return $$0;
   }

   public static fbt.a a(fbt.b $$0) {
      return new fbt.a($$0);
   }

   public static class a extends fcg.a<fbt.a> {
      private final fbt.b a;
      private Optional<Builder<kk<?>>> b = Optional.empty();
      private Optional<Builder<kk<?>>> c = Optional.empty();

      a(fbt.b $$0) {
         this.a = $$0;
      }

      public fbt.a a(kk<?> $$0) {
         if (this.b.isEmpty()) {
            this.b = Optional.of(ImmutableList.builder());
         }

         this.b.get().add($$0);
         return this;
      }

      public fbt.a b(kk<?> $$0) {
         if (this.c.isEmpty()) {
            this.c = Optional.of(ImmutableList.builder());
         }

         this.c.get().add($$0);
         return this;
      }

      protected fbt.a a() {
         return this;
      }

      @Override
      public fch b() {
         return new fbt(this.g(), this.a, this.b.map(Builder::build), this.c.map(Builder::build));
      }
   }

   public static enum b implements bax {
      a("block_entity");

      public static final Codec<fbt.b> b = bax.b(fbt.b::values);
      private final String c;

      private b(final String $$0) {
         this.c = $$0;
      }

      public ki a(fat $$0) {
         switch (this) {
            case a:
               dyo $$1 = $$0.c(fdn.h);
               return $$1 != null ? $$1.q() : ki.a;
            default:
               throw new MatchException(null, null);
         }
      }

      public Set<bbk<?>> a() {
         switch (this) {
            case a:
               return Set.of(fdn.h);
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
