import javax.annotation.Nullable;

public interface bql<S, T> {
   @Nullable
   T a(bqk<S> var1);

   static <S, T> bql<S, T> a(bqo<S> $$0, bql.a<S, T> $$1) {
      return new bql.c<>($$1, $$0);
   }

   static <S, T> bql<S, T> a(bqo<S> $$0, bql.b<S, T> $$1) {
      return new bql.c<>($$1, $$0);
   }

   @FunctionalInterface
   public interface a<S, T> {
      @Nullable
      T run(bqk<S> var1);
   }

   @FunctionalInterface
   public interface b<S, T> extends bql.a<S, T> {
      T run(bqm var1);

      @Override
      default T run(bqk<S> $$0) {
         return this.run($$0.a());
      }
   }

   public static record c<S, T>(bql.a<S, T> a, bqo<S> b) implements bql<S, T> {
      @Nullable
      @Override
      public T a(bqk<S> $$0) {
         bqm $$1 = $$0.a();
         $$1.a();

         Object var3;
         try {
            if (!this.b.a($$0, $$1, bqe.a)) {
               return null;
            }

            var3 = this.a.run($$0);
         } finally {
            $$1.b();
         }

         return (T)var3;
      }
   }
}
