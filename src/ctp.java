public record ctp<T extends ctn<?>>(ajh b, T c) {
   public static final xs<vf, ctp<?>> a = xs.a(ajh.b, ctp::a, ctn.i, ctp::b, ctp::new);

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof ctp<?> $$1 && this.b.equals($$1.b)) {
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
