import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public record dl(List<dl.c> c) {
   private static final Codec<List<dl.c>> d = Codec.unboundedMap(Codec.STRING, dl.e.c)
      .xmap(
         $$0 -> $$0.entrySet().stream().map($$0x -> new dl.c((String)$$0x.getKey(), (dl.e)$$0x.getValue())).toList(),
         $$0 -> $$0.stream().collect(Collectors.toMap(dl.c::a, dl.c::b))
      );
   public static final Codec<dl> a = d.xmap(dl::new, dl::a);
   public static final yv<ByteBuf, dl> b = dl.c.a.a(yt.a()).a(dl::new, dl::a);

   public <S extends drd<?, S>> boolean a(drc<?, S> $$0, S $$1) {
      for (dl.c $$2 : this.c) {
         if (!$$2.a($$0, $$1)) {
            return false;
         }
      }

      return true;
   }

   public boolean a(drb $$0) {
      return this.a($$0.b().m(), $$0);
   }

   public boolean a(emu $$0) {
      return this.a($$0.a().f(), $$0);
   }

   public Optional<String> a(drc<?, ?> $$0) {
      for (dl.c $$1 : this.c) {
         Optional<String> $$2 = $$1.a($$0);
         if ($$2.isPresent()) {
            return $$2;
         }
      }

      return Optional.empty();
   }

   public List<dl.c> a() {
      return this.c;
   }

   public static class a {
      private final Builder<dl.c> a = ImmutableList.builder();

      private a() {
      }

      public static dl.a a() {
         return new dl.a();
      }

      public dl.a a(dse<?> $$0, String $$1) {
         this.a.add(new dl.c($$0.f(), new dl.b($$1)));
         return this;
      }

      public dl.a a(dse<Integer> $$0, int $$1) {
         return this.a($$0, Integer.toString($$1));
      }

      public dl.a a(dse<Boolean> $$0, boolean $$1) {
         return this.a($$0, Boolean.toString($$1));
      }

      public <T extends Comparable<T> & ayx> dl.a a(dse<T> $$0, T $$1) {
         return this.a($$0, $$1.c());
      }

      public Optional<dl> b() {
         return Optional.of(new dl(this.a.build()));
      }
   }

   static record b(String e) implements dl.e {
      public static final Codec<dl.b> a = Codec.STRING.xmap(dl.b::new, dl.b::a);
      public static final yv<ByteBuf, dl.b> b = yt.k.a(dl.b::new, dl.b::a);

      @Override
      public <T extends Comparable<T>> boolean a(drd<?, ?> $$0, dse<T> $$1) {
         T $$2 = $$0.c($$1);
         Optional<T> $$3 = $$1.b(this.e);
         return $$3.isPresent() && $$2.compareTo($$3.get()) == 0;
      }

      public String a() {
         return this.e;
      }
   }

   static record c(String b, dl.e c) {
      public static final yv<ByteBuf, dl.c> a = yv.a(yt.k, dl.c::a, dl.e.d, dl.c::b, dl.c::new);

      public <S extends drd<?, S>> boolean a(drc<?, S> $$0, S $$1) {
         dse<?> $$2 = $$0.a(this.b);
         return $$2 != null && this.c.a($$1, $$2);
      }

      public Optional<String> a(drc<?, ?> $$0) {
         dse<?> $$1 = $$0.a(this.b);
         return $$1 != null ? Optional.empty() : Optional.of(this.b);
      }

      public String a() {
         return this.b;
      }

      public dl.e b() {
         return this.c;
      }
   }

   static record d(Optional<String> e, Optional<String> f) implements dl.e {
      public static final Codec<dl.d> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.STRING.optionalFieldOf("min").forGetter(dl.d::a), Codec.STRING.optionalFieldOf("max").forGetter(dl.d::b)).apply($$0, dl.d::new)
      );
      public static final yv<ByteBuf, dl.d> b = yv.a(yt.a(yt.k), dl.d::a, yt.a(yt.k), dl.d::b, dl.d::new);

      @Override
      public <T extends Comparable<T>> boolean a(drd<?, ?> $$0, dse<T> $$1) {
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
      Codec<dl.e> c = Codec.either(dl.b.a, dl.d.a).xmap(Either::unwrap, $$0 -> {
         if ($$0 instanceof dl.b $$1) {
            return Either.left($$1);
         } else if ($$0 instanceof dl.d $$2) {
            return Either.right($$2);
         } else {
            throw new UnsupportedOperationException();
         }
      });
      yv<ByteBuf, dl.e> d = yt.a(dl.b.b, dl.d.b).a(Either::unwrap, $$0 -> {
         if ($$0 instanceof dl.b $$1) {
            return Either.left($$1);
         } else if ($$0 instanceof dl.d $$2) {
            return Either.right($$2);
         } else {
            throw new UnsupportedOperationException();
         }
      });

      <T extends Comparable<T>> boolean a(drd<?, ?> var1, dse<T> var2);
   }
}
