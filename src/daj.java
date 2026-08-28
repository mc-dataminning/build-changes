public record daj<T extends dah<?>>(alc b, T c) {
   public static final zb<wo, daj<?>> a = zb.a(alc.b, daj::a, dah.i, daj::b, daj::new);

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof daj<?> $$1 && this.b.equals($$1.b)) {
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

   public alc a() {
      return this.b;
   }

   public T b() {
      return this.c;
   }
}
