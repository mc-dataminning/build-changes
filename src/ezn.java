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

public class ezn extends faa {
   public static final MapCodec<ezn> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  ezn.b.b.fieldOf("source").forGetter($$0x -> $$0x.b),
                  ki.a.listOf().optionalFieldOf("include").forGetter($$0x -> $$0x.c),
                  ki.a.listOf().optionalFieldOf("exclude").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, ezn::new)
   );
   private final ezn.b b;
   private final Optional<List<ki<?>>> c;
   private final Optional<List<ki<?>>> d;
   private final Predicate<ki<?>> e;

   ezn(List<fbw> $$0, ezn.b $$1, Optional<List<ki<?>>> $$2, Optional<List<ki<?>>> $$3) {
      super($$0);
      this.b = $$1;
      this.c = $$2.map(List::copyOf);
      this.d = $$3.map(List::copyOf);
      List<Predicate<ki<?>>> $$4 = new ArrayList<>(2);
      $$3.ifPresent($$1x -> $$4.add($$1xx -> !$$1x.contains($$1xx)));
      $$2.ifPresent($$1x -> $$4.add($$1x::contains));
      this.e = af.a($$4);
   }

   @Override
   public fac<ezn> b() {
      return fad.J;
   }

   @Override
   public Set<bav<?>> a() {
      return this.b.a();
   }

   @Override
   public cys a(cys $$0, eyn $$1) {
      kg $$2 = this.b.a($$1);
      $$0.b($$2.a(this.e));
      return $$0;
   }

   public static ezn.a a(ezn.b $$0) {
      return new ezn.a($$0);
   }

   public static class a extends faa.a<ezn.a> {
      private final ezn.b a;
      private Optional<Builder<ki<?>>> b = Optional.empty();
      private Optional<Builder<ki<?>>> c = Optional.empty();

      a(ezn.b $$0) {
         this.a = $$0;
      }

      public ezn.a a(ki<?> $$0) {
         if (this.b.isEmpty()) {
            this.b = Optional.of(ImmutableList.builder());
         }

         this.b.get().add($$0);
         return this;
      }

      public ezn.a b(ki<?> $$0) {
         if (this.c.isEmpty()) {
            this.c = Optional.of(ImmutableList.builder());
         }

         this.c.get().add($$0);
         return this;
      }

      protected ezn.a a() {
         return this;
      }

      @Override
      public fab b() {
         return new ezn(this.g(), this.a, this.b.map(Builder::build), this.c.map(Builder::build));
      }
   }

   public static enum b implements bai {
      a("block_entity");

      public static final Codec<ezn.b> b = bai.b(ezn.b::values);
      private final String c;

      private b(final String $$0) {
         this.c = $$0;
      }

      public kg a(eyn $$0) {
         switch (this) {
            case a:
               dwn $$1 = $$0.c(fbh.h);
               return $$1 != null ? $$1.q() : kg.a;
            default:
               throw new MatchException(null, null);
         }
      }

      public Set<bav<?>> a() {
         switch (this) {
            case a:
               return Set.of(fbh.h);
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
