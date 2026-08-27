import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public record db(List<db.c> c) {
   private static final Codec<List<db.c>> d = Codec.unboundedMap(Codec.STRING, db.e.c)
      .xmap(
         $$0 -> $$0.entrySet().stream().map($$0x -> new db.c((String)$$0x.getKey(), (db.e)$$0x.getValue())).toList(),
         $$0 -> $$0.stream().collect(Collectors.toMap(db.c::a, db.c::b))
      );
   public static final Codec<db> a = d.xmap(db::new, db::a);
   public static final ye<ByteBuf, db> b = db.c.a.a(yc.a()).a(db::new, db::a);

   public <S extends dpb<?, S>> boolean a(dpa<?, S> $$0, S $$1) {
      for (db.c $$2 : this.c) {
         if (!$$2.a($$0, $$1)) {
            return false;
         }
      }

      return true;
   }

   public boolean a(doz $$0) {
      return this.a($$0.b().l(), $$0);
   }

   public boolean a(eks $$0) {
      return this.a($$0.a().f(), $$0);
   }

   public Optional<String> a(dpa<?, ?> $$0) {
      for (db.c $$1 : this.c) {
         Optional<String> $$2 = $$1.a($$0);
         if ($$2.isPresent()) {
            return $$2;
         }
      }

      return Optional.empty();
   }

   public List<db.c> a() {
      return this.c;
   }

   public static class a {
      private final Builder<db.c> a = ImmutableList.builder();

      private a() {
      }

      public static db.a a() {
         return new db.a();
      }

      public db.a a(dqc<?> $$0, String $$1) {
         this.a.add(new db.c($$0.f(), new db.b($$1)));
         return this;
      }

      public db.a a(dqc<Integer> $$0, int $$1) {
         return this.a($$0, Integer.toString($$1));
      }

      public db.a a(dqc<Boolean> $$0, boolean $$1) {
         return this.a($$0, Boolean.toString($$1));
      }

      public <T extends Comparable<T> & aye> db.a a(dqc<T> $$0, T $$1) {
         return this.a($$0, $$1.c());
      }

      public Optional<db> b() {
         return Optional.of(new db(this.a.build()));
      }
   }

   static record b(String e) implements db.e {
      public static final Codec<db.b> a = Codec.STRING.xmap(db.b::new, db.b::a);
      public static final ye<ByteBuf, db.b> b = yc.k.a(db.b::new, db.b::a);

      @Override
      public <T extends Comparable<T>> boolean a(dpb<?, ?> $$0, dqc<T> $$1) {
         T $$2 = $$0.c($$1);
         Optional<T> $$3 = $$1.b(this.e);
         return $$3.isPresent() && $$2.compareTo($$3.get()) == 0;
      }

      public String a() {
         return this.e;
      }
   }

   static record c(String b, db.e c) {
      public static final ye<ByteBuf, db.c> a = ye.a(yc.k, db.c::a, db.e.d, db.c::b, db.c::new);

      public <S extends dpb<?, S>> boolean a(dpa<?, S> $$0, S $$1) {
         dqc<?> $$2 = $$0.a(this.b);
         return $$2 != null && this.c.a($$1, $$2);
      }

      public Optional<String> a(dpa<?, ?> $$0) {
         dqc<?> $$1 = $$0.a(this.b);
         return $$1 != null ? Optional.empty() : Optional.of(this.b);
      }

      public String a() {
         return this.b;
      }

      public db.e b() {
         return this.c;
      }
   }

   static record d(Optional<String> e, Optional<String> f) implements db.e {
      public static final Codec<db.d> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(aws.a(Codec.STRING, "min").forGetter(db.d::a), aws.a(Codec.STRING, "max").forGetter(db.d::b)).apply($$0, db.d::new)
      );
      public static final ye<ByteBuf, db.d> b = ye.a(yc.a(yc.k), db.d::a, yc.a(yc.k), db.d::b, db.d::new);

      @Override
      public <T extends Comparable<T>> boolean a(dpb<?, ?> $$0, dqc<T> $$1) {
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
      Codec<db.e> c = Codec.either(db.b.a, db.d.a).xmap($$0 -> (db.e)$$0.map($$0x -> $$0x, $$0x -> $$0x), $$0 -> {
         if ($$0 instanceof db.b $$1) {
            return Either.left($$1);
         } else if ($$0 instanceof db.d $$2) {
            return Either.right($$2);
         } else {
            throw new UnsupportedOperationException();
         }
      });
      ye<ByteBuf, db.e> d = yc.a(db.b.b, db.d.b).a($$0 -> (db.e)$$0.map($$0x -> $$0x, $$0x -> $$0x), $$0 -> {
         if ($$0 instanceof db.b $$1) {
            return Either.left($$1);
         } else if ($$0 instanceof db.d $$2) {
            return Either.right($$2);
         } else {
            throw new UnsupportedOperationException();
         }
      });

      <T extends Comparable<T>> boolean a(dpb<?, ?> var1, dqc<T> var2);
   }
}
