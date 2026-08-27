public record cwi<T extends cwg<?>>(akf b, T c) {
   public static final yq<wd, cwi<?>> a = yq.a(akf.b, cwi::a, cwg.i, cwi::b, cwi::new);

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof cwi<?> $$1 && this.b.equals($$1.b)) {
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

   public akf a() {
      return this.b;
   }

   public T b() {
      return this.c;
   }
}
