import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Supplier;

public interface cw<T extends Number> {
   SimpleCommandExceptionType a = new SimpleCommandExceptionType(wy.c("argument.range.empty"));
   SimpleCommandExceptionType b = new SimpleCommandExceptionType(wy.c("argument.range.swapped"));

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

   static <T extends Number, R extends cw<T>> Codec<R> a(Codec<T> $$0, cw.a<T, R> $$1) {
      Codec<R> $$2 = RecordCodecBuilder.create(
         $$2x -> $$2x.group($$0.optionalFieldOf("min").forGetter(cw::a), $$0.optionalFieldOf("max").forGetter(cw::b)).apply($$2x, $$1::create)
      );
      return Codec.either($$2, $$0).xmap($$1x -> (cw)$$1x.map($$0xx -> $$0xx, $$1xx -> $$1.create(Optional.of((T)$$1xx), Optional.of((T)$$1xx))), $$0x -> {
         Optional<T> $$1x = $$0x.d();
         return $$1x.isPresent() ? Either.right($$1x.get()) : Either.left($$0x);
      });
   }

   static <B extends ByteBuf, T extends Number, R extends cw<T>> yw<B, R> a(final yw<B, T> $$0, final cw.a<T, R> $$1) {
      return new yw<B, R>() {
         private static final int d = 1;
         public static final int a = 2;

         public R a(B $$0x) {
            byte $$1 = $$0.readByte();
            Optional<T> $$2 = ($$1 & 1) != 0 ? Optional.of($$0.decode($$0)) : Optional.empty();
            Optional<T> $$3 = ($$1 & 2) != 0 ? Optional.of($$0.decode($$0)) : Optional.empty();
            return $$1.create($$2, $$3);
         }

         public void a(B $$0x, R $$1x) {
            Optional<T> $$2 = $$1.a();
            Optional<T> $$3 = $$1.b();
            $$0.writeByte(($$2.isPresent() ? 1 : 0) | ($$3.isPresent() ? 2 : 0));
            $$2.ifPresent($$2x -> $$0.encode($$0, (T)$$2x));
            $$3.ifPresent($$2x -> $$0.encode($$0, (T)$$2x));
         }
      };
   }

   static <T extends Number, R extends cw<T>> R a(
      StringReader $$0, cw.b<T, R> $$1, Function<String, T> $$2, Supplier<DynamicCommandExceptionType> $$3, Function<T, T> $$4
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
   public interface a<T extends Number, R extends cw<T>> {
      R create(Optional<T> var1, Optional<T> var2);
   }

   @FunctionalInterface
   public interface b<T extends Number, R extends cw<T>> {
      R create(StringReader var1, Optional<T> var2, Optional<T> var3) throws CommandSyntaxException;
   }

   public static record c(Optional<Double> f, Optional<Double> g, Optional<Double> h, Optional<Double> i) implements cw<Double> {
      public static final cw.c c = new cw.c(Optional.empty(), Optional.empty());
      public static final Codec<cw.c> d = cw.a(Codec.DOUBLE, cw.c::new);
      public static final yw<ByteBuf, cw.c> e = cw.a(yu.m, cw.c::new);

      private c(Optional<Double> $$0, Optional<Double> $$1) {
         this($$0, $$1, a($$0), a($$1));
      }

      private static cw.c a(StringReader $$0, Optional<Double> $$1, Optional<Double> $$2) throws CommandSyntaxException {
         if ($$1.isPresent() && $$2.isPresent() && $$1.get() > $$2.get()) {
            throw b.createWithContext($$0);
         } else {
            return new cw.c($$1, $$2);
         }
      }

      private static Optional<Double> a(Optional<Double> $$0) {
         return $$0.map($$0x -> $$0x * $$0x);
      }

      public static cw.c a(double $$0) {
         return new cw.c(Optional.of($$0), Optional.of($$0));
      }

      public static cw.c a(double $$0, double $$1) {
         return new cw.c(Optional.of($$0), Optional.of($$1));
      }

      public static cw.c b(double $$0) {
         return new cw.c(Optional.of($$0), Optional.empty());
      }

      public static cw.c c(double $$0) {
         return new cw.c(Optional.empty(), Optional.of($$0));
      }

      public boolean d(double $$0) {
         return this.f.isPresent() && this.f.get() > $$0 ? false : this.g.isEmpty() || !(this.g.get() < $$0);
      }

      public boolean e(double $$0) {
         return this.h.isPresent() && this.h.get() > $$0 ? false : this.i.isEmpty() || !(this.i.get() < $$0);
      }

      public static cw.c a(StringReader $$0) throws CommandSyntaxException {
         return a($$0, $$0x -> $$0x);
      }

      public static cw.c a(StringReader $$0, Function<Double, Double> $$1) throws CommandSyntaxException {
         return cw.a($$0, cw.c::a, Double::parseDouble, CommandSyntaxException.BUILT_IN_EXCEPTIONS::readerInvalidDouble, $$1);
      }

      @Override
      public Optional<Double> a() {
         return this.f;
      }

      @Override
      public Optional<Double> b() {
         return this.g;
      }

      public Optional<Double> e() {
         return this.h;
      }

      public Optional<Double> f() {
         return this.i;
      }
   }

   public static record d(Optional<Integer> f, Optional<Integer> g, Optional<Long> h, Optional<Long> i) implements cw<Integer> {
      public static final cw.d c = new cw.d(Optional.empty(), Optional.empty());
      public static final Codec<cw.d> d = cw.a(Codec.INT, cw.d::new);
      public static final yw<ByteBuf, cw.d> e = cw.a(yu.g, cw.d::new);

      private d(Optional<Integer> $$0, Optional<Integer> $$1) {
         this($$0, $$1, $$0.map($$0x -> $$0x.longValue() * $$0x.longValue()), a($$1));
      }

      private static cw.d a(StringReader $$0, Optional<Integer> $$1, Optional<Integer> $$2) throws CommandSyntaxException {
         if ($$1.isPresent() && $$2.isPresent() && $$1.get() > $$2.get()) {
            throw b.createWithContext($$0);
         } else {
            return new cw.d($$1, $$2);
         }
      }

      private static Optional<Long> a(Optional<Integer> $$0) {
         return $$0.map($$0x -> $$0x.longValue() * $$0x.longValue());
      }

      public static cw.d a(int $$0) {
         return new cw.d(Optional.of($$0), Optional.of($$0));
      }

      public static cw.d a(int $$0, int $$1) {
         return new cw.d(Optional.of($$0), Optional.of($$1));
      }

      public static cw.d b(int $$0) {
         return new cw.d(Optional.of($$0), Optional.empty());
      }

      public static cw.d c(int $$0) {
         return new cw.d(Optional.empty(), Optional.of($$0));
      }

      public boolean d(int $$0) {
         return this.f.isPresent() && this.f.get() > $$0 ? false : this.g.isEmpty() || this.g.get() >= $$0;
      }

      public boolean a(long $$0) {
         return this.h.isPresent() && this.h.get() > $$0 ? false : this.i.isEmpty() || this.i.get() >= $$0;
      }

      public static cw.d a(StringReader $$0) throws CommandSyntaxException {
         return a($$0, $$0x -> $$0x);
      }

      public static cw.d a(StringReader $$0, Function<Integer, Integer> $$1) throws CommandSyntaxException {
         return cw.a($$0, cw.d::a, Integer::parseInt, CommandSyntaxException.BUILT_IN_EXCEPTIONS::readerInvalidInt, $$1);
      }

      @Override
      public Optional<Integer> a() {
         return this.f;
      }

      @Override
      public Optional<Integer> b() {
         return this.g;
      }

      public Optional<Long> e() {
         return this.h;
      }

      public Optional<Long> f() {
         return this.i;
      }
   }
}
