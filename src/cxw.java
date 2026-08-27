public record cxw<T extends cxu<?>>(akm b, T c) {
   public static final yv<wi, cxw<?>> a = yv.a(akm.b, cxw::a, cxu.i, cxw::b, cxw::new);

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof cxw<?> $$1 && this.b.equals($$1.b)) {
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

   public akm a() {
      return this.b;
   }

   public T b() {
      return this.c;
   }
}
