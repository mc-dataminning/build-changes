public record cyi<T extends cyg<?>>(akk b, T c) {
   public static final ys<wf, cyi<?>> a = ys.a(akk.b, cyi::a, cyg.i, cyi::b, cyi::new);

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof cyi<?> $$1 && this.b.equals($$1.b)) {
            return true;
         }

         return false;
      }
   }

   @Override
   public int hashCode() {
      return this.b.hashCode();
   }

   @Override
   public String toString() {
      return this.b.toString();
   }

   public akk a() {
      return this.b;
   }

   public T b() {
      return this.c;
   }
}
