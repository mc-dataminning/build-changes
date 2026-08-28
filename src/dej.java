public record dej<T extends dee<?>>(alf<dee<?>> b, T c) {
   public static final yw<wj, dej<?>> a = yw.a(alf.b(mh.bv), dej::a, dee.c, dej::b, dej::new);

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof dej<?> $$1 && this.b == $$1.b) {
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

   public alf<dee<?>> a() {
      return this.b;
   }

   public T b() {
      return this.c;
   }
}
