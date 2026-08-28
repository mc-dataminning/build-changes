public record czv<T extends czt<?>>(alb b, T c) {
   public static final zb<wo, czv<?>> a = zb.a(alb.b, czv::a, czt.i, czv::b, czv::new);

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof czv<?> $$1 && this.b.equals($$1.b)) {
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
