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

public class ewp extends exc {
   public static final MapCodec<ewp> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  ewp.b.b.fieldOf("source").forGetter($$0x -> $$0x.b),
                  ku.a.listOf().optionalFieldOf("include").forGetter($$0x -> $$0x.c),
                  ku.a.listOf().optionalFieldOf("exclude").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, ewp::new)
   );
   private final ewp.b b;
   private final Optional<List<ku<?>>> c;
   private final Optional<List<ku<?>>> d;
   private final Predicate<ku<?>> e;

   ewp(List<eyy> $$0, ewp.b $$1, Optional<List<ku<?>>> $$2, Optional<List<ku<?>>> $$3) {
      super($$0);
      this.b = $$1;
      this.c = $$2.map(List::copyOf);
      this.d = $$3.map(List::copyOf);
      List<Predicate<ku<?>>> $$4 = new ArrayList<>(2);
      $$3.ifPresent($$1x -> $$4.add($$1xx -> !$$1x.contains($$1xx)));
      $$2.ifPresent($$1x -> $$4.add($$1x::contains));
      this.e = af.a($$4);
   }

   @Override
   public exe<ewp> b() {
      return exf.J;
   }

   @Override
   public Set<bah<?>> a() {
      return this.b.a();
   }

   @Override
   public cwn a(cwn $$0, evp $$1) {
      kr $$2 = this.b.a($$1);
      $$0.b($$2.a(this.e));
      return $$0;
   }

   public static ewp.a a(ewp.b $$0) {
      return new ewp.a($$0);
   }

   public static class a extends exc.a<ewp.a> {
      private final ewp.b a;
      private Optional<Builder<ku<?>>> b = Optional.empty();
      private Optional<Builder<ku<?>>> c = Optional.empty();

      a(ewp.b $$0) {
         this.a = $$0;
      }

      public ewp.a a(ku<?> $$0) {
         if (this.b.isEmpty()) {
            this.b = Optional.of(ImmutableList.builder());
         }

         this.b.get().add($$0);
         return this;
      }

      public ewp.a b(ku<?> $$0) {
         if (this.c.isEmpty()) {
            this.c = Optional.of(ImmutableList.builder());
         }

         this.c.get().add($$0);
         return this;
      }

      protected ewp.a a() {
         return this;
      }

      @Override
      public exd b() {
         return new ewp(this.g(), this.a, this.b.map(Builder::build), this.c.map(Builder::build));
      }
   }

   public static enum b implements azu {
      a("block_entity");

      public static final Codec<ewp.b> b = azu.b(ewp.b::values);
      private final String c;

      private b(final String $$0) {
         this.c = $$0;
      }

      public kr a(evp $$0) {
         switch (this) {
            case a:
               dtx $$1 = $$0.c(eyj.h);
               return $$1 != null ? $$1.q() : kr.a;
            default:
               throw new MatchException(null, null);
         }
      }

      public Set<bah<?>> a() {
         switch (this) {
            case a:
               return Set.of(eyj.h);
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
