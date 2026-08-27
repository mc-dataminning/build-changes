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

public record da(List<da.c> b) {
   private static final Codec<List<da.c>> c = Codec.unboundedMap(Codec.STRING, da.e.b)
      .xmap(
         $$0 -> $$0.entrySet().stream().map($$0x -> new da.c((String)$$0x.getKey(), (da.e)$$0x.getValue())).toList(),
         $$0 -> $$0.stream().collect(Collectors.toMap(da.c::a, da.c::b))
      );
   public static final Codec<da> a = c.xmap(da::new, da::b);

   public <S extends dfl<?, S>> boolean a(dfk<?, S> $$0, S $$1) {
      for (da.c $$2 : this.b) {
         if (!$$2.a($$0, $$1)) {
            return false;
         }
      }

      return true;
   }

   public boolean a(dfj $$0) {
      return this.a($$0.b().l(), $$0);
   }

   public boolean a(eam $$0) {
      return this.a($$0.a().f(), $$0);
   }

   public Optional<String> a(dfk<?, ?> $$0) {
      for (da.c $$1 : this.b) {
         Optional<String> $$2 = $$1.a($$0);
         if ($$2.isPresent()) {
            return $$2;
         }
      }

      return Optional.empty();
   }

   public void a(dfk<?, ?> $$0, Consumer<String> $$1) {
      this.b.forEach($$2 -> $$2.a($$0).ifPresent($$1));
   }

   public static Optional<da> a(@Nullable JsonElement $$0) {
      return $$0 != null && !$$0.isJsonNull() ? Optional.of(ac.a(a.parse(JsonOps.INSTANCE, $$0), JsonParseException::new)) : Optional.empty();
   }

   public JsonElement a() {
      return ac.a(a.encodeStart(JsonOps.INSTANCE, this), IllegalStateException::new);
   }

   public static class a {
      private final Builder<da.c> a = ImmutableList.builder();

      private a() {
      }

      public static da.a a() {
         return new da.a();
      }

      public da.a a(dgm<?> $$0, String $$1) {
         this.a.add(new da.c($$0.f(), new da.b($$1)));
         return this;
      }

      public da.a a(dgm<Integer> $$0, int $$1) {
         return this.a($$0, Integer.toString($$1));
      }

      public da.a a(dgm<Boolean> $$0, boolean $$1) {
         return this.a($$0, Boolean.toString($$1));
      }

      public <T extends Comparable<T> & asp> da.a a(dgm<T> $$0, T $$1) {
         return this.a($$0, $$1.c());
      }

      public Optional<da> b() {
         return Optional.of(new da(this.a.build()));
      }
   }

   static record b(String c) implements da.e {
      public static final Codec<da.b> a = Codec.STRING.xmap(da.b::new, da.b::a);

      @Override
      public <T extends Comparable<T>> boolean a(dfl<?, ?> $$0, dgm<T> $$1) {
         T $$2 = $$0.c($$1);
         Optional<T> $$3 = $$1.b(this.c);
         return $$3.isPresent() && $$2.compareTo($$3.get()) == 0;
      }

      public String a() {
         return this.c;
      }
   }

   static record c(String a, da.e b) {
      public <S extends dfl<?, S>> boolean a(dfk<?, S> $$0, S $$1) {
         dgm<?> $$2 = $$0.a(this.a);
         return $$2 != null && this.b.a($$1, $$2);
      }

      public Optional<String> a(dfk<?, ?> $$0) {
         dgm<?> $$1 = $$0.a(this.a);
         return $$1 != null ? Optional.empty() : Optional.of(this.a);
      }
   }

   static record d(Optional<String> c, Optional<String> d) implements da.e {
      public static final Codec<da.d> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(arf.a(Codec.STRING, "min").forGetter(da.d::a), arf.a(Codec.STRING, "max").forGetter(da.d::b)).apply($$0, da.d::new)
      );

      @Override
      public <T extends Comparable<T>> boolean a(dfl<?, ?> $$0, dgm<T> $$1) {
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
      Codec<da.e> b = Codec.either(da.b.a, da.d.a).xmap($$0 -> (da.e)$$0.map($$0x -> $$0x, $$0x -> $$0x), $$0 -> {
         if ($$0 instanceof da.b $$1) {
            return Either.left($$1);
         } else if ($$0 instanceof da.d $$2) {
            return Either.right($$2);
         } else {
            throw new UnsupportedOperationException();
         }
      });

      <T extends Comparable<T>> boolean a(dfl<?, ?> var1, dgm<T> var2);
   }
}
