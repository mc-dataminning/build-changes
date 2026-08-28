public record dbk<T extends dbf<?>>(aku<dbf<?>> b, T c) {
   public static final yn<wa, dbk<?>> a = yn.a(aku.b(mc.bk), dbk::a, dbf.b, dbk::b, dbk::new);

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof dbk<?> $$1 && this.b == $$1.b) {
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

   public aku<dbf<?>> a() {
      return this.b;
   }

   public T b() {
      return this.c;
   }
}
