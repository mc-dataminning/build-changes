public record dam<T extends dak<?>>(ale b, T c) {
   public static final zc<wp, dam<?>> a = zc.a(ale.b, dam::a, dak.i, dam::b, dam::new);

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof dam<?> $$1 && this.b.equals($$1.b)) {
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

   public ale a() {
      return this.b;
   }

   public T b() {
      return this.c;
   }
}
