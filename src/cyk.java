public record cyk<T extends cyi<?>>(akk b, T c) {
   public static final ys<wf, cyk<?>> a = ys.a(akk.b, cyk::a, cyi.i, cyk::b, cyk::new);

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof cyk<?> $$1 && this.b.equals($$1.b)) {
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
