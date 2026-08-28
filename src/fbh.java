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

public class fbh extends fbu {
   public static final MapCodec<fbh> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  fbh.b.b.fieldOf("source").forGetter($$0x -> $$0x.b),
                  kj.a.listOf().optionalFieldOf("include").forGetter($$0x -> $$0x.c),
                  kj.a.listOf().optionalFieldOf("exclude").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, fbh::new)
   );
   private final fbh.b b;
   private final Optional<List<kj<?>>> c;
   private final Optional<List<kj<?>>> d;
   private final Predicate<kj<?>> e;

   fbh(List<fdq> $$0, fbh.b $$1, Optional<List<kj<?>>> $$2, Optional<List<kj<?>>> $$3) {
      super($$0);
      this.b = $$1;
      this.c = $$2.map(List::copyOf);
      this.d = $$3.map(List::copyOf);
      List<Predicate<kj<?>>> $$4 = new ArrayList<>(2);
      $$3.ifPresent($$1x -> $$4.add($$1xx -> !$$1x.contains($$1xx)));
      $$2.ifPresent($$1x -> $$4.add($$1x::contains));
      this.e = ag.a($$4);
   }

   @Override
   public fbw<fbh> b() {
      return fbx.J;
   }

   @Override
   public Set<baz<?>> a() {
      return this.b.a();
   }

   @Override
   public czy a(czy $$0, fah $$1) {
      kh $$2 = this.b.a($$1);
      $$0.b($$2.a(this.e));
      return $$0;
   }

   public static fbh.a a(fbh.b $$0) {
      return new fbh.a($$0);
   }

   public static class a extends fbu.a<fbh.a> {
      private final fbh.b a;
      private Optional<Builder<kj<?>>> b = Optional.empty();
      private Optional<Builder<kj<?>>> c = Optional.empty();

      a(fbh.b $$0) {
         this.a = $$0;
      }

      public fbh.a a(kj<?> $$0) {
         if (this.b.isEmpty()) {
            this.b = Optional.of(ImmutableList.builder());
         }

         this.b.get().add($$0);
         return this;
      }

      public fbh.a b(kj<?> $$0) {
         if (this.c.isEmpty()) {
            this.c = Optional.of(ImmutableList.builder());
         }

         this.c.get().add($$0);
         return this;
      }

      protected fbh.a a() {
         return this;
      }

      @Override
      public fbv b() {
         return new fbh(this.g(), this.a, this.b.map(Builder::build), this.c.map(Builder::build));
      }
   }

   public static enum b implements bam {
      a("block_entity");

      public static final Codec<fbh.b> b = bam.b(fbh.b::values);
      private final String c;

      private b(final String $$0) {
         this.c = $$0;
      }

      public kh a(fah $$0) {
         switch (this) {
            case a:
               dyc $$1 = $$0.c(fdb.h);
               return $$1 != null ? $$1.q() : kh.a;
            default:
               throw new MatchException(null, null);
         }
      }

      public Set<baz<?>> a() {
         switch (this) {
            case a:
               return Set.of(fdb.h);
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
