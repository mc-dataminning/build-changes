public record cyx<T extends cyv<?>>(alf b, T c) {
   public static final zn<xa, cyx<?>> a = zn.a(alf.b, cyx::a, cyv.i, cyx::b, cyx::new);

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof cyx<?> $$1 && this.b.equals($$1.b)) {
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

   public alf a() {
      return this.b;
   }

   public T b() {
      return this.c;
   }
}
