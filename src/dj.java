import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Supplier;

public interface dj<T extends Number> {
   SimpleCommandExceptionType a = new SimpleCommandExceptionType(xi.c("argument.range.empty"));
   SimpleCommandExceptionType b = new SimpleCommandExceptionType(xi.c("argument.range.swapped"));

   Optional<T> a();

   Optional<T> b();

   default boolean c() {
      return this.a().isEmpty() && this.b().isEmpty();
   }

   default Optional<T> d() {
      Optional<T> $$0 = this.a();
      Optional<T> $$1 = this.b();
      return $$0.equals($$1) ? $$0 : Optional.empty();
   }

   static <T extends Number, R extends dj<T>> Codec<R> a(Codec<T> $$0, dj.a<T, R> $$1) {
      Codec<R> $$2 = RecordCodecBuilder.create(
         $$2x -> $$2x.group($$0.optionalFieldOf("min").forGetter(dj::a), $$0.optionalFieldOf("max").forGetter(dj::b)).apply($$2x, $$1::create)
      );
      return Codec.either($$2, $$0).xmap($$1x -> (dj)$$1x.map($$0xx -> $$0xx, $$1xx -> $$1.create(Optional.of((T)$$1xx), Optional.of((T)$$1xx))), $$0x -> {
         Optional<T> $$1x = $$0x.d();
         return $$1x.isPresent() ? Either.right($$1x.get()) : Either.left($$0x);
      });
   }

   static <T extends Number, R extends dj<T>> R a(
      StringReader $$0, dj.b<T, R> $$1, Function<String, T> $$2, Supplier<DynamicCommandExceptionType> $$3, Function<T, T> $$4
   ) throws CommandSyntaxException {
      if (!$$0.canRead()) {
         throw a.createWithContext($$0);
      } else {
         int $$5 = $$0.getCursor();

         try {
            Optional<T> $$6 = a($$0, $$2, $$3).map($$4);
            Optional<T> $$7;
            if ($$0.canRead(2) && $$0.peek() == '.' && $$0.peek(1) == '.') {
               $$0.skip();
               $$0.skip();
               $$7 = a($$0, $$2, $$3).map($$4);
               if ($$6.isEmpty() && $$7.isEmpty()) {
                  throw a.createWithContext($$0);
               }
            } else {
               $$7 = $$6;
            }

            if ($$6.isEmpty() && $$7.isEmpty()) {
               throw a.createWithContext($$0);
            } else {
               return $$1.create($$0, $$6, $$7);
            }
         } catch (CommandSyntaxException var8) {
            $$0.setCursor($$5);
            throw new CommandSyntaxException(var8.getType(), var8.getRawMessage(), var8.getInput(), $$5);
         }
      }
   }

   private static <T extends Number> Optional<T> a(StringReader $$0, Function<String, T> $$1, Supplier<DynamicCommandExceptionType> $$2) throws CommandSyntaxException {
      int $$3 = $$0.getCursor();

      while ($$0.canRead() && a($$0)) {
         $$0.skip();
      }

      String $$4 = $$0.getString().substring($$3, $$0.getCursor());
      if ($$4.isEmpty()) {
         return Optional.empty();
      } else {
         try {
            return Optional.of($$1.apply($$4));
         } catch (NumberFormatException var6) {
            throw $$2.get().createWithContext($$0, $$4);
         }
      }
   }

   private static boolean a(StringReader $$0) {
      char $$1 = $$0.peek();
      if (($$1 < '0' || $$1 > '9') && $$1 != '-') {
         return $$1 != '.' ? false : !$$0.canRead(2) || $$0.peek(1) != '.';
      } else {
         return true;
      }
   }

   @FunctionalInterface
   public interface a<T extends Number, R extends dj<T>> {
      R create(Optional<T> var1, Optional<T> var2);
   }

   @FunctionalInterface
   public interface b<T extends Number, R extends dj<T>> {
      R create(StringReader var1, Optional<T> var2, Optional<T> var3) throws CommandSyntaxException;
   }

   public static record c(Optional<Double> e, Optional<Double> f, Optional<Double> g, Optional<Double> h) implements dj<Double> {
      public static final dj.c c = new dj.c(Optional.empty(), Optional.empty());
      public static final Codec<dj.c> d = dj.a(Codec.DOUBLE, dj.c::new);

      private c(Optional<Double> $$0, Optional<Double> $$1) {
         this($$0, $$1, a($$0), a($$1));
      }

      private static dj.c a(StringReader $$0, Optional<Double> $$1, Optional<Double> $$2) throws CommandSyntaxException {
         if ($$1.isPresent() && $$2.isPresent() && $$1.get() > $$2.get()) {
            throw b.createWithContext($$0);
         } else {
            return new dj.c($$1, $$2);
         }
      }

      private static Optional<Double> a(Optional<Double> $$0) {
         return $$0.map($$0x -> $$0x * $$0x);
      }

      public static dj.c a(double $$0) {
         return new dj.c(Optional.of($$0), Optional.of($$0));
      }

      public static dj.c a(double $$0, double $$1) {
         return new dj.c(Optional.of($$0), Optional.of($$1));
      }

      public static dj.c b(double $$0) {
         return new dj.c(Optional.of($$0), Optional.empty());
      }

      public static dj.c c(double $$0) {
         return new dj.c(Optional.empty(), Optional.of($$0));
      }

      public boolean d(double $$0) {
         return this.e.isPresent() && this.e.get() > $$0 ? false : this.f.isEmpty() || !(this.f.get() < $$0);
      }

      public boolean e(double $$0) {
         return this.g.isPresent() && this.g.get() > $$0 ? false : this.h.isEmpty() || !(this.h.get() < $$0);
      }

      public static dj.c a(StringReader $$0) throws CommandSyntaxException {
         return a($$0, $$0x -> $$0x);
      }

      public static dj.c a(StringReader $$0, Function<Double, Double> $$1) throws CommandSyntaxException {
         return dj.a($$0, dj.c::a, Double::parseDouble, CommandSyntaxException.BUILT_IN_EXCEPTIONS::readerInvalidDouble, $$1);
      }

      @Override
      public Optional<Double> a() {
         return this.e;
      }

      @Override
      public Optional<Double> b() {
         return this.f;
      }

      public Optional<Double> e() {
         return this.g;
      }

      public Optional<Double> f() {
         return this.h;
      }
   }

   public static record d(Optional<Integer> e, Optional<Integer> f, Optional<Long> g, Optional<Long> h) implements dj<Integer> {
      public static final dj.d c = new dj.d(Optional.empty(), Optional.empty());
      public static final Codec<dj.d> d = dj.a(Codec.INT, dj.d::new);

      private d(Optional<Integer> $$0, Optional<Integer> $$1) {
         this($$0, $$1, $$0.map($$0x -> $$0x.longValue() * $$0x.longValue()), a($$1));
      }

      private static dj.d a(StringReader $$0, Optional<Integer> $$1, Optional<Integer> $$2) throws CommandSyntaxException {
         if ($$1.isPresent() && $$2.isPresent() && $$1.get() > $$2.get()) {
            throw b.createWithContext($$0);
         } else {
            return new dj.d($$1, $$2);
         }
      }

      private static Optional<Long> a(Optional<Integer> $$0) {
         return $$0.map($$0x -> $$0x.longValue() * $$0x.longValue());
      }

      public static dj.d a(int $$0) {
         return new dj.d(Optional.of($$0), Optional.of($$0));
      }

      public static dj.d a(int $$0, int $$1) {
         return new dj.d(Optional.of($$0), Optional.of($$1));
      }

      public static dj.d b(int $$0) {
         return new dj.d(Optional.of($$0), Optional.empty());
      }

      public static dj.d c(int $$0) {
         return new dj.d(Optional.empty(), Optional.of($$0));
      }

      public boolean d(int $$0) {
         return this.e.isPresent() && this.e.get() > $$0 ? false : this.f.isEmpty() || this.f.get() >= $$0;
      }

      public boolean a(long $$0) {
         return this.g.isPresent() && this.g.get() > $$0 ? false : this.h.isEmpty() || this.h.get() >= $$0;
      }

      public static dj.d a(StringReader $$0) throws CommandSyntaxException {
         return a($$0, $$0x -> $$0x);
      }

      public static dj.d a(StringReader $$0, Function<Integer, Integer> $$1) throws CommandSyntaxException {
         return dj.a($$0, dj.d::a, Integer::parseInt, CommandSyntaxException.BUILT_IN_EXCEPTIONS::readerInvalidInt, $$1);
      }

      @Override
      public Optional<Integer> a() {
         return this.e;
      }

      @Override
      public Optional<Integer> b() {
         return this.f;
      }

      public Optional<Long> e() {
         return this.g;
      }

      public Optional<Long> f() {
         return this.h;
      }
   }
}
