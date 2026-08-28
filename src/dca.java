public record dca<T extends dbv<?>>(akt<dbv<?>> b, T c) {
   public static final yn<wa, dca<?>> a = yn.a(akt.b(mc.bm), dca::a, dbv.b, dca::b, dca::new);

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof dca<?> $$1 && this.b == $$1.b) {
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

   public akt<dbv<?>> a() {
      return this.b;
   }

   public T b() {
      return this.c;
   }
}
