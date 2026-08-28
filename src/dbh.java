public record dbh<T extends dbc<?>>(akt<dbc<?>> b, T c) {
   public static final ym<vz, dbh<?>> a = ym.a(akt.b(mc.bk), dbh::a, dbc.b, dbh::b, dbh::new);

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof dbh<?> $$1 && this.b == $$1.b) {
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

   public akt<dbc<?>> a() {
      return this.b;
   }

   public T b() {
      return this.c;
   }
}
