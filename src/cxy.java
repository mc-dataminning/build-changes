public record cxy<T extends cxw<?>>(akn b, T c) {
   public static final yv<wi, cxy<?>> a = yv.a(akn.b, cxy::a, cxw.i, cxy::b, cxy::new);

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof cxy<?> $$1 && this.b.equals($$1.b)) {
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

   public akn a() {
      return this.b;
   }

   public T b() {
      return this.c;
   }
}
