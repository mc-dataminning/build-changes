public record czc<T extends cza<?>>(akt b, T c) {
   public static final zc<wp, czc<?>> a = zc.a(akt.b, czc::a, cza.i, czc::b, czc::new);

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof czc<?> $$1 && this.b.equals($$1.b)) {
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

   public akt a() {
      return this.b;
   }

   public T b() {
      return this.c;
   }
}
