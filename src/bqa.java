import javax.annotation.Nullable;

public interface bqa<S, T> {
   @Nullable
   T a(bpz<S> var1);

   static <S, T> bqa<S, T> a(bqd<S> $$0, bqa.a<S, T> $$1) {
      return new bqa.c<>($$1, $$0);
   }

   static <S, T> bqa<S, T> a(bqd<S> $$0, bqa.b<S, T> $$1) {
      return new bqa.c<>($$1, $$0);
   }

   @FunctionalInterface
   public interface a<S, T> {
      @Nullable
      T run(bpz<S> var1);
   }

   @FunctionalInterface
   public interface b<S, T> extends bqa.a<S, T> {
      T run(bqb var1);

      @Override
      default T run(bpz<S> $$0) {
         return this.run($$0.a());
      }
   }

   public static record c<S, T>(bqa.a<S, T> a, bqd<S> b) implements bqa<S, T> {
      @Nullable
      @Override
      public T a(bpz<S> $$0) {
         bqb $$1 = $$0.a();
         $$1.a();

         Object var3;
         try {
            if (!this.b.a($$0, $$1, bpt.a)) {
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
