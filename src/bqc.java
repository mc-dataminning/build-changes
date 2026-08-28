import javax.annotation.Nullable;

public interface bqc<S, T> {
   @Nullable
   T a(bqb<S> var1);

   static <S, T> bqc<S, T> a(bqf<S> $$0, bqc.a<S, T> $$1) {
      return new bqc.c<>($$1, $$0);
   }

   static <S, T> bqc<S, T> a(bqf<S> $$0, bqc.b<S, T> $$1) {
      return new bqc.c<>($$1, $$0);
   }

   @FunctionalInterface
   public interface a<S, T> {
      @Nullable
      T run(bqb<S> var1);
   }

   @FunctionalInterface
   public interface b<S, T> extends bqc.a<S, T> {
      T run(bqd var1);

      @Override
      default T run(bqb<S> $$0) {
         return this.run($$0.a());
      }
   }

   public static record c<S, T>(bqc.a<S, T> a, bqf<S> b) implements bqc<S, T> {
      @Nullable
      @Override
      public T a(bqb<S> $$0) {
         bqd $$1 = $$0.a();
         $$1.a();

         Object var3;
         try {
            if (!this.b.a($$0, $$1, bpv.a)) {
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
