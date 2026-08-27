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

public interface ck<T extends Number> {
   SimpleCommandExceptionType a = new SimpleCommandExceptionType(vf.c("argument.range.empty"));
   SimpleCommandExceptionType b = new SimpleCommandExceptionType(vf.c("argument.range.swapped"));

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

   static <T extends Number, R extends ck<T>> Codec<R> a(Codec<T> $$0, ck.a<T, R> $$1) {
      Codec<R> $$2 = RecordCodecBuilder.create(
         $$2x -> $$2x.group(atw.a($$0, "min").forGetter(ck::a), atw.a($$0, "max").forGetter(ck::b)).apply($$2x, $$1::create)
      );
      return Codec.either($$2, $$0).xmap($$1x -> (ck)$$1x.map($$0xx -> $$0xx, $$1xx -> $$1.create(Optional.of((T)$$1xx), Optional.of((T)$$1xx))), $$0x -> {
         Optional<T> $$1x = $$0x.d();
         return $$1x.isPresent() ? Either.right($$1x.get()) : Either.left($$0x);
      });
   }

   static <T extends Number, R extends ck<T>> R a(
      StringReader $$0, ck.b<T, R> $$1, Function<String, T> $$2, Supplier<DynamicCommandExceptionType> $$3, Function<T, T> $$4
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
   public interface a<T extends Number, R extends ck<T>> {
      R create(Optional<T> var1, Optional<T> var2);
   }

   @FunctionalInterface
   public interface b<T extends Number, R extends ck<T>> {
      R create(StringReader var1, Optional<T> var2, Optional<T> var3) throws CommandSyntaxException;
   }

   public static record c(Optional<Double> e, Optional<Double> f, Optional<Double> g, Optional<Double> h) implements ck<Double> {
      public static final ck.c c = new ck.c(Optional.empty(), Optional.empty());
      public static final Codec<ck.c> d = ck.a(Codec.DOUBLE, ck.c::new);

      private c(Optional<Double> $$0, Optional<Double> $$1) {
         this($$0, $$1, a($$0), a($$1));
      }

      private static ck.c a(StringReader $$0, Optional<Double> $$1, Optional<Double> $$2) throws CommandSyntaxException {
         if ($$1.isPresent() && $$2.isPresent() && $$1.get() > $$2.get()) {
            throw b.createWithContext($$0);
         } else {
            return new ck.c($$1, $$2);
         }
      }

      private static Optional<Double> a(Optional<Double> $$0) {
         return $$0.map($$0x -> $$0x * $$0x);
      }

      public static ck.c a(double $$0) {
         return new ck.c(Optional.of($$0), Optional.of($$0));
      }

      public static ck.c a(double $$0, double $$1) {
         return new ck.c(Optional.of($$0), Optional.of($$1));
      }

      public static ck.c b(double $$0) {
         return new ck.c(Optional.of($$0), Optional.empty());
      }

      public static ck.c c(double $$0) {
         return new ck.c(Optional.empty(), Optional.of($$0));
      }

      public boolean d(double $$0) {
         return this.e.isPresent() && this.e.get() > $$0 ? false : this.f.isEmpty() || !(this.f.get() < $$0);
      }

      public boolean e(double $$0) {
         return this.g.isPresent() && this.g.get() > $$0 ? false : this.h.isEmpty() || !(this.h.get() < $$0);
      }

      public static ck.c a(StringReader $$0) throws CommandSyntaxException {
         return a($$0, $$0x -> $$0x);
      }

      public static ck.c a(StringReader $$0, Function<Double, Double> $$1) throws CommandSyntaxException {
         return ck.a($$0, ck.c::a, Double::parseDouble, CommandSyntaxException.BUILT_IN_EXCEPTIONS::readerInvalidDouble, $$1);
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

   public static record d(Optional<Integer> e, Optional<Integer> f, Optional<Long> g, Optional<Long> h) implements ck<Integer> {
      public static final ck.d c = new ck.d(Optional.empty(), Optional.empty());
      public static final Codec<ck.d> d = ck.a(Codec.INT, ck.d::new);

      private d(Optional<Integer> $$0, Optional<Integer> $$1) {
         this($$0, $$1, $$0.map($$0x -> $$0x.longValue() * $$0x.longValue()), a($$1));
      }

      private static ck.d a(StringReader $$0, Optional<Integer> $$1, Optional<Integer> $$2) throws CommandSyntaxException {
         if ($$1.isPresent() && $$2.isPresent() && $$1.get() > $$2.get()) {
            throw b.createWithContext($$0);
         } else {
            return new ck.d($$1, $$2);
         }
      }

      private static Optional<Long> a(Optional<Integer> $$0) {
         return $$0.map($$0x -> $$0x.longValue() * $$0x.longValue());
      }

      public static ck.d a(int $$0) {
         return new ck.d(Optional.of($$0), Optional.of($$0));
      }

      public static ck.d a(int $$0, int $$1) {
         return new ck.d(Optional.of($$0), Optional.of($$1));
      }

      public static ck.d b(int $$0) {
         return new ck.d(Optional.of($$0), Optional.empty());
      }

      public static ck.d c(int $$0) {
         return new ck.d(Optional.empty(), Optional.of($$0));
      }

      public boolean d(int $$0) {
         return this.e.isPresent() && this.e.get() > $$0 ? false : this.f.isEmpty() || this.f.get() >= $$0;
      }

      public boolean a(long $$0) {
         return this.g.isPresent() && this.g.get() > $$0 ? false : this.h.isEmpty() || this.h.get() >= $$0;
      }

      public static ck.d a(StringReader $$0) throws CommandSyntaxException {
         return a($$0, $$0x -> $$0x);
      }

      public static ck.d a(StringReader $$0, Function<Integer, Integer> $$1) throws CommandSyntaxException {
         return ck.a($$0, ck.d::a, Integer::parseInt, CommandSyntaxException.BUILT_IN_EXCEPTIONS::readerInvalidInt, $$1);
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
