public record cyz<T extends cyx<?>>(akq b, T c) {
   public static final yw<wj, cyz<?>> a = yw.a(akq.b, cyz::a, cyx.i, cyz::b, cyz::new);

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof cyz<?> $$1 && this.b.equals($$1.b)) {
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

   public akq a() {
      return this.b;
   }

   public T b() {
      return this.c;
   }
}
