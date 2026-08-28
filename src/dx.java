import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public record dx(List<dx.c> c) {
   private static final Codec<List<dx.c>> d = Codec.unboundedMap(Codec.STRING, dx.e.c)
      .xmap(
         $$0 -> $$0.entrySet().stream().map($$0x -> new dx.c((String)$$0x.getKey(), (dx.e)$$0x.getValue())).toList(),
         $$0 -> $$0.stream().collect(Collectors.toMap(dx.c::a, dx.c::b))
      );
   public static final Codec<dx> a = d.xmap(dx::new, dx::a);
   public static final zm<ByteBuf, dx> b = dx.c.a.a(zk.a()).a(dx::new, dx::a);

   public <S extends dsc<?, S>> boolean a(dsb<?, S> $$0, S $$1) {
      for (dx.c $$2 : this.c) {
         if (!$$2.a($$0, $$1)) {
            return false;
         }
      }

      return true;
   }

   public boolean a(dsa $$0) {
      return this.a($$0.b().l(), $$0);
   }

   public boolean a(ent $$0) {
      return this.a($$0.a().f(), $$0);
   }

   public Optional<String> a(dsb<?, ?> $$0) {
      for (dx.c $$1 : this.c) {
         Optional<String> $$2 = $$1.a($$0);
         if ($$2.isPresent()) {
            return $$2;
         }
      }

      return Optional.empty();
   }

   public List<dx.c> a() {
      return this.c;
   }

   public static class a {
      private final Builder<dx.c> a = ImmutableList.builder();

      private a() {
      }

      public static dx.a a() {
         return new dx.a();
      }

      public dx.a a(dtd<?> $$0, String $$1) {
         this.a.add(new dx.c($$0.f(), new dx.b($$1)));
         return this;
      }

      public dx.a a(dtd<Integer> $$0, int $$1) {
         return this.a($$0, Integer.toString($$1));
      }

      public dx.a a(dtd<Boolean> $$0, boolean $$1) {
         return this.a($$0, Boolean.toString($$1));
      }

      public <T extends Comparable<T> & azs> dx.a a(dtd<T> $$0, T $$1) {
         return this.a($$0, $$1.c());
      }

      public Optional<dx> b() {
         return Optional.of(new dx(this.a.build()));
      }
   }

   static record b(String e) implements dx.e {
      public static final Codec<dx.b> a = Codec.STRING.xmap(dx.b::new, dx.b::a);
      public static final zm<ByteBuf, dx.b> b = zk.l.a(dx.b::new, dx.b::a);

      @Override
      public <T extends Comparable<T>> boolean a(dsc<?, ?> $$0, dtd<T> $$1) {
         T $$2 = $$0.c($$1);
         Optional<T> $$3 = $$1.b(this.e);
         return $$3.isPresent() && $$2.compareTo($$3.get()) == 0;
      }

      public String a() {
         return this.e;
      }
   }

   static record c(String b, dx.e c) {
      public static final zm<ByteBuf, dx.c> a = zm.a(zk.l, dx.c::a, dx.e.d, dx.c::b, dx.c::new);

      public <S extends dsc<?, S>> boolean a(dsb<?, S> $$0, S $$1) {
         dtd<?> $$2 = $$0.a(this.b);
         return $$2 != null && this.c.a($$1, $$2);
      }

      public Optional<String> a(dsb<?, ?> $$0) {
         dtd<?> $$1 = $$0.a(this.b);
         return $$1 != null ? Optional.empty() : Optional.of(this.b);
      }

      public String a() {
         return this.b;
      }

      public dx.e b() {
         return this.c;
      }
   }

   static record d(Optional<String> e, Optional<String> f) implements dx.e {
      public static final Codec<dx.d> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.STRING.optionalFieldOf("min").forGetter(dx.d::a), Codec.STRING.optionalFieldOf("max").forGetter(dx.d::b)).apply($$0, dx.d::new)
      );
      public static final zm<ByteBuf, dx.d> b = zm.a(zk.a(zk.l), dx.d::a, zk.a(zk.l), dx.d::b, dx.d::new);

      @Override
      public <T extends Comparable<T>> boolean a(dsc<?, ?> $$0, dtd<T> $$1) {
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
      Codec<dx.e> c = Codec.either(dx.b.a, dx.d.a).xmap(Either::unwrap, $$0 -> {
         if ($$0 instanceof dx.b $$1) {
            return Either.left($$1);
         } else if ($$0 instanceof dx.d $$2) {
            return Either.right($$2);
         } else {
            throw new UnsupportedOperationException();
         }
      });
      zm<ByteBuf, dx.e> d = zk.a(dx.b.b, dx.d.b).a(Either::unwrap, $$0 -> {
         if ($$0 instanceof dx.b $$1) {
            return Either.left($$1);
         } else if ($$0 instanceof dx.d $$2) {
            return Either.right($$2);
         } else {
            throw new UnsupportedOperationException();
         }
      });

      <T extends Comparable<T>> boolean a(dsc<?, ?> var1, dtd<T> var2);
   }
}
