import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public interface apc<T> {
   static <T> apc<T> a(T $$0) {
      return new apc.b<>($$0);
   }

   static <T> apc<T> a(String $$0) {
      return a(() -> $$0);
   }

   static <T> apc<T> a(Supplier<String> $$0) {
      return new apc.a<>($$0);
   }

   boolean a();

   @Nullable
   T b(@Nullable T var1);

   @Nullable
   static <R> R a(apc<? extends R> $$0, @Nullable R $$1) {
      R $$2 = (R)$$0.b(null);
      return $$2 != null ? $$2 : $$1;
   }

   @Nullable
   String b();

   apc<T> a(Consumer<T> var1);

   <R> apc<R> a(Function<T, R> var1);

   <E extends Throwable> T b(Supplier<E> var1) throws E;

   public static record a<T>(Supplier<String> a) implements apc<T> {
      @Override
      public boolean a() {
         return false;
      }

      @Nullable
      @Override
      public T b(@Nullable T $$0) {
         return $$0;
      }

      @Override
      public String b() {
         return this.a.get();
      }

      @Override
      public apc<T> a(Consumer<T> $$0) {
         return this;
      }

      @Override
      public <R> apc<R> a(Function<T, R> $$0) {
         return new apc.a(this.a);
      }

      @Override
      public <E extends Throwable> T b(Supplier<E> $$0) throws E {
         throw $$0.get();
      }

      public Supplier<String> c() {
         return this.a;
      }
   }

   public static record b<T>(T a) implements apc<T> {
      @Override
      public boolean a() {
         return true;
      }

      @Override
      public T b(@Nullable T $$0) {
         return this.a;
      }

      @Nullable
      @Override
      public String b() {
         return null;
      }

      @Override
      public apc<T> a(Consumer<T> $$0) {
         $$0.accept(this.a);
         return this;
      }

      @Override
      public <R> apc<R> a(Function<T, R> $$0) {
         return new apc.b<>($$0.apply(this.a));
      }

      @Override
      public <E extends Throwable> T b(Supplier<E> $$0) throws E {
         return this.a;
      }

      public T c() {
         return this.a;
      }
   }
}
