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

public class esr extends ete {
   public static final MapCodec<esr> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  esr.b.b.fieldOf("source").forGetter($$0x -> $$0x.b),
                  kp.a.listOf().optionalFieldOf("include").forGetter($$0x -> $$0x.c),
                  kp.a.listOf().optionalFieldOf("exclude").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, esr::new)
   );
   private final esr.b b;
   private final Optional<List<kp<?>>> c;
   private final Optional<List<kp<?>>> d;
   private final Predicate<kp<?>> e;

   esr(List<evc> $$0, esr.b $$1, Optional<List<kp<?>>> $$2, Optional<List<kp<?>>> $$3) {
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
   public etg<esr> b() {
      return eth.J;
   }

   @Override
   public Set<euk<?>> a() {
      return this.b.a();
   }

   @Override
   public cuq a(cuq $$0, err $$1) {
      km $$2 = this.b.a($$1);
      $$0.b($$2.a(this.e));
      return $$0;
   }

   public static esr.a a(esr.b $$0) {
      return new esr.a($$0);
   }

   public static class a extends ete.a<esr.a> {
      private final esr.b a;
      private Optional<Builder<kp<?>>> b = Optional.empty();
      private Optional<Builder<kp<?>>> c = Optional.empty();

      a(esr.b $$0) {
         this.a = $$0;
      }

      public esr.a a(kp<?> $$0) {
         if (this.b.isEmpty()) {
            this.b = Optional.of(ImmutableList.builder());
         }

         this.b.get().add($$0);
         return this;
      }

      public esr.a b(kp<?> $$0) {
         if (this.c.isEmpty()) {
            this.c = Optional.of(ImmutableList.builder());
         }

         this.c.get().add($$0);
         return this;
      }

      protected esr.a a() {
         return this;
      }

      @Override
      public etf b() {
         return new esr(this.g(), this.a, this.b.map(Builder::build), this.c.map(Builder::build));
      }
   }

   public static enum b implements azk {
      a("block_entity");

      public static final Codec<esr.b> b = azk.b(esr.b::values);
      private final String c;

      private b(final String $$0) {
         this.c = $$0;
      }

      public km a(err $$0) {
         switch (this) {
            case a:
               dqh $$1 = $$0.c(eun.h);
               return $$1 != null ? $$1.s() : km.a;
            default:
               throw new MatchException(null, null);
         }
      }

      public Set<euk<?>> a() {
         switch (this) {
            case a:
               return Set.of(eun.h);
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
