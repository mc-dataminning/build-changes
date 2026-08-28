public record dcd<T extends dbz<?>>(aly<dbz<?>> b, T c) {
   public static final zt<xg, dcd<?>> a = zt.a(aly.b(mb.bj), dcd::a, dbz.b, dcd::b, dcd::new);

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof dcd<?> $$1 && this.b == $$1.b) {
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

   public aly<dbz<?>> a() {
      return this.b;
   }

   public T b() {
      return this.c;
   }
}
