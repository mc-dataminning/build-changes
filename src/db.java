import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public record db(List<db.c> b) {
   private static final Codec<List<db.c>> c = Codec.unboundedMap(Codec.STRING, db.e.b)
      .xmap(
         $$0 -> $$0.entrySet().stream().map($$0x -> new db.c((String)$$0x.getKey(), (db.e)$$0x.getValue())).toList(),
         $$0 -> $$0.stream().collect(Collectors.toMap(db.c::a, db.c::b))
      );
   public static final Codec<db> a = c.xmap(db::new, db::a);

   public <S extends dlh<?, S>> boolean a(dlg<?, S> $$0, S $$1) {
      for (db.c $$2 : this.b) {
         if (!$$2.a($$0, $$1)) {
            return false;
         }
      }

      return true;
   }

   public boolean a(dlf $$0) {
      return this.a($$0.b().n(), $$0);
   }

   public boolean a(egp $$0) {
      return this.a($$0.a().f(), $$0);
   }

   public Optional<String> a(dlg<?, ?> $$0) {
      for (db.c $$1 : this.b) {
         Optional<String> $$2 = $$1.a($$0);
         if ($$2.isPresent()) {
            return $$2;
         }
      }

      return Optional.empty();
   }

   public List<db.c> a() {
      return this.b;
   }

   public static class a {
      private final Builder<db.c> a = ImmutableList.builder();

      private a() {
      }

      public static db.a a() {
         return new db.a();
      }

      public db.a a(dmi<?> $$0, String $$1) {
         this.a.add(new db.c($$0.f(), new db.b($$1)));
         return this;
      }

      public db.a a(dmi<Integer> $$0, int $$1) {
         return this.a($$0, Integer.toString($$1));
      }

      public db.a a(dmi<Boolean> $$0, boolean $$1) {
         return this.a($$0, Boolean.toString($$1));
      }

      public <T extends Comparable<T> & axc> db.a a(dmi<T> $$0, T $$1) {
         return this.a($$0, $$1.c());
      }

      public Optional<db> b() {
         return Optional.of(new db(this.a.build()));
      }
   }

   static record b(String c) implements db.e {
      public static final Codec<db.b> a = Codec.STRING.xmap(db.b::new, db.b::a);

      @Override
      public <T extends Comparable<T>> boolean a(dlh<?, ?> $$0, dmi<T> $$1) {
         T $$2 = $$0.c($$1);
         Optional<T> $$3 = $$1.b(this.c);
         return $$3.isPresent() && $$2.compareTo($$3.get()) == 0;
      }

      public String a() {
         return this.c;
      }
   }

   static record c(String a, db.e b) {
      public <S extends dlh<?, S>> boolean a(dlg<?, S> $$0, S $$1) {
         dmi<?> $$2 = $$0.a(this.a);
         return $$2 != null && this.b.a($$1, $$2);
      }

      public Optional<String> a(dlg<?, ?> $$0) {
         dmi<?> $$1 = $$0.a(this.a);
         return $$1 != null ? Optional.empty() : Optional.of(this.a);
      }
   }

   static record d(Optional<String> c, Optional<String> d) implements db.e {
      public static final Codec<db.d> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(avp.a(Codec.STRING, "min").forGetter(db.d::a), avp.a(Codec.STRING, "max").forGetter(db.d::b)).apply($$0, db.d::new)
      );

      @Override
      public <T extends Comparable<T>> boolean a(dlh<?, ?> $$0, dmi<T> $$1) {
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
      Codec<db.e> b = Codec.either(db.b.a, db.d.a).xmap($$0 -> (db.e)$$0.map($$0x -> $$0x, $$0x -> $$0x), $$0 -> {
         if ($$0 instanceof db.b $$1) {
            return Either.left($$1);
         } else if ($$0 instanceof db.d $$2) {
            return Either.right($$2);
         } else {
            throw new UnsupportedOperationException();
         }
      });

      <T extends Comparable<T>> boolean a(dlh<?, ?> var1, dmi<T> var2);
   }
}
