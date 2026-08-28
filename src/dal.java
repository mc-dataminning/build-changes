public record dal<T extends daj<?>>(alh b, T c) {
   public static final zf<ws, dal<?>> a = zf.a(alh.b, dal::a, daj.i, dal::b, dal::new);

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof dal<?> $$1 && this.b.equals($$1.b)) {
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

   public alh a() {
      return this.b;
   }

   public T b() {
      return this.c;
   }
}
