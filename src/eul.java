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

public class eul extends euy {
   public static final MapCodec<eul> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  eul.b.b.fieldOf("source").forGetter($$0x -> $$0x.b),
                  kr.a.listOf().optionalFieldOf("include").forGetter($$0x -> $$0x.c),
                  kr.a.listOf().optionalFieldOf("exclude").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, eul::new)
   );
   private final eul.b b;
   private final Optional<List<kr<?>>> c;
   private final Optional<List<kr<?>>> d;
   private final Predicate<kr<?>> e;

   eul(List<eww> $$0, eul.b $$1, Optional<List<kr<?>>> $$2, Optional<List<kr<?>>> $$3) {
      super($$0);
      this.b = $$1;
      this.c = $$2.map(List::copyOf);
      this.d = $$3.map(List::copyOf);
      List<Predicate<kr<?>>> $$4 = new ArrayList<>(2);
      $$3.ifPresent($$1x -> $$4.add($$1xx -> !$$1x.contains($$1xx)));
      $$2.ifPresent($$1x -> $$4.add($$1x::contains));
      this.e = ad.a($$4);
   }

   @Override
   public eva<eul> b() {
      return evb.J;
   }

   @Override
   public Set<ewe<?>> a() {
      return this.b.a();
   }

   @Override
   public cvs a(cvs $$0, etl $$1) {
      ko $$2 = this.b.a($$1);
      $$0.b($$2.a(this.e));
      return $$0;
   }

   public static eul.a a(eul.b $$0) {
      return new eul.a($$0);
   }

   public static class a extends euy.a<eul.a> {
      private final eul.b a;
      private Optional<Builder<kr<?>>> b = Optional.empty();
      private Optional<Builder<kr<?>>> c = Optional.empty();

      a(eul.b $$0) {
         this.a = $$0;
      }

      public eul.a a(kr<?> $$0) {
         if (this.b.isEmpty()) {
            this.b = Optional.of(ImmutableList.builder());
         }

         this.b.get().add($$0);
         return this;
      }

      public eul.a b(kr<?> $$0) {
         if (this.c.isEmpty()) {
            this.c = Optional.of(ImmutableList.builder());
         }

         this.c.get().add($$0);
         return this;
      }

      protected eul.a a() {
         return this;
      }

      @Override
      public euz b() {
         return new eul(this.g(), this.a, this.b.map(Builder::build), this.c.map(Builder::build));
      }
   }

   public static enum b implements bab {
      a("block_entity");

      public static final Codec<eul.b> b = bab.b(eul.b::values);
      private final String c;

      private b(final String $$0) {
         this.c = $$0;
      }

      public ko a(etl $$0) {
         switch (this) {
            case a:
               drv $$1 = $$0.c(ewh.h);
               return $$1 != null ? $$1.r() : ko.a;
            default:
               throw new MatchException(null, null);
         }
      }

      public Set<ewe<?>> a() {
         switch (this) {
            case a:
               return Set.of(ewh.h);
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
