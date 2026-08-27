import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public record cz(List<cz.c> b) {
   private static final Codec<List<cz.c>> c = Codec.unboundedMap(Codec.STRING, cz.e.b)
      .xmap(
         $$0 -> $$0.entrySet().stream().map($$0x -> new cz.c((String)$$0x.getKey(), (cz.e)$$0x.getValue())).toList(),
         $$0 -> $$0.stream().collect(Collectors.toMap(cz.c::a, cz.c::b))
      );
   public static final Codec<cz> a = c.xmap(cz::new, cz::a);

   public <S extends djc<?, S>> boolean a(djb<?, S> $$0, S $$1) {
      for (cz.c $$2 : this.b) {
         if (!$$2.a($$0, $$1)) {
            return false;
         }
      }

      return true;
   }

   public boolean a(dja $$0) {
      return this.a($$0.b().n(), $$0);
   }

   public boolean a(eek $$0) {
      return this.a($$0.a().f(), $$0);
   }

   public Optional<String> a(djb<?, ?> $$0) {
      for (cz.c $$1 : this.b) {
         Optional<String> $$2 = $$1.a($$0);
         if ($$2.isPresent()) {
            return $$2;
         }
      }

      return Optional.empty();
   }

   public List<cz.c> a() {
      return this.b;
   }

   public static class a {
      private final Builder<cz.c> a = ImmutableList.builder();

      private a() {
      }

      public static cz.a a() {
         return new cz.a();
      }

      public cz.a a(dkd<?> $$0, String $$1) {
         this.a.add(new cz.c($$0.f(), new cz.b($$1)));
         return this;
      }

      public cz.a a(dkd<Integer> $$0, int $$1) {
         return this.a($$0, Integer.toString($$1));
      }

      public cz.a a(dkd<Boolean> $$0, boolean $$1) {
         return this.a($$0, Boolean.toString($$1));
      }

      public <T extends Comparable<T> & ave> cz.a a(dkd<T> $$0, T $$1) {
         return this.a($$0, $$1.c());
      }

      public Optional<cz> b() {
         return Optional.of(new cz(this.a.build()));
      }
   }

   static record b(String c) implements cz.e {
      public static final Codec<cz.b> a = Codec.STRING.xmap(cz.b::new, cz.b::a);

      @Override
      public <T extends Comparable<T>> boolean a(djc<?, ?> $$0, dkd<T> $$1) {
         T $$2 = $$0.c($$1);
         Optional<T> $$3 = $$1.b(this.c);
         return $$3.isPresent() && $$2.compareTo($$3.get()) == 0;
      }

      public String a() {
         return this.c;
      }
   }

   static record c(String a, cz.e b) {
      public <S extends djc<?, S>> boolean a(djb<?, S> $$0, S $$1) {
         dkd<?> $$2 = $$0.a(this.a);
         return $$2 != null && this.b.a($$1, $$2);
      }

      public Optional<String> a(djb<?, ?> $$0) {
         dkd<?> $$1 = $$0.a(this.a);
         return $$1 != null ? Optional.empty() : Optional.of(this.a);
      }
   }

   static record d(Optional<String> c, Optional<String> d) implements cz.e {
      public static final Codec<cz.d> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(atq.a(Codec.STRING, "min").forGetter(cz.d::a), atq.a(Codec.STRING, "max").forGetter(cz.d::b)).apply($$0, cz.d::new)
      );

      @Override
      public <T extends Comparable<T>> boolean a(djc<?, ?> $$0, dkd<T> $$1) {
         T $$2 = $$0.c($$1);
         if (this.c.isPresent()) {
            Optional<T> $$3 = $$1.b(this.c.get());
            if ($$3.isEmpty() || $$2.compareTo($$3.get()) < 0) {
               return false;
            }
         }

         if (this.d.isPresent()) {
            Optional<T> $$4 = $$1.b(this.d.get());
            if ($$4.isEmpty() || $$2.compareTo($$4.get()) > 0) {
               return false;
            }
         }

         return true;
      }

      public Optional<String> a() {
         return this.c;
      }

      public Optional<String> b() {
         return this.d;
      }
   }

   interface e {
      Codec<cz.e> b = Codec.either(cz.b.a, cz.d.a).xmap($$0 -> (cz.e)$$0.map($$0x -> $$0x, $$0x -> $$0x), $$0 -> {
         if ($$0 instanceof cz.b $$1) {
            return Either.left($$1);
         } else if ($$0 instanceof cz.d $$2) {
            return Either.right($$2);
         } else {
            throw new UnsupportedOperationException();
         }
      });

      <T extends Comparable<T>> boolean a(djc<?, ?> var1, dkd<T> var2);
   }
}
