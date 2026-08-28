import java.util.Optional;

public interface bpv<S, T> {
   Optional<T> a(bpu<S> var1);

   static <S, T> bpv<S, T> a(bpy<S> $$0, bpv.a<S, T> $$1) {
      return new bpv.c<>($$1, $$0);
   }

   static <S, T> bpv<S, T> a(bpy<S> $$0, bpv.b<T> $$1) {
      return new bpv.c<>(($$1x, $$2) -> Optional.of($$1.run($$2)), $$0);
   }

   @FunctionalInterface
   public interface a<S, T> {
      Optional<T> run(bpu<S> var1, bpw var2);
   }

   @FunctionalInterface
   public interface b<T> {
      T run(bpw var1);
   }

   public static record c<S, T>(bpv.a<S, T> a, bpy<S> b) implements bpv<S, T> {
      @Override
      public Optional<T> a(bpu<S> $$0) {
         bpw $$1 = new bpw();
         return this.b.a($$0, $$1, bpq.a) ? this.a.run($$0, $$1) : Optional.empty();
      }
   }
}
