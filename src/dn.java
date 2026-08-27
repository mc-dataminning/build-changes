import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public record dn(List<dn.c> c) {
   private static final Codec<List<dn.c>> d = Codec.unboundedMap(Codec.STRING, dn.e.c)
      .xmap(
         $$0 -> $$0.entrySet().stream().map($$0x -> new dn.c((String)$$0x.getKey(), (dn.e)$$0x.getValue())).toList(),
         $$0 -> $$0.stream().collect(Collectors.toMap(dn.c::a, dn.c::b))
      );
   public static final Codec<dn> a = d.xmap(dn::new, dn::a);
   public static final zc<ByteBuf, dn> b = dn.c.a.a(za.a()).a(dn::new, dn::a);

   public <S extends dte<?, S>> boolean a(dtd<?, S> $$0, S $$1) {
      for (dn.c $$2 : this.c) {
         if (!$$2.a($$0, $$1)) {
            return false;
         }
      }

      return true;
   }

   public boolean a(dtc $$0) {
      return this.a($$0.b().l(), $$0);
   }

   public boolean a(epe $$0) {
      return this.a($$0.a().f(), $$0);
   }

   public Optional<String> a(dtd<?, ?> $$0) {
      for (dn.c $$1 : this.c) {
         Optional<String> $$2 = $$1.a($$0);
         if ($$2.isPresent()) {
            return $$2;
         }
      }

      return Optional.empty();
   }

   public List<dn.c> a() {
      return this.c;
   }

   public static class a {
      private final Builder<dn.c> a = ImmutableList.builder();

      private a() {
      }

      public static dn.a a() {
         return new dn.a();
      }

      public dn.a a(duf<?> $$0, String $$1) {
         this.a.add(new dn.c($$0.f(), new dn.b($$1)));
         return this;
      }

      public dn.a a(duf<Integer> $$0, int $$1) {
         return this.a($$0, Integer.toString($$1));
      }

      public dn.a a(duf<Boolean> $$0, boolean $$1) {
         return this.a($$0, Boolean.toString($$1));
      }

      public <T extends Comparable<T> & azg> dn.a a(duf<T> $$0, T $$1) {
         return this.a($$0, $$1.c());
      }

      public Optional<dn> b() {
         return Optional.of(new dn(this.a.build()));
      }
   }

   static record b(String e) implements dn.e {
      public static final Codec<dn.b> a = Codec.STRING.xmap(dn.b::new, dn.b::a);
      public static final zc<ByteBuf, dn.b> b = za.l.a(dn.b::new, dn.b::a);

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

   static record c(String b, dn.e c) {
      public static final zc<ByteBuf, dn.c> a = zc.a(za.l, dn.c::a, dn.e.d, dn.c::b, dn.c::new);

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

      public dn.e b() {
         return this.c;
      }
   }

   static record d(Optional<String> e, Optional<String> f) implements dn.e {
      public static final Codec<dn.d> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(axu.a(Codec.STRING, "min").forGetter(dn.d::a), axu.a(Codec.STRING, "max").forGetter(dn.d::b)).apply($$0, dn.d::new)
      );
      public static final zc<ByteBuf, dn.d> b = zc.a(za.a(za.l), dn.d::a, za.a(za.l), dn.d::b, dn.d::new);

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
      Codec<dn.e> c = Codec.either(dn.b.a, dn.d.a).xmap($$0 -> (dn.e)$$0.map($$0x -> $$0x, $$0x -> $$0x), $$0 -> {
         if ($$0 instanceof dn.b $$1) {
            return Either.left($$1);
         } else if ($$0 instanceof dn.d $$2) {
            return Either.right($$2);
         } else {
            throw new UnsupportedOperationException();
         }
      });
      zc<ByteBuf, dn.e> d = za.a(dn.b.b, dn.d.b).a($$0 -> (dn.e)$$0.map($$0x -> $$0x, $$0x -> $$0x), $$0 -> {
         if ($$0 instanceof dn.b $$1) {
            return Either.left($$1);
         } else if ($$0 instanceof dn.d $$2) {
            return Either.right($$2);
         } else {
            throw new UnsupportedOperationException();
         }
      });

      <T extends Comparable<T>> boolean a(dte<?, ?> var1, duf<T> var2);
   }
}
