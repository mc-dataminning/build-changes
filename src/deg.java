public record deg<T extends deb<?>>(alf<deb<?>> b, T c) {
   public static final yw<wj, deg<?>> a = yw.a(alf.b(mh.bu), deg::a, deb.c, deg::b, deg::new);

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof deg<?> $$1 && this.b == $$1.b) {
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

   public alf<deb<?>> a() {
      return this.b;
   }

   public T b() {
      return this.c;
   }
}
