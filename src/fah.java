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

public class fah extends fau {
   public static final MapCodec<fah> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  fah.b.b.fieldOf("source").forGetter($$0x -> $$0x.b),
                  ki.a.listOf().optionalFieldOf("include").forGetter($$0x -> $$0x.c),
                  ki.a.listOf().optionalFieldOf("exclude").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, fah::new)
   );
   private final fah.b b;
   private final Optional<List<ki<?>>> c;
   private final Optional<List<ki<?>>> d;
   private final Predicate<ki<?>> e;

   fah(List<fcq> $$0, fah.b $$1, Optional<List<ki<?>>> $$2, Optional<List<ki<?>>> $$3) {
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
   public faw<fah> b() {
      return fax.J;
   }

   @Override
   public Set<bax<?>> a() {
      return this.b.a();
   }

   @Override
   public czd a(czd $$0, ezh $$1) {
      kg $$2 = this.b.a($$1);
      $$0.b($$2.a(this.e));
      return $$0;
   }

   public static fah.a a(fah.b $$0) {
      return new fah.a($$0);
   }

   public static class a extends fau.a<fah.a> {
      private final fah.b a;
      private Optional<Builder<ki<?>>> b = Optional.empty();
      private Optional<Builder<ki<?>>> c = Optional.empty();

      a(fah.b $$0) {
         this.a = $$0;
      }

      public fah.a a(ki<?> $$0) {
         if (this.b.isEmpty()) {
            this.b = Optional.of(ImmutableList.builder());
         }

         this.b.get().add($$0);
         return this;
      }

      public fah.a b(ki<?> $$0) {
         if (this.c.isEmpty()) {
            this.c = Optional.of(ImmutableList.builder());
         }

         this.c.get().add($$0);
         return this;
      }

      protected fah.a a() {
         return this;
      }

      @Override
      public fav b() {
         return new fah(this.g(), this.a, this.b.map(Builder::build), this.c.map(Builder::build));
      }
   }

   public static enum b implements bak {
      a("block_entity");

      public static final Codec<fah.b> b = bak.b(fah.b::values);
      private final String c;

      private b(final String $$0) {
         this.c = $$0;
      }

      public kg a(ezh $$0) {
         switch (this) {
            case a:
               dxf $$1 = $$0.c(fcb.h);
               return $$1 != null ? $$1.q() : kg.a;
            default:
               throw new MatchException(null, null);
         }
      }

      public Set<bax<?>> a() {
         switch (this) {
            case a:
               return Set.of(fcb.h);
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
