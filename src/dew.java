public record dew<T extends der<?>>(alj<der<?>> b, T c) {
   public static final za<wn, dew<?>> a = za.a(alj.b(mi.bv), dew::a, der.c, dew::b, dew::new);

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof dew<?> $$1 && this.b == $$1.b) {
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

   public alj<der<?>> a() {
      return this.b;
   }

   public T b() {
      return this.c;
   }
}
