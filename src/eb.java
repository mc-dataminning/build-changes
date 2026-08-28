import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public record eb(List<eb.c> c) {
   private static final Codec<List<eb.c>> d = Codec.unboundedMap(Codec.STRING, eb.e.c)
      .xmap(
         $$0 -> $$0.entrySet().stream().map($$0x -> new eb.c((String)$$0x.getKey(), (eb.e)$$0x.getValue())).toList(),
         $$0 -> $$0.stream().collect(Collectors.toMap(eb.c::a, eb.c::b))
      );
   public static final Codec<eb> a = d.xmap(eb::new, eb::a);
   public static final yx<ByteBuf, eb> b = eb.c.a.a(yv.a()).a(eb::new, eb::a);

   public <S extends dte<?, S>> boolean a(dtd<?, S> $$0, S $$1) {
      for (eb.c $$2 : this.c) {
         if (!$$2.a($$0, $$1)) {
            return false;
         }
      }

      return true;
   }

   public boolean a(dtc $$0) {
      return this.a($$0.b().l(), $$0);
   }

   public boolean a(epc $$0) {
      return this.a($$0.a().f(), $$0);
   }

   public Optional<String> a(dtd<?, ?> $$0) {
      for (eb.c $$1 : this.c) {
         Optional<String> $$2 = $$1.a($$0);
         if ($$2.isPresent()) {
            return $$2;
         }
      }

      return Optional.empty();
   }

   public List<eb.c> a() {
      return this.c;
   }

   public static class a {
      private final Builder<eb.c> a = ImmutableList.builder();

      private a() {
      }

      public static eb.a a() {
         return new eb.a();
      }

      public eb.a a(duf<?> $$0, String $$1) {
         this.a.add(new eb.c($$0.f(), new eb.b($$1)));
         return this;
      }

      public eb.a a(duf<Integer> $$0, int $$1) {
         return this.a($$0, Integer.toString($$1));
      }

      public eb.a a(duf<Boolean> $$0, boolean $$1) {
         return this.a($$0, Boolean.toString($$1));
      }

      public <T extends Comparable<T> & azk> eb.a a(duf<T> $$0, T $$1) {
         return this.a($$0, $$1.c());
      }

      public Optional<eb> b() {
         return Optional.of(new eb(this.a.build()));
      }
   }

   static record b(String e) implements eb.e {
      public static final Codec<eb.b> a = Codec.STRING.xmap(eb.b::new, eb.b::a);
      public static final yx<ByteBuf, eb.b> b = yv.l.a(eb.b::new, eb.b::a);

      @Override
      public <T extends Comparable<T>> boolean a(dte<?, ?> $$0, duf<T> $$1) {
         T $$2 = $$0.c($$1);
         Optional<T> $$3 = $$1.b(this.e);
         return $$3.isPresent() && $$2.compareTo($$3.get()) == 0;
      }

      public String a() {
         return this.e;
      }
   }

   static record c(String b, eb.e c) {
      public static final yx<ByteBuf, eb.c> a = yx.a(yv.l, eb.c::a, eb.e.d, eb.c::b, eb.c::new);

      public <S extends dte<?, S>> boolean a(dtd<?, S> $$0, S $$1) {
         duf<?> $$2 = $$0.a(this.b);
         return $$2 != null && this.c.a($$1, $$2);
      }

      public Optional<String> a(dtd<?, ?> $$0) {
         duf<?> $$1 = $$0.a(this.b);
         return $$1 != null ? Optional.empty() : Optional.of(this.b);
      }

      public String a() {
         return this.b;
      }

      public eb.e b() {
         return this.c;
      }
   }

   static record d(Optional<String> e, Optional<String> f) implements eb.e {
      public static final Codec<eb.d> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.STRING.optionalFieldOf("min").forGetter(eb.d::a), Codec.STRING.optionalFieldOf("max").forGetter(eb.d::b)).apply($$0, eb.d::new)
      );
      public static final yx<ByteBuf, eb.d> b = yx.a(yv.a(yv.l), eb.d::a, yv.a(yv.l), eb.d::b, eb.d::new);

      @Override
      public <T extends Comparable<T>> boolean a(dte<?, ?> $$0, duf<T> $$1) {
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
      Codec<eb.e> c = Codec.either(eb.b.a, eb.d.a).xmap(Either::unwrap, $$0 -> {
         if ($$0 instanceof eb.b $$1) {
            return Either.left($$1);
         } else if ($$0 instanceof eb.d $$2) {
            return Either.right($$2);
         } else {
            throw new UnsupportedOperationException();
         }
      });
      yx<ByteBuf, eb.e> d = yv.a(eb.b.b, eb.d.b).a(Either::unwrap, $$0 -> {
         if ($$0 instanceof eb.b $$1) {
            return Either.left($$1);
         } else if ($$0 instanceof eb.d $$2) {
            return Either.right($$2);
         } else {
            throw new UnsupportedOperationException();
         }
      });

      <T extends Comparable<T>> boolean a(dte<?, ?> var1, duf<T> var2);
   }
}
