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

public class erw extends esj {
   public static final MapCodec<erw> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  erw.b.b.fieldOf("source").forGetter($$0x -> $$0x.b),
                  km.a.listOf().optionalFieldOf("include").forGetter($$0x -> $$0x.c),
                  km.a.listOf().optionalFieldOf("exclude").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, erw::new)
   );
   private final erw.b b;
   private final Optional<List<km<?>>> c;
   private final Optional<List<km<?>>> d;
   private final Predicate<km<?>> e;

   erw(List<euh> $$0, erw.b $$1, Optional<List<km<?>>> $$2, Optional<List<km<?>>> $$3) {
      super($$0);
      this.b = $$1;
      this.c = $$2.map(List::copyOf);
      this.d = $$3.map(List::copyOf);
      List<Predicate<km<?>>> $$4 = new ArrayList<>(2);
      $$3.ifPresent($$1x -> $$4.add($$1xx -> !$$1x.contains($$1xx)));
      $$2.ifPresent($$1x -> $$4.add($$1x::contains));
      this.e = ac.a($$4);
   }

   @Override
   public esl<erw> b() {
      return esm.J;
   }

   @Override
   public Set<etp<?>> a() {
      return this.b.a();
   }

   @Override
   public cud a(cud $$0, eqw $$1) {
      kj $$2 = this.b.a($$1);
      $$0.b($$2.a(this.e));
      return $$0;
   }

   public static erw.a a(erw.b $$0) {
      return new erw.a($$0);
   }

   public static class a extends esj.a<erw.a> {
      private final erw.b a;
      private Optional<Builder<km<?>>> b = Optional.empty();
      private Optional<Builder<km<?>>> c = Optional.empty();

      a(erw.b $$0) {
         this.a = $$0;
      }

      public erw.a a(km<?> $$0) {
         if (this.b.isEmpty()) {
            this.b = Optional.of(ImmutableList.builder());
         }

         this.b.get().add($$0);
         return this;
      }

      public erw.a b(km<?> $$0) {
         if (this.c.isEmpty()) {
            this.c = Optional.of(ImmutableList.builder());
         }

         this.c.get().add($$0);
         return this;
      }

      protected erw.a a() {
         return this;
      }

      @Override
      public esk b() {
         return new erw(this.g(), this.a, this.b.map(Builder::build), this.c.map(Builder::build));
      }
   }

   public static enum b implements azc {
      a("block_entity");

      public static final Codec<erw.b> b = azc.b(erw.b::values);
      private final String c;

      private b(final String $$0) {
         this.c = $$0;
      }

      public kj a(eqw $$0) {
         switch (this) {
            case a:
               dpq $$1 = $$0.c(ets.h);
               return $$1 != null ? $$1.s() : kj.a;
            default:
               throw new MatchException(null, null);
         }
      }

      public Set<etp<?>> a() {
         switch (this) {
            case a:
               return Set.of(ets.h);
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
