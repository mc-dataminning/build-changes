public record csu<T extends css<?>>(ajc b, T c) {
   public static final xq<vd, csu<?>> a = xq.a(ajc.b, csu::a, css.i, csu::b, csu::new);

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof csu<?> $$1 && this.b.equals($$1.b)) {
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

   public ajc a() {
      return this.b;
   }

   public T b() {
      return this.c;
   }
}
