public record cyw<T extends cyu<?>>(ale b, T c) {
   public static final zm<wz, cyw<?>> a = zm.a(ale.b, cyw::a, cyu.i, cyw::b, cyw::new);

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof cyw<?> $$1 && this.b.equals($$1.b)) {
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
