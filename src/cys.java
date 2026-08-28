public record cys<T extends cyq<?>>(alb b, T c) {
   public static final zj<ww, cys<?>> a = zj.a(alb.b, cys::a, cyq.i, cys::b, cys::new);

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof cys<?> $$1 && this.b.equals($$1.b)) {
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

   public alb a() {
      return this.b;
   }

   public T b() {
      return this.c;
   }
}
