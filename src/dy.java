import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public record dy(List<dy.c> c) {
   private static final Codec<List<dy.c>> d = Codec.unboundedMap(Codec.STRING, dy.e.c)
      .xmap(
         $$0 -> $$0.entrySet().stream().map($$0x -> new dy.c((String)$$0x.getKey(), (dy.e)$$0x.getValue())).toList(),
         $$0 -> $$0.stream().collect(Collectors.toMap(dy.c::a, dy.c::b))
      );
   public static final Codec<dy> a = d.xmap(dy::new, dy::a);
   public static final ys<ByteBuf, dy> b = dy.c.a.a(yq.a()).a(dy::new, dy::a);

   public <S extends dsn<?, S>> boolean a(dsm<?, S> $$0, S $$1) {
      for (dy.c $$2 : this.c) {
         if (!$$2.a($$0, $$1)) {
            return false;
         }
      }

      return true;
   }

   public boolean a(dsl $$0) {
      return this.a($$0.b().l(), $$0);
   }

   public boolean a(eoj $$0) {
      return this.a($$0.a().f(), $$0);
   }

   public Optional<String> a(dsm<?, ?> $$0) {
      for (dy.c $$1 : this.c) {
         Optional<String> $$2 = $$1.a($$0);
         if ($$2.isPresent()) {
            return $$2;
         }
      }

      return Optional.empty();
   }

   public List<dy.c> a() {
      return this.c;
   }

   public static class a {
      private final Builder<dy.c> a = ImmutableList.builder();

      private a() {
      }

      public static dy.a a() {
         return new dy.a();
      }

      public dy.a a(dto<?> $$0, String $$1) {
         this.a.add(new dy.c($$0.f(), new dy.b($$1)));
         return this;
      }

      public dy.a a(dto<Integer> $$0, int $$1) {
         return this.a($$0, Integer.toString($$1));
      }

      public dy.a a(dto<Boolean> $$0, boolean $$1) {
         return this.a($$0, Boolean.toString($$1));
      }

      public <T extends Comparable<T> & azc> dy.a a(dto<T> $$0, T $$1) {
         return this.a($$0, $$1.c());
      }

      public Optional<dy> b() {
         return Optional.of(new dy(this.a.build()));
      }
   }

   static record b(String e) implements dy.e {
      public static final Codec<dy.b> a = Codec.STRING.xmap(dy.b::new, dy.b::a);
      public static final ys<ByteBuf, dy.b> b = yq.l.a(dy.b::new, dy.b::a);

      @Override
      public <T extends Comparable<T>> boolean a(dsn<?, ?> $$0, dto<T> $$1) {
         T $$2 = $$0.c($$1);
         Optional<T> $$3 = $$1.b(this.e);
         return $$3.isPresent() && $$2.compareTo($$3.get()) == 0;
      }

      public String a() {
         return this.e;
      }
   }

   static record c(String b, dy.e c) {
      public static final ys<ByteBuf, dy.c> a = ys.a(yq.l, dy.c::a, dy.e.d, dy.c::b, dy.c::new);

      public <S extends dsn<?, S>> boolean a(dsm<?, S> $$0, S $$1) {
         dto<?> $$2 = $$0.a(this.b);
         return $$2 != null && this.c.a($$1, $$2);
      }

      public Optional<String> a(dsm<?, ?> $$0) {
         dto<?> $$1 = $$0.a(this.b);
         return $$1 != null ? Optional.empty() : Optional.of(this.b);
      }

      public String a() {
         return this.b;
      }

      public dy.e b() {
         return this.c;
      }
   }

   static record d(Optional<String> e, Optional<String> f) implements dy.e {
      public static final Codec<dy.d> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.STRING.optionalFieldOf("min").forGetter(dy.d::a), Codec.STRING.optionalFieldOf("max").forGetter(dy.d::b)).apply($$0, dy.d::new)
      );
      public static final ys<ByteBuf, dy.d> b = ys.a(yq.a(yq.l), dy.d::a, yq.a(yq.l), dy.d::b, dy.d::new);

      @Override
      public <T extends Comparable<T>> boolean a(dsn<?, ?> $$0, dto<T> $$1) {
         T $$2 = $$0.c($$1);
         if (this.e.isPresent()) {
            Optional<T> $$3 = $$1.b(this.e.get());
            if ($$3.isEmpty() || $$2.compareTo($$3.get()) < 0) {
               return false;
            }
         }

         if (this.f.isPresent()) {
            Optional<T> $$4 = $$1.b(this.f.get());
            if ($$4.isEmpty() || $$2.compareTo($$4.get()) > 0) {
               return false;
            }
         }

         return true;
      }

      public Optional<String> a() {
         return this.e;
      }

      public Optional<String> b() {
         return this.f;
      }
   }

   interface e {
      Codec<dy.e> c = Codec.either(dy.b.a, dy.d.a).xmap(Either::unwrap, $$0 -> {
         if ($$0 instanceof dy.b $$1) {
            return Either.left($$1);
         } else if ($$0 instanceof dy.d $$2) {
            return Either.right($$2);
         } else {
            throw new UnsupportedOperationException();
         }
      });
      ys<ByteBuf, dy.e> d = yq.a(dy.b.b, dy.d.b).a(Either::unwrap, $$0 -> {
         if ($$0 instanceof dy.b $$1) {
            return Either.left($$1);
         } else if ($$0 instanceof dy.d $$2) {
            return Either.right($$2);
         } else {
            throw new UnsupportedOperationException();
         }
      });

      <T extends Comparable<T>> boolean a(dsn<?, ?> var1, dto<T> var2);
   }
}
