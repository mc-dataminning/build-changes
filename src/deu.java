public record deu<T extends dep<?>>(alh<dep<?>> b, T c) {
   public static final yy<wl, deu<?>> a = yy.a(alh.b(mh.bv), deu::a, dep.c, deu::b, deu::new);

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof deu<?> $$1 && this.b == $$1.b) {
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

   public alh<dep<?>> a() {
      return this.b;
   }

   public T b() {
      return this.c;
   }
}
