import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.JsonOps;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public record cy(List<cy.c> b) {
   private static final Codec<List<cy.c>> c = Codec.unboundedMap(Codec.STRING, cy.e.b)
      .xmap(
         $$0 -> $$0.entrySet().stream().map($$0x -> new cy.c((String)$$0x.getKey(), (cy.e)$$0x.getValue())).toList(),
         $$0 -> $$0.stream().collect(Collectors.toMap(cy.c::a, cy.c::b))
      );
   public static final Codec<cy> a = c.xmap(cy::new, cy::b);

   public <S extends dfc<?, S>> boolean a(dfb<?, S> $$0, S $$1) {
      for (cy.c $$2 : this.b) {
         if (!$$2.a($$0, $$1)) {
            return false;
         }
      }

      return true;
   }

   public boolean a(dfa $$0) {
      return this.a($$0.b().l(), $$0);
   }

   public boolean a(ead $$0) {
      return this.a($$0.a().f(), $$0);
   }

   public Optional<String> a(dfb<?, ?> $$0) {
      for (cy.c $$1 : this.b) {
         Optional<String> $$2 = $$1.a($$0);
         if ($$2.isPresent()) {
            return $$2;
         }
      }

      return Optional.empty();
   }

   public void a(dfb<?, ?> $$0, Consumer<String> $$1) {
      this.b.forEach($$2 -> $$2.a($$0).ifPresent($$1));
   }

   public static Optional<cy> a(@Nullable JsonElement $$0) {
      return $$0 != null && !$$0.isJsonNull() ? Optional.of(ac.a(a.parse(JsonOps.INSTANCE, $$0), JsonParseException::new)) : Optional.empty();
   }

   public JsonElement a() {
      return ac.a(a.encodeStart(JsonOps.INSTANCE, this), IllegalStateException::new);
   }

   public static class a {
      private final Builder<cy.c> a = ImmutableList.builder();

      private a() {
      }

      public static cy.a a() {
         return new cy.a();
      }

      public cy.a a(dgd<?> $$0, String $$1) {
         this.a.add(new cy.c($$0.f(), new cy.b($$1)));
         return this;
      }

      public cy.a a(dgd<Integer> $$0, int $$1) {
         return this.a($$0, Integer.toString($$1));
      }

      public cy.a a(dgd<Boolean> $$0, boolean $$1) {
         return this.a($$0, Boolean.toString($$1));
      }

      public <T extends Comparable<T> & ash> cy.a a(dgd<T> $$0, T $$1) {
         return this.a($$0, $$1.c());
      }

      public Optional<cy> b() {
         ImmutableList<cy.c> $$0 = this.a.build();
         return $$0.isEmpty() ? Optional.empty() : Optional.of(new cy($$0));
      }
   }

   static record b(String c) implements cy.e {
      public static final Codec<cy.b> a = Codec.STRING.xmap(cy.b::new, cy.b::a);

      @Override
      public <T extends Comparable<T>> boolean a(dfc<?, ?> $$0, dgd<T> $$1) {
         T $$2 = $$0.c($$1);
         Optional<T> $$3 = $$1.b(this.c);
         return $$3.isPresent() && $$2.compareTo($$3.get()) == 0;
      }

      public String a() {
         return this.c;
      }
   }

   static record c(String a, cy.e b) {
      public <S extends dfc<?, S>> boolean a(dfb<?, S> $$0, S $$1) {
         dgd<?> $$2 = $$0.a(this.a);
         return $$2 != null && this.b.a($$1, $$2);
      }

      public Optional<String> a(dfb<?, ?> $$0) {
         dgd<?> $$1 = $$0.a(this.a);
         return $$1 != null ? Optional.empty() : Optional.of(this.a);
      }
   }

   static record d(Optional<String> c, Optional<String> d) implements cy.e {
      public static final Codec<cy.d> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(aqy.a(Codec.STRING, "min").forGetter(cy.d::a), aqy.a(Codec.STRING, "max").forGetter(cy.d::b)).apply($$0, cy.d::new)
      );

      @Override
      public <T extends Comparable<T>> boolean a(dfc<?, ?> $$0, dgd<T> $$1) {
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
      Codec<cy.e> b = Codec.either(cy.b.a, cy.d.a).xmap($$0 -> (cy.e)$$0.map($$0x -> $$0x, $$0x -> $$0x), $$0 -> {
         if ($$0 instanceof cy.b $$1) {
            return Either.left($$1);
         } else if ($$0 instanceof cy.d $$2) {
            return Either.right($$2);
         } else {
            throw new UnsupportedOperationException();
         }
      });

      <T extends Comparable<T>> boolean a(dfc<?, ?> var1, dgd<T> var2);
   }
}
