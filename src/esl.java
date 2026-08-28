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

public class esl extends esy {
   public static final MapCodec<esl> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  esl.b.b.fieldOf("source").forGetter($$0x -> $$0x.b),
                  kp.a.listOf().optionalFieldOf("include").forGetter($$0x -> $$0x.c),
                  kp.a.listOf().optionalFieldOf("exclude").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, esl::new)
   );
   private final esl.b b;
   private final Optional<List<kp<?>>> c;
   private final Optional<List<kp<?>>> d;
   private final Predicate<kp<?>> e;

   esl(List<euw> $$0, esl.b $$1, Optional<List<kp<?>>> $$2, Optional<List<kp<?>>> $$3) {
      super($$0);
      this.b = $$1;
      this.c = $$2.map(List::copyOf);
      this.d = $$3.map(List::copyOf);
      List<Predicate<kp<?>>> $$4 = new ArrayList<>(2);
      $$3.ifPresent($$1x -> $$4.add($$1xx -> !$$1x.contains($$1xx)));
      $$2.ifPresent($$1x -> $$4.add($$1x::contains));
      this.e = ad.a($$4);
   }

   @Override
   public eta<esl> b() {
      return etb.J;
   }

   @Override
   public Set<eue<?>> a() {
      return this.b.a();
   }

   @Override
   public cuo a(cuo $$0, erl $$1) {
      km $$2 = this.b.a($$1);
      $$0.b($$2.a(this.e));
      return $$0;
   }

   public static esl.a a(esl.b $$0) {
      return new esl.a($$0);
   }

   public static class a extends esy.a<esl.a> {
      private final esl.b a;
      private Optional<Builder<kp<?>>> b = Optional.empty();
      private Optional<Builder<kp<?>>> c = Optional.empty();

      a(esl.b $$0) {
         this.a = $$0;
      }

      public esl.a a(kp<?> $$0) {
         if (this.b.isEmpty()) {
            this.b = Optional.of(ImmutableList.builder());
         }

         this.b.get().add($$0);
         return this;
      }

      public esl.a b(kp<?> $$0) {
         if (this.c.isEmpty()) {
            this.c = Optional.of(ImmutableList.builder());
         }

         this.c.get().add($$0);
         return this;
      }

      protected esl.a a() {
         return this;
      }

      @Override
      public esz b() {
         return new esl(this.g(), this.a, this.b.map(Builder::build), this.c.map(Builder::build));
      }
   }

   public static enum b implements azj {
      a("block_entity");

      public static final Codec<esl.b> b = azj.b(esl.b::values);
      private final String c;

      private b(final String $$0) {
         this.c = $$0;
      }

      public km a(erl $$0) {
         switch (this) {
            case a:
               dqf $$1 = $$0.c(euh.h);
               return $$1 != null ? $$1.s() : km.a;
            default:
               throw new MatchException(null, null);
         }
      }

      public Set<eue<?>> a() {
         switch (this) {
            case a:
               return Set.of(euh.h);
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
