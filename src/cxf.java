public record cxf<T extends cxd<?>>(akh b, T c) {
   public static final ys<wf, cxf<?>> a = ys.a(akh.b, cxf::a, cxd.i, cxf::b, cxf::new);

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof cxf<?> $$1 && this.b.equals($$1.b)) {
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

   public akh a() {
      return this.b;
   }

   public T b() {
      return this.c;
   }
}
