public record dbc<T extends dba<?>>(alj b, T c) {
   public static final zh<wu, dbc<?>> a = zh.a(alj.b, dbc::a, dba.i, dbc::b, dbc::new);

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof dbc<?> $$1 && this.b.equals($$1.b)) {
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

   public alj a() {
      return this.b;
   }

   public T b() {
      return this.c;
   }
}
