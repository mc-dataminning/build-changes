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

public class evn extends ewa {
   public static final MapCodec<evn> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  evn.b.b.fieldOf("source").forGetter($$0x -> $$0x.b),
                  kt.a.listOf().optionalFieldOf("include").forGetter($$0x -> $$0x.c),
                  kt.a.listOf().optionalFieldOf("exclude").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, evn::new)
   );
   private final evn.b b;
   private final Optional<List<kt<?>>> c;
   private final Optional<List<kt<?>>> d;
   private final Predicate<kt<?>> e;

   evn(List<exy> $$0, evn.b $$1, Optional<List<kt<?>>> $$2, Optional<List<kt<?>>> $$3) {
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
   public ewc<evn> b() {
      return ewd.J;
   }

   @Override
   public Set<exg<?>> a() {
      return this.b.a();
   }

   @Override
   public cwm a(cwm $$0, eun $$1) {
      kq $$2 = this.b.a($$1);
      $$0.b($$2.a(this.e));
      return $$0;
   }

   public static evn.a a(evn.b $$0) {
      return new evn.a($$0);
   }

   public static class a extends ewa.a<evn.a> {
      private final evn.b a;
      private Optional<Builder<kt<?>>> b = Optional.empty();
      private Optional<Builder<kt<?>>> c = Optional.empty();

      a(evn.b $$0) {
         this.a = $$0;
      }

      public evn.a a(kt<?> $$0) {
         if (this.b.isEmpty()) {
            this.b = Optional.of(ImmutableList.builder());
         }

         this.b.get().add($$0);
         return this;
      }

      public evn.a b(kt<?> $$0) {
         if (this.c.isEmpty()) {
            this.c = Optional.of(ImmutableList.builder());
         }

         this.c.get().add($$0);
         return this;
      }

      protected evn.a a() {
         return this;
      }

      @Override
      public ewb b() {
         return new evn(this.g(), this.a, this.b.map(Builder::build), this.c.map(Builder::build));
      }
   }

   public static enum b implements bai {
      a("block_entity");

      public static final Codec<evn.b> b = bai.b(evn.b::values);
      private final String c;

      private b(final String $$0) {
         this.c = $$0;
      }

      public kq a(eun $$0) {
         switch (this) {
            case a:
               dsy $$1 = $$0.c(exj.h);
               return $$1 != null ? $$1.r() : kq.a;
            default:
               throw new MatchException(null, null);
         }
      }

      public Set<exg<?>> a() {
         switch (this) {
            case a:
               return Set.of(exj.h);
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
