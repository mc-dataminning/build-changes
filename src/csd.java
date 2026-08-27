public record csd<T extends csb<?>>(aiy b, T c) {
   public static final xo<vb, csd<?>> a = xo.a(aiy.b, csd::a, csb.i, csd::b, csd::new);

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof csd<?> $$1 && this.b.equals($$1.b)) {
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

   public aiy a() {
      return this.b;
   }

   public T b() {
      return this.c;
   }
}
