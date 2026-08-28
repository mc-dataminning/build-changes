import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public interface aqn<T> {
   static <T> aqn<T> a(T $$0) {
      return new aqn.b<>($$0);
   }

   static <T> aqn<T> a(String $$0) {
      return a(() -> $$0);
   }

   static <T> aqn<T> a(Supplier<String> $$0) {
      return new aqn.a<>($$0);
   }

   boolean a();

   @Nullable
   T b(@Nullable T var1);

   @Nullable
   static <R> R a(aqn<? extends R> $$0, @Nullable R $$1) {
      R $$2 = (R)$$0.b(null);
      return $$2 != null ? $$2 : $$1;
   }

   @Nullable
   String b();

   aqn<T> a(Consumer<T> var1);

   <R> aqn<R> a(Function<T, R> var1);

   <E extends Throwable> T b(Supplier<E> var1) throws E;

   public static record a<T>(Supplier<String> a) implements aqn<T> {
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
      public aqn<T> a(Consumer<T> $$0) {
         return this;
      }

      @Override
      public <R> aqn<R> a(Function<T, R> $$0) {
         return new aqn.a(this.a);
      }

      @Override
      public <E extends Throwable> T b(Supplier<E> $$0) throws E {
         throw $$0.get();
      }

      public Supplier<String> c() {
         return this.a;
      }
   }

   public static record b<T>(T a) implements aqn<T> {
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
      public aqn<T> a(Consumer<T> $$0) {
         $$0.accept(this.a);
         return this;
      }

      @Override
      public <R> aqn<R> a(Function<T, R> $$0) {
         return new aqn.b<>($$0.apply(this.a));
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
