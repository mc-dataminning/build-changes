public record czb<T extends cyz<?>>(akr b, T c) {
   public static final yx<wk, czb<?>> a = yx.a(akr.b, czb::a, cyz.i, czb::b, czb::new);

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof czb<?> $$1 && this.b.equals($$1.b)) {
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

   public akr a() {
      return this.b;
   }

   public T b() {
      return this.c;
   }
}
