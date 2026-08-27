public record cvl<T extends cvj<?>>(ajt b, T c) {
   public static final ye<vr, cvl<?>> a = ye.a(ajt.b, cvl::a, cvj.i, cvl::b, cvl::new);

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof cvl<?> $$1 && this.b.equals($$1.b)) {
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

   public ajt a() {
      return this.b;
   }

   public T b() {
      return this.c;
   }
}
