public record dcq<T extends dcl<?>>(alc<dcl<?>> b, T c) {
   public static final yt<wg, dcq<?>> a = yt.a(alc.b(me.br), dcq::a, dcl.b, dcq::b, dcq::new);

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof dcq<?> $$1 && this.b == $$1.b) {
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

   public alc<dcl<?>> a() {
      return this.b;
   }

   public T b() {
      return this.c;
   }
}
