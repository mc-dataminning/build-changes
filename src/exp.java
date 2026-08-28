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

public class exp extends eyc {
   public static final MapCodec<exp> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  exp.b.b.fieldOf("source").forGetter($$0x -> $$0x.b),
                  kt.a.listOf().optionalFieldOf("include").forGetter($$0x -> $$0x.c),
                  kt.a.listOf().optionalFieldOf("exclude").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, exp::new)
   );
   private final exp.b b;
   private final Optional<List<kt<?>>> c;
   private final Optional<List<kt<?>>> d;
   private final Predicate<kt<?>> e;

   exp(List<ezy> $$0, exp.b $$1, Optional<List<kt<?>>> $$2, Optional<List<kt<?>>> $$3) {
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
   public eye<exp> b() {
      return eyf.J;
   }

   @Override
   public Set<bbn<?>> a() {
      return this.b.a();
   }

   @Override
   public cxp a(cxp $$0, ewp $$1) {
      kq $$2 = this.b.a($$1);
      $$0.b($$2.a(this.e));
      return $$0;
   }

   public static exp.a a(exp.b $$0) {
      return new exp.a($$0);
   }

   public static class a extends eyc.a<exp.a> {
      private final exp.b a;
      private Optional<Builder<kt<?>>> b = Optional.empty();
      private Optional<Builder<kt<?>>> c = Optional.empty();

      a(exp.b $$0) {
         this.a = $$0;
      }

      public exp.a a(kt<?> $$0) {
         if (this.b.isEmpty()) {
            this.b = Optional.of(ImmutableList.builder());
         }

         this.b.get().add($$0);
         return this;
      }

      public exp.a b(kt<?> $$0) {
         if (this.c.isEmpty()) {
            this.c = Optional.of(ImmutableList.builder());
         }

         this.c.get().add($$0);
         return this;
      }

      protected exp.a a() {
         return this;
      }

      @Override
      public eyd b() {
         return new exp(this.g(), this.a, this.b.map(Builder::build), this.c.map(Builder::build));
      }
   }

   public static enum b implements bba {
      a("block_entity");

      public static final Codec<exp.b> b = bba.b(exp.b::values);
      private final String c;

      private b(final String $$0) {
         this.c = $$0;
      }

      public kq a(ewp $$0) {
         switch (this) {
            case a:
               dux $$1 = $$0.c(ezj.h);
               return $$1 != null ? $$1.r() : kq.a;
            default:
               throw new MatchException(null, null);
         }
      }

      public Set<bbn<?>> a() {
         switch (this) {
            case a:
               return Set.of(ezj.h);
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
