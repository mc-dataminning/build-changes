public record dbj<T extends dbe<?>>(aku<dbe<?>> b, T c) {
   public static final yn<wa, dbj<?>> a = yn.a(aku.b(mc.bk), dbj::a, dbe.b, dbj::b, dbj::new);

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof dbj<?> $$1 && this.b == $$1.b) {
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

   public aku<dbe<?>> a() {
      return this.b;
   }

   public T b() {
      return this.c;
   }
}
