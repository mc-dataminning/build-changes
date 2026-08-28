public record ddo<T extends ddj<?>>(ald<ddj<?>> b, T c) {
   public static final yu<wh, ddo<?>> a = yu.a(ald.b(mg.bs), ddo::a, ddj.b, ddo::b, ddo::new);

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof ddo<?> $$1 && this.b == $$1.b) {
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

   public ald<ddj<?>> a() {
      return this.b;
   }

   public T b() {
      return this.c;
   }
}
