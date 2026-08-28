public record dav<T extends dat<?>>(all b, T c) {
   public static final zj<ww, dav<?>> a = zj.a(all.b, dav::a, dat.i, dav::b, dav::new);

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof dav<?> $$1 && this.b.equals($$1.b)) {
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

   public all a() {
      return this.b;
   }

   public T b() {
      return this.c;
   }
}
