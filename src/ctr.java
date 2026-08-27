public record ctr<T extends ctp<?>>(ajh b, T c) {
   public static final xs<vf, ctr<?>> a = xs.a(ajh.b, ctr::a, ctp.i, ctr::b, ctr::new);

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof ctr<?> $$1 && this.b.equals($$1.b)) {
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

   public ajh a() {
      return this.b;
   }

   public T b() {
      return this.c;
   }
}
