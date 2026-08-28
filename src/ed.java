import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public record ed(List<ed.c> c) {
   private static final Codec<List<ed.c>> d = Codec.unboundedMap(Codec.STRING, ed.e.c)
      .xmap(
         $$0 -> $$0.entrySet().stream().map($$0x -> new ed.c((String)$$0x.getKey(), (ed.e)$$0x.getValue())).toList(),
         $$0 -> $$0.stream().collect(Collectors.toMap(ed.c::a, ed.c::b))
      );
   public static final Codec<ed> a = d.xmap(ed::new, ed::a);
   public static final zf<ByteBuf, ed> b = ed.c.a.a(zd.a()).a(ed::new, ed::a);

   public <S extends dvf<?, S>> boolean a(dve<?, S> $$0, S $$1) {
      for (ed.c $$2 : this.c) {
         if (!$$2.a($$0, $$1)) {
            return false;
         }
      }

      return true;
   }

   public boolean a(dvd $$0) {
      return this.a($$0.b().l(), $$0);
   }

   public boolean a(ere $$0) {
      return this.a($$0.a().f(), $$0);
   }

   public Optional<String> a(dve<?, ?> $$0) {
      for (ed.c $$1 : this.c) {
         Optional<String> $$2 = $$1.a($$0);
         if ($$2.isPresent()) {
            return $$2;
         }
      }

      return Optional.empty();
   }

   public List<ed.c> a() {
      return this.c;
   }

   public static class a {
      private final Builder<ed.c> a = ImmutableList.builder();

      private a() {
      }

      public static ed.a a() {
         return new ed.a();
      }

      public ed.a a(dwg<?> $$0, String $$1) {
         this.a.add(new ed.c($$0.f(), new ed.b($$1)));
         return this;
      }

      public ed.a a(dwg<Integer> $$0, int $$1) {
         return this.a($$0, Integer.toString($$1));
      }

      public ed.a a(dwg<Boolean> $$0, boolean $$1) {
         return this.a($$0, Boolean.toString($$1));
      }

      public <T extends Comparable<T> & baf> ed.a a(dwg<T> $$0, T $$1) {
         return this.a($$0, $$1.c());
      }

      public Optional<ed> b() {
         return Optional.of(new ed(this.a.build()));
      }
   }

   static record b(String e) implements ed.e {
      public static final Codec<ed.b> a = Codec.STRING.xmap(ed.b::new, ed.b::a);
      public static final zf<ByteBuf, ed.b> b = zd.m.a(ed.b::new, ed.b::a);

      @Override
      public <T extends Comparable<T>> boolean a(dvf<?, ?> $$0, dwg<T> $$1) {
         T $$2 = $$0.c($$1);
         Optional<T> $$3 = $$1.b(this.e);
         return $$3.isPresent() && $$2.compareTo($$3.get()) == 0;
      }

      public String a() {
         return this.e;
      }
   }

   static record c(String b, ed.e c) {
      public static final zf<ByteBuf, ed.c> a = zf.a(zd.m, ed.c::a, ed.e.d, ed.c::b, ed.c::new);

      public <S extends dvf<?, S>> boolean a(dve<?, S> $$0, S $$1) {
         dwg<?> $$2 = $$0.a(this.b);
         return $$2 != null && this.c.a($$1, $$2);
      }

      public Optional<String> a(dve<?, ?> $$0) {
         dwg<?> $$1 = $$0.a(this.b);
         return $$1 != null ? Optional.empty() : Optional.of(this.b);
      }

      public String a() {
         return this.b;
      }

      public ed.e b() {
         return this.c;
      }
   }

   static record d(Optional<String> e, Optional<String> f) implements ed.e {
      public static final Codec<ed.d> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.STRING.optionalFieldOf("min").forGetter(ed.d::a), Codec.STRING.optionalFieldOf("max").forGetter(ed.d::b)).apply($$0, ed.d::new)
      );
      public static final zf<ByteBuf, ed.d> b = zf.a(zd.a(zd.m), ed.d::a, zd.a(zd.m), ed.d::b, ed.d::new);

      @Override
      public <T extends Comparable<T>> boolean a(dvf<?, ?> $$0, dwg<T> $$1) {
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
      Codec<ed.e> c = Codec.either(ed.b.a, ed.d.a).xmap(Either::unwrap, $$0 -> {
         if ($$0 instanceof ed.b $$1) {
            return Either.left($$1);
         } else if ($$0 instanceof ed.d $$2) {
            return Either.right($$2);
         } else {
            throw new UnsupportedOperationException();
         }
      });
      zf<ByteBuf, ed.e> d = zd.a(ed.b.b, ed.d.b).a(Either::unwrap, $$0 -> {
         if ($$0 instanceof ed.b $$1) {
            return Either.left($$1);
         } else if ($$0 instanceof ed.d $$2) {
            return Either.right($$2);
         } else {
            throw new UnsupportedOperationException();
         }
      });

      <T extends Comparable<T>> boolean a(dvf<?, ?> var1, dwg<T> var2);
   }
}
