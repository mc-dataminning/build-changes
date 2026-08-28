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

public class ews extends exf {
   public static final MapCodec<ews> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  ews.b.b.fieldOf("source").forGetter($$0x -> $$0x.b),
                  ku.a.listOf().optionalFieldOf("include").forGetter($$0x -> $$0x.c),
                  ku.a.listOf().optionalFieldOf("exclude").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, ews::new)
   );
   private final ews.b b;
   private final Optional<List<ku<?>>> c;
   private final Optional<List<ku<?>>> d;
   private final Predicate<ku<?>> e;

   ews(List<ezb> $$0, ews.b $$1, Optional<List<ku<?>>> $$2, Optional<List<ku<?>>> $$3) {
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
   public exh<ews> b() {
      return exi.J;
   }

   @Override
   public Set<bai<?>> a() {
      return this.b.a();
   }

   @Override
   public cwq a(cwq $$0, evs $$1) {
      kr $$2 = this.b.a($$1);
      $$0.b($$2.a(this.e));
      return $$0;
   }

   public static ews.a a(ews.b $$0) {
      return new ews.a($$0);
   }

   public static class a extends exf.a<ews.a> {
      private final ews.b a;
      private Optional<Builder<ku<?>>> b = Optional.empty();
      private Optional<Builder<ku<?>>> c = Optional.empty();

      a(ews.b $$0) {
         this.a = $$0;
      }

      public ews.a a(ku<?> $$0) {
         if (this.b.isEmpty()) {
            this.b = Optional.of(ImmutableList.builder());
         }

         this.b.get().add($$0);
         return this;
      }

      public ews.a b(ku<?> $$0) {
         if (this.c.isEmpty()) {
            this.c = Optional.of(ImmutableList.builder());
         }

         this.c.get().add($$0);
         return this;
      }

      protected ews.a a() {
         return this;
      }

      @Override
      public exg b() {
         return new ews(this.g(), this.a, this.b.map(Builder::build), this.c.map(Builder::build));
      }
   }

   public static enum b implements azv {
      a("block_entity");

      public static final Codec<ews.b> b = azv.b(ews.b::values);
      private final String c;

      private b(final String $$0) {
         this.c = $$0;
      }

      public kr a(evs $$0) {
         switch (this) {
            case a:
               dua $$1 = $$0.c(eym.h);
               return $$1 != null ? $$1.q() : kr.a;
            default:
               throw new MatchException(null, null);
         }
      }

      public Set<bai<?>> a() {
         switch (this) {
            case a:
               return Set.of(eym.h);
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
