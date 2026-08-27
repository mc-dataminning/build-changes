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

public class eqh extends eqs {
   public static final MapCodec<eqh> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  eqh.b.b.fieldOf("source").forGetter($$0x -> $$0x.b),
                  ka.a.listOf().optionalFieldOf("include").forGetter($$0x -> $$0x.c),
                  ka.a.listOf().optionalFieldOf("exclude").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, eqh::new)
   );
   private final eqh.b b;
   private final Optional<List<ka<?>>> c;
   private final Optional<List<ka<?>>> d;
   private final Predicate<ka<?>> e;

   eqh(List<esn> $$0, eqh.b $$1, Optional<List<ka<?>>> $$2, Optional<List<ka<?>>> $$3) {
      super($$0);
      this.b = $$1;
      this.c = $$2.map(List::copyOf);
      this.d = $$3.map(List::copyOf);
      List<Predicate<ka<?>>> $$4 = new ArrayList<>(2);
      $$3.ifPresent($$1x -> $$4.add($$1xx -> !$$1x.contains($$1xx)));
      $$2.ifPresent($$1x -> $$4.add($$1x::contains));
      this.e = ac.a($$4);
   }

   @Override
   public equ b() {
      return eqv.G;
   }

   @Override
   public Set<erw<?>> a() {
      return this.b.a();
   }

   @Override
   public ctq a(ctq $$0, eph $$1) {
      jx $$2 = this.b.a($$1);
      $$0.a($$2.a(this.e));
      return $$0;
   }

   public static eqh.a a(eqh.b $$0) {
      return new eqh.a($$0);
   }

   public static class a extends eqs.a<eqh.a> {
      private final eqh.b a;
      private Optional<Builder<ka<?>>> b = Optional.empty();
      private Optional<Builder<ka<?>>> c = Optional.empty();

      a(eqh.b $$0) {
         this.a = $$0;
      }

      public eqh.a a(ka<?> $$0) {
         if (this.b.isEmpty()) {
            this.b = Optional.of(ImmutableList.builder());
         }

         this.b.get().add($$0);
         return this;
      }

      public eqh.a b(ka<?> $$0) {
         if (this.c.isEmpty()) {
            this.c = Optional.of(ImmutableList.builder());
         }

         this.c.get().add($$0);
         return this;
      }

      protected eqh.a a() {
         return this;
      }

      @Override
      public eqt b() {
         return new eqh(this.g(), this.a, this.b.map(Builder::build), this.c.map(Builder::build));
      }
   }

   public static enum b implements ayz {
      a("block_entity");

      public static final Codec<eqh.b> b = ayz.b(eqh.b::values);
      private final String c;

      private b(String $$0) {
         this.c = $$0;
      }

      public jx a(eph $$0) {
         switch (this) {
            case a:
               doi $$1 = $$0.c(erz.h);
               return $$1 != null ? $$1.s() : jx.a;
            default:
               throw new MatchException(null, null);
         }
      }

      public Set<erw<?>> a() {
         switch (this) {
            case a:
               return Set.of(erz.h);
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
