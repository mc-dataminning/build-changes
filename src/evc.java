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

public class evc extends evp {
   public static final MapCodec<evc> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  evc.b.b.fieldOf("source").forGetter($$0x -> $$0x.b),
                  kt.a.listOf().optionalFieldOf("include").forGetter($$0x -> $$0x.c),
                  kt.a.listOf().optionalFieldOf("exclude").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, evc::new)
   );
   private final evc.b b;
   private final Optional<List<kt<?>>> c;
   private final Optional<List<kt<?>>> d;
   private final Predicate<kt<?>> e;

   evc(List<exn> $$0, evc.b $$1, Optional<List<kt<?>>> $$2, Optional<List<kt<?>>> $$3) {
      super($$0);
      this.b = $$1;
      this.c = $$2.map(List::copyOf);
      this.d = $$3.map(List::copyOf);
      List<Predicate<kt<?>>> $$4 = new ArrayList<>(2);
      $$3.ifPresent($$1x -> $$4.add($$1xx -> !$$1x.contains($$1xx)));
      $$2.ifPresent($$1x -> $$4.add($$1x::contains));
      this.e = ae.a($$4);
   }

   @Override
   public evr<evc> b() {
      return evs.J;
   }

   @Override
   public Set<ewv<?>> a() {
      return this.b.a();
   }

   @Override
   public cwb a(cwb $$0, euc $$1) {
      kq $$2 = this.b.a($$1);
      $$0.b($$2.a(this.e));
      return $$0;
   }

   public static evc.a a(evc.b $$0) {
      return new evc.a($$0);
   }

   public static class a extends evp.a<evc.a> {
      private final evc.b a;
      private Optional<Builder<kt<?>>> b = Optional.empty();
      private Optional<Builder<kt<?>>> c = Optional.empty();

      a(evc.b $$0) {
         this.a = $$0;
      }

      public evc.a a(kt<?> $$0) {
         if (this.b.isEmpty()) {
            this.b = Optional.of(ImmutableList.builder());
         }

         this.b.get().add($$0);
         return this;
      }

      public evc.a b(kt<?> $$0) {
         if (this.c.isEmpty()) {
            this.c = Optional.of(ImmutableList.builder());
         }

         this.c.get().add($$0);
         return this;
      }

      protected evc.a a() {
         return this;
      }

      @Override
      public evq b() {
         return new evc(this.g(), this.a, this.b.map(Builder::build), this.c.map(Builder::build));
      }
   }

   public static enum b implements bag {
      a("block_entity");

      public static final Codec<evc.b> b = bag.b(evc.b::values);
      private final String c;

      private b(final String $$0) {
         this.c = $$0;
      }

      public kq a(euc $$0) {
         switch (this) {
            case a:
               dsm $$1 = $$0.c(ewy.h);
               return $$1 != null ? $$1.r() : kq.a;
            default:
               throw new MatchException(null, null);
         }
      }

      public Set<ewv<?>> a() {
         switch (this) {
            case a:
               return Set.of(ewy.h);
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
