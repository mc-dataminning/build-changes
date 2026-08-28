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

public class exo extends eyb {
   public static final MapCodec<exo> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  exo.b.b.fieldOf("source").forGetter($$0x -> $$0x.b),
                  kt.a.listOf().optionalFieldOf("include").forGetter($$0x -> $$0x.c),
                  kt.a.listOf().optionalFieldOf("exclude").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, exo::new)
   );
   private final exo.b b;
   private final Optional<List<kt<?>>> c;
   private final Optional<List<kt<?>>> d;
   private final Predicate<kt<?>> e;

   exo(List<ezx> $$0, exo.b $$1, Optional<List<kt<?>>> $$2, Optional<List<kt<?>>> $$3) {
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
   public eyd<exo> b() {
      return eye.J;
   }

   @Override
   public Set<bbn<?>> a() {
      return this.b.a();
   }

   @Override
   public cxo a(cxo $$0, ewo $$1) {
      kq $$2 = this.b.a($$1);
      $$0.b($$2.a(this.e));
      return $$0;
   }

   public static exo.a a(exo.b $$0) {
      return new exo.a($$0);
   }

   public static class a extends eyb.a<exo.a> {
      private final exo.b a;
      private Optional<Builder<kt<?>>> b = Optional.empty();
      private Optional<Builder<kt<?>>> c = Optional.empty();

      a(exo.b $$0) {
         this.a = $$0;
      }

      public exo.a a(kt<?> $$0) {
         if (this.b.isEmpty()) {
            this.b = Optional.of(ImmutableList.builder());
         }

         this.b.get().add($$0);
         return this;
      }

      public exo.a b(kt<?> $$0) {
         if (this.c.isEmpty()) {
            this.c = Optional.of(ImmutableList.builder());
         }

         this.c.get().add($$0);
         return this;
      }

      protected exo.a a() {
         return this;
      }

      @Override
      public eyc b() {
         return new exo(this.g(), this.a, this.b.map(Builder::build), this.c.map(Builder::build));
      }
   }

   public static enum b implements bba {
      a("block_entity");

      public static final Codec<exo.b> b = bba.b(exo.b::values);
      private final String c;

      private b(final String $$0) {
         this.c = $$0;
      }

      public kq a(ewo $$0) {
         switch (this) {
            case a:
               duw $$1 = $$0.c(ezi.h);
               return $$1 != null ? $$1.r() : kq.a;
            default:
               throw new MatchException(null, null);
         }
      }

      public Set<bbn<?>> a() {
         switch (this) {
            case a:
               return Set.of(ezi.h);
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
